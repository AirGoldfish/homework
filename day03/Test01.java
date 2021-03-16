package day03;

import java.util.*;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(cal.DATE,3);
        d=cal.getTime();
        System.out.println(d);
    }
}
