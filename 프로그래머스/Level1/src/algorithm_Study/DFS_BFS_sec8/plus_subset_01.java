package algorithm_Study.DFS_BFS_sec8;

import java.util.Scanner;

/* 합이 같은 부분집합
 * 
 1. 합이 같은 부분집합(DFS : 아마존 인터뷰)
설명

N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때

두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.

둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.

예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.


입력
첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.

두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.


출력
첫 번째 줄에 “YES" 또는 ”NO"를 출력한다.


예시 입력 1 

6
1 3 5 6 7 10  

예시 출력 1
YES
 
 */
public class plus_subset_01 {
	 static String answer = "NO";
	 static int n, total =0;
	 static boolean flag = false;
	 
	 static void DFS(int L , int sum, int[] arr)
	 {
		 if(flag)
		 {
			 return; // 트루면 넘어오는 재귀 다 리턴 하기
		 }
		 if(sum>total/2) //포함하지 않을때
		 {
			 return; 
		 }
		 if(L==n)
		 {
			 if((total-sum)==sum)
			 {
				 answer = "YES";
				 flag = true;
			 }
			 
		 }
		 else
		 {
			 DFS(L+1, sum+arr[L], arr); //sum에 arr 부분집합 누적
			 DFS(L+1, sum, arr);
		 }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n ; i++)
		{
			arr[i] = kb.nextInt();
			total+= arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);

	}

}
