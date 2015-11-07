package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ConsertoBusiness;
import model.Conserto;
import model.Data;

@WebServlet({ "/ConsertoController", "/ConsertoController.do" })
public class ConsertoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsertoController() {
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

	}
	
	private void pesquisa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoPesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");
	
		ConsertoBusiness bancoConserto = (ConsertoBusiness) request.getServletContext().getAttribute("bancoConserto");
	
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();
		Conserto resultadoEspecifico;
		Data dt = new Data();
		
		switch(tipoDePesquisa.toLowerCase()){
		
		case "codigo":
			resultadoEspecifico = bancoConserto.pesquisarCodigo(campoDePesquisa);
			dispatcher = "conserto-exibir.jsp";
			break;
		case "nome":
			resultado = bancoConserto.pesquisarCliente(campoDePesquisa);
			dispatcher = "conserto-pesquisar.jsp";
			break;
		case "placa":
			resultado = bancoConserto.pesquisarVeiculo(campoDePesquisa);
			dispatcher = "conserto-pesquisar.jsp";
			break;
		case "data":
			resultado = bancoConserto.pesquisarData(dt.returnDate(campoDePesquisa));
			dispatcher = "conserto-pesquisar.jsp";
			break;
		case "tiposervico":
			resultado = bancoConserto.pesquisarTipoServico(campoDePesquisa);
			dispatcher = "conserto-pesquisar.jsp";
			break;
//		case "preco":
//			resultado = bancoConserto.pesquisarPreco(0, Double.parseDouble(campoDePesquisa));
//			dispatcher = "conserto-pesquisar.jsp";
//			break;
		default: 
			dispatcher = "Home.jsp";
		}
		
		request.setAttribute("listouConserto", Boolean.TRUE);
		request.setAttribute("resultadoPesquisa", resultado);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}
