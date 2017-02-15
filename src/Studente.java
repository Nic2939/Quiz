//Classe Studente 4
public class Studente {

	private String nome,cognome,classe,dataN;
	
	public Studente(String n,String c) {
		nome=n;
		cognome=c;
		
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}


	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getDataN() {
		return dataN;
	}

	public void setDataN(String dataN) {
		this.dataN = dataN;
	}

	public String toString(){
		String s="\nSTUDENTE\nNome: "+nome;
		s+="\nCognome: "+cognome;
		s+="\nClasse: "+classe;
		s+="\nData di nascita: "+dataN+"\n";
		
		return s;
	}


public static void main(String[] args){
	Studente s=new Studente("Paolo","Pasanisi");
	s.setClasse("4AI");
	s.setDataN("14/03/1999");
	System.out.println(s);
}
}