


public class NewClass {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("enter the number of test cases : ");
        int c = s.nextInt();
        System.out.println("enter the id of parntes : ");
        byte b1 = s.nextByte();
        byte b2 = s.nextByte();
        byte i = (byte) (b1 * b2);
        if (i % 2 == 0) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }

}
