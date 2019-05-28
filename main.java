import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean A;
        int Z;
        double schum;
        String D;
        boolean W;
        boolean H;
        USD usd = new USD();
        ILS ils = new ILS();
        ArrayList<Double> results = new ArrayList<>();


        Introduction.welcome();
        do {
            Introduction.start();
            do {
                Scannings.Scanning1();
                A = Scannings.M;
                Z = Scannings.C;
            }
            while (A == false);

            Introduction.amountEntry();
            do {
                Scannings.Scanning2();
                W = Scannings.T;
            }
            while (W == true);


            if (Z == 1) {
                schum = Scannings.amount * usd.value;
                results.add(schum);
                System.out.println(schum);
            }
            if (Z == 2) {
                schum = Scannings.amount * ils.value;
                results.add(schum);
                System.out.println(schum);
            }
            Introduction.againQuestion();

        do {
            Scannings.Scanning3();
            D = Scannings.again;
            H = Scannings.K;
        }
        while (H == true);
            }
            while (D.equalsIgnoreCase("y"));

            Introduction.end();

            for (int i = 0; i < results.size(); i++) {
                System.out.println(results.get(i));


    }}}