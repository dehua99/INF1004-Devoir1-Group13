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
	}
}
