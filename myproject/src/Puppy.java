public class Puppy {

	int puppyAge;
	String puppyName;
	
	public String getPuppyName() {
		return puppyName;
	}

	public Puppy(String name)
	{
		System.out.println("Passed Name is " + name);
		this.puppyName = name;
	}
	
	public void setAge(int puppyAge){
		this.puppyAge = puppyAge;
	}
	
	public int getAge(){
		System.out.println("Puppy Age is " + puppyAge);
		return puppyAge;
		
	}
	
	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy("Tommy");
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Variable name puppyAge = " + myPuppy.puppyAge);
		System.out.println(myPuppy.getPuppyName());
		
	}
}
