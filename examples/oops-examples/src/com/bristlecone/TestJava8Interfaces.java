package com.bristlecone;

interface A { 
	void m1();
	// from Java 8 onwards default methods & static methods are allowed
	default void test1() {
		System.out.println("test1() has defult implementation");
	}
	default void test2() {
		System.out.println("test2() has default implementation");
	}
	static void test3() {
		System.out.println("test3() is static in A");
	}
}
class Imp implements A {
	public void m1() {
		System.out.println("implemented in a class");
	}
	@Override
	public void test2() {
		System.out.println("test2() is overridden");
	}
}
public class TestJava8Interfaces {
	public static void main(String[] args) {
		A.test3();
		A a = new Imp();
		a.test1();
		a.test2();
	}
}
