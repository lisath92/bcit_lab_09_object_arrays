
/**
 * MyArrayList - an imlementation of an array list based on a Java array.
 * 
 * @author Colleen
 * @version 2013.11.15
 */
public class MyArrayList implements MyList {
	private Object[] theList; // array of objects
	private Object type;

	/**
	 * Constructor - start with an empty array
	 */
	public MyArrayList() {
		theList = new Object[0];
	}

	/**
	 * Constructor specifying the object of the list.
	 * @param type is the List's Object type.
	 */
	public MyArrayList(Object type) {
		theList = new Object[0];
		setType(type);
		
	}
	
	/**
	 * Adds a new element at the end of the list.
	 * 
	 * @param the
	 *            object to add
	 * @return true if element successfully added, false if parameter is null
	 */
	public boolean add(Object toAdd) {
		if (toAdd != null && toAdd.getClass().equals(type.getClass())) {
			Object[] newList = new Object[theList.length + 1];
			for (int i = 0; i < theList.length; i++) {
				newList[i] = theList[i];
			}
			newList[theList.length] = toAdd;
			theList = newList;
			return true;
		} else {
			System.out.println("The parameter is not compatible with the list type.");
			return false;

		}
	}

	
	
	/**
	 * Gets the object at the specified index.
	 * 
	 * @param index
	 *            value of object to get
	 * @return object at that index
	 */
	public Object get(int index) {
		if (index >= 0 && index < theList.length) {
			return theList[index];
		} else {
			return null;
		}
	}

	/**
	 * Removes specified object from list.
	 * 
	 * @param index
	 *            value of object to remove
	 * @return the object removed
	 */
	public Object remove(int index) {
		if (index >= 0 && index < theList.length) {
			Object[] newList = new Object[theList.length - 1];
			Object object = new Object();
			int counter = 0;
			for (int i = 0; i < theList.length; i++) {
				if (i == index) {
					object = theList[i];
				} else {
					newList[counter] = theList[i];
					counter++;
				}
			}
			theList = newList;
			return object;
		} else {
			return null;
		}
	}

	/**
	 * Returns size of the list
	 * 
	 * @return number of elements in the list
	 */
	public int size() {

		return theList.length;
	}

	/**
	 * @return true if the list has no elements, false otherwise
	 */
	public boolean isEmpty() {
		if (theList.length > 0) {
			return false;
		} else {
			return true;
		}

	}
	
	/**
	 * @param type of the object.
	 */
	public void setType(Object type) {
		if (type != null) {
			this.type = type;
		}
	}
	
	/**
	 * Displays all the items in the array.
	 */
	public void display() {
		for (Object object : theList) {
			System.out.println(object.toString());
		}
	}
}
