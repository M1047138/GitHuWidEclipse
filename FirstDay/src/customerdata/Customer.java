package customerdata;

public class Customer {
	
	private String name;
	private String contact;
	private double rating;
	
	public Customer() {
		super();
	}

	public Customer(String name, String contact, double rating) {
		super();
		this.name = name;
		this.contact = contact;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	

}
