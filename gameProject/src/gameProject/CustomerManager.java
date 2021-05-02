package gameProject;

public class CustomerManager implements CustomerService {

	private UserValidationService userValidationService;

	public CustomerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	public void Add(Customer customer) {
		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("Ekleme ��lemi Ba�ar�l�");

		} else {
			System.out.println("Ekleme ��lemi Yap�lamad�");

		}

	}

	public void Update(Customer customer) {
		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("G�ncelleme ��lemi Ba�ar�l�");

		} else {
			System.out.println("G�ncelleme ��lemi Yap�lamad� ");

		}
		
		

	}

	public void Delete(Customer customer) {

		if (userValidationService.CheckIfRealPerson(customer) == true) {
			System.out.println("Silme ��lemi Ba�ar�l�");

		} else {
			System.out.println("Silme ��lemi Yap�lamad� ");

		}

	}

}
