package etc;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//문제) 1000미만의 자연수에서 3,5의 배수의 총합 구하기
		/*
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if (i%3==0 || i%5==0) sum+=i;
		}
		System.out.println(sum);
		*/
		
		
		//문제) Spiral Array 출력하기 - 6x6 매트릭스에 나선형 회전을 한 값 출력
		int num1=0, num2=0;
		int num=0; //매트릭스에 입력될 숫자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 입력: ");
		num1=sc.nextInt();
		System.out.print("열 입력: ");
		num2=sc.nextInt();
		int[][] arr = new int [num1][num2];
		
		for (int i=0;i<arr.length;i++) {
			if (i==0) {
				for (int j=0;j<arr[i].length;j++) {
					arr[i][j] = num;
					num++;
					
					if (j==arr[i].length-1) {
						for (int k=1;k<arr[i].length;k++) {
							arr[k][j]=num;
							num++;
						}
					}	
				}
				i=4;
			}
			
			if (i==5) {
				for (int j=arr[i].length-2;j>=0;j--) {
					arr[i][j]=num;
					num++;
					
					if (j==0) {
						for (int k=arr.length-2;k>0;k--) {
							arr[k][j]=num;
							num++;
						}
					}
				}
				i=0;
			}
			
			if (i==1) {
				for(int j=1;j<arr[i].length-1;j++) {
					arr[i][j]=num;
					num++;
					
					if (j==4) {
						for(int k=2;k<arr.length-1;k++) {
							arr[k][j]=num;
							num++;
						}
					}
				}
				i=3;
			}
			
		}//첫번째 for문 끝!
		
		
		//출력 함수
		for(int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
