package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya Ekleme Baþarýlý");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya Güncelleme Baþarýlý");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya Silme Baþarýlý");
	}
	
	

}
