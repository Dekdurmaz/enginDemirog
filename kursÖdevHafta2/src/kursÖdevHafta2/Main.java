package kursÖdevHafta2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java" , "Engin Demirog", "Ücretsiz", "100 Saat");
		Course course2 = new Course("C#" , "Engin Demirog", "Ücretsiz" , "120 Saat");
		Course [] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println(course.teacher);
			System.out.println(course.price);
			System.out.println(course.detail);
			
		}
		
		Student student1 = new Student("Muhammed Cemal ÖZBEK", 1 , new Course[] {course1});
		Student student2 = new Student("Muhammet Enes KOCA", 2 , new Course[] {course2});
		Student [] students = {student1,student2};
		
		
		for (Student student : students) {
			System.out.println(student.name);
			}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		
		CourseManager courseManager1 = new CourseManager();
		courseManager1.delete(course1);
		courseManager1.delete(course2);
		
		
	}

}
