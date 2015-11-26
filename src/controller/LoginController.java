package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.AdministradorBusiness;
import model.Administrador;
import model.Usuario;

@WebServlet({ "/LoginController", "/LoginController.do" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
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

		if (action == null) {
			this.verificarSession(request, response);
		} else {
			switch (action.toLowerCase()) {
			case "entrar":
				this.login(request, response);
				break;
			case "sair":
				this.logout(request, response);
				break;
			default:
				System.out.println("Ola");
				this.verificarSession(request, response);
				break;
			}
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeDeUsuario = request.getParameter("usuarioNome");
		String senha = request.getParameter("usuarioSenha");

		AdministradorBusiness bancoAdministrador = (AdministradorBusiness) request.getServletContext()
				.getAttribute("bancoAdministrador");

		HttpSession session = request.getSession();

		if (nomeDeUsuario != null && (nomeDeUsuario.length() > 0 && (senha != null && (senha.length() > 0)))) {
			Usuario usuario = new Usuario(nomeDeUsuario, senha);
			Administrador admLogado = bancoAdministrador.pesquisarUsuario(usuario);

			if (admLogado != null) {
				session.setAttribute("usuarioLogado", admLogado);
			} else {
				request.setAttribute("loginInvalido", Boolean.TRUE);
			}
		}

		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		session.setAttribute("usuarioLogado", null);
		session.invalidate();
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	private void verificarSession(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (session.getAttribute("usuarioLogado") == null) {
			session.invalidate();
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("home.jsp");
		}

	}
}
