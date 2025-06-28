package org.example;
import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        String[] userName = new String[3];
        double[] balances = new double[3];

        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);

            System.out.print("Adinizi daxil edin: ");
            userName[i] = sc.nextLine();

            System.out.print("Balansi daxil edin: ");
            balances[i] = sc.nextDouble();
        }

        do{
            System.out.println("Balansa baxmaq ucun 1-e bas.");
            System.out.println("Pul yatirmaq ucun 2-e bas.");
            System.out.println("Pul cixarmaq ucun 3-e bas.");
            System.out.println("Adi deyismek ucun 4-e bas.");
            System.out.println("Cixis ucun 5-e bas.");
            System.out.print("Emeliyatin nomresini daxil edin: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num == 5){
                System.out.println("Cıxıs edildi."); break;
            }
            switch (num){
                case 1:
                    balance(userName, balances); break;
                case 2:
                    pulYatir(userName, balances); break;
                case 3:
                    pulCixar(userName, balances); break;
                case 4:
                    adDeyis(userName); break;
                default:
                    System.out.println("1 ve 5 arasi reqem daxil edin."); break;
            }
        }while(true);
    }

    public static void balance(String[] userName, double[] balances){
        System.out.print("Adınızı daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String adi = sc.nextLine();
        int count=0;
        while(true){
            for (int i = 0; i < 3; i++)
                if(userName[i].equals(adi)){
                    count = i;
                    break;
                }
            if(count == 0) {
                System.out.println("Yanlis ad daxil edildi.Yeniden daxil edin.");
                adi = sc.nextLine();
            }
            else break;
        }
        System.out.println("Sizin balansiniz: " + balances[count] + "\n");
    }

    public static void pulYatir(String[] userName, double[] balances){
        System.out.print("Adınızı daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String adi = sc.nextLine();
        System.out.print("Meblegi daxil edin: ");
        int meb = sc.nextInt();
        int count=0;
        while(true){
            for (int i = 0; i < 3; i++)
                if(userName[i].equals(adi)){
                    count = i;
                    break;
                }
            if(count == 0) {
                System.out.println("Yanlis ad daxil edildi.Yeniden daxil edin.");
                adi = sc.nextLine();
            }
            else break;

        }
        if(meb >= 1000) System.out.println("TEBRIKLER!!!");
        balances[count] += meb;
        System.out.println("Sizin balansiniz: " + balances[count]);
        System.out.println("Mebleg ugurla daxil edildi.\n");
    }

    public static void pulCixar(String[] userName, double[] balances){
        System.out.print("Adınızı daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String adi = sc.nextLine();
        int count=0;
        while(true){
            for (int i = 0; i < 3; i++)
                if(userName[i].equals(adi)){
                    count = i;
                    break;
                }
            if(count == 0) {
                System.out.println("Yanlis ad daxil edildi.Yeniden daxil edin.");
                adi = sc.nextLine();
            }
            else break;

        }
        System.out.print("Cixartmaq istediyiniz meblegi daxil edin: ");
        int meb;
        while(true){
            meb = sc.nextInt();
            if(balances[count] >= meb) break;
            System.out.println("Sizin kifayet qeder balansiniz yoxdur.");
            System.out.print("Yeniden daxil edin: ");
        }
        balances[count] -= meb;
        System.out.println("Sizin balansiniz: " + balances[count]);
        System.out.println("Mebleg ugurla cixarildi.\n");
    }

    public static void adDeyis(String[] userName){
        System.out.print("Kohne adinizi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String adi = sc.nextLine();
        int count=0;
        while(true){
            for (int i = 0; i < 3; i++)
                if(userName[i].equals(adi)){
                    count = i;
                    break;
                }
            if(count == 0) {
                System.out.println("Yanlis ad daxil edildi.Yeniden daxil edin.");
                adi = sc.nextLine();
            }
            else break;
        }
        System.out.print("Yeni adinizi daxil edin: ");
        String yeniAd = sc.nextLine();
        userName[count] = yeniAd;
    }
}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Adinizi giriniz ve pulunuz daxil edin: ");
//        String str = sc.nextLine();
//        String numberPart = str.replaceAll("[^0-9]", "");
//        int a = Integer.parseInt(numberPart);
////        System.out.println(a+  str);
//        System.out.println("Balans yoxlamaq ucun 1-e basin.");
//        System.out.println("Pul cixartmaq ucun 2-e basin.");
//        System.out.println("Pul yatirmaq ucun 3-e basin.");
//        System.out.print("Emeliyati daxil edin: ");
//        int num = sc.nextInt();
//
//        switch (num){
//            case 1: System.out.print("Balans: " + a); break;
//            case 2:
//                System.out.print("Meblegi daxil edin: ");
//                int meb = sc.nextInt();
//                while(true){
//                    System.out.print("Yeni mebleg daxil edin: ");
//
//                    if(meb > a){
//                        System.out.println("Balansda kifayet qeder pul yoxdur.");
//                    }
//                    else if(meb < a){
//                        a -= meb;
//                        System.out.println("Balans: " + a);
//                    }
//                }
//        }