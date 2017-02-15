// Versione beta
public class Domanda {
	private String testo;
	private String[] risposte;
	private boolean [] corrette;
	private boolean rispSing;
	private int posRisp=0;
	private int rispSelected;
	
	private int [] rispSelectedMult;
	private int posRispMult = 0;
	
	public Domanda(boolean rS) {
		rispSing=rS;
		rispSelectedMult = new int[4];
	}
	
	public Domanda( int n,String t, boolean rS) {
		testo=t;
		rispSing=rS;
		risposte=new String[n];
		corrette=new boolean[n];
		rispSelectedMult = new int[4];
	}
	
	public void setRispCorr(int pos) {
		corrette[pos]=true;
	}
	
	public void setRisp(String[] risp) {
		risposte=risp;
		
	}
	
	public void setRispSelezionata(int r){
		rispSelected = r;
	}
	
	public int getRispSelected(){
		return rispSelected;
	}
	
	public void setRispSelezionataMult(int r){
		rispSelectedMult[posRispMult] = r;
		posRispMult++;
	}
	
	public int[] getRispSelectedMult(){
		return rispSelectedMult;
	}
	
	public boolean isRispSing() {
		return rispSing;
	
	}
	
	public String getTesto(){
		return testo;
	}
	
	public String getRisp(int n){
		return risposte[n];
	}
	
	public int getRispCorrSing(){
		for (int i = 0; i < 4; i++) {
			if (corrette[i]==true) {
				return i;
			}
		}
		return 0;
	}
	
	public int[] getRispCorrMul(){
		int[] corr = new int[2];
		for (int i = 0,j=0; i < 4; i++) {
			if (corrette[i]==true) {
				corr[j]=i;
				j++;
			}
		}
		return corr;
	}
}
