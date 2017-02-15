public class RisTest {

	private String dataS,materia;
	private int punti;
	private Studente stud;
	
	public RisTest(String d,int p,String m,Studente s){
		dataS=d;
		punti=p;
		materia=m;
		stud=s;
	}

	public String getDataS() {
		return dataS;
	}

	public String getMateria() {
		return materia;
	}

	public int getPunti() {
		return punti;
	}

	public Studente getStud() {
		return stud;
	}
	public String toString(){
		String s=stud.toString()+"\nData svolgimento: "+dataS+"\nPunteggio: "+punti+"\nMateria: "+materia;
		return s;
	}
	//public static void main(String[] args) {
		

	//}

}
