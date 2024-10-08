package in.arjit.binding;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private String name;
	private String city;
	private String gender;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
