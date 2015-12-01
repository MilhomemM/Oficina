package listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import business.AdministradorBusiness;
import business.ClienteBusiness;
import business.ConsertoBusiness;
import business.ServicoBusiness;
import business.VeiculoBusiness;
import model.Administrador;
import model.Carro;
import model.Cliente;
import model.Conserto;
import model.Data;
import model.Funilaria;
import model.Mecanica;
import model.Moto;
import model.Pintura;
import model.Servico;
import model.Usuario;

/**
 * Application Lifecycle Listener implementation class Persistencia
 *
 */
@WebListener
public class Persistencia implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public Persistencia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent contexto) {
		System.out.println("Aplicação finalizada...");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent contexto) {
		System.out.println("Iniciando aplicação...");
		System.out.println("Gerando persistencia...");

		AdministradorBusiness bancoAdministrador = new AdministradorBusiness();
		ClienteBusiness bancoCliente = new ClienteBusiness();
		VeiculoBusiness bancoVeiculo = new VeiculoBusiness();
		ServicoBusiness bancoServico = new ServicoBusiness();
		ConsertoBusiness bancoConserto = new ConsertoBusiness();

		Data data = new Data();

		bancoAdministrador
				.adicionar(new Administrador("Flavio Alves da Costa", "12345678900", "55533322200", "Masculino",
						data.returnDate(16, 04, 1996), "flavioalves996@gmail.com", new Usuario("Flavio", "Delicinha")));
		bancoAdministrador.adicionar(new Administrador("Marcelo Milhomen Lourenço", "06544337431", "20004750595",
				"Masculino", data.returnDate(24, 04, 1995), "zemaria@gmail.com", new Usuario("Marcelo", "ZeMaria")));
		bancoAdministrador.adicionar(new Administrador("Vlabson Viana", "06544337432", "20014750578", "Masculino",
				data.returnDate(27, 06, 1985), "vlabson@gmail.com", new Usuario("Vlabson", "Dimmy")));
		bancoAdministrador.adicionar(new Administrador("Ruan Vitor", "06544336941", "20104750548", "Masculino",
				data.returnDate(23, 07, 1995), "saci@gmail.com", new Usuario("Ruan", "Melissao")));
		bancoAdministrador.adicionar(new Administrador("Filipe Facundo Bezerra", "06547236941", "20104750514",
				"Masculino", data.returnDate(23, 06, 1994), "fofinho@gmail.com", new Usuario("Filipe", "CSS")));
		bancoAdministrador.adicionar(new Administrador("Paula Bras", "06544337433", "20004750595", "Feminino",
				data.returnDate(21, 05, 1990), "paula_tejano@gmail.com", new Usuario("paula", "tejano")));
		// Teste
		System.out.println("Administradores ("+bancoAdministrador.getSize()+"):");
		for (int i = 0; i < bancoAdministrador.getSize(); i++) {
			System.out.println(bancoAdministrador.getBanco().get(i));
		}
		// Fim teste

		bancoCliente.adicionar(new Cliente("Flavio Alves da Costa", "9876543210", "12345678900", "Masculino",
				data.returnDate(16, 04, 1996), "flavio@gmail.com", "707070"));
		bancoCliente.adicionar(new Cliente("Ruan Vitor De Souza Soares", "9876543211", "98765432100", "Masculino",
				data.returnDate(01, 05, 1974), "chicobaladeira@gmail.com,", "808080"));
		bancoCliente.adicionar(new Cliente("Paulinha Brazz Fernandes", "98765432112", "982765432100", "Feminino",
				data.returnDate(15, 06, 1984), "paulinha.brazz@gmail.com,", "80808120"));
		bancoCliente.adicionar(new Cliente("Melissão Silva Costa", "987621543211", "987654322100", "Feminino",
				data.returnDate(22, 07, 1994), "melissão@gmail.com,", "8080821210"));
		bancoCliente.adicionar(new Cliente("Marcello Millhomen", "9287621543211", "2987654322100", "Masculino",
				data.returnDate(31, 11, 1984), "boquinha@gmail.com,", "8080821210"));
		bancoCliente.adicionar(new Cliente("Vlabson Viana", "9816523310", "94345378920", "Masculino",
				data.returnDate(24, 11, 1938), "dimmy_neutron@gmail.com", "70707210"));
		bancoCliente.adicionar(new Cliente("Thiago Leite", "298726212543211", "398736534322100", "Masculino",
				data.returnDate(21, 03, 1994), "inputi_taipe@gmail.com,", "8081210821210"));
		// Teste
		System.out.println("Clientes ("+bancoCliente.getSize()+"):");
		for (int i = 0; i < bancoCliente.getSize(); i++) {
			System.out.println(bancoCliente.getBanco().get(i));
		}
		// Fim teste

		bancoVeiculo.adicionar(new Carro(bancoCliente.getBanco().get(0), "NXZ2015", 2012, "Renault", "Logan", "Prata",
				"1234567890", "Fortaleza", "Ceará"));
		bancoVeiculo.adicionar(new Moto(bancoCliente.getBanco().get(1), "ABC123", 2015, "Honda", "Titan 250", "Preta",
				"25123125423452", "Fortaleza", "Ceará"));
		// Teste
		System.out.println("Veiculos ("+bancoVeiculo.getSize()+"):");
		for (int i = 0; i < bancoVeiculo.getSize(); i++) {
			System.out.println(bancoVeiculo.getBanco().get(i));
		}
		// Fim teste

		bancoServico.adicionar(new Pintura("Carro", "Tira risco", 300.00, "Vermelho", "Porta lateral direita"));
		bancoServico.adicionar(new Pintura("Moto", "Pintura completa", 400.00, "Preta", "Tanque"));
		bancoServico.adicionar(new Funilaria("Carro", "Martelinho de ouro", 600.00, "Porta lateral direita"));
		bancoServico.adicionar(new Funilaria("Moto", "Desamassamento", 250.00, "Porta lateral direita"));
		bancoServico.adicionar(new Mecanica("Carro", "Troca de Óleo", 300.00));
		bancoServico.adicionar(new Mecanica("Moto", "Troca do fuído do freio", 300.00));
		// Teste
		System.out.println("Serviços ("+bancoServico.getSize()+"):");
		for (int i = 0; i < bancoServico.getSize(); i++) {
			System.out.println(bancoServico.getBanco().get(i));
		}
		// Fim teste
		System.out.println("1");

		ArrayList<Servico> aux;

		aux = new ArrayList<Servico>();
		aux.add(bancoServico.getBanco().get(0));
		aux.add(bancoServico.getBanco().get(4));
		bancoConserto.adicionar(new Conserto(bancoVeiculo.getBanco().get(0), data.returnDate(16, 04, 1996), aux,
				bancoServico.getBanco().get(0).getPreco() + bancoServico.getBanco().get(4).getPreco()));
		
		contexto.getServletContext().setAttribute("bancoAdministrador", bancoAdministrador);
		contexto.getServletContext().setAttribute("bancoCliente", bancoCliente);
		contexto.getServletContext().setAttribute("bancoVeiculo", bancoVeiculo);
		contexto.getServletContext().setAttribute("bancoServico", bancoServico);
		contexto.getServletContext().setAttribute("bancoConserto", bancoConserto);

		// PARA TESTES
		System.out.println(bancoAdministrador.getBanco().get(0));
		contexto.getServletContext().setAttribute("administradorSelecionado", bancoAdministrador.getBanco().get(0));
		System.out.println(bancoCliente.getBanco().get(0));
		contexto.getServletContext().setAttribute("clienteSelecionado", bancoCliente.getBanco().get(0));
		System.out.println(bancoVeiculo.getBanco().get(0));
		contexto.getServletContext().setAttribute("veiculoSelecionado", bancoVeiculo.getBanco().get(0));
		System.out.println(bancoServico.getBanco().get(0));
		contexto.getServletContext().setAttribute("servicoSelecionado", bancoServico.getBanco().get(0));
		System.out.println(bancoConserto.getBanco().get(0));
		contexto.getServletContext().setAttribute("consertoSelecionado", bancoConserto.getBanco().get(0));
	}
}