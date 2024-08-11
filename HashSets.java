import java.util.HashSet;
import java.util.Set;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[]args){
    Set<Person> set= new HashSet<>();
     set.add(new Person("swapna", 20, "Hyderabad"));
     set.add(new Person("Swathi", 21, "Chennai"));
     set.add(new Person("jyothi", 22, "Rajahmundry"));
     set.add(new Person("suni", 23, "warangal"));
     set.add(new Person("sunny", 24, "Bheemavaram"));
    
     for(Person p:set)
     {
         System.out.println(p);
    }
    class Person{
        String name;
        int age;
        String address;
        public Person(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
        }
    }
}
}
