package CollectionClass;

import java.util.*;

public class one {

	public static void main(String[] args) {
		List(); // List
		map(); // map
	}

	public static void List() {
		ArrayList<Book> list = new ArrayList<>();
		Book b1 = new Book("1", "Java", "THU", 10);
		Book b2 = new Book("2", "Python", "PK", 20);
		Book b3 = new Book("3", "C", "ZJU", 30);
		Book b4 = new Book("4", "C++", "HZNU", 40);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		// ͨ������ֵ���ʣ���˳�������Ҳ��������ʡ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getPress() + " "
					+ list.get(i).getPrice());
		}
		// ͨ�����������ʣ�ʵ��˳�������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getId() + " " + book.getName() + " " + book.getPress() + " " + book.getPrice());
		}
		// ͨ��ForEachѭ�����ʣ�ʵ��˳�������
		for (Book book : list) {
			System.out.println(book.getId() + " " + book.getName() + " " + book.getPress() + " " + book.getPrice());
		}
	}

	public static void map() {
		Map<String, Book> map = new HashMap<>();
		Book b1 = new Book("1", "Java", "THU", 10);
		Book b2 = new Book("2", "Python", "PK", 20);
		Book b3 = new Book("3", "C", "ZJU", 30);
		Book b4 = new Book("4", "C++", "HZNU", 40);
		map.put(b1.getId(), b1);
		map.put(b2.getId(), b2);
		map.put(b3.getId(), b3);
		map.put(b4.getId(), b4);
		// ͨ��Iterator����key-value
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println("next:" + entry.getKey() + "-" + ((Book) entry.getValue()).getName() + " "
					+ ((Book) entry.getValue()).getPress() + " " + ((Book) entry.getValue()).getPrice());
		}
	}
}

class Book {

	private String id, name, press;

	private double price;

	public Book() {
	}

	public Book(String id, String name, String press, double price) {
		super();
		this.id = id;
		this.name = name;
		this.press = press;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}