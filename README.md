# Comparator-in-Java
Difference between Comparable and Comparator
Comparable is meant for objects with natural ordering which means the object itself must know how it is to be ordered. For example Roll Numbers of students. Whereas, Comparator interface sorting is done through a separate class.
Logically, Comparable interface compares “this” reference with the object specified and Comparator in Java compares two different class objects provided.
If any class implements Comparable interface in Java then collection of that object either List or Array can be sorted automatically by using Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural order defined by CompareTo method.
