import org.junit.Test;

public class AnimalSays {


    public static void main(String[] args) {
        Animal voiceOfAnimal = new Animal();
        voiceOfAnimal.insert("Cat", "Meow");
        voiceOfAnimal.insert("Dog", "Bow");
        voiceOfAnimal.insert("Camel", "Grunt");
        voiceOfAnimal.insert("Cattle", "mow");
        voiceOfAnimal.insert("Calf", "Bleet");
        System.out.println(voiceOfAnimal.search("Cat"));
        System.out.println(voiceOfAnimal.search("Calf"));
        System.out.println(voiceOfAnimal.search("Cattle"));
        System.out.println(voiceOfAnimal.search("Car"));
    }


    @Test
    public void testInsert() {
        Animal voiceOfAnimal = new Animal();
        voiceOfAnimal.insert("Cat", "Meow");
        voiceOfAnimal.insert("Cattle", "Moo");
        voiceOfAnimal.insert("Canada", "Trudeau");
        String canadaVoice = voiceOfAnimal.search("Canada");
        String voice = voiceOfAnimal.search("Cap");
        System.out.println(canadaVoice);
    }
}
