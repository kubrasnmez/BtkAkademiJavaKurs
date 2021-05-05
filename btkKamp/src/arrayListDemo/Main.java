package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		System.out.println(sayilar.size());
		sayilar.add(10);
		System.out.println(sayilar.size());
		System.out.println(sayilar.get(0));
		sayilar.set(0, "Ankara");
		System.out.println(sayilar.get(0));
		//sayilar.remove(0);
		//sayilar.clear();
		for(Object i : sayilar) {
			System.out.println(i);
		}



		

	}

}
