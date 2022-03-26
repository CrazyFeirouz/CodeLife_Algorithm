import java.util.Scanner;

/**
 * @description: 换个格式输出整数
 * @author: Feirouz
 * @date: 2022-02-19 23:38
 */
public class Test1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = numToStr(num);
        System.out.println(s);
    }

    public static String numToStr(int num) {
        int maxBin = (num + "").length();
        String str = "";
        for (int i = 0; i < maxBin; i++) {
            int curBinVal = num / (int) Math.pow(10, i) % 10;
            String curChar = "";
            if (i == 1) {           // 十位
                curChar = "S";
            }
            if (i == 2) {           // 百位
                curChar = "B";
            }
            for (int j = curBinVal; j > 0; j--) {
                if (i == 0) {       // 个位
                    curChar = Integer.toString(j);
                }
                str = curChar + str;
            }
        }
        return str;
    }
}
