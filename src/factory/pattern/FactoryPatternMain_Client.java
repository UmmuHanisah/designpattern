package factory.pattern;

// Source: https://www.youtube.com/watch?v=JFvSCobD7JU
// Java Design Pattern Interview Questions and Answers [ MOST ASKED DESIGN PATTERN INTERVIEW QUESTIONS]

// This is a client class
public class FactoryPatternMain_Client {

	public static void main(String[] args) {
		
		//1: Create a factory object
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		//2: Ask factory to bring the doctor. The client will not see how to bring a Doctor
		// getProfession() method will return a Doctor object
		Profession doctor = professionFactory.getProfession("Doctor");
		doctor.print();

	}

}
