import java.util.*;
public class A1103210_0421_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年月日(請以/隔開):");
        String date = sc.next();
        char[] y = new char[4];
        char[] m = new char[2];
        char[] d = new char[2];
        if(date.matches("[0-9]{4}[/][0-9]{2}[/][0-9]{2}")){
            date.getChars(0, 4, y, 0);
            date.getChars(5, 7, m, 0);
            date.getChars(8, 10, d, 0);
        }
        else if(date.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")){
            date.getChars(0, 2, m, 0);
            date.getChars(3, 5, d, 0);
            date.getChars(6, 10, y, 0);
        }
        else{
            System.out.println("輸入錯誤");
        }
        sc.close();

        String year = new String(y); // 將char陣列轉換為字串
        String month = new String(m);
        String day = new String(d);
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
    }
}