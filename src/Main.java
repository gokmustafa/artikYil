import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen yıl giriniz: ");

        int year = input.nextInt();

        if ((year % 4)==0){
            System.out.print(year +" bir artık yıldır.");
        } else {
            System.out.print(year +" bir artık yıl değildir.");
        }
    }
}
