import java.util.ArrayList;
import java.util.List;

public class QuizController {
	
	public static QuizView display = new QuizView();
	public static List<User> users = new ArrayList<User>();
	
	public static void main(String[] args) {
		//New User Test Purposes Only
		users.add(new User("Alan", "Verdin", "averdin", "1234", "averdin@miners.utep.edu", users.size() - 1));
		User user = getUser(0);
		user.addQuiz(new Quiz("CS TEST QUIZ", user.getQuizzes().size() - 1, user.getEmail(), "Computer Science", 0));
		
		display.welcomeMSG();
		display.userInfo(user.getName(), user.getEmail(), user.getQuizCount());
		display.quizMenu(user.getQuizzes());
	}
	public static User getUser(int id) {
		return users.get(id).getUser();
	}
}
