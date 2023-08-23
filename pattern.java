package com.pattern;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;int count=8;int i;
		
		for(i=1;i<n;i++)
		{			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(" "+ count);
			}
			System.out.println();
			count=count-2;
		}
		

	}

}
