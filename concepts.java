public abstract class concepts{
    abstract void main();}
class Reading extends concepts{
    void main() {
        System.out.println("read the text");
    }}abstract class Write extends concepts {
    abstract void main();
}
abstract class Detail {
    private int age;
}
class ConceptAbstract {
    public static void main(String args[]) {
        Reading s = new Reading();
        s.main();
    }
}
