package com.springBoot;
interface I1
{
void m1();
}

interface I2
{
void m2();
}
class A implements I1,I2
{
@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
		
	}

}
public class test{
	public static void main(String[] args) {

	A a= new A();
a.m2();
}

	}
