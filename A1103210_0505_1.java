import java.util.Scanner;

public class A1103210_0505_1{
    public static void main(String[] args) {
        int[] win = { 5, 14, 28, 31, 36, 42 };
        int[] user = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("請輸入第 " + (i+1) + " 個數字：");
            int num = sc.nextInt();

            if (num < 1 || num > 49) {
                System.out.println("輸入的數字必須在 1 到 49 之間");
                throw new IllegalArgumentException("數字超出範圍");
            }

            user[i] = num;
        }

        int matchCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (user[i] == win[j]) {
                    matchCount++;
                    break;
                }
            }
        }
        
        if (matchCount >= 3) {
            System.out.println("恭喜你中獎了！");
        } else {
            System.out.println("很抱歉，你沒有中獎");
        }
    }
}
