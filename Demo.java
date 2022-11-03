public class Demo {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("insert text");
        s.insert(5,"text");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("it is used to _ at the specified index position");
        s.insert(6, "position");
        System.out.println(s1);
    }
}


