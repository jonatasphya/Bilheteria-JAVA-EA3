import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String nome;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracaoFilme;
	private List<Filme> filmes = new ArrayList<>();
	private boolean filme3D = false;
	
	public Filme() {}
	
	public Filme(String nome, String diretor, String descricao, String genero, String duracaoFilme, boolean filme3D) {
		this.nome = nome;
		this.diretor = diretor;
		this.descricao = descricao;
		this.genero = genero;
		this.duracaoFilme = duracaoFilme;
		this.filme3D = filme3D;
	}
	
	public Filme(String nome, String diretor, String descricao, String genero, String duracaoFilme) {
		this.nome = nome;
		this.diretor = diretor;
		this.descricao = descricao;
		this.genero = genero;
		this.duracaoFilme = duracaoFilme;
	}
	
	public boolean isFilme3D() {
		return filme3D;
	}
	public void setFilme3D(boolean filme3d) {
		filme3D = filme3d;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracaoFilme() {
		return duracaoFilme;
	}
	public void setDuracaoFilme(String duracaoFilme) {
		this.duracaoFilme = duracaoFilme;
	}
	
	@Override
	public String toString() {
		String O3D;
		if(filme3D == true) {
			O3D = "SIM";
		}else {
			O3D = "NÃO";
		}
		return "NOME: " + nome + "\nDIREÇÃO: " + diretor + "\n\nSINOPSE: " + descricao + "\nGENERO: " + genero
				+ "\nDURAÇÃO: " + duracaoFilme + "\n3D: " + O3D;
	}
	

}
