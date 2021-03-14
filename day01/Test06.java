package day01;
/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		int a=parseInt("56*99");
		System.out.println(a);
	}
	public static int parseInt(String str){
		// 最后要生成的数字
		int num = 0,num1=0;
		// 临时变量，用于计算对应位数的数字
		int flag = 0,pos=0;
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i)-48)<0){
				pos=i;
				break;
			}
		}
		for (int i = 0; i < pos; i++) {
			flag=(int)((str.charAt(i)-48)*Math.pow(10,(pos-i-1)));
			num+=flag;
		}
		for (int i = pos+1; i < str.length(); i++) {
			flag=(int)((str.charAt(i)-48)*Math.pow(10,(str.length()-i-1)));
			num1+=flag;
		}
		switch (str.charAt(pos)) {
			case '+':
				num = num + num1;
				break;
			case '-':
				num=num-num1;
				break;
			case '*':
				num=num*num1;
				break;
			case '/':
				num=num/num1;
				break;
			default:
		}
		return num;
	}
}








