
// Constructor overloading example

public class Student {
	public  int rno;
	private String name;
	String  first_name;
	protected String univer;
	
    public Student(){
		
	}
	
	public Student(int rno, String name, String first_name){
	this.rno = rno;
	this.name = name;
	this.first_name = first_name;
	}
	
	public Student(int rno, String name, String first_name, String univer){
	this.rno = rno;
	this.name = name;
	this.first_name = first_name;
	this.univer = univer;
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("rno="+rno+" name="+name+" first_name="+first_name + " univer="+univer);
	}
}