package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.AdministradorBusiness;
import model.Administrador;
import model.Data;
import model.Usuario;

@WebServlet({ "/AdministradorController", "/AdministradorController.do" })
public class AdministradorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdministradorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		switch (action.toLowerCase()) {
		case "registrar":
			this.registrar(request, response);
			break;
		case "alterar":
			this.alterar(request, response);
			break;
		case "excluir":
			break;
		}
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("usuarioNomeCompleto");
		String email = request.getParameter("usuarioEmail");
		String confirmarEmail = request.getParameter("usuarioConfirmarEmail");
		String rg = request.getParameter("usuarioRG");
		String cpf = request.getParameter("usuarioCPF");
		String nomeDeUsuario = request.getParameter("usuarioNomeDeUsuario");
		String senha = request.getParameter("usuarioSenha");
		String confirmarSenha = request.getParameter("usuarioConfirmeSenha");
		String sexo = request.getParameter("usuarioSexo");
		String nascimento = request.getParameter("usuarioNascimento");

		Data dt = new Data();

		AdministradorBusiness bancoAdministrador = (AdministradorBusiness) request.getServletContext()
				.getAttribute("bancoAdministrador");

		String mensagem;

		if (email.equals(confirmarEmail)) {
			if (senha.equals(confirmarSenha)) {
				Usuario uNovo = new Usuario(nomeDeUsuario, senha);
				Administrador admNovo = new Administrador(nome, rg, cpf, sexo, dt.returnDateInvertido(nascimento),
						email, uNovo);

				if (bancoAdministrador.adicionar(admNovo)) {
					mensagem = "Registrado com sucesso!";

					request.getServletContext().setAttribute("bancoAdministrador", bancoAdministrador);
					request.setAttribute("registrado", Boolean.TRUE);
					request.setAttribute("admMensagem", mensagem);

					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					mensagem = "Houve um erro ao tentar efetuar o registro, talvez o usuario ja exista...";
				}
			} else {
				mensagem = "Senhas não coincidem!";
			}
		} else {
			mensagem = "Emails não coincidem!";
		}

		request.setAttribute("registroError", Boolean.TRUE);
		request.setAttribute("admMensagem", mensagem);

		request.getRequestDispatcher("usuario-registrar.jsp").forward(request, response);
	}

	public void alterar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	public void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// LoginController.do?action=Sair
	}
}
