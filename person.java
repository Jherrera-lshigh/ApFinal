public class person 
{

    private String name;
    private String hairColor;
    private int age;
    private double height;
    private String sex;
    private double weight;
    
    public person(){

        name = "Tyler Smith";
        hairColor = "blonde";
        age = 24;
        height = 6.0;
        sex = "male";
        weight= 180.0;
    }

    public person(String name, String hairColor, int age, double height, double weight,String sex){
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.weight = weight;

    }

    public void changeName(String newName){
        name = newName;
        System.out.println("Your name has been changed to " + name);
    } 

    public void changeAge(int newAge){
        age = newAge;
        System.out.println("Your age has been changed to " + age);
    } 

    public String toString(){

        return name +  "\nage: " + age + "\nhair color: " + hairColor + "\nheight: " + height + "\nweight: "+ weight + "\nsex: " + sex;
    }


    public static void main (String []args)
    {

        // Create a default person
        person adult = new person();
        System.out.println(adult);

        System.out.println();

        // Create a person with 
        person daniel = new person("D-Rod", "Black",17, 5.9, 225.0 ,"Often");
        System.out.println(daniel);


    }
    
}
