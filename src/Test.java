

public class Test {
	private Domanda[] domande;
	private int num,pos=0;
	
	public Test(int n) {
		num = n;
		domande = new Domanda[num];
	}
	
	public void addDomanda(Domanda d) {
		if (pos<num) {
			domande[pos]=d;
		}
	}
	
	public Domanda getDomanda(int n) {
		return domande[n];
	}
	
	public int getNum() {
		return num;
	}
}
