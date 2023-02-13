import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 24000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money Usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * 24000;
        System.out.print("To VND: " + quydoi);
    }
}