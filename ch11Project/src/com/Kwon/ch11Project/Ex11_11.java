package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		 //HashSet�� Ŭ������ ��ü�� add�� ��ü�� Ư�� �ɹ������� �ߺ��� ���� ���ϱ� ���� ���
	      HashSet set = new HashSet(); 
	      
	      boolean res = set.add("abc");
	      boolean res1 = set.add("abc");
	      //��Ұ� abc�� ���� �����Ƿ� �ߺ��Ǿ� ���°��� add����
	      System.out.println(res);
	      System.out.println(res1);
	      System.out.println(set);
	      
	      //�������� ��� ������ ���� Ŭ������ ��ü�� add�� �� ��ü�� Ư�� ��� ������ �������� �ߺ� üũ�� �ϱ� ���ؼ���
	      //Object�� equals�� hashCode�޼��带 ������ �Ͽ� ��
	      //add�� equals �� hashCode�޼��带 �ڹٿ��� ȣ���Ͽ� üũ
	      //Person ��ü�� add��
	      //new �� �����ϴ� ��ü�� �ּҰ� �ٸ� ��ü
	      //equals�� hashCode �� ������ �ʰ� Object���� ����ϸ� ������ �ɹ� ������ ���� ������ ����
	      //�ɹ����� ������ ���Ϸ��� equals�� hashCode�� PersonŬ�������� ������
	      set.add(new Person("David",10));
	      set.add(new Person("David",10));
	      System.out.println(set);
	   }

	}
	class Person {
	   String name;
	   int age;
	   Person(){
	    super();   
	   }
	   Person(String name,int age){
	      super();   
	      this.name=name;
	      this.age=age;
	   }
	   
	   @Override
	   public String toString() {
	      return name + ":" + age;
	   }
	   @Override
	   public boolean equals(Object obj) {
	      if (!(obj instanceof Person)) {
	         return false;
	      }
	      Person p = (Person)obj;
	      return name.equals(p.name) && age == p.age;
	   }
	   @Override
	   public int hashCode() {
	      return Objects.hash(name,age);
	      //Objects �� java.util�� �ִ� Object�� ���ϰ� ó���ϴ� Ŭ����
	      //hash(Object ...values)�� values�� �̿��Ͽ� hashCode�� �����
	      
	   }//main method;
	}//main class;