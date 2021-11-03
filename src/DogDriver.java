public class DogDriver
{
    public static void main (String args[])
    {

        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Austrailian Shepard", 45);
        Dog dog3 = new Dog("Sydney",9, "Chihuahua",400);

        System.out.println("Fang is a " + dog1.getBreed()
                + "\nand Fang is " + dog1.getAge() + " years old");
        System.out.println();

        System.out.println("Piper weighs " + dog2.getWeight() + " pounds.");
        System.out.println();

        System.out.println(dog3.toString());
        System.out.println();

        System.out.println("I have " + Dog.getDogCount() + " dogs");
        System.out.println();

        if(dog2.compareTo(dog1) == 0)
        {
            System.out.println("Piper and Fang are the same age");
        }
        else if(dog2.compareTo(dog1) < 0)
        {
            System.out.println("Piper is younger than Fang");
        }
        else if(dog2.compareTo(dog1) > 0)
        {
            System.out.println("Piper is older than Fang");
        }

        if(dog1.compareTo(dog3) == 0)
        {
            System.out.println("Fang is the same age as Sydney");
        }
        else if(dog1.compareTo(dog3) < 0)
        {
            System.out.println("Fang is younger than Sydney");
        }
        else if(dog1.compareTo(dog3) > 0)
        {
            System.out.println("Fang is older than Sydney");
        }


    }//end main method

}
