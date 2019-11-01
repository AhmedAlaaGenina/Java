import java.util.*;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] primes ={2,3,5,7,9,11,13};
//        primes=new int[]{17,19,23,29,31};
//        for(int i=0;i<primes.length;i++){
//            System.out.println(primes[i]);
//        }
//        ArrayList<Integer> num;
//        num=new ArrayList<Integer>();
        ArrayList<Integer> num = new ArrayList<>(List.of(2, 3, 52, 354, 23, 1));
//        boolean add = num.add(12);
//        num.add(2,70);
//        num.remove(3);
//        int y=num.get(2);
//        int x=num.indexOf(2);
//        num.set(0,20);
//        int x=num.indexOf(3);
//        System.out.println(x);
//        for (int i = 0; i < num.size(); i++) {
//            System.out.println(num.get(i));
//        }
//        if (num.get(3) == 354) {
//            System.out.println(true);
//        }
//        Collections.sort(num);
        num.set(0, 4);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}
