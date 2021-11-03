public class Dog implements Comparable
{
    //instance variables
    private String name;
    private int age;
    private String breed;
    private double weight;//in pounds

    private static int dogCount = 0;

    public Dog (String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount ++;
    }//end full constructor

    public Dog ()
    {
        this.name = "";
        this.age = 0;
        this.breed = "";
        this.weight = 0.0;
        dogCount++;
    }//end default constructor

    //getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    public static int getDogCount()
    {
        return dogCount;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge (int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;
        return output;
    }//end toString

    //dog's weight from pounds to kilograms.
    public double poundsToKilograms()
    {
        return weight * 0.45;
    }//end poundsToKilograms


    @Override
    public int compareTo(Object dog) {
        int output = 0;
        if (this.age < ((Dog)dog).getAge())
        {
            output = -1;
        }
        else if (this.age > ((Dog)dog).getAge())
        {
            output = 1;
        }
        return output;
    }
}//end dog class
