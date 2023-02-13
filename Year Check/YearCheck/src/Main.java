import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = scanner.nextInt();
        boolean LaNamNhuan = false;

        boolean CHiaCho4 = year % 4 == 0;
        if(CHiaCho4){
            boolean CHiaCho100 = year % 100 == 0;
            if(CHiaCho100){
                boolean CHiaCho400 = year % 400 == 0;
                if(CHiaCho400){
                    LaNamNhuan = true;
                }
            } else {
                LaNamNhuan = true;
            }
        }

        if(LaNamNhuan){
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d la nam ko nhuan", year);
        }
    }
}