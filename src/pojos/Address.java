package pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private String area;
	private String city;
	private String pinNo;
	public Address() 
	{
		
	}
	
	public Address(String street, String area, String city, String pinNo) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.pinNo = pinNo;
	}

	@Column(length = 80)
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column(length = 80)
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Column(length = 80)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(length = 10)
	public String getPinNo() {
		return pinNo;
	}
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	
}
