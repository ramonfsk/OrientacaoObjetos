public class Piloto {
	//ATRIBUTES
	private String nome, equipe, nacionalidade;
	private int idade, codigo, sumVoltasCorrida, ptsCampeonato;
	//CONSTRUCTOR
	public Piloto(int codigo, String nome, int idade, String equipe, String nacionalidade){
		setCodigo(codigo);
		setNome(nome);
		setIdade(idade);
		setEquipe(equipe);
		setNacionalidade(nacionalidade);
		setSumVoltasCorrida(0);
		setPtsCampeonato(0);
	}
	//METHODS
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getSumVoltasCorrida() {
		return sumVoltasCorrida;
	}
	public void setSumVoltasCorrida(int sumVoltasCorrida) {
		this.sumVoltasCorrida = sumVoltasCorrida;
	}
	public int getPtsCampeonato() {
		return ptsCampeonato;
	}
	public void setPtsCampeonato(int ptsCampeonato) {
		this.ptsCampeonato = ptsCampeonato;
	}
}
