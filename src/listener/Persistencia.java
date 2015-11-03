package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import business.AdministradorBusiness;
import business.ClienteBusiness;
import business.ConsertoBusiness;
import business.ServicoBusiness;
import business.VeiculoBusiness;
import model.Administrador;
import model.Cliente;
import model.Data;
import model.Funilaria;
import model.Mecanica;
import model.Pintura;
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

		bancoAdministrador.adicionar(new Administrador("Filipe Facundo Bezerra", "06547236941", "20104750514",
				"Masculino", data.returnDate(23, 06, 1994), new Usuario("filipe", "123456")));
		bancoAdministrador.adicionar(new Administrador("Ruan Vitor", "06544336941", "20104750548", "Masculino",
				data.returnDate(23, 07, 1995), new Usuario("ruan", "654123")));
		bancoAdministrador.adicionar(new Administrador("Vlabson Fernandes", "06544337431", "20014750578", "Masculino",
				data.returnDate(27, 06, 1985), new Usuario("vlabson", "258456")));
		bancoAdministrador.adicionar(new Administrador("Flavio Alves da Costa", "06544337431", "20084750548",
				"Masculino", data.returnDate(25, 03, 1996), new Usuario("flavio", "147258")));
		bancoAdministrador.adicionar(new Administrador("Marcelo Millhomen", "06544337431", "20004750595", "Masculino",
				data.returnDate(24, 04, 1995), new Usuario("marcelo", "159753")));
		bancoAdministrador.adicionar(new Administrador("PaulaBras", "06544337431", "20004750595", "Feminino",
				data.returnDate(21, 05, 1990), new Usuario("paulo", "789456")));

		bancoCliente.adicionar(new Cliente("Flavio Alves da Costa", "9876543210", "12345678900", "Masculino",
				data.returnDate(16, 04, 1996), "flavio@gmail.com", "707070"));
		bancoCliente.adicionar(new Cliente("Chico Baladeira Fernandes", "9876543210", "98765432100", "Masculino",
				data.returnDate(01, 05, 1974), "chicobaladeira@gmail.com,", "808080"));

		bancoServico.adicionar(new Pintura("SERV0001","Carro", "Tira risco", 300.00, "Vermelho", "Porta lateral direita"));
		bancoServico.adicionar(new Pintura("SERV0002","Moto", "Pintura completa", 400.00, "Preta", "Tanque"));
		bancoServico.adicionar(new Funilaria("SERV0003","Carro", "Martelinho de ouro", 600.00, "Porta lateral direita"));
		bancoServico.adicionar(new Funilaria("SERV0004","Moto", "Desamassamento", 250.00, "Porta lateral direita"));
		bancoServico.adicionar(new Mecanica("SERV0005","Carro", "Troca de Óleo", 300.00));
		bancoServico.adicionar(new Mecanica("SERV0006","Moto", "Troca do fuído do freio", 300.00));
//
//		bancoConserto.adicionar(
//				new Conserto(bancoCliente.pesquisarCpf("12345678900"), bancoVeiculo.pesquisarPlaca("NXZ2015"),
//						data.returnDate(16, 04, 2015), bancoServico.pesquisarCodigo("PMF0"),
//						bancoServico.pesquisarCodigo("PMF1"), bancoServico.pesquisarCodigo("PMF2"), 450.00));
//		bancoConserto.adicionar(
//				new Conserto(bancoCliente.pesquisarCpf("98765432100"), bancoVeiculo.pesquisarPlaca("ABC0532"),
//						data.returnDate(26, 03, 2016), bancoServico.pesquisarCodigo("PMF0"),
//						bancoServico.pesquisarCodigo("PMF1"), bancoServico.pesquisarCodigo("PMF2"), 340.00));

		contexto.getServletContext().setAttribute("bancoAdministrador", bancoAdministrador);
		contexto.getServletContext().setAttribute("bancoCliente", bancoCliente);
		contexto.getServletContext().setAttribute("bancoVeiculo", bancoVeiculo);
		contexto.getServletContext().setAttribute("bancoServico", bancoServico);
		contexto.getServletContext().setAttribute("bancoConserto", bancoConserto);
	}
}
