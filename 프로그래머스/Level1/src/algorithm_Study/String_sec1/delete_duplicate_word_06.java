package algorithm_Study.String_sec1;

import java.util.Scanner;

/*
 6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1 

ksekkset
예시 출력 1

kset
 */
public class delete_duplicate_word_06 {
	public static String solution(String str)
	{
		String answer ="";
		
		for(int i=0; i<str.length();i++)
		{
			if(str.indexOf(str.charAt(i))==i) //indxof => 문자가 처음 나타나는 인덱스 위치  - onenote 설명 참고
			{
				// i가 indexof 랑 같으면 중복이 아닌 것임
				answer+=str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	}

}
