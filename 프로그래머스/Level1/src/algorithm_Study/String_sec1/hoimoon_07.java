package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 7. 회문 문자열
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1 

gooG
예시 출력 1

YES
 */
public class hoimoon_07 {
	public static String solution(String str)
	{
		String answer ="YES";
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i=0; i<len/2 ; i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1)) // good 기준 0 과 3(인덱스) 비교 하려면  len-i-1 해줘야 함  4-0-1
			{
				answer = "NO";
			}
		}
		return answer;
	}
	
	public static String solution_builder(String str)
	{
		String answer ="NO";
		String tmp = new StringBuilder(str).reverse().toString(); //뒤집어지게 함
		
		if(str.equalsIgnoreCase(tmp)) //equalsIgnoreCase : 대문자 무시하고 비교하는 기능
		{
			answer="YES";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution_builder(str));
	}

}
