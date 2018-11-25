public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String n, String e, char g) {
		name = n;
		email = e;
		if (g=='U' || g=='F' || g=='M') {
			gender = g;
		}
		else
			gender = 'U';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		this.email = e;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return this.name+", Email: "+this.email+", gender: "+this.gender;
	}
}
