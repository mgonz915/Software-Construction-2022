import java.util.List;

public class QuizView {
	public void welcomeMSG() {
		System.out.println("----------------------------------------------");
		System.out.println("WELCOME TO LET'S QUIZ!");
		System.out.println("----------------------------------------------\n");
	}
	public void userInfo(String name, String email, int quizCount) {
		System.out.println("USER INFORMATION:\n----------------------------------------------");
		System.out.println("\tName: "+name+"\n\tEmail: "+email+"\n\tQuiz Count: "+quizCount);
		System.out.println("----------------------------------------------\n");
	}
	public void quizMenu(List<Quiz> quizzes) {
		System.out.println("USER QUIZZES:\n----------------------------------------------");
		for(int i = 0; i < quizzes.size(); i++) {
			System.out.println("\t"+(i+1)+": "+quizzes.get(i).getTitle());
		}
		System.out.println("----------------------------------------------\n");
	}
}
