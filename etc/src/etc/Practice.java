package etc;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//����) 1000�̸��� �ڿ������� 3,5�� ����� ���� ���ϱ�
		/*
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if (i%3==0 || i%5==0) sum+=i;
		}
		System.out.println(sum);
		*/
		
		
		//����) Spiral Array ����ϱ� - 6x6 ��Ʈ������ ������ ȸ���� �� �� ���
		int num1=0, num2=0;
		int num=0; //��Ʈ������ �Էµ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		num1=sc.nextInt();
		System.out.print("�� �Է�: ");
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
			
		}//ù��° for�� ��!
		
		
		//��� �Լ�
		for(int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
