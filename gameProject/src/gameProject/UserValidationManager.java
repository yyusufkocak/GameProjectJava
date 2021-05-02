package gameProject;

public class UserValidationManager implements UserValidationService {
	
	 public boolean CheckIfRealPerson(Customer customer)
     {
         if (customer.getBirthYear()< 2004 && customer.getFirstName().length() > 3
              && customer.getLastName().length() > 2 && customer.getNationalityId() > 4)
         {
           System.out.println("Doðrulama Ýþlemi Baþarýlý");
           System.out.println("++++++++++++++++++++++++++++++++++++++");
             return true; 
         }
         else
         {
        	 System.out.println("Doðrulama Yapýlamadý");
        	 System.out.println("-------------------------------------------------------------------");
             return false;
         }

     }
}
