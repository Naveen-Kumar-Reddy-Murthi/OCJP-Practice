package org.mnr.jvm_29;

import java.lang.reflect.Method;
import java.util.Arrays;

public class JavaLangClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c1	=	Class.forName("org.mnr.jvm_29.Student");
		Method[] m= c1.getDeclaredMethods();
		System.out.println(Arrays.toString(m));
		//[public int org.mnr.jvm_29.Student.getId(), public java.lang.String org.mnr.jvm_29.Student.getSchool()]
		
		Student s1	=	new Student();
		Student s2	=	new Student();
		
		Class c2	=	s1.getClass();
		Class c3	=	s2.getClass();
		System.out.println(c2==c3);//true
		System.out.println(c2.hashCode());//364465875
		System.out.println(c3.hashCode());//364465875

	}

}

class Student{
	public Student() {
	}
	public String getSchool(){
		return "AITS";
	}
	public int getId(){
		return 13123;
	}
}