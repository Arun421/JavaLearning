package com.Arun;

public class A {
private int a;
private String msg;
 public A() {
	 System.out.println("Default constructor");
 }
 public A(int a,String msg) {
	 System.out.println("2 param constructor");
 }
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public String toString() {
	return "A [a=" + a + ", msg=" + msg + "]";
}


}
