import java.util.ArrayList;
import java.util.List;

public class QuizController {
	
	public static QuizView display = new QuizView();
	public static List<User> users = new ArrayList<User>();
	
	public static void main(String[] args) {
		//New User Test Purposes Only
		//Adds new user.
		users.add(new User("Alan", "Verdin", "averdin", "1234", "averdin@miners.utep.edu", users.size() - 1));
		users.add(new User("Christian", "Gomez", "cgomez", "4321", "cgomez@miners.utep.edu", users.size() - 1));
		
		//Gets user by ID.
		User user = getUser(0);
		
		//Adding quizzes to current user.
		user.addQuiz(new Quiz("CS TEST QUIZ", user.getQuizzes().size() - 1, user.getEmail(), "Computer Science", 0));
		user.addQuiz(new Quiz("CS EASY QUIZ", user.getQuizzes().size() - 1, user.getEmail(), "Computer Science", 0));
		user.addQuiz(new Quiz("CS MIDTERM REVIEW QUIZ", user.getQuizzes().size() - 1, user.getEmail(), "Computer Science", 0));
		
		
		//Access View Controller
		display.welcomeMSG();
		display.userInfo(users.get(0).getName(), users.get(0).getEmail(), users.get(0).getQuizCount());
		display.userInfo(users.get(1).getName(), users.get(1).getEmail(), users.get(1).getQuizCount());
		display.quizMenu(users.get(0).getQuizzes());
	}
	public static User getUser(int id) {
		return users.get(id).getUser();
	}
}
