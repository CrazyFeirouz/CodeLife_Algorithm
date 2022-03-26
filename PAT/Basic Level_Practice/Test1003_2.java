import java.util.Scanner;

/**
 * @description: 1003 我要通过！
 * @author: Feirouz
 * @date: 2022-02-18 19:50
 * 第二版本 - 20分
 */

public class Test1003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            String input = scanner.next();
            if(pass(input)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean pass(String str) {
        // 先得包含这三个字符
        if (str.contains("A") && str.contains("P") && str.contains("T")) {
            boolean matche = str.matches("A*PA+TA*");
            if (matche) {
                int A_P = str.indexOf('P');
                int tIndex = str.indexOf('T');
                int P_A = tIndex - A_P - 1;
                int T_A = str.length() - tIndex - 1;
                if (A_P * P_A == T_A) {
                    return true;
                }
            }
        }
        return false;
    }

}
