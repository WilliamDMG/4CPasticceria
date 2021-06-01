/**
 * 
 * @author William
 *
 */

public class Pasticceria {
	private String nome;
	private String citta;
	private int nProdotti;
	private Prodotto[] prodotti;
	
	public Pasticceria(String nome, String citta, int size) {
		this.nome = nome;
		this.citta = citta;
		this.nProdotti = 0;
		this.prodotti = new Prodotto[size];
	}
	
	@Override
	public String toString() {
    	String prodottiPresenti = "[\n\t";
    	for (int i = 0; i < nProdotti; i++) {
    		prodottiPresenti += prodotti[i].toString();
    		if (i < (nProdotti- 1)) {
    			prodottiPresenti += ", \n\t";
    		} else {
    			prodottiPresenti += "]\n";
    		}
		}
		return "Pasticceria [nome=" + nome + ", citta=" + citta + ", nProdotti=" + nProdotti + ", prodotti=" + prodottiPresenti + "]";
	}
	
	public boolean aggiungiProdotto(Prodotto prod) {
		if (nProdotti < prodotti.length) {
			prodotti[nProdotti] = prod;
	    	nProdotti++;
	    	return true;
    	}
        return false;
	}
	
    public boolean rimuoviProdotto(String codice) {
    	for (int i = 0; i < nProdotti; i++) {
			if (prodotti[i].getCodice().compareToIgnoreCase(codice) == 0) {
				for (int j = i; j < nProdotti - 1; j++) {
					prodotti[j] = prodotti[j + 1];
				}
				nProdotti--;
		    	return true;
			}
		}
        return false;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public int getnProdotti() {
		return nProdotti;
	}
	
	public void setnProdotti(int nProdotti) {
		this.nProdotti = nProdotti;
	}
	
	public Prodotto[] getProdotti() {
		return prodotti;
	}
	
	public void setProdotti(Prodotto[] prodotti) {
		this.prodotti = prodotti;
	}
	
	public static void main(String[] args) {
		Pasticceria past = new Pasticceria("MUSIO", "RUFFANO", 2);
		Prodotto prod = new Prodotto("X", "Dolce", 5, true);
		Prodotto prod2 = new Prodotto("Y", "Dolce2", 10, false);
		Prodotto prod3 = new Prodotto("Z", "Dolce3", 15, false);
		
		System.out.println(past.aggiungiProdotto(prod));
		System.out.println(past.aggiungiProdotto(prod2));
		System.out.println(past.aggiungiProdotto(prod3));
		
		System.out.println(past);
		
		//System.out.println(past.rimuoviProdotto("X"));
		
		//System.out.println(past);
	}
}
