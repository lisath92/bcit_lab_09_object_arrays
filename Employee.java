public class Employee {

	private String firstName;
	private String lastName;

	/**
	 * Default constructor.
	 */
	public Employee() {
	}

	/**
	 * Employee profile.
	 * 
	 * @param firstName
	 *            is the employee's first name.
	 */
	public Employee(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	/**
	 * @return the firstName as a String.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set.
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && !firstName.trim().isEmpty()) {
			this.firstName = formatName(firstName);
		}
	}

	/**
	 * @return the lastName as a String.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set.
	 */
	public void setLastName(String lastName) {
		if (lastName != null && !lastName.trim().isEmpty()) {
			this.lastName = formatName(lastName);
		}
	}

	private String formatName(String name) {
		if (name != null && !name.trim().isEmpty()) {
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}