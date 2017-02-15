//Versione beta
public class Test {
	private Domanda[] domande;
	private int num,pos=0;
	
	
	public Test(int n) {
		num=n;
		domande=new Domanda[num];
	
	}
	
	public void addDomanda(Domanda d) {
		if(pos<num)
			domande[pos]=d;
		pos++;
	
	}
	
	public void ordina(){
		do{
		for(int i=0;i<3;i++){
			if(domande[i].isRispSing()==false && domande[i+1].isRispSing()==true){
				Domanda temp=domande[i];
				domande[i]=domande[i+1];
				domande[i+1]=temp;
			}
			
		}
		}while(domande[0].isRispSing()!=true || domande[1].isRispSing()!=true);
		
	}
	
	public Domanda getDomanda(int n) {
		return domande[n];
	
	}
	
	public int getNum() {
		return num;
	
	}
}
