package com.rs.logical.examples;

public class Armstrong {
public static void main(String[] args) {
int n=153,r,temp,c,sum=0;
temp=n;
while(n>0){
	r=n%10;
	c=r*r*r;
	sum=sum+c;
	n=n/10;
}
n=temp;
if(n==sum){
	System.out.println("Armstrong");
}else{
	System.out.println("Not Armstrong");
}
}
}
