package print_data_time;

public class data_time {
    public static void main(String[] args) {
        java.util.Date dt= new java.util.Date ();
        System.out.println(dt);
        java.text.SimpleDateFormat df=new java.text.SimpleDateFormat("dd-MM-yyyy    |   hh:mm:ss a");
        System.out.println(df.format(dt));
    }
}
