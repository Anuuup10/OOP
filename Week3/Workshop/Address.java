package Workshop;

public class Address {
	private String street;
	private String city;
	private String zipCode;
	
	    // Getter methods
	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    // Setter methods
	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        Address addr = new Address();

	        addr.setStreet("123 Main Street");
	        addr.setCity("Biratnagar");
	        addr.setZipCode("1010");

	        System.out.println("Street: " + addr.getStreet());
	        System.out.println("City: " + addr.getCity());
	        System.out.println("Zip Code: " + addr.getZipCode());
	   }
}

