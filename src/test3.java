import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i, ebob=1,ekok;
        System.out.println("***Lutfen n1'i n2'den kucuk bir deger giriniz***");
        System.out.print("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();

        if (n1<n2){
            i = n1;
            while (i >= 1){
               if (n1 % i == 0 && n2 % i == 0){
                   ebob = i;
                   System.out.println("ebob: " +ebob);
                   break;
               }
                i--;
            }
        } else {
            System.out.println("n1 n2'den buyuk olamaz.");
        }
         ekok = (n1*n2)/ebob;
         System.out.println("ekok: "+ekok);
    }

}





