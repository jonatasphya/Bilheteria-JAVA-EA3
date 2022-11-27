import java.util.ArrayList;
import java.util.List;

public class Ingresso {

	private int ingressoMeia;
	private int ingressoInteira;
	private String horarioSecao;
	private double valorIngressoMeia = 12.0;
	private double valorIngressoInteira = 24.0;
	private List<Filme> filmeSelecionado = new ArrayList<>();

	public List<Filme> getFilmeSelecionado() {
		return filmeSelecionado;
	}
	public void setFilmeSelecionado(List<Filme> filmeSelecionado) {
		this.filmeSelecionado = filmeSelecionado;
	}
	
	public int getIngressoMeia() {
		return ingressoMeia;
	}
	public void setIngressoMeia(int ingressoMeia) {
		this.ingressoMeia = ingressoMeia;
	}
	public int getIngressoInteira() {
		return ingressoInteira;
	}
	public void setIngressoInteira(int ingressoInteira) {
		this.ingressoInteira = ingressoInteira;
	}
	public String getHorarioSecao() {
		return horarioSecao;
	}
	public void setHorarioSecao(String horarioSecao) {
		this.horarioSecao = horarioSecao;
	}
	public double getValorIngressoMeia() {
		return valorIngressoMeia;
	}
	
	public double getValorIngressoInteira() {
		return valorIngressoInteira;
	}
	
	public void acessoLanchonete() {
		System.out.println("PARA ACESSO A LANCHONETE, COMPRE INGRESSOS VIP!");
	}

	
	@Override
	public String toString() {
		return "Ingresso [filme=" + filmeSelecionado.get(0) + ", ingressoMeia=" + ingressoMeia + ", ingressoInteira=" + ingressoInteira
				+ ", horarioSecao=" + horarioSecao + ", valorIngressoMeia=" + valorIngressoMeia
				+ ", valorIngressoInteira=" + valorIngressoInteira + "]";
	}
	
	

}
