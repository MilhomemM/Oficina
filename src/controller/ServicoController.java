package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ServicoBusiness;
import model.Mecanica;
import model.Pintura;
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

		switch (action) {
		case "Cadastrar":
			this.cadastrar(request, response);
			break;
		case "Pesquisar":
			this.pesquisar(request, response);
			break;
		}

	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dispatcher;
		String tipoServico = request.getParameter("servicoTipo");
		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");
		Servico novo;
		switch (tipoServico) {
		case "Pintura":
			String TipoVeiculoPintura = request.getParameter("servicoTipoVeiculo");
			String servicoPintura = request.getParameter("servico");
			String corPintura = request.getParameter("servicoCor");
			String pecaPintura = request.getParameter("servicoPeca");
			String precoPintura = request.getParameter("servicoPreco");
			String codigo = String.valueOf(bancoServico.getSize() + 1);
			if (codigo.length() < 4) {
				for (int i = 0; i < 4 - codigo.length(); i++)
					codigo = "0" + codigo;
			}
			codigo = "SERV" + codigo;
			novo = new Pintura(codigo, TipoVeiculoPintura, servicoPintura, Double.parseDouble(precoPintura), corPintura,
					pecaPintura);
			System.out.println(codigo);
			break;
		case "Mecanica":
			String TipoVeiculoMecanica = request.getParameter("servicoTipoVeiculo");
			String servicoMecanica = request.getParameter("servico");
			String pecaMecanica = request.getParameter("servicoPeca");
			String precoMecanica = request.getParameter("servicoPreco");
			novo = new Mecanica("SERV" + bancoServico.getSize() + 1, TipoVeiculoMecanica, servicoMecanica,
					Double.parseDouble(precoMecanica));
			break;
		case "Funilaria":
			String TipoVeiculoFunilaria = request.getParameter("servicoTipoVeiculo");
			String servicoFunilaria = request.getParameter("servico");
			String pecaFunilaria = request.getParameter("servicoPeca");
			String precoFunilaria = request.getParameter("servicoPreco");
			novo = new Mecanica("SERV" + bancoServico.getSize() + 1, TipoVeiculoFunilaria, servicoFunilaria,
					Double.parseDouble(precoFunilaria));
			break;
		default:
			break;
		}
		request.getServletContext().setAttribute("bancoServico", bancoServico);
		dispatcher = "Servico.jsp";
		response.sendRedirect(dispatcher);
	}

	private void pesquisar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoDePesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");

		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");

		ArrayList<Servico> resultado = new ArrayList<Servico>();
		Servico resultadoEspecifico;

		switch (tipoDePesquisa) {
		case "Codigo":
			resultadoEspecifico = bancoServico.pesquisarCodigo(campoDePesquisa);
			dispatcher = "Servico - Exibir.jsp";
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
			dispatcher = "Home.jsp";
		}
		request.setAttribute("listouServico", Boolean.TRUE);
		request.setAttribute("resultadoPesquisa", resultado);
		System.out.println("Oi");
		System.out.println(dispatcher);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}