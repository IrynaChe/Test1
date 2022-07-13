public class Lesson3 {

    public static void main(String[] args) {
        byte b = 17;
        short s = 1;
        int i = 145;
        long l = 111111;
        double d = 11.111111;
        float f = 24.2f;
        boolean bl = true;
        char c = 'H';

        System.out.println("Byte is: "+ b);
        System.out.println("Short is: "+ s);
        System.out.println("Long is: "+ l);
        System.out.println("Int is: "+ i);
        System.out.println("Double is: "+ d);
        System.out.println("Float is: "+ f);
        System.out.println("Boolean is: "+ bl);
        System.out.println("Char is: "+ c);


        String color = "UA flag";
        if (color == "blue yellow")
        {
            System.out.println("It's still UA flag.");
        } else{
            System.out.println("That's a match.");
        }

        String favColor = "green";
        String favFruit = "mango";
        String favHobbies = "hiking, baking";
        String favMusic = "pop";
        System.out.println(String.format("Users Preferences: color: %s; hobbies: %s; fruit: %s; music: %s.",
        favColor, favHobbies, favFruit, favMusic));

    }
}
