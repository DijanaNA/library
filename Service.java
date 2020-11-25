package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Service {

	// kreirame studenti
	public static HashSet<Student> getAllStudents() {
		HashSet<Student> set = new HashSet<Student>();
		Student s1 = new Student("111", "s1", "pass1");
		set.add(s1);
		Student s2 = new Student("222", "s2", "pass2");
		set.add(s2);
		Student s3 = new Student("333", "s3", "pass3");
		set.add(s3);
		return set;
	}

	// kreirame mapa so user i pass od site studenti
	public static HashMap<String, String> getAllStudentsCredentials() {
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<Student> set = getAllStudents();
		for (Student s : set) {
			map.put(s.getUser(), s.getPassword());
		}
		return map;
	}

	// kreirame mapa so user i pass od site vraboteni
	public static HashMap<String, String> getAllEmployeesCredentials() {
		HashMap<String, String> map = new HashMap<String, String>();
		Employee e1 = new Employee("email1", "11");
		map.put(e1.getEmail(), e1.getEmployeeId());
		Employee e2 = new Employee("email2", "22");
		map.put(e2.getEmail(), e2.getEmployeeId());
		Employee e3 = new Employee("email3", "33");
		map.put(e3.getEmail(), e3.getEmployeeId());
		return map;
	}

	// kreirame authors
	public static List<Author> getAllAuthors() {
		List<Author> list = new ArrayList<Author>();
		Author a1 = new Author("love");
		a1.name = "Nicolas";
		a1.lastname = "Sparks";
		list.add(a1);
		Author a2 = new Author("crime");
		a2.name = "Agata";
		a2.lastname = "Kristi";
		list.add(a2);
		Author a3 = new Author("horror");
		a3.name = "Sebastian";
		a3.lastname = "Fitz";
		list.add(a3);
		return list;
	}

	// kreirame knigi
	public static List<Book> getAllBooks() {
		List<Book> list = new ArrayList<Book>();
		Author author = getAllAuthors().get(0);
		Book b1 = new Book("The notebook", 5, author, true);
		list.add(b1);
		author = getAllAuthors().get(1);
		Book b2 = new Book("13 problems", 11, author, true);
		list.add(b2);
		Book b3 = new Book("Crime book", 20, author, false);
		list.add(b3);
		author = getAllAuthors().get(2);
		Book b4 = new Book("The ring", 5, author, true);
		list.add(b4);
		list.add(b4);
		list.add(b4);
		return list;
	}

	public static HashSet<Book> getAllBooksSet() {
		HashSet<Book> set = new HashSet<Book>();
		Author author = getAllAuthors().get(0);
		Book b1 = new Book("The notebook", 5, author, true);
		set.add(b1);
		author = getAllAuthors().get(1);
		Book b2 = new Book("13 problems", 11, author, true);
		set.add(b2);
		Book b3 = new Book("Crime book", 20, author, false);
		set.add(b3);
		author = getAllAuthors().get(2);
		Book b4 = new Book("The ring", 7, author, true);
		set.add(b4);
		return set;
	}

	public static HashMap<Integer, List<Book>> getBooks(Scanner s) {
		// gi zemame site knigi
		List<Book> books = getAllBooks();
		// kreirame lista so available knigi, ja polnime podocna
		List<Book> availableBooks = new ArrayList<Book>();
		int sum = 0;
		System.out.println("Za kolku knigi ste zainteresirani? ");
		// broj na knigi
		int n = s.nextInt();
		while (n > 0) {
			System.out.println("Vnesi ime na kniga ");
			s = new Scanner(System.in);
			String book = s.next();
			for (Book b : books) {
				if (b.getTitle().contains(book)) {
					if (b.isAvailable()) {
						availableBooks.add(b);
						sum += b.getPrice();
					}
				}
			}
			n--;
		}
		HashMap<Integer, List<Book>> map = new HashMap<Integer, List<Book>>();
		// koristime mapa kako return type bidejkji sakame da vratime povekje promenlivi
		map.put(sum, availableBooks);
		return map;
	}

	public static BinaryTree createBooksTree() {
		List<Book> books = getAllBooks();
		BinaryTree binaryTree = new BinaryTree();
		Node root = null;
		root = binaryTree.insert(root, books.get(0));
		binaryTree.insert(root, books.get(1));
		binaryTree.insert(root, books.get(2));
		binaryTree.insert(root, books.get(3));
		return binaryTree;
	}

}
