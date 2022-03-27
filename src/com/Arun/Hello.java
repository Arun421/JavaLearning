package com.Arun;

public class Hello {
 private A Aobj;
 
 private B Bobj;

 public Hello(A Aobj) {
	this.Aobj = Aobj;
}
public Hello(B Bobj) {
	this.Bobj = Bobj;
}
 
public Hello(A aobj, B bobj) {  
	super();
	Aobj = aobj;
	Bobj = bobj;
}


public void show() {
	System.out.println(Aobj);
	System.out.println(Bobj);
}
 
}
