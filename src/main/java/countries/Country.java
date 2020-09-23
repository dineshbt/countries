package countries;

public class Country {
	private Long id;
	private String capital;
	private String country;
	public Country(Long id, String capital, String country) {
		this.id = id;
		this.capital = capital;
		this.country = country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
