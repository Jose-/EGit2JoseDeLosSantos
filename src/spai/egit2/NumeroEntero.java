package spai.egit2;

public class NumeroEntero {
	private int valor;

	public NumeroEntero(int valor) {
		this.valor = valor;
	}

	public NumeroEntero() {
		this(0);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public void incrementar() {
		this.setValor(this.valor + 1);
	}

	public void doblar() {
		this.setValor(this.valor * 2);
	}

	public void decrementar() {
		this.valor--;
	}

	public int sumar(int i, int j) {
		return -1;
	}

	public int multiplicar(int i, int j) {
		return -1;
	}
}
