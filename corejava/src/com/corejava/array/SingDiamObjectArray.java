package com.corejava.array;

public class SingDiamObjectArray {
	public static void main(String[] args) {

		System.out.println("********************** ACCOUNT************************");		
		
		Account ac[] = new Account[3];

		System.out.println(ac[0]);

		ac[0] = new Account();
		ac[0].setAccountNo(1);
		ac[0].setBalance(100);
		ac[0].setName("Ram");

		System.out.println(ac[0]);

		ac[1] = new Account();
		ac[1].setAccountNo(2);
		ac[1].setBalance(200);
		ac[1].setName("Rohan");

		ac[2] = new Account();
		ac[2].setAccountNo(3);
		ac[2].setBalance(300);
		ac[2].setName("Rajesh");

		for (int i = 0; i < ac.length; i++) {
			ac[i].display();
			System.out.println("*****");
		}

		System.out.println("********************** STUDENT************************");
		Student st[] = new Student[5];

		st[0] = new Student("Ram", "Deshpande", "ram@yahoo.com", 1, 5);
		st[1] = new Student("Lakhan", "Chand", "ram@yahoo.com", 2, 5);
		st[2] = new Student("Nikhil", "Puri", "ram@yahoo.com", 3, 5);

		for (int i = 0; i < st.length; i++) {

			if (st[0] != null) {

				st[0].displayInfo();
			}
		}

	}
}