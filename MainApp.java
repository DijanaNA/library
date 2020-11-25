package library;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		HashMap<String, String> studentsCredentitals = Service.getAllStudentsCredentials();

		BinaryTree tree = Service.createBooksTree();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi user: ");
		String user = s.next();

		if (studentsCredentitals.containsKey(user)) {
			System.out.println("Vnesi password: ");
			String password = s.next();
			if (studentsCredentitals.get(user).equals(password)) {
				System.out.println("Uspeshno se najavivte!! ");
				HashMap<Integer, List<Book>> map = Service.getBooks(s);
				System.out.println(map.toString());
			} else {
				System.out.println("Nevalidni user i password");
			}
		}
	}
}
