package Devoir1;

import Devoir1.TrajetList.Trajet;

public class Text {
	public static void main(String[]args) {
		
		TrajetList<String> MauL019= new TrajetList();
		MauL019.insert("montreal","qubec",2999,4999,"Abc");
		MauL019.insert("montreal","qubec",2999,5999,"Abc");
		MauL019.insert("montreal","qubec",2999,5999,"Abc");
		MauL019.insert("montreal","qubec",2999,5999,"Abc");
		MauL019.insert("montreal","qubec",2999,5999,"Abc");
		
		
		TrajetList<String> DehZ020= new TrajetList();

		MauL019.display();

		}
	

}
