package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ClienteBusiness;
import business.VeiculoBusiness;
import model.Carro;
import model.Cliente;
import model.Data;
import model.Moto;
import model.Veiculo;

@WebServlet({ "/VeiculoController", "/VeiculoController.do" })
public class VeiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VeiculoController() {
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
		case "cadastrar":
			System.out.println("VeiculoController - Switch - cadastrar");
			this.cadastrar(request, response);
			break;
		case "pesquisar":
			System.out.println("VeiculoController - Switch - pesquisar");
			this.pesquisar(request, response);
			break;
		case "alterar":
			System.out.println("VeiculoController - Switch - alterar");
			this.alterar(request, response);
			break;
		case "excluir":
			System.out.println("VeiculoController - Switch - excluir");
			this.excluir(request, response);
			break;
		default:
			System.out.println("VeiculoController - Switch - defaullt");
			request.getRequestDispatcher("veiculo.jsp").forward(request, response);
			break;
		}
	}
	
	
	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String dispatcher = "veiculo-detalhes.jsp";
		
		String cpfProprietario = request.getParameter("veiculoProprietario");
		String tipoVeiculo = request.getParameter("veiculoTipo");
		String marcaVeiculo = request.getParameter("veiculoMarca");
		String modeloVeiculo = request.getParameter("veiculoModelo");
		String anoVeiculo = request.getParameter("veiculoAnoModelo");
		String corVeiculo = request.getParameter("veiculoCor");
		String placaVeiculo = request.getParameter("veiculoPlaca");
		String chassiVeiculo = request.getParameter("veiculoChassi");
		String cidadeVeiculo = request.getParameter("veiculoCidade");
		String estadoVeiculo = request.getParameter("veiculoEstado");
		
		ClienteBusiness bancoCliente = (ClienteBusiness) request.getServletContext().getAttribute("bancoCliente"); 
				
		Cliente proprietario = bancoCliente.pesquisarCpf(cpfProprietario);
		 
		Veiculo novo = null;
		
		if( tipoVeiculo.equalsIgnoreCase("carro")){
				novo = new Carro(proprietario, placaVeiculo, Integer.parseInt(anoVeiculo), marcaVeiculo, modeloVeiculo, corVeiculo, chassiVeiculo, cidadeVeiculo, estadoVeiculo);
		}else if( tipoVeiculo.equalsIgnoreCase("moto")){
			 novo = new Moto(proprietario, placaVeiculo,  Integer.parseInt(anoVeiculo), marcaVeiculo, modeloVeiculo, corVeiculo, chassiVeiculo, cidadeVeiculo, estadoVeiculo);
		}
			
		
		VeiculoBusiness bancoVeiculo = (VeiculoBusiness) request.getServletContext().getAttribute("bancoVeiculo");
		
		bancoVeiculo.adicionar(novo);
		
		request.getServletContext().setAttribute("bancoVeiculo", bancoVeiculo);
		request.setAttribute("veiculoSelecionado", novo);
		request.setAttribute("cadastrado", Boolean.TRUE);
		
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}

	
	private void pesquisar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrou Controle Pesquisar");
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoPesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");
	
		VeiculoBusiness bancoVeiculo = (VeiculoBusiness) request.getServletContext().getAttribute("bancoVeiculo");
	
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();
		Veiculo resultadoEspecifico;
		Data dt = new Data();
		
		switch(tipoDePesquisa.toLowerCase()){

		case "proprietario":
			resultadoEspecifico = bancoVeiculo.pesquisarProprietario(campoDePesquisa);
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		case "placaVeiculo":
			resultadoEspecifico = bancoVeiculo.pesquisarPlacaVeiculo(campoDePesquisa);
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		case "tipoVeiculo":
			resultado = bancoVeiculo.pesquisarTipo(campoDePesquisa);
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		case "marcaVeiculo":
			resultado = bancoVeiculo.pesquisarMarcaVeiculo(campoDePesquisa);
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		case "modeloVeiculo":
			resultado = bancoVeiculo.pesquisarModeloVeiculo(campoDePesquisa);
			dispatcher =  "veiculo-pesquisar.jsp";
			break;
		case "anoVeiculo":
			resultado = bancoVeiculo.pesquisaAnoVeiculo( Integer.parseInt(campoDePesquisa));
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		case "corVeiculo":
			resultado = bancoVeiculo.pesquisarCorVeiculo(campoDePesquisa);
			dispatcher = "veiculo-pesquisar.jsp";
			break;
		default: 
			dispatcher = "veiculo.jsp";
		}
		
		request.setAttribute("listouVeiculo", Boolean.TRUE);
		request.setAttribute("resultadoPesquisa", resultado);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
	

	public void alterar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ENTROU");
		String dispatcher = "veiculo-detalhes.jsp";

		String cpfProprietario = request.getParameter("veiculoProprietario");
		String corVeiculo = request.getParameter("veiculoCor");
		String placaVeiculo = request.getParameter("veiculoPlaca");
		
		VeiculoBusiness bancoVeiculo = (VeiculoBusiness) request.getServletContext().getAttribute("bancoVeiculo");
		ClienteBusiness bancoCliente = (ClienteBusiness) request.getServletContext().getAttribute("bancoCliente");

		Veiculo veiculoAlterado = bancoVeiculo.pesquisarPlacaVeiculo(placaVeiculo);
		Cliente novoProprientario = bancoCliente.pesquisarCpf(cpfProprietario);

		
		veiculoAlterado.setProprietario(novoProprientario);
		veiculoAlterado.setCor(corVeiculo);

		bancoVeiculo.alterar(bancoVeiculo.pesquisarPlacaVeiculoIndex(placaVeiculo), veiculoAlterado);
		
		request.setAttribute("veiculoSelecionado", veiculoAlterado);
		request.setAttribute("alterado", Boolean.TRUE);
		request.getServletContext().setAttribute("bancoVeiculo", bancoVeiculo);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
		
	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entrou0");
		String dispatcher = "veiculo.jsp";
		System.out.println("Passou Dispatcher");
		String cpfProprietario = request.getParameter("veiculoProprietario");
		String placaVeiculo = request.getParameter("veiculoPlaca");
		System.out.println("Recebeu os Getparameter");
		
		VeiculoBusiness bancoVeiculo = (VeiculoBusiness) request.getServletContext().getAttribute("bancoVeiculo");
		System.out.println("Instanceou o Banco");
		int placaExluir = bancoVeiculo.pesquisarPlacaVeiculoIndex(placaVeiculo);
		System.out.println("Pegou a possição indice");
		System.out.println(placaExluir);
		
		bancoVeiculo.remover(placaExluir);
		
		request.setAttribute("excluido", Boolean.TRUE);
		request.getServletContext().setAttribute("bancoVeiculo", bancoVeiculo);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}
