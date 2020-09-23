package countries;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CountriesController {
	
	private static final Country[] countries = { new Country(1L, "New Delhi", "India"),
			new Country(2L, "Washington DC", "USA"),
			new Country(3L, "Beijing", "China") };

	@GetMapping("/countries")
	public Country[] countries() {
		return countries;
	}

	@GetMapping("/countries/{id}")
	public Country country(@PathVariable int id) {
		for (Country country : countries) {
			if (country.getId() == id) {
				return country;
			}

		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity not found");
	}

}
