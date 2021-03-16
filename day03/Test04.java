package day03;

import java.text.*;
import java.util.*;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生产日期, 输入格式为:yyyy-MM-dd");
        String product = sc.nextLine();
        System.out.println("请输入保质期天数：");
        int day=sc.nextInt();
        Date date = sdf.parse(product);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_YEAR,day);
        cal.add(Calendar.DAY_OF_YEAR,-14);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        date=cal.getTime();
        System.out.println(date);
    }
}
