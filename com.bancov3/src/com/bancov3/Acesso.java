package com.bancov3;

public class Acesso {
	//ATTRIBUTES
	private boolean nivelAgencia;
	private boolean nivelCaixa;
	private boolean nivelSalaReuniao;
	private boolean nivelCofre;
	private boolean nivelArquivos;
	//CONSTRUCTOR
	public Acesso(){
		setNivelAgencia(false);
		setNivelCaixa(false);
		setNivelSalaReuniao(false);
		setNivelCofre(false);
		setNivelArquivos(false);
	}
	//METHODS
	//GETTERS & SETTERS
	public boolean isNivelAgencia() {
		return nivelAgencia;
	}
	public void setNivelAgencia(boolean nivelAgencia) {
		this.nivelAgencia = nivelAgencia;
	}
	public boolean isNivelCaixa() {
		return nivelCaixa;
	}
	public void setNivelCaixa(boolean nivelCaixa) {
		this.nivelCaixa = nivelCaixa;
	}
	public boolean isNivelSalaReuniao() {
		return nivelSalaReuniao;
	}
	public void setNivelSalaReuniao(boolean nivelSalaReuniao) {
		this.nivelSalaReuniao = nivelSalaReuniao;
	}
	public boolean isNivelCofre() {
		return nivelCofre;
	}
	public void setNivelCofre(boolean nivelCofre) {
		this.nivelCofre = nivelCofre;
	}
	public boolean isNivelArquivos() {
		return nivelArquivos;
	}
	public void setNivelArquivos(boolean nivelArquivos) {
		this.nivelArquivos = nivelArquivos;
	}
}
