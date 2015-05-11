/* This implements the Address class.
 * An address has a house number, street, optional apartment number,
 * city, state, and zip code. 
 * 
 * Two constructors: one with apartment #, one without.
 * 
 * Print method that prints address with street on one line, city/state/zip on next.
 * 
 * comesBefore(Address other) method that compares zip codes to determine whether
 * this address comes before another address.
 */
public class Address {
	private int houseNumber;
	private String streetName;
	private int apartmentNumber = -1;
	private String cityName;
	private String stateName;
	private int zipCode;

//	public static void main(String[] args) {
//			Address test = new Address(117, "Antoinette", "Green Bay", "Wisconsin", 54311);
//			test.print();
//	}
	
	public Address(int houseNumber, String streetName, int apartmentNumber, String cityName, String stateName, int zipCode) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.apartmentNumber = apartmentNumber;
		this.cityName = cityName;
		this.stateName = stateName;
		this.zipCode = zipCode;
	}
	
	public Address(int houseNumber, String streetName, String cityName, String stateName, int zipCode) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.zipCode = zipCode;
	}
	
	public void print() {
		if (apartmentNumber == -1) {
			System.out.println(String.format("%d %s Street\n%s, %s %d", houseNumber, streetName, cityName, stateName, zipCode));
		} else {
			System.out.println(String.format("%d, %s Street, Apartment %d\n%s, %s %d", houseNumber, apartmentNumber, streetName, cityName, stateName, zipCode));
		}
	}
	
	public boolean comesBefore(Address other) {
		return (this.zipCode > other.zipCode);
	}
}