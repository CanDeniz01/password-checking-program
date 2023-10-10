package SıfreProjesi;

import java.util.Scanner;

public class SifreKontrol {
    public class C02_Soru2 {
        public static void main(String[] args) {
            //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
            //kontrol edin ve sifredeki hatalari yazdirin.
            //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
            //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
            //- Sifre kucuk harf icermelidir
            //- Sifre buyuk harf icermelidir
            //- Sifre ozel karakter icermelidir
            //- Sifre en az 8 karakter olmalidir.

            boolean flag=false;

            while (!flag){
                Scanner scanner=new Scanner(System.in);
                System.out.println("Lutfen sifre giriniz");
                String sifre=scanner.nextLine();
                flag=sifreKontrol(sifre);

            }
            System.out.println("Sifre basarıyla kaydedildi");
        }
        public static boolean sifreKontrol(String sifre){
            int sayac=0;
            String str=sifre.replaceAll("\\w","");
            String kucukHarf=sifre.toLowerCase();
            String buyukHarf=sifre.toUpperCase();
            int uzunluk=sifre.length();
            if (uzunluk < 8) {
                System.out.println("sifre en az 8 karakter olmalıdır");
                sayac++;
            }
            if (sifre.equals(kucukHarf)){
                System.out.println("Sıfre buyuk harf içermeli");
                sayac++;
            }
            if (sifre.equals(buyukHarf)){
                System.out.println("Sıfre kucuk harf icermeli");
                sayac++;
            }
            if (sifre.contains(str)){
                System.out.println("Ozel karakter icermemeli");
                sayac++;
            }
            if (sayac==0){
                return true;
            }else {
                return false;
            }

        }






    }

}
