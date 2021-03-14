package day01;

import java.util.Arrays;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 
 * @author Bonnie
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		char[] c=new char[7];
		String str="";
		for (int i = 0; i < c.length/2+1; i++) {
			c[i]=(char)(Math.random()*26+65);
			c[c.length-1-i]=c[i];
		}
		for (int i = 0; i < c.length; i++) {
			str=str+c[i];
		}
		System.out.println(str);
		if(check(str)){
			System.out.println("是回文");
		}
		else {
			System.out.println("不是回文");
		}

	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str){
		char[] c=str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=c[c.length-1-i]){
				return false;
			}
		}
		return true;
	}
}
