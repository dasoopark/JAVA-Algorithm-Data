package algorithm_Study.Sorting_and_Searching_sec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 7. 좌표 정렬
설명

N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력
N개의 좌표를 정렬하여 출력하세요.

예시 입력 1 
5
2 7
1 3
1 2
2 5
3 6
예시 출력 1

1 2
1 3
2 5
2 7
3 6
 */

//좌표정렬

class Point implements Comparable<Point>
{
	public int x, y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) { //정렬 기준을 잡아야함
		// TODO Auto-generated method stub
		//o.x => 콜되서 들어온 매개변수 객체의 값
		if(this.x==o.x)
			return this.y-o.y;       //현재 this 객체가 앞에있고, 매개변수로 넘어온 오브젝트 객체가 뒤에 있으면  
		else
		{
			return this.x-o.x;
		}
	}
	
}

public class xy_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x,y));
		}
		
		Collections.sort(arr); //Comparable을 통해서, Point객체를 정렬 시킴 - CompareTo
		for(Point o : arr)
		{
			System.out.println(o.x+" "+o.y);
		}
	}

}
