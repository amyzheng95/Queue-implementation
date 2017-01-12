//Need to make sure that he or she is a student

/**
 * A class for students that contains their name, age and ID
 * @author Amy Zheng 260566548
 *
 */

public class Student {
	
	private String name;
	private int age;
	private String studentID;
	
	/**
	 * Construct a Student using their names, age and IDs
	 * @param name the name of the student
	 * @param age the age of the student
	 * @param ID the student ID number of the student
	 */
	//We can only know if a student is valid if they have their ID cards
	//Based on common sense, their IDs have their names and birthdays
	//This constructor constructs a student only when ID and age is correct
	
	//Name
	//Assume name only has letters
	
	//Age
	// we'll assume that a student can be of any age of 5 to 122 (which I found online
	// is the oldest person in the world) cause I don't really know if all high school have 
	//age limits
	
	//ID
	//We assume here that all student IDs are 5 digits long but might not start with 22
	//Has to only have numbers
	
	/**
	 * Constructs a student
	 * @param name student's name
	 * @param age student's age
	 * @param ID student's ID
	 */
	Student(String name, int age, String ID){
		// can construct a student with valid ID and age
		if(this.checkAge(age) == true 
				&& this.checkID(ID) == true
				&& this.checkName(name) == true){
			this.name = name;
			this.studentID = ID;
			this.age = age;
		} 
	
		 
	}
	
	//If the organizer wants to check whether the data is correct
	
	/**
	 * Gets the name of the student
	 * @return the name of the student in String
	 */
	public String getName() {
		 return this.name;
	}
	
	/**
	 * Gets the age of the student 
	 * @return the age of the student in integer
	 */
	public int getAge() {
		 return this.age;
	}
	
	/**
	 * Gets the student ID number of the student
	 * @return the student ID number of the student
	 */
	public String getID() {
		 return this.studentID;
	}
	
	
	//Just in case they have to change the data of the students	
	//For setting the name individually
	/**
	 * Sets the name of the student
	 * @param name the name of the student
	 */
	public void setName(String name){
		if(this.checkName(name) == true){
			this.name = name;
		}
	}
	
	/**
	 * Sets the age of the student
	 * @param age the age of the student
	 */
	public void setAge(int age){
		if(this.checkAge(age) == true){
			this.age = age;
		}
	}
	
	/**
	 * Sets the student ID number of the student
	 * @param ID the student ID number of the student
	 */
	public void setId(String ID){
		if(this.checkID(ID) == true){
			this.studentID = ID;
		}
	}
	
	//CHECKING
	
	/**
	 * For checking name
	 * @param name name of student
	 * @return
	 */
	//For checking if it is a valid name
	private boolean checkName(String name){
		if(name.matches("^[ A-z]+$")){
			return true;
		}else {
			 throw new IllegalArgumentException(name + " is not a valid name!");
		}	
	}
	
	/**
	 * For checking student age
	 * @param age the age of a student
	 * @return
	 */
	//has to be between and including 5-122.
	private boolean checkAge(int age){
		if(age >= 5 && age <= 122){//if older than 5
			return true;
		} else{
			throw new IllegalArgumentException(age + " is not a valid age for a student");
		}
	}
	
	/**
	 * For checking if it is a valid student ID number
	 * @param ID student ID , can have letters
	 * @return
	 */
	//For checking if it is a valid student ID number
	private boolean checkID(String ID){
		if(ID.length() == 5 && ID.matches("[0-9 A-z]+")){//check if it's characters and 5 digits
			for(int i = 0 ; i <= 1 ; i++){
			}
			return true;
		} else{
			throw new IllegalArgumentException(ID + " is not a valid ID");
		}
		
	}
		
}
