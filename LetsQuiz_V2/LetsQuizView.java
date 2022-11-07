import java.util.List;

public class LetsQuizView {
	public void welcomeMSG() {
		System.out.println("\n--------------------------------------");
		System.out.println("WELCOME TO LET'S QUIZ!");
		System.out.println("--------------------------------------");
	}
	public void successMSG() {
		System.out.println("\n--------------------------------------");
		System.out.println("LOGGIN SUCCCESS!");
		System.out.println("--------------------------------------");
	}
	public void loggoutMSG() {
		System.out.println("\n--------------------------------------");
		System.out.println("LOGGOUT SUCCCESS!");
		System.out.println("--------------------------------------");
	}
	public void menu() {
		System.out.println("\ta. View User Information.");
		System.out.println("\tb. View Quizzes.");
		System.out.println("\tc. Select Quiz To Take.");
		System.out.println("\td. View Gradez.");
		System.out.println("\te. Loggout.");
	}
	public void quizzes(List<Quiz> quizzes) {
		for(int i = 0; i < quizzes.size(); i++) {
			System.out.println("\t"+i+". "+quizzes.get(i).getTitle());
		}
	}
	public void viewUserInformation(String name, String email, int id, int quizCount) {
		System.out.println("\tUser: "+name+"\n\tEmail: "+email+"\n\tID: "+id+"\n\tQuizzes: "+quizCount);
	}
	public void viewQuizGrades(List<Quiz> quizzes) {
		for(int i = 0; i < quizzes.size(); i++) {
			System.out.println("\t"+i+". "+quizzes.get(i).getTitle()+"\n\t\tGrade: "+quizzes.get(i).getGrade());
		}
	}
	public void quizInformation(String title, String topic, String author, int questionCount) {
		System.out.println("\tQuiz Title: "+title+"\n\tQuiz Topic: "+topic+"\n\tQuiz Author: "+author+"\n\tQuestion Total: "+questionCount);
	}
	public void quizResults(String title, String topic, String author, int questionCount, double result) {
		System.out.println("\tQuiz Title: "+title+"\n\tQuiz Topic: "+topic+"\n\tQuiz Author: "+author+"\n\tQuestion Total: "+questionCount+"\n\tQuiz Grade: "+result);
	}
	public void question(int num, String question, String[] questionAnswers) {
		System.out.println("\tQ"+(num + 1)+": "+question);
		for(int i = 0; i < questionAnswers.length; i++) {
			System.out.println("\t"+questionAnswers[i]);
		}
	}
	public void inputErrorMSG(String input) {
		System.out.println("\n--------------------------------------");
		System.out.println("INVALID "+input+" TRY AGAIN!");
		System.out.println("--------------------------------------");
	}
	public void headerMSG(String title) {
		System.out.println("\n"+title+":\n--------------------------------------");
	}
	public void footerMSG() {
		System.out.println("--------------------------------------");
	}
	public void inputMSG(String input) {
		System.out.print(input+": ");
	}
}
