
public class IngressoVIP extends Ingresso{
	private double valorIngressoMeia = 24.0;
	private double valorIngressoInteira = 48.0;
	
	public double getValorIngressoMeia() {
		return valorIngressoMeia;
	}
	
	public double getValorIngressoInteira() {
		return valorIngressoInteira;
	}
	
	public void acessoLanchonete() {
		System.out.println("LANCHONETE LIBERADA!");
	}
	
	public double comprar(int qtdIngressoInteira, int qtdIngressoMeia) {
		
		return (qtdIngressoInteira * valorIngressoInteira) + (qtdIngressoMeia * valorIngressoMeia);
		
	}

	@Override
	public String toString() {
		return "IngressoVIP [valorIngressoMeia=" + valorIngressoMeia + ", valorIngressoInteira=" + valorIngressoInteira
				+ "]";
	}
	
	
}
