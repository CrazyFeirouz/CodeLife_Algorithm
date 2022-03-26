import java.util.*;

/**
 * @description: 继续(3n+1)猜想
 * @author: Feirouz
 * @date: 2022-02-20 20:42
 */

/**
 * 思路： 我们按照路线全部走一遍，并且将所有算出来的数值都存在某HashSet（元素不能重复）中，
 *      存完后，比较我们要判断的数是否在HashSet中存在，
 *          若存在，则不是关键数，
 *          若不存在，则是关键数
 */
public class Test1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> allNumList = new HashSet<>();      // 存储所有计算过程数值
        int[] numlist = new int[n];                         // 所有需判断值的数组
        for (int i = 0; i < n; i++) {
            // 1. 获取输入值
            int curNum = scanner.nextInt();
            // 2. 放入所有判断值的数组
            numlist[i] = curNum;
            // 3. 循环该数所有过程值，并且存入hashset中
            while (curNum > 1){
                if (curNum % 2 == 1) {  // 奇数
                    curNum = (curNum * 3 + 1) / 2;
                    allNumList.add(curNum);
                } else {                // 偶数
                    curNum = curNum / 2;
                    allNumList.add(curNum);
                }
            }
        }
        // 现在已经得到了两个数组所有值
        // 判断所有判断值的数是否在HashSet中存在
        ArrayList<Integer> keylist = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (!allNumList.contains(numlist[i])) {
                keylist.add(numlist[i]);
            }
        }
        // 返回结果
        String str = "";
        Collections.sort(keylist);
        for (Integer key : keylist) {
            str = key + " " + str;
        }
        System.out.println(str.trim());
    }
}
