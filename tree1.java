package javaprojects;

import java.util.TreeMap;

public class tree1 {
  public static void main(String[] args) {

    TreeMap<Long, String> map = new TreeMap<Long, String>();
    TreeMap<Long, String> Name = new TreeMap<Long, String>();
    TreeMap<Long, String> email = new TreeMap<Long, String>();
    TreeMap<Long, Enum> Gender = new TreeMap<Long, Enum>();
    map.put(9078567438L, "Anu");
    map.put(8909677865L, "Neenu");
    map.put(7898096745L, "Ansu");
    map.put(6789456790L, "Sara");
    System.out.println("The keys of the given treemap is" + map.keySet());
    System.out.println("The values of the given treemap is " + map.values());
    System.out.println("The key/value pair is " + map.entrySet());
    Name.put(7669574685L, "Anu");
    Name.put(7685483647L, "Sara");
    Name.put(8765900673L, "Neenu");
    Name.put(9858493684L, "Ansu");
    System.out.println("The keys of the given treemap is" + Name.keySet());
    System.out.println("The values of the given treemap is " + Name.values());
    System.out.println("The key/value pair is " + Name.entrySet());
    email.put(7656480365L, "sunitha123@gmail.com");
    email.put(7684937875L, "akhila123@gmail.com");
    email.put(9875673637L, "manogna34@gmail.com");
    email.put(8765836747L, "chinna@gmail.com");
    System.out.println("The keys of the given treemap is" + email.keySet());
    System.out.println("The values of the given treemap is" + email.values());
    System.out.println("The key/value pair is " + email.entrySet());
  }
}