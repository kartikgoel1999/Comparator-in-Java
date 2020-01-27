import java.util.*;
class Student
{
	int sid;
	String name;
	Student(int sid,String name)
	{
		this.sid=sid;
		this.name=name;
	}
	public String toString()
	{
		return "["+sid+"  "+name+"]";
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Student s1=(Student)obj1;
		Student s2=(Student)obj2;
		if(s2.sid > s1.sid)
			return -1;
		else if(s2.sid < s1.sid)
			return 1;
		else
			return 0;
	}
}
class ComparatorDemo1
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1001,"Raja");
		Student s2=new Student(1002,"Java");
		Student s3=new Student(1003,"CSS");
		Student s4=new Student(1004,"JavaScipt");
		Student s5=new Student(1005,"ADvanced Java");
		Student s6=new Student(1006,"C++");
		System.out.println(s1);
		MyComparator comp=new MyComparator();
		TreeSet t1=new TreeSet(comp);
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);
		t1.add(s6);
		System.out.println(t1);
	}
}
