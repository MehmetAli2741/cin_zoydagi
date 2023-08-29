import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        String horoscope = "";
        boolean isError = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Dogum Yılınızı Giriniz: ");
        year = in.nextInt();
        int total =(year%12);

       if ((total >= 0) && (total <= 11)){
           switch (total) {
               case 1:
                   horoscope = "Maymun";
                   break;

               case 2:
                   horoscope = "Horoz";
                   break;

               case 3:
                   horoscope = "Köpek";
                   break;

               case 4:
                   horoscope = "Domuz";
                   break;

               case 5:
                   horoscope = "Fare";
                   break;

               case 6:
                   horoscope = "Öküz";
                   break;

               case 7:
                   horoscope = "Kaplan";
                   break;

               case 8:
                   horoscope = "Tavşan";
                   break;

               case 9:
                   horoscope = "Ejderha";
                   break;

               case 10:
                   horoscope = "Yılan";
                   break;

               case 11:
                   horoscope = "At";
                   break;

               case 12:
                   horoscope = "Koyun";
                   break;
               default:


           } System.out.println("Çin Zoydagı Burcunuz: " + horoscope);
       }else {
           System.out.println("Hatalı Bir Giriş Yaptınız...");
       }

    }
}