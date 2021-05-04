package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
		
		//valueAndReferanceTypes();
		
		DortIslem dortIslem  = new DortIslem();
		System.out.println(dortIslem.topla(4, 9));
		System.out.println(dortIslem.cikar(10, 2));
		System.out.println(dortIslem.carp(25, 5));
		System.out.println(dortIslem.bol(25, 10));
		

	}

	public static void valueAndReferanceTypes() {
		//int, float, double, string, byte bu sayýsal deðiþkenler deðer tiplerdir.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//referans tip
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1 ;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	} 

}
