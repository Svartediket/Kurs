package Collection;

import Collection.Collect;

public class TestCollection {
	public static void main(String[] args) {
		
		System.out.println("Создание коллекции типа Double:");
		Collect <Double> integColl = new Collect<>();
		integColl.add(1.0);
		integColl.add(2.9);
		integColl.add(1.1);
		integColl.add(4.0);
		
		integColl.deleteLast();
		
		Link<Double> f = integColl.find(2);
		if (f == null)
			System.out.println("Такого элемента нет!");
		else
			System.out.println("Под индексом " + f.id + " хранится объект " + f.data);
		
		System.out.println("Size = " + integColl.size());
		System.out.println("min = " + integColl.min().data);
		integColl.showList();
		
		
		System.out.println("\n\nСоздание коллекции типа String:");
		Collect <String> strColl = new Collect<>();
		strColl.add("absa");
		strColl.add("abda");
		strColl.add("abcd");
		strColl.add("abca");
		
		strColl.deleteLast();
		
		Link<String> s = strColl.find(2);
		if (s == null)
			System.out.println("Такого элемента нет!");
		else
			System.out.println("Под индексом " + s.id + " хранится объект " + s.data);
		
		System.out.println("Size = " + strColl.size());
		System.out.println("min = " + strColl.min().data);
		strColl.showList();
		
		
	}
}
