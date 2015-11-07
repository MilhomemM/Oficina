package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.AdministradorBusiness;
import model.Administrador;
import model.Cliente;
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
		System.out.println("chegou");
		String action = request.getParameter("action");
		System.out.println("Action = " + action);
		switch (action.toLowerCase()) {
		case "registrar":
			this.registrar(request, response);
			break;
		case "cancelar":
			this.cancelarRegistro(request, response);
			break;
		}
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeCompleto = request.getParameter("usuarioNomeCompleto");
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
		Administrador novo;
	
		if (senha.equals(confirmarSenha) && email.equals(confirmarEmail)) {
			
			Usuario novoUsuario = new Usuario(nomeDeUsuario, senha);
			System.out.println("usuario passou");
			System.out.println(dt.filtroData(dt.returnDateInvertido(nascimento)));
			novo = new Administrador(nomeCompleto, rg, cpf, sexo, dt.returnDateInvertido(nascimento), novoUsuario);
			bancoAdministrador.adicionar(novo);
			request.getServletContext().setAttribute("AdministradorBusiness", bancoAdministrador);

			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("registrar-usuario.jsp").forward(request, response);
		}

	}
	
	private void cancelarRegistro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setAttribute("registroCancelado", Boolean.TRUE);
		request.getRequestDispatcher("login.jsp");
	}
}
