package for_swich;

public class for_swich {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        int g1=0, g2=0, g3=0;
        String stn1="", stn2="", stn3="";
        for (int x =1; x<=3;x++){
            System.out.println("Enter the name of student"+x+ ":");
            switch (x) {
                case 1:
                    stn1 = s.next();
                    break;
                case 2:
                    stn2 = s.next();
                    break;
                case 3:
                    stn3 = s.next();
                    break;
            }
            System.out.println("Enter the Degree of student "+x+":");
            switch (x) {
                case 1:
                    g1 = s.nextInt();
                    break;
                case 2:
                    g2 = s.nextInt();
                    break;
                case 3:
                    g3 = s.nextInt();
                    break;
            }


        }
            System.out.println("student "+stn1+": degree is "+g1);
            System.out.println("student "+stn2+": degree is "+g2);
            System.out.println("student "+stn3+": degree is "+g3);
    }
}
