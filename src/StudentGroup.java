import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */

public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students!=null)
			return students;
		else
			return null;
	
		
	}

	@Override
	public void setStudents(Student[] students)throws IllegalArgumentException {	

	
	if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
		return students[index];
		}
	//return null;
	}

	@Override
	public void setStudent(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
			this.students[index]=student;
			}
		}

	@Override
	public void addFirst(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		Student s=students[0];
		students[0]=student;
		Student s1;
		for(int i=1;i<students.length;i++)
		{
		s1=students[i];
		students[i]=s;
		s=s1;
		}
	}

	@Override
	public void addLast(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		
			{
		if(students[i]==null){
		students[i]=student;
		break;
		}
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		Student s=students[index];
		students[index]=student;
		Student s1;
		for(int i=index+1;i<students.length;i++)
		{
		s1=students[i];
		students[i]=s;
		s=s1;
		}
	}
	@Override
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int k=index;k<students.length-1;k++)
		{
			students[k]=students[k+1];
		}
	}

	@Override

	
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int k=index;k<students.length-1;k++)
		{
			students[k]=students[k+1];
		}
	}

	@OverridealArgumentException {
		// Add your implementation here
		int check=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int k=i;k<students.length-1;k++)
		{
			students[k]=students[k+1];
		}
		check++;
		break;
			
		}
		}
		if(check==0)
			throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		else{
			for(int k=index+1;k<students.length;k++)
			{
			students[k]=null;
			}
		}			
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int j=i+1;j<students.length;j++)
		{
			students[j]=null;
		}
		
		break;
			
		}
		}
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
		int c=0;
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int i=index+1;i<students.length;i++)
		{
		students[c++]=students[i];
		}
		for(int i=c;i<students.length;i++)
		{
		students[i]=null;
		}
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
	//public void remove(Student student)throws Illeg
		int check=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int k=i+1;k<students.length;k++)
		{
			students[check++]=students[k];
		}
		
		break;
		}
			
		}
		for(int i=check;i<students.length;i++)
		{
		students[i]=null;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student s1;
		for(int i=0;i<students.length-1;i++)
		{
			for(int k=0;k<students.length-i-1;k++)
			{
				if(students[k].compareTo(students[k+1])>0){
				s1=students[k];
				students[k]=students[k+1];
				students[k+1]=s1;
				}
			}
		}}
		@Override
	public Student[] getByBirthDate(Date date)throws IllegalArgumentException {
		// Add your implementation here
		Student[] students1=new Student[students.length];
		int check=0;
		if(date==null)
			throw new IllegalArgumentException();
		else
		{
		Date d;
		for(int i=0;i<students.length;i++)
		{
		d=students[i].getBirthDate();
			if(d.before(date) || d.equals(date))
				students1[check++]=students[i];
		}
		}
		return students1;	
		//return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException{
		// Add your implementation here
		Student[] students1=new Student[students.length];
		int check=0;
		if(firstDate==null || lastDate==null)
			throw new IllegalArgumentException();
		else{
			Date d;
		for(int i=0;i<students.length;i++)
		{
		d=students[i].getBirthDate();
		if(d.before(lastDate) && d.after(firstDate))
			students1[check++]=students[i];
		}
		}
		return students1;
		//return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)throws IllegalArgumentException {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent)throws IllegalArgumentException {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=0;
		Student[] students1=new Student[students.length];
		int check=0;
		
		for(int i=0;i<students.length;i++)
		{
			if(max<students[i].getAvgMark())
				max=students[i].getAvgMark();
		}
		for(int i=0;i<students.length;i++)
		{
		if(students[i].getAvgMark()==max)
			students1[check++]=students[i];
		}
		return students1;
		//return null;
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else{
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		
		return students[i+1];
		
		
		}	
		}
		}
			
		return null;
	}
}
