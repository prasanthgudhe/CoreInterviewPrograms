package com.rs.logical.examples;

public class Palindrome {
public static void main(String[] args) {
	int n=121,r,sum=0,temp;
	temp=n;
	while(n>0){
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	n=temp;
	if(sum==n){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not Palindrome");
	}
}
}
