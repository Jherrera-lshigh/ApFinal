public class person 
{
    //declare variables 

    private String name;
    private String hairColor;
    private int age;
    private double height;
    private String sex;
    private double weight;
    
    //Create Default Person
    public person(){

        name = "Tyler Smith";
        hairColor = "blonde";
        age = 24;
        height = 6.0;
        sex = "male";
        weight= 180.0;
    }

    //Create a unique person with attributes
    public person(String name, String hairColor, int age, double height, double weight,String sex){
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.weight = weight;

    }
    //Changes the Name of the Person
    public void changeName(String newName){
        name = newName;
        System.out.println("Your name has been changed to " + name);
    } 
    //Changes the Age of the Person
    public void changeAge(int newAge){
        age = newAge;
        System.out.println("Your age has been changed to " + age);
    } 
    //Prints out the person with each attributes on a new line
    public String toString(){

        return name +  "\nage: " + age + "\nhair color: " + hairColor + "\nheight: " + height + "\nweight: "+ weight + "\nsex: " + sex;
    }


    public static void main (String []args)
    {

        // Create a default person
        person adult = new person();
        System.out.println(adult);

        System.out.println();

        // Create a person with the following attributes
        person daniel = new person("Daniel", "Black",17, 5.9, 225.0 ,"Male");
        System.out.println(daniel);

        //used for spacing 
        System.out.println();


        //calls the helper methods to change the name and age
        daniel.changeName("D-Rod");
        daniel.changeAge(18);

        System.out.println();
        
        //prints out the person with the new attributes
        System.out.println(daniel);

    }
    
}
