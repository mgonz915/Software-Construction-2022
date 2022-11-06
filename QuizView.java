import java.util.List;

public class QuizView {
	public void welcomeMSG() {
		System.out.println("\n----------------------------------------------");
		System.out.println("WELCOME TO LET'S QUIZ!");
		System.out.println("----------------------------------------------");
	}
	public void loginError() {
		System.out.println("\n----------------------------------------------");
		System.out.println("LOGIN ERROR, TRY AGAIN!");
		System.out.println("----------------------------------------------");
	}
	public void inputError() {
		System.out.println("\n----------------------------------------------");
		System.out.println("INVALID INPUT, TRY AGAIN!");
		System.out.println("----------------------------------------------");
	}
	public void loginSuccess() {
		System.out.println("\n----------------------------------------------");
		System.out.println("LOGIN SUCCESS!");
		System.out.println("----------------------------------------------");
	}
	public void loggoutMSG() {
		System.out.println("\n----------------------------------------------");
		System.out.println("LOGGOUT SUCCESS!");
		System.out.println("----------------------------------------------");
	}
	public void endMSG() {
		System.out.println("----------------------------------------------");
	}
	public void usernameLogin() {
		System.out.println("\nLOGIN:\n----------------------------------------------");
		System.out.print("\tUsername: ");
	}
	public void passwordLogin() {
		System.out.print("\tPassword: ");
	}
	public void userInfo(String name, String email, int quizCount) {
		System.out.println("\nUSER INFORMATION:\n----------------------------------------------");
		System.out.println("\tName: "+name+"\n\tEmail: "+email+"\n\tQuiz Count: "+quizCount);
		System.out.println("----------------------------------------------");
	}
	public void viewQuizzes(List<Quiz> quizzes) {
		System.out.println("\nUSER QUIZZES:\n----------------------------------------------");
		if(quizzes.isEmpty()) {
			System.out.println("\tNO QUIZZES!");
		}
		else {
			for(int i = 0; i < quizzes.size(); i++) {
				System.out.println("\t"+(i+1)+": "+quizzes.get(i).getTitle());
			}
		}
		System.out.println("----------------------------------------------");
	}
	public void menu() {
		System.out.println("\nMENU:\n----------------------------------------------");
		System.out.println("\ta. View User Information");
		System.out.println("\tb. View Quizzes");
		System.out.println("\tc. Select Quizz");
		System.out.println("\td. Loggout");
		System.out.println("----------------------------------------------");
	}
	public void promptOption(String value) {
		System.out.print(value+": ");
	}
	public void quizInformation(String title, String topic, String author, int count) {
		System.out.println("\nQUIZ: "+title+" - INFORMATION:\n----------------------------------------------");
		System.out.println("\tTitle: "+title+"\n\tTopic: "+topic+"\n\tQuiz Author: "+author+"Questions: "+count);
		System.out.println("----------------------------------------------");
	}
	public void question(String title, String content, String[] answers) {
		System.out.println("\n"+title+"\n----------------------------------------------");
		System.out.println("\t"+content);
		for(int i = 0; i < answers.length; i++) {
			System.out.println("\t"+answers[i]);
		}
		System.out.println("----------------------------------------------");
	}
}
