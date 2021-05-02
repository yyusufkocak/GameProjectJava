package gameProject;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Yusuf");
		customer1.setLastName("Koçak");
		customer1.setBirthYear(1997);
		customer1.setNationalityId(11111111);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Batuhan");
		customer2.setLastName("Cömert");
		customer2.setBirthYear(2004);
		customer2.setNationalityId(11111111);

		CustomerManager customerManager = new CustomerManager(new UserValidationManager());

		customerManager.Add(customer2);

		System.out.println();

		customerManager.Add(customer1);

		System.out.println();

		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Süper Mayýs Ýndirimi");
		campaign1.setCampaignInfo("Bir oyun alana ikincisi %50 indirimli !");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		campaignManager.Delete(campaign1);
		campaignManager.Update(campaign1);

		System.out.println();

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.GameSale(customer1, campaign1);

	}

}
