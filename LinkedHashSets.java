
  
  import java.util.LinkedHashSet;
  import java.util.Set;
  import java.util.Iterator;
  
  public class LinkedHashSets{
  public static void main(String[]args){
    // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  Set<Person> set= new LinkedHashSet<>();
    set.add(new Person("kim", 22, "Korea"));
    set.add(new Person("jimin", 23, "South Korea"));
    set.add(new Person("vijay", 28, "Kerala"));
    
  
    Iterator<Person> it= set.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
  }
  }
  }

  