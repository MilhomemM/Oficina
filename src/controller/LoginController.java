package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		switch (action.toLowerCase()) {
		case "entrar":
			System.out.println("AQUi 1");
			this.login(request, response);
			break;
		case "sair":
			this.logout(request, response);
			break;
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AQUi 2");
		String nomeDeUsuario = request.getParameter("usuarioNome");
		String senha = request.getParameter("usuarioSenha");
		System.out.println("AQUi 3");
		AdministradorBusiness bancoAdministrador = (AdministradorBusiness) request.getServletContext()
				.getAttribute("bancoAdministrador");
		System.out.println("AQUi 4");
		Usuario u = new Usuario(nomeDeUsuario, senha);
		System.out.println("AQUi 5");
		Administrador buscado = bancoAdministrador.pesquisarUsuario(u.getLogin());
		System.out.println(nomeDeUsuario + " / " + senha);
		System.out.println(buscado.getUsuario().getLogin() + " \\ " + buscado.getUsuario().getSenha());
		System.out.println("AQUi 6");
		if(buscado != null)
		{
			System.out.println("Não é null");
			if(buscado.getUsuario().getLogin().equals(nomeDeUsuario))
			{
				System.out.println("Achou o usuario");
				if(buscado.getUsuario().getSenha().equals(senha))
				{
					System.out.println("Senha bateu");

					request.getServletContext().setAttribute("usuarioLogado", buscado.getNome());
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			}
		}
		else
		{
			System.out.println("AQUi 8");
			request.setAttribute("loginError", Boolean.TRUE);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
		System.out.println("AQUi 9");
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AQUi 10");
		request.getServletContext().setAttribute("usuarioLogado", "Admin");
		System.out.println("AQUi 11");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		System.out.println("AQUi 12");
	}
}
