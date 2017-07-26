/**
 * Created by malviyas on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(1,"a",0,4);
        User user2 = new User(2,"b",5,2);
        User user3 = new User(3,"t",15,1);
        User user4 = new User(6,"r",20,3);
        User user5 = new User(4,"e",40,4);
        User user6 = new User(5,"d",-1,5);
        MovieService m = new MovieService();
        try{
            m.buy(user6,20000);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (InvalidRatingException e) {
            e.printStackTrace();
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }
    }
}
