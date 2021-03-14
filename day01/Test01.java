package day01;

import java.util.Arrays;

/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		test1(str);
		//以下自行调用test2,test3...等方法。
		test2(str);
		test3(str);
		test4(str);
		test5(str);
		test6("  Hello   ");
		test7(str);
		test8(str);
		test9(str);

	}
	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
	public static void test1(String str){
		System.out.println("当前方法实现:1:输出字符串\"HelloWorld\"的字符串长度");
		char[] c=str.toCharArray();
		System.out.println(c.length);
	}
	public static void test2(String str){
		System.out.println("当前方法实现:2:输出\"HelloWorld\"中\"o\"的位置");
		char[] c=str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='o'){
				System.out.println("在第"+(i+1)+"个位置");
			}
		}
	}
	public static void test3(String str){
		System.out.println("当前方法实现:3:输出\"HelloWorld\"中从下标5出开始第一次出现\"o\"的位置");
		char[] c=str.toCharArray();
		for (int i = 5; i <c.length ; i++) {
			if(c[i]=='o'){
				System.out.println("在下标"+i+"处");
			}
		}
	}
	public static void test4(String str){
		System.out.println("当前方法实现:4:截取\"HelloWorld\"中的\"Hello\"并输出");
		char[] c=str.toCharArray();
		String result="";
		for (int i = 0; i < c.length; i++) {
			result=result+c[i];
			if(result.equals("Hello")){
				System.out.println(result);
				break;
			}
		}
	}
	public static void test5(String str){
		System.out.println("当前方法实现:5:截取\"HelloWorld\"中的\"World\"并输出");
		char[] c=str.toCharArray();
		String result="";
		for (int i = 5; i < c.length; i++) {
			result=result+c[i];
			if(result.equals("World")){
				System.out.println(result);
				break;
			}
		}
	}
	public static void test6(String str){
		System.out.println("当前方法实现:6:将字符串\"  Hello   \"中两边的空白去除后输出");
		char[] c=str.toCharArray();
		String result="";
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=' '){
				result=result+c[i];
			}
		}
		System.out.println(result);
	}
	public static void test7(String str){
		System.out.println("当前方法实现:7:输出\"HelloWorld\"中第6个字符\"W\"");
		char[] c=str.toCharArray();
		System.out.println(c[5]);
	}
	public static void test8(String str){
		System.out.println("当前方法实现:8:输出\"HelloWorld\"是否是以\"h\"开头和\"ld\"结尾的");
		char[] c=str.toCharArray();
		System.out.println(((c[0]=='h')&&(c[c.length-2]=='l')&&(c[c.length-1]=='d')));
	}
	public static void test9(String str){
		System.out.println("当前方法实现:9:将\"HelloWorld\"分别转换为全大写和全小写并输出");
		char[] c=str.toCharArray();
		String result1="",result2="";
		for (int i = 0; i < c.length; i++) {
			if(c[i]>=97){
				result1=result1+(char)(c[i]-32);
				result2=result2+c[i];
			}
			else {
				result2=result2+(char)(c[i]+32);
				result1=result1+c[i];
			}
		}
		System.out.println(result1+"  "+result2);
	}
}
