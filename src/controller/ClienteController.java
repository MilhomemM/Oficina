package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ClienteBusiness;
import model.Cliente;
import model.Data;

@WebServlet({ "/ClienteController", "/ClienteController.do" })
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteController() {
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
		case "pesquisar":
			System.out.println("Entrou no switch");
			this.pesquisar(request, response);
			break;
		}
	}

	private void pesquisar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entrou no metodo");
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoDePesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");
		Data dt = new Data();

		ClienteBusiness bancoCliente = (ClienteBusiness) request.getServletContext().getAttribute("bancoCliente");

		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		Cliente resultadoEspecifico = null;

		switch (tipoDePesquisa.toLowerCase()) {
		case "nome":
			resultado = bancoCliente.pesquisarNome(campoDePesquisa);
			dispatcher = "cliente-pesquisar.jsp";
			break;
		case "sexo":
			resultado = bancoCliente.pesquisarSexo(campoDePesquisa);
			dispatcher = "cliente-pesquisar.jsp";
			break;
		case "nascimento":
			resultado = bancoCliente.pesquisarNascimento(dt.returnDate(campoDePesquisa));
			dispatcher = "cliente-pesquisar.jsp";
			break;
		case "rg":
			resultadoEspecifico = bancoCliente.pesquisarRg(campoDePesquisa);
			if (resultadoEspecifico != null)
				dispatcher = "cliente-detalhes.jsp";
			else
				dispatcher = "cliente-pesquisar.jsp";
			break;
		case "cpf":
			resultadoEspecifico = bancoCliente.pesquisarCpf(campoDePesquisa);
			if (resultadoEspecifico != null)
				dispatcher = "cliente-detalhes.jsp";
			else
				dispatcher = "cliente-pesquisar.jsp";
			break;
		case "email":
			resultado = bancoCliente.pesquisarEmail(campoDePesquisa);
			dispatcher = "cliente-detalhes.jsp";
			break;
		case "telefone":
			resultado = bancoCliente.pesquisarTelefone(campoDePesquisa);
			dispatcher = "cliente-detalhes.jsp";
			break;
		default:
			dispatcher = "home.jsp";
		}
		if ((tipoDePesquisa.equalsIgnoreCase("Rg") || tipoDePesquisa.equalsIgnoreCase("Cpf"))
				&& resultadoEspecifico != null) {
			request.setAttribute("ClienteSelecionado", resultadoEspecifico);
		} else {
			request.setAttribute("resultadoPesquisa", resultado);
			request.setAttribute("listouCliente", Boolean.TRUE);
		}
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}

}
