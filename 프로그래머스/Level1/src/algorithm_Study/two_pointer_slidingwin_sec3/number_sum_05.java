package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.Scanner;

/*
 5. 연속된 자연수의 합
설명

N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 
정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.

입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력
첫 줄에 총 경우수를 출력합니다.


예시 입력 1 
15

예시 출력 1
3
 */
public class number_sum_05 {
	
	static int solution(int n)
	{
		int answer = 0, sum = 0, lt =0;
		int m = n/2+1;  //타겟의 슬라이딩 범위
		
		int []arr  = new int[m];
		
		for(int i =0; i<m;i++)
		{
			arr[i] = i+1; //연속된 자연수 배열에 대입
		}
		for(int rt=0; rt<m; rt++)
		{
			sum+=arr[rt];
			
			if(sum==n) answer++; //가짓수 출력
			
			while(sum>=n)
			{
				sum-=arr[lt++]; 
				if(sum==n) answer++;
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
	}

}
