import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class MenuController {

	Scanner sc = new Scanner(System.in);
	Ingresso ingresso = new Ingresso();
	IngressoVIP ingressoVIP = new IngressoVIP();

	public void menuFilmes() {
		Filme filmes = new Filme();
		
		Filme filme01 = new Filme("Duna", 
				"Denis Villeneuve", 
				"Paul Atreides é um jovem brilhante, "
				+ "\ndono de um destino além de sua compreensão. \n"
				+ "Ele deve viajar para o planeta mais perigoso \n"
				+ "do universo para garantir o futuro de seu povo.\n", 
				"Ficção científica/Aventura", 
				"2h 35m", false);
		
		Filme filme02 = new Filme("Matrix",
				"Lana Wachowski, Lilly Wachowski",
				"Um jovem programador é atormentado \n" 
				+ "por estranhos pesadelos nos quais sempre está \n"
				+ "conectado por cabos a um imenso sistema de computadores \n"
				+ "do futuro. À medida que o sonho se repete, ele começa a \n"
				+ "levantar dúvidas sobre a realidade. E quando encontra os \n"
				+ "misteriosos Morpheus e Trinity, ele descobre que é vítima \n"
				+ "do Matrix, um sistema inteligente e artificial que manipula \n"
				+ "a mente das pessoas e cria a ilusão de um mundo real enquanto \n"
				+ "usa os cérebros e corpos dos indivíduos para produzir energia.\n",
				"Ação/Ficção científica", 
				"2h 26m", true);
		
		Filme filme03 = new Filme("Blade Runner 2049",
				"Denis Villeneuve",
				"Após descobrir um segredo que ameaça o que resta \n"
				+ "da sociedade, um novo policial parte em busca de Rick Deckard, \n"
				+ "que está desaparecido há 30 anos.\n",
				"Ficção científica/Ação",
				"2h 43m", true);
		
		Filme filme04 = new Filme("K-PAX - O Caminho da Luz",
				"Iain Softley",
				"Misterioso paciente de um hospital psiquiátrico afirma \n"
				+ "pertencer a um planeta distante chamado K-PAX. À medida que seu \n"
				+ "psiquiatra tenta ajudá-lo, ele percebe que o possível alienígena \n"
				+ "está causando um efeito extraordinário na saúde mental de outros \n" 
				+ "pacientes da instituição.",
				"Ficção científica/Drama",
				"2h 1m");
		
		Filme filme05 = new Filme("A Chegada",
				"Denis Villeneuve",
				"Naves alienígenas chegaram às principais cidades do mundo. \n"
				+ "Com a intenção de se comunicar com os visitantes, uma linguista e um \n"
				+ "militar são chamados para decifrar as estranhas mensagens dos visitantes.\n",
				"Ficção científica/Thriller",
				"1h 56m");
		
		Filme filme06 = new Filme("Prometheus",
				"Ridley Scott",
				"Este prelúdio do filme Alien conta a história de \n"
				+ "uma equipe de cientistas que embarca em uma jornada espacial \n"
				+ "para descobrir a verdade sobre a origem da raça humana. \n"
				+ "No planeta de destino, eles encontram criaturas poderosas \n" + "e revelações assustadoras.\n",
				"Ficção científica/Terror",
				"2h 4m", true);
		
		Filme filme07 = new Filme("Amadeus",
				"Miloš Forman",
				"Após tentar se suicidar, Salieri (F. Murray Abraham) \n"
				+ "confessa a um padre que foi o responsável pela morte de Mozart (Tom Hulce) \n"
				+ "e relata como conheceu, conviveu e passou a odiar Mozart, que era um jovem \n"
				+ "irreverente mas compunha como se sua música tivesse sido abençoada por Deus.\n",
				"Drama/História",
				"2h 40m", false);
		
		Filme filme08 = new Filme("Interestelar",
				"Christopher Nolan",
				"As reservas naturais da Terra estão chegando ao fim \n"
				+ "e um grupo de astronautas recebe a missão de verificar \n"
				+ "possíveis planetas para receberem a população mundial, \n"
				+ "possibilitando a continuação da espécie. Cooper é chamado \n"
				+ "para liderar o grupo e aceita a missão sabendo que pode nunca \n"
				+ "mais ver os filhos. Ao lado de Brand, Jenkins e Doyle, ele \n"
				+ "seguirá em busca de um novo lar.", 
				"Ficção científica/Aventura", 
				"2h 49m", true);
		
		Filme filme09 = new Filme("Perdido em Marte",
				"Ridley Scott",
				"O astronauta Mark Watney é enviado a uma missão para Marte, \n"
				+ "mas após uma severa tempestade, ele é dado como morto, \n"
				+ "abandonado pelos colegas e acorda sozinho no planeta inóspito \n"
				+ "com escassos suprimentos e sem saber como reencontrar os \n"
				+ "companheiros ou retornar à Terra. Ele inicia então uma dura luta \n"
				+ "pela própria sobrevivência, utilizando de todo o seu conhecimento científico \n"
				+ "para fazer contato e retornar para casa.", 
				"Ficção científica/Drama", "2h 24m");
		
		Filme filme10 = new Filme("Oblivion", 
				"Joseph Kosinski",
				"Em 2077, Jack Harper é o responsável pela manutenção de equipamentos de segurança \n"
				+ "em um planeta Terra irreconhecível, que foi destruído por uma raça alienígena. \n"
				+ "O que restou da humanidade vive hoje em uma colônia lunar, para onde Jack irá assim \n"
				+ "que terminar seu trabalho na Terra. Porém um dia, ele encontra a espaçonave \n"
				+ "de uma mulher e, ao conhecê-la, tudo o que Jack sabe até então é posto em dúvida, \n"
				+ "iniciando-se uma jornada em que ele precisará descobrir o que realmente aconteceu no passado.",
				"Ficção científica/Ação",
				"2h 24m", true);
		

		filmes.setFilmes(List.of(
				filme01, 
				filme02, 
				filme03, 
				filme04, 
				filme05, 
				filme06, 
				filme07, 
				filme08,
				filme09,
				filme10));

		int i = 1;
		int opc;

		System.out.println("FILMES");

		for (Filme a : filmes.getFilmes()) {
			if (a.isFilme3D() == true) {
				System.out.println(i + " - " + a.getNome() + "(3D)");
			} else {
				System.out.println(i + " - " + a.getNome());
			}
			i++;
		}

		System.out.print("SELECIONE O FILME: ");
		opc = sc.nextInt();

		mostrarDadosFilme(opc, filmes);

	}

	private final void mostrarDadosFilme(int opc, Filme filme) {

		System.out.println(filme.getFilmes().get(opc - 1));
		System.out.print("SELECIONAR ESTE FILME? (S/N): ");
		String SN = sc.next();
		if (SN.equals("s") || SN.equals("S")) {
			ingresso.setFilmeSelecionado(List.of(filme.getFilmes().get(opc - 1)));
			selecionarSessoes();
		} else {
			menuFilmes();
		}
	}

	private final void selecionarSessoes() {

		ArrayList<String> arrSessoes = new ArrayList<>(Arrays.asList("14:30", "15:00", "16:30", "17:00", "17:30",
				"18:00", "19:00", "19:30", "20:30", "21:00"));

		System.out.println("SESSÕES");
		int i = 1;
		for (String horarios : arrSessoes) {
			System.out.println(i + " - " + horarios);
			i++;
		}

		System.out.print("DIGITE O NÚMERO CORRESPONDENTE A SESSÃO: ");
		int opc = sc.nextInt();
		ingresso.setHorarioSecao(arrSessoes.get(opc - 1));
		selecionarIngressos();
	}

	private final void selecionarIngressos() {

		System.out.println("ESCOLHA O TIPO DE INGRESSO\n1 - VIP\n2 - NORMAL\n0 - INICIO\nESCOLHA: ");
		int opc = sc.nextInt();

		if (opc == 1) {
			ingressoVIP.setFilmeSelecionado(ingresso.getFilmeSelecionado());
			ingressoVIP.setHorarioSecao(ingresso.getHorarioSecao());
			System.out.println("(VIP) QUANTAS ENTRADAS INTEIRAS (R$ 48,00)? ");
			ingressoVIP.setIngressoInteira(sc.nextInt());
			System.out.println("(VIP) QUANTAS ENTRADAS MEIAS (R$ 24,00)? ");
			ingressoVIP.setIngressoMeia(sc.nextInt());
			finalizaCompra(true);
		} 
		else if (opc == 2) 
		{

			if (ingresso.getFilmeSelecionado().get(0).isFilme3D() == false) 
			{
				System.out.println("QUANTAS ENTRADAS INTEIRAS (R$ 24,00)? ");
				ingresso.setIngressoInteira(sc.nextInt());
				System.out.println("QUANTAS ENTRADAS MEIAS (R$ 12,00)? ");
				ingresso.setIngressoMeia(sc.nextInt());
				finalizaCompra();
			} 
			else 
			{
				System.out.println("ESTE FILME SOMENTE PODERÁ SER ADICIONADO A INGRESSOS VIP");
				selecionarIngressos();
			}
		} else {
			menuFilmes();
		}
	}

	private final void finalizaCompra(boolean vip) {

		if (vip == true) {
			double totalIngressos = ingressoVIP.comprar(ingressoVIP.getIngressoInteira(), ingressoVIP.getIngressoMeia());

			System.out.println("VOCÊ IRÁ ASSISTIR " + ingressoVIP.getFilmeSelecionado().get(0).getNome()
					+ "\nNA SESSÃO DE " + ingressoVIP.getHorarioSecao());

			System.out.println("INTEIRAS: " + ingressoVIP.getIngressoInteira() + " x R$ 48,00");
			System.out.println("MEIAS: " + ingressoVIP.getIngressoMeia() + " x R$ 24,00");
			System.out.println("TOTAL A PAGAR: "
					+ NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(totalIngressos));
			ingressoVIP.acessoLanchonete();
		}
	}

	private final void finalizaCompra() {

		double totalIngressos = ingresso.comprar(ingresso.getIngressoInteira(), ingresso.getIngressoMeia());

		System.out.println("VOCÊ IRÁ ASSISTIR " + ingresso.getFilmeSelecionado().get(0).getNome() + "\nNA SESSÃO DE "
				+ ingresso.getHorarioSecao());

		System.out.println("INTEIRAS: " + ingresso.getIngressoInteira() + " x R$ 24,00");
		System.out.println("MEIAS: " + ingresso.getIngressoMeia() + " x R$ 12,00");
		System.out.println(
				"TOTAL A PAGAR: " + NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(totalIngressos));
		ingresso.acessoLanchonete();
	}

}
