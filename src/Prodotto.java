public class Prodotto {
	private String codice;
	private String nome;
	private double prezzo;
	private boolean zucchero;
	
	public Prodotto(String codice, String nome, double prezzo, boolean zucchero) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.zucchero = zucchero;
	}
	
	@Override
	public String toString() {
		String value = "senza zucchero";
		if (zucchero) {
			value = "con zucchero";
		}
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", prezzo=" + prezzo + ", zucchero=" + value + "]";
	}
	
	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public boolean isZucchero() {
		return zucchero;
	}
	
	public void setZucchero(boolean zucchero) {
		this.zucchero = zucchero;
	}
	
	public static void main(String[] args) {
		Prodotto prod = new Prodotto("X", "Dolce", 5, true);
		
		System.out.println(prod);
	}
}
