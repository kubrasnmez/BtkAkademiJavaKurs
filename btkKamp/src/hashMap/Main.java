package hashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		sozluk.put("computer", "bilgisayar");
		sozluk.put("pencil", "kalem");
		
		System.out.println(sozluk);
		System.out.println(sozluk.get("table"));
		//sozluk.remove("table");
		System.out.println(sozluk.size());
		
		//set ifadesinde yaz�l� gelmez.
		for (String item : sozluk.keySet()) {
			System.out.println("Eleman : " + item + "De�er : " + sozluk.get(item));
		}
		


		


	}

}
