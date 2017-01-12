import java.util.LinkedList;

// queue needs to check if the student is above 15 
/**
 * A class for creating queues of students
 * @author Amy Zheng 260566548
 *
 */
public class Queue {
	private LinkedList<Student>  inline;
	private int size =0;
	//Constructor for queue
	
	Queue(){
		inline = new LinkedList<Student>();
	}
	
	
	/**
	 * Constructor for creating a Queue
	 * @param student a valid student with a Name, ID, and age
	 */
	//Has to have at least one student to start a queue
	Queue(Student student){
		
		inline = new LinkedList<Student>();
		
		if(checkAge(student.getAge()) == true && checkID(student.getID())){
			this.enqueues(student);
		}	
	}
	
	/**
	 * Adds a student at the back of the line 
	 * @param student a valid student with a Name, ID, and age
	 */

	//for adding a student to line
	public void enqueues(Student student){
		if(checkAge(student.getAge()) == true && checkID(student.getID())){		
			this.inline.addLast(student);
		}
		size++;
	}
	
	/**
	 * Removes the first student in the line
	 */
	//for removing a student from line
	public void dequeues(){
		if(size!=0){
			this.inline.removeFirst();
		}else{
			throw new IllegalArgumentException("The Queue is empty");
		}
		size--;
	}
	/**
	 * Gets the size of the queue
	 * @return the size of the queue
	 */
	public int getSize(){
		return size;
	}
	
	
	/**
	 * For checking whether the student is old enough for the graduation party
	 * @param age the age of a student
	 * @return
	 */
	//has to be larger or equal to 15
	private boolean checkAge(int age){
		if(age >= 15){//if older than or equal to 15
			return true;
		} else{
			throw new IllegalArgumentException(age + " is underaged for the graduation party");
		}		
	}
	
	/**
	 * For checking whether the student is a high school student
	 * @param ID a student ID
	 * @return
	 */
	//For checking if it is a valid student ID number
	private boolean checkID(String ID){
		for(int i = 0 ; i <= 1 ; i++){
			if(ID.charAt(i) != '2'){
				throw new IllegalArgumentException("This ID does not start with 22");
		
			}
		}
				return true;	
	}	
	
	
}
