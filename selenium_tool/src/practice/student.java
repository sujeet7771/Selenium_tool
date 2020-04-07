package practice;

import java.util.Comparator;

import net.bytebuddy.asm.Advice.Return;
import selectClass.sort;

public class student {
 public student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
 private int id;
 private String name;
 private int percentage;
 public static Comparator sortByidAs=(Object o1,Object o2)->{
	 return (((student)o1).getId())-(((student)o2).getId());
 };
//public static Comparator sortByname=(Object o1,Object o2)->{
//	return (((student)o1).getName())-(((student)o2).getName());
//};
public static Comparator sortBypercentage=(Object o1,Object o2)->
{
	return (((student)o1).getPercentage())-(((student)o2).getPercentage());
};

@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getPercentage() {
	return percentage;
}
 
 
 
}
