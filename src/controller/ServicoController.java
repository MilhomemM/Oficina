package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ServicoBusiness;
import model.Servico;

@WebServlet({ "/ServicoController", "/ServicoController.do" })
public class ServicoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServicoController() {
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
		String dispatcher = new String();

		switch (action) {
		case "pesquisar":
			this.pesquisar(request, dispatcher);
			
			break;
		}

	}

	private void pesquisar(HttpServletRequest request, String dispatcher) throws ServletException, IOException {
		String tipoDePesquisa = request.getParameter("tipoDePesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");

		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");

		ArrayList<Servico> resultado = new ArrayList<Servico>();
		Servico resultadoEspecifico;

		switch (tipoDePesquisa) {
		case "Codigo":
			resultadoEspecifico = bancoServico.pesquisarCodigo(campoDePesquisa);
			dispatcher = "Servico - Alterar.jsp";
			break;
		case "TipoVeiculo":
			resultado = bancoServico.pesquisarTipoVeiculo(campoDePesquisa);
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		case "TipoServico":
			resultado = bancoServico.pesquisarTipoServico(campoDePesquisa);
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		case "Servico":
			resultado = bancoServico.pesquisarDescricao(campoDePesquisa);
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		case "Preco":
			resultado = bancoServico.pesquisarPreco(0, Double.parseDouble(campoDePesquisa));
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		case "Cor":
			resultado = bancoServico.pesquisarCor(campoDePesquisa);
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		case "Peca":
			resultado = bancoServico.pesquisarPeca(campoDePesquisa);
			dispatcher = "Servico - Pesquisar.jsp";
			break;
		default: 
		}
	}
}