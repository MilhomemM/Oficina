package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ConsertoBusiness;
import business.ServicoBusiness;
import business.VeiculoBusiness;
import model.Carro;
import model.Conserto;
import model.Data;
import model.Funilaria;
import model.Mecanica;
import model.Moto;
import model.Pintura;
import model.Servico;
import model.Veiculo;

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
		this.cadastrar(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String data = request.getParameter("clienteData");
		String veiculo = request.getParameter("clientePlacaVeiculo");
		String servicoCheckP = request.getParameter("consertoCheckP");
		String servicoCodigoP = request.getParameter("consertoCodigoPintura");
		String servicoCheckF = request.getParameter("consertoCheckF");
		String servicoCodigoF = request.getParameter("consertoCodigoFunilaria");
		String servicoCheckM = request.getParameter("consertoCheckM");
		String servicoCodigoM = request.getParameter("consertoCodigoMecanica");

		System.out.println("data: " + data);
		System.out.println("veiculo: " + veiculo);
		System.out.println("checkP: " + servicoCheckP);
		System.out.println("cdgP: " + servicoCodigoP);
		System.out.println("checkF: " + servicoCheckF);
		System.out.println("cdgF: " + servicoCodigoF);
		System.out.println("checkM: " + servicoCheckM);
		System.out.println("cdgM: " + servicoCodigoM);

		String mensagem = "";
		boolean erro = false;

		VeiculoBusiness bancoVeiculo = (VeiculoBusiness) request.getServletContext().getAttribute("bancoVeiculo");
		ServicoBusiness bancoServico = (ServicoBusiness) request.getServletContext().getAttribute("bancoServico");
		ConsertoBusiness bancoConserto = (ConsertoBusiness) request.getServletContext().getAttribute("bancoConserto");

		Veiculo v = bancoVeiculo.pesquisarPlacaVeiculo(veiculo);
		ArrayList<Servico> servicos = new ArrayList<Servico>();

		if (v != null) {
			if (v instanceof Carro) {
				if (servicoCheckP != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoP);
					System.out.println("ola");
					if (temp != null) {
						if (temp instanceof Pintura) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("carro")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de PINTURA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de PINTURA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de PINTURA informado não existe!\n";
						erro = true;
					}
				}

				if (servicoCheckF != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoF);
					if (temp != null) {
						if (temp instanceof Funilaria) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("carro")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de FUNILARIA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de FUNILARIA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de FUNILARIA informado não existe!\n";
						erro = true;
					}
				}

				if (servicoCheckM != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoM);
					if (temp != null) {
						if (temp instanceof Mecanica) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("carro")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de MECANICA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de MECANICA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de MECANICA informado não existe!\n";
						erro = true;
					}
				}
			} else if (v instanceof Moto) {
				System.out.println("CheckboxP");
				if (servicoCheckP != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoP);
					if (temp != null) {
						if (temp instanceof Pintura) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("moto")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de PINTURA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de PINTURA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de PINTURA informado não existe!\n";
						erro = true;
					}
				}
				System.out.println("CheckboxF");
				if (servicoCheckF != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoF);
					if (temp != null) {
						if (temp instanceof Funilaria) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("Moto")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de FUNILARIA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de FUNILARIA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de FUNILARIA informado não existe!\n";
						erro = true;
					}
				}
				System.out.println("CheckboxM");
				if (servicoCheckM != null) {
					Servico temp = bancoServico.pesquisarCodigo(servicoCodigoM);
					if (temp != null) {
						if (temp instanceof Mecanica) {
							if (temp.getTipoVeiculo().equalsIgnoreCase("Moto")) {
								servicos.add(temp);
							} else {
								mensagem += "O serviço de MECANICA informado não corresponde ao tipo de veículo informado!\n";
								erro = true;
							}
						} else {
							mensagem += "O codigo do serviço informado, não corresponde à uma instancia de MECANICA!\n";
							erro = true;
						}
					} else {
						mensagem += "O serviço de MECANICA informado não existe!\n";
						erro = true;
					}
				}
			}
		} else {
			mensagem += "Veiculo não encontrado!\n";
			erro = true;
		}

		Conserto novo;

		if (!erro) {
			Data dt = new Data();
			double total = 0.0;
			for (int i = 0; i < servicos.size(); i++)
				total += servicos.get(i).getPreco();
			
			novo = new Conserto(v, dt.returnDateInvertido(data), servicos, total);
			
			bancoConserto.adicionar(novo);

			request.getServletContext().setAttribute("bancoConserto", bancoConserto);
			request.setAttribute("consertoSelecionado", novo);
			request.setAttribute("agendado", Boolean.TRUE);
			
			request.getRequestDispatcher("conserto-detalhes.jsp").forward(request, response);
		} else {
			request.setAttribute("agendamentoErro", Boolean.TRUE);
			request.setAttribute("mensagemErro", mensagem);
			
			request.getRequestDispatcher("conserto-agendar.jsp").forward(request, response);
		}
	}

	private void pesquisar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dispatcher;
		String tipoDePesquisa = request.getParameter("tipoPesquisa");
		String campoDePesquisa = request.getParameter("campoDePesquisa");

		ConsertoBusiness bancoConserto = (ConsertoBusiness) request.getServletContext().getAttribute("bancoConserto");

		ArrayList<Conserto> resultado = new ArrayList<Conserto>();
		Conserto resultadoEspecifico;
		Data dt = new Data();

		switch (tipoDePesquisa.toLowerCase()) {

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
		// case "preco":
		// resultado = bancoConserto.pesquisarPreco(0,
		// Double.parseDouble(campoDePesquisa));
		// dispatcher = "conserto-pesquisar.jsp";
		// break;
		default:
			dispatcher = "Home.jsp";
		}

		request.setAttribute("listouConserto", Boolean.TRUE);
		request.setAttribute("resultadoPesquisa", resultado);
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}
