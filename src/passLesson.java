import java.util.Scanner;

public class passLesson {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        int Math, Phys, Tur, Chem, Mus;
        int totalPoint = 0;
        int count = 0;

        System.out.println("Math point: ");
        Math = dat.nextInt();
        if (Math >= 0 && Math <= 100) {
            totalPoint += Math;
            count++;
        }

        System.out.println("Physics point: ");
        Phys = dat.nextInt();
        if (Phys >= 0 && Phys <= 100) {
            totalPoint += Phys;
            count++;
        }

        System.out.println("Turkish point: ");
        Tur = dat.nextInt();
        if (Tur >= 0 && Tur <= 100) {
            totalPoint += Tur;
            count++;
        }

        System.out.println("Chemistry point: ");
        Chem = dat.nextInt();
        if (Chem >= 0 && Chem <= 100) {
            totalPoint += Chem;
            count++;
        }

        System.out.println("Music point: ");
        Mus = dat.nextInt();
        if (Mus >= 0 && Mus <= 100) {
            totalPoint += Mus;
            count++;
        }

        double passPoint = totalPoint / count;

        if (passPoint >= 55) {
            System.out.println("Good job! You passed!!");

        } else
            System.out.println("Sorry. Your average is " + passPoint + " It must be minimum 55. You need to study harder.");


    }
}
