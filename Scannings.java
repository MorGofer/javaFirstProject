import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Scannings {

    static boolean M;
    static boolean T;
    static boolean K;
    public static int C;
    static double amount;
    static String again;

    public static void Scanning1 () {
        try {
            M = false;
            Scanner firstChoice = new Scanner(System.in);
             C = firstChoice.nextInt();
            if (C != 1 && C!= 2) {
                System.out.println("Invalid Choice, please try again");}
            else M = true;
        }
        catch (InputMismatchException e) {
             System.out.println("Invalid Choice, please try again");
                }


    }
    public static void Scanning2(){
        try{
            T = false;
            Scanner amountChoice = new Scanner(System.in);
             amount = amountChoice.nextInt();}
        catch (InputMismatchException ee){
             System.out.println("Invalid Choice, please try again");
        T =  true;
    }
}
    public static void Scanning3(){

        Scanner oneMore = new Scanner(System.in);
        again = oneMore.next();
        K = false;

        if (again.equalsIgnoreCase("Y") || again.equalsIgnoreCase("N")){
            K = false;
        }
        else{
            System.out.println("Invalid Choice, please try again");
            K = true;}
        }
        }
