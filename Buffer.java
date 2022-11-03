public class Buffer {
    public static void main(String args[]) {
        StringBuffer string_buffer = new StringBuffer();
        string_buffer.append("StringBuffer");
        string_buffer.append("is a peer class of String");
        string_buffer.append("that provides much of");
        string_buffer.append("the functionality of strings");
        System.out.println("This string buffer is defined as: " + string_buffer);
        string_buffer.delete(0, string_buffer.length());
        System.out.println("The string buffer after clearing: " + string_buffer);
    }

}

