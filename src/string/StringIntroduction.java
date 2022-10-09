package string;

public class StringIntroduction {

    public static void main(String[] args) {

        String name1 = "Samit Das";                          // object created at string pool area if not previously there

        String name2 = "Samit Das";                          // referenced to the previous object no new object created

        String anotherName = new String("Samit Das");        // object created only at heap memory as previously present at string pool area
 
        String anotherName2 = new String("Amit Das");        // object created at heap memory as well as string pool area


        System.out.println(name1 == name2);
        System.out.println(name1 == anotherName);

        System.out.println(anotherName2.charAt(0));
        System.out.println(anotherName2.length());
        System.out.println(anotherName2.charAt(7));

        String string1 = "It's nice weather at Contai";

        System.out.println(string1.substring(5));
        System.out.println(string1.substring(3, 12));
        System.out.println(string1.indexOf("h"));
        System.out.println(string1.contains("her"));
        System.out.println(string1.contains("C"));
        System.out.println(string1.toLowerCase());
        System.out.println(string1.toUpperCase());
        System.out.println(string1.trim());


        System.out.println(name1.equals(name2));
        System.out.println(name1.isEmpty());

        System.out.println(name1.concat(" is a good boy"));
        System.out.println(anotherName.concat(anotherName2));

        System.out.println(string1.replace('n', 'f'));

        System.out.println();

        String cars = "Maruti, Kia, Hyundai, Farrari, BMW, Marcedise, Lamborgini, Audi, Range Rover, Nissan";
        String allCars[] = cars.split(", ");

        for (String car: allCars){
            System.out.println(car);
        }

    }
    
}
