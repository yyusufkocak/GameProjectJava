package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya Ekleme Ba�ar�l�");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya G�ncelleme Ba�ar�l�");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya Silme Ba�ar�l�");
	}
	
	

}
