package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String key=RandomKey();
		System.out.println("验证码："+key);
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		if(check(str,key)){
			System.out.println("验证有效");
		}
		else{
			System.out.println("验证无效");
		}
	}
	public static String RandomKey(){
		char[] c=new char[5];
		String key="";
		for (int i = 0; i < c.length; i++) {
			if((Math.random()*10)>5) {
				c[i] = (char) (Math.random() * 26 + 65);
			}
			else{
				c[i]=(char)(Math.random() * 26 +97);
			}
			key=key+c[i];
		}
		return key;
	}
	public static boolean check(String str,String key){
		char[] c= str.toCharArray();
		char[] k= key.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(((c[i])!=k[i])&&(c[i]!=(char)(k[i]-32))&&(c[i]!=(char)(k[i]+32))){
				return false;
			}
		}
		return true;
	}
}
