

public class MyArrayListDriver {

	public static void main(String[] args) {
		MyArrayList myList = new MyArrayList(new Employee());
		Object object_1 = new Employee("Stuart", "Bagnall");
		Object object_2 = new Employee("Paul", "walker");
		Object object_3 = "123";
		System.out.println("Adding all objects-------");
		System.out.println(myList.add(object_1));
		System.out.println(myList.add(object_2));
		System.out.println(myList.add(object_3));
		System.out.println("Is the list empty? " + myList.isEmpty());
		System.out.println("Displaying all the list objects -----");
		myList.display();
		System.out.println("The first element in the list: " + myList.get(0));
		System.out.println("Removing the first element------");
		System.out.println(myList.remove(0));
		System.out.println("What is the list size? " + myList.size());

	}

}
