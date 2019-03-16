package buliderpattern;

class PersonDetail{
	public String streetAddress, postCode, city;
	public String companyName, position;
	public int annualIncome;
	@Override
	public String toString() {
		return "PersonDetail [streetAddress=" + streetAddress + ", postCode=" + postCode + ", city=" + city
				+ ", companyName=" + companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
	}
	
}

class PersonDetailBulider{
	protected PersonDetail personDetail = new PersonDetail();
	
	public PersonAddressBulider lives() {
		return new PersonAddressBulider(personDetail);
	}
	
	public PersonJobBulider works() {
		return new PersonJobBulider(personDetail);
	}
	
	public PersonDetail bulid() {
		return personDetail;
	}

}

class PersonAddressBulider extends PersonDetailBulider{
	
	public PersonAddressBulider(PersonDetail personDetail) {
		this.personDetail = personDetail;
	}
	
	public PersonAddressBulider at(String streetAddress) {
		personDetail.streetAddress = streetAddress;
		return this;
	}
	
	public PersonAddressBulider in(String city) {
		personDetail.city = city;
		return this;
	}
	
	public PersonAddressBulider withPost(String postCode) {
		personDetail.postCode = postCode;
		return this;
	}
}

class PersonJobBulider extends PersonDetailBulider{
	public PersonJobBulider(PersonDetail personDetail) {
		this.personDetail = personDetail;
	}
	
	public PersonJobBulider at(String companyName) {
		personDetail.companyName = companyName;
		return this;
	}
	
	public PersonJobBulider asA(String position) {
		personDetail.position = position;
		return this;
	}
	
	public PersonJobBulider earning(int annualIncome) {
		personDetail.annualIncome = annualIncome;
		return this;
	}
	
}

public class FacetedBuliderDemo {

	public static void main(String[] args) {
		PersonDetailBulider personDetailBulider = new PersonDetailBulider();
		PersonDetail p = personDetailBulider
			.lives()
				.at("North car street")
				.in("Chennai")
				.withPost("627002")
			.works()
				.asA("SDE")
				.at("Amazon")
				.earning(150000)
			.bulid();
		System.out.println(p);
				
				

	}

}
