package algorithm_Study.two_pointer_slidingwin_sec3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1 

3
1 3 5
5
2 3 6 7 9
예시 출력 1

1 2 3 3 5 6 7 9
 */
public class two_pointer_algorithm {
	
	static public ArrayList<Integer> solution(int n, int m, int []a, int[] b)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 =0, p2 =0; //포인터
		
		while(p1<n && p2<m)
		{
			if(a[p1]<b[p2])
			{
				answer.add(a[p1++]); //후순위 연산자, p1을 가르키는 값을 애드하고 1증가함!!!!!!!!!!!!!!!!!!!!!!
			}
			
			else
			{
				answer.add(b[p2++]);
			}
			
		}
		
		while(p1<n) //남아있을떄 포인터만 이동하면서 넣어줌
		{
			answer.add(a[p1++]);
		}
		
		while(p2<m)
		{
			answer.add(b[p2++]);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++)
		{
			b[i] = kb.nextInt();
		}
		for(int x : solution(n,m,a,b))
		{
			System.out.print(x + " ");
		}
	}

}
