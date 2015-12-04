package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ServicoBusiness;
import model.Funilaria;
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

		switch (action.toLowerCase()) {
		case "cadastrar":
			System.out.println("ServicoController - Switch - Cadastrar");
			this.cadastrar(request, response);
			break;
		case "pesquisar":
			System.out.println("ServicoController - Switch - Pesquisar");
			this.pesquisar(request, response);
			break;
		case "alterar":
			System.out.println("ServicoController - Switch - Alterar");
			this.alterar(request, response);
			break;
		case "cancelar":
			System.out.println("ServicoController - Switch - cancelar");
			this.excluir(request, response);
		case "excluir":
			System.out.println("ServicoController - Switch - Excluir");
			this.excluir(request, response);
			break;
		default:
			System.out.println("ServicoController - Switch - defaullt");
			request.getRequestDispatcher("servico.jsp").forward(request, response);
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
			precoPintura = precoPintura.replace(',', '.');
			novo = new Pintura(TipoVeiculoPintura, servicoPintura, Double.parseDouble(precoPintura), corPintura,
					pecaPintura);
			bancoServico.adicionar(novo);
			break;
		case "Mecanica":
			String TipoVeiculoMecanica = request.getParameter("servicoTipoVeiculo");
			String servicoMecanica = request.getParameter("servico");
			String precoMecanica = request.getParameter("servicoPreco");
			precoMecanica = precoMecanica.replace(',', '.');

			novo = new Mecanica(TipoVeiculoMecanica, servicoMecanica, Double.parseDouble(precoMecanica));

			bancoServico.adicionar(novo);
			break;
		case "Funilaria":
			String TipoVeiculoFunilaria = request.getParameter("servicoTipoVeiculo");
			String servicoFunilaria = request.getParameter("servico");
			String pecaFunilaria = request.getParameter("servicoPeca");
			String precoFunilaria = request.getParameter("servicoPreco");
			precoFunilaria = precoFunilaria.replace(',', '.');

			novo = new Funilaria(TipoVeiculoFunilaria, servicoFunilaria, Double.parseDouble(precoFunilaria),
					pecaFunilaria);
			bancoServico.adicionar(novo);
			break;
		default:
			novo = null;
			break;
		}
		request.getServletContext().setAttribute("bancoServico", bancoServico);
		request.setAttribute("servicoSelecionado", novo);
		request.setAttribute("cadastrado", Boolean.TRUE);
		dispatcher = "servico-detalhes.jsp";
		// response.sendRedirect(dispatcher);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}

	private void pesquisar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoDePesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");

		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");

		ArrayList<Servico> resultado = new ArrayList<Servico>();
		Servico resultadoEspecifico = null;

		switch (tipoDePesquisa.toLowerCase()) {
		case "codigo":
			resultadoEspecifico = bancoServico.pesquisarCodigo(campoDePesquisa);
			if (resultadoEspecifico != null)
				dispatcher = "servico-detalhes.jsp";
			else
				dispatcher = "servico-pesquisar.jsp";
			break;
		case "tipoveiculo":
			resultado = bancoServico.pesquisarTipoVeiculo(campoDePesquisa);
			dispatcher = "servico-pesquisar.jsp";
			break;
		case "tiposervico":
			resultado = bancoServico.pesquisarTipoServico(campoDePesquisa);
			dispatcher = "servico-pesquisar.jsp";
			break;
		case "servico":
			resultado = bancoServico.pesquisarDescricao(campoDePesquisa);
			dispatcher = "servico-pesquisar.jsp";
			break;
		case "preco":
			resultado = bancoServico.pesquisarPreco(0, Double.parseDouble(campoDePesquisa));
			dispatcher = "servico-pesquisar.jsp";
			break;
		case "cor":
			resultado = bancoServico.pesquisarCor(campoDePesquisa);
			dispatcher = "servico-pesquisar.jsp";
			break;
		case "peca":
			resultado = bancoServico.pesquisarPeca(campoDePesquisa);
			dispatcher = "servico-pesquisar.jsp";
			break;
		default:
			dispatcher = "home.jsp";
		}

		if (tipoDePesquisa.equalsIgnoreCase("Codigo") && resultadoEspecifico != null) {
			request.setAttribute("servicoSelecionado", resultadoEspecifico);
		} else {
			request.setAttribute("resultadoPesquisa", resultado);
			request.setAttribute("listouServico", Boolean.TRUE);
		}
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}

	private void alterar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String codigo = request.getParameter("servicoCodigo");
		String preco = request.getParameter("servicoPreco");
//		String cor = request.getParameter("servicoCor");
//		String peca = request.getParameter("servicoPeca");
		String dispatcher = "servico-detalhes.jsp";
		preco = preco.replace(',', '.');

		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");
		Servico s = bancoServico.pesquisarCodigo(codigo);

		s.setPreco(Double.parseDouble(preco));
//		s.setCor(cor);
//		s.setPeca(peca);
		int posicao = bancoServico.pesquisarCodigoIndex(codigo);
		if (posicao != -1) {
			bancoServico.alterar(posicao, s);
		}
		request.setAttribute("servicoSelecionado", s);
		request.setAttribute("alterado", Boolean.TRUE);
		request.getServletContext().setAttribute("bancoServico", bancoServico);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codigo = request.getParameter("servicoCodigo");
		String dispatcher = "servico.jsp";

		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");

		int posicao = bancoServico.pesquisarCodigoIndex(codigo);
		bancoServico.remover(posicao);

		request.setAttribute("excluido", Boolean.TRUE);
		request.getServletContext().setAttribute("bancoServico", bancoServico);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}