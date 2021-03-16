package day03;
import java.text.*;
import java.util.*;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日, 输入格式为:yyyy-MM-dd");
        String birthday = sc.nextLine();
        Date date = sdf.parse(birthday);
        Date now = new Date();
        long time = now .getTime() - date.getTime();
        long week = time/1000/60/60/24/7;
        System.out.println("到今天经历了:"+week+"周");
    }
}