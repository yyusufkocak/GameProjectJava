package gameProject;

public class CustomerManager implements CustomerService {

	private UserValidationService userValidationService;

	public CustomerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	public void Add(Customer customer) {
		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("Ekleme Ýþlemi Baþarýlý");

		} else {
			System.out.println("Ekleme Ýþlemi Yapýlamadý");

		}

	}

	public void Update(Customer customer) {
		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("Güncelleme Ýþlemi Baþarýlý");

		} else {
			System.out.println("Güncelleme Ýþlemi Yapýlamadý ");

		}
		
		

	}

	public void Delete(Customer customer) {

		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("Silme Ýþlemi Baþarýlý");

		} else {
			System.out.println("Silme Ýþlemi Yapýlamadý ");

		}

	}

}
