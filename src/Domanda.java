

public class Domanda {
	private String testo;
	private String[] risposte;
	private boolean [] corrette;
	private boolean rispSing;
	private int posRisp=0;
	
	public Domanda(boolean rS) {
		rispSing = rS;
	}
	
	public void Domanda(int n,String t, boolean rS) {
		testo = t;
		rispSing = rS;
		risposte = new String[n];
		corrette = new boolean[n];
		
	}
	
	public void setRispCorr(int pos) {
		corrette[pos] = true;
	}
	
	public void setRisp(String risp) {
		risposte[posRisp] = risp;
	}
	
	public boolean isRispSing() {
		return rispSing;
	}
	
	public String getTesto(){
		return testo;
	}
	
	public String getRisp(int pos){
		return risposte[pos];
	}
	
}
