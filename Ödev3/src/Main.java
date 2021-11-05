
public class Main extends AllCourseManager{
//String courseName,String teacherName,int percentOfFinish
	public static void main(String[] args) {
		AllCourses course1=new AllCourses("Java Script","Engin Demirog",0);
		AllCourses course2=new AllCourses("C#","Engin Demirog",0);
		AllCourses course3=new AllCourses("JAVA&REACT","Engin Demirog",0);
		AllCourses course4=new AllCourses("Temel Programlama","Engin Demirog",0);
		AllCourses [] courses= {course1,course2,course3,course4};
		for(AllCourses courses1:courses){
			System.out.println(courses1.courseName);
			
		}
		AllCourseManager courseManager=new AllCourseManager();
		courseManager.allCourseManager(course1);
		
	
	
	}

	
}