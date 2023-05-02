import java.util.*;
public class A1103210_0421_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入電子郵件信箱:");
        String mail = sc.next();

        if(mail.matches("[a-z]+@[a-z]+[.][a-z]{2,}")){
            System.out.println("輸入正確");
        }
        else{
            System.out.println("輸入錯誤");
        }
        sc.close();

    }
}

