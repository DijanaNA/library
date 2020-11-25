package library;

public class Author extends Person {
	private String genre;

	public Author() {
		
	}
	public Author(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return name + ", " + lastname;
	}
	
}
