import java.io.*;
public class ReverseBuffer {
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("this method returns the reversed object on which it was called");
        s.reverse();
        System.out.println(s);
    }

}