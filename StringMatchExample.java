public class StringMatchExample {
        public static void main(String args[]){
            String name="java string pool refers to collection of strings which are stored in heap memory";
            System.out.println(name.contains("java string pool")); // returns true
            System.out.println(name.contains("refers to collection of strings which are stored in heap memory")); // returns true
            System.out.println(name.contains("c language")); // returns false
        }}

