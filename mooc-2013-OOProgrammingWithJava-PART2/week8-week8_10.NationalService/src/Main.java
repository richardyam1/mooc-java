public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService test1 = new CivilService();

        System.out.println(test1.getDaysLeft());
        test1.work();
        System.out.println(test1.getDaysLeft());
    }
}
