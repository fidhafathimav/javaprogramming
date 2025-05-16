package project1;
import java.util.Scanner;

public class Linearsearch {
	public static void main(String[]args) {
		int i,n,search,array[],f=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=s.nextInt();
		array=new int[n];
		System.out.println("enter elements");
		for(i=0;i<n;i++) {
			array[i]=s.nextInt();}
		System.out.println("enter elements to search");
		search=s.nextInt();
		for(i=0;i<n;i++) {
			if(array[i]==search) {
				System.out.println("found in"+(i+1)+"th location");
				f=1;
				break;
			}
		}
		if(f==0) {
			System.out.println("Not found");
		}
		
	}
	
	}


