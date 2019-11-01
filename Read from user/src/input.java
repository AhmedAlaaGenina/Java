public class input {
    public static void main(String[] args) {


        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Your name is : "+ name +"\nYour age is : " + age);
    }
}
