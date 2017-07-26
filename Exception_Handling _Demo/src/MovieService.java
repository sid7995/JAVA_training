/**
 * Created by malviyas on 7/26/2017.
 */
public class MovieService {
    public  void buy(User user, double price) throws InvalidPriceException, InvalidRatingException, InvalidAgeException {
        if(price <= 0 ){
            throw new InvalidPriceException("Price cannot be negetive");
        }
        if(price >0 && price<= 2000 ){
            throw new InvalidPriceException("Price Cannot be less than 2000");
        }
        if(user.getRating()<3){
            throw new InvalidRatingException("Movie was not too bad");
        }
        if(user.getAge()<=0){
            throw new InvalidAgeException("Age cannot be negetive or Zero");
        }
        if(user.getAge()>0 && user.getAge()<=10){
            throw new InvalidAgeException("Kids Not allowed");
        }
        if(user.getAge()>10 && user.getAge()<=20){
            throw new InvalidAgeException("Teenagers");
        }

    }
    public  void watch(User user) throws InvalidAgeException, InvalidRatingException {
        if(user.getAge()<=0){
            throw new InvalidAgeException("Age cannot be negetive or Zero");
        }
        if(user.getAge()>0 && user.getAge()<=10){
            throw new InvalidAgeException("Kids Not allowed");
        }
        if(user.getAge()>10 && user.getAge()<=20){
            throw new InvalidAgeException("Teenagers");
        }
        if(user.getRating()<3){
            throw new InvalidRatingException("Movie was not too bad");
        }
    }
}
