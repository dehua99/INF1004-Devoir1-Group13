package Devoir1;

public class Companie {
	public static void main(String[]args) {
		TrajetList<String> JohS17T= new TrajetList();
		Chauffeur JohS17= new Chauffeur ("John","Smith",2017,"123 Main Line",JohS17T);
		JohS17T.insert("Toronto","Ottawa",6788,7140,"Aston Martin Rapide S");
		JohS17T.insert("montreal","qubec",2999,5999,"Abc");
		JohS17T.insert("montreal","qubec",2999,5999,"Abc");
		JohS17T.insert("montreal","qubec",2999,5999,"Abc");
		JohS17T.insert("montreal","qubec",2999,5999,"Abc");
		
		JohS17.display(JohS17);
		
		TrajetList<String> SarB18T= new TrajetList();
		Chauffeur SarB18= new Chauffeur ("John","Smith",2017,"123 Off Line",JohS17T);
		SarB18T.insert("Quebec City","Montreal",4575,4844,"Rolls-Royce Cullinan");
		SarB18T.insert("Quebec City","Trois-Rivieres",4575,4704,"Rolls-Royce Cullinan");
		SarB18T.insert("Trois-Rivieres","Montreal",4704,4845,"Rolls-Royce Cullinan");
		SarB18T.insert("Quebec City","Montreal",6540,6809,"Rolls-Royce White Ghost");
		SarB18T.insert("Quebec City","Trois-Rivieres",6540,6669,"Rolls-Royce White Ghost");
		SarB18T.insert("Trois-Rivieres","Montreal",6669,6801,"Rolls-Royce White Ghost");
		
		TrajetList<String> MarR18T= new TrajetList();
		Chauffeur MarR18= new Chauffeur ("Mark","Riley",2017,"673 Off Line",JohS17T);
		MarR18T.insert("Quebec City","Montreal",4575,4844,"Rolls-Royce Cullinan");
		MarR18T.insert("Quebec City","Trois-Rivieres",4575,4704,"Rolls-Royce Cullinan");
		MarR18T.insert("Trois-Rivieres","Montreal",4704,4845,"Rolls-Royce Cullinan");
		MarR18T.insert("Quebec City","Montreal",6540,6809,"Rolls-Royce White Ghost");
		MarR18T.insert("Quebec City","Trois-Rivieres",6540,6669,"Rolls-Royce White Ghost");
		MarR18T.insert("Trois-Rivieres","Montreal",6669,6801,"Rolls-Royce White Ghost");
		
	}
}
