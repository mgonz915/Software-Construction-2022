import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizController {
	
	public static QuizView display = new QuizView();
	public static List<User> users = new ArrayList<User>();
	public static Scanner scn = new Scanner(System.in);
	public static User user;
	
	public static void main(String[] args) {
		//Generate Users
		generateUsers();
		
		//Access View Controller
		display.welcomeMSG();
		
		//Run Program
		boolean endProgram = false;
		while(!endProgram) {
			//Login
			boolean valid = false;
			while(!valid) {
				display.usernameLogin();
				String username = scn.next();
				display.passwordLogin();
				String password = scn.next();
				display.endMSG();
				
				valid = authenticateUser(username, password);
				if(valid) {
					display.loginSuccess();
				}
				else {
					display.loginError();
				}
			}
			
			valid = false;
			while(!valid) {
				display.menu();
				display.promptOption("SELECT MENU OPTION");
				String option = scn.next();
				
				switch(option) {
				case "a":
					display.userInfo(user.getName(), user.getEmail(), user.getQuizCount());
					break;
				case "b":
					display.viewQuizzes(user.getQuizzes());
					break;
				case "c":
					
					boolean selected = false;
					while(!selected) {
						display.viewQuizzes(user.getQuizzes());
						display.promptOption("(PRESS 'X' TO EXIT) SELECT QUIZ OPTION");
						option = scn.next();
					
						try{
							if(option.equals("x") || option.equals("X")){
								selected = true;
								break;
							}
							
							if(0 < Integer.parseInt(option) && Integer.parseInt(option) < user.getQuizCount() + 1) {
									quizController(Integer.parseInt(option) - 1);
									break;
							}
						}
						catch(Exception e) {
							//display.inputError();
						}
					}
					break;
				case "d":
					valid = true;
					display.loggoutMSG();
					break;
				default:
					display.inputError();
					break;
				}
			}
		}
	}
	public static void quizController(int id) {
		Quiz quiz = user.getQuizzes().get(id).getQuiz();
		display.quizInformation(quiz.getTitle(), quiz.getTopic(), quiz.getAuthorEmail(), quiz.getQuestions().size());
		
		for(int i = 0; i < user.getQuizCount(); i++){
			display.question(quiz.getQuestions().get(i).getTitle(), quiz.getQuestions().get(i).getContent(), quiz.getQuestions().get(i).getAnswers());
			display.promptOption("SELECT QUESTION OPTION");
			String option = scn.next();
			
			if(option.equals(quiz.getQuestions().get(i).getAnswer())) {
				quiz.getQuestions().get(i).setCorrect(true);
			}	
		}
		//quiz.gradeQuiz();
	}
	public static boolean authenticateUser(String username, String password) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password)) {
				user = users.get(i).getUser();
				return true;
			}
		}
		return false;
	}
	public static void generateUsers() {
		//New User Test Purposes Only
		//Adds new user.
		users.add(new User("Alan", "Verdin", "averdin", "1234", "averdin@miners.utep.edu", users.size() - 1));
				
		//Adding quizzes to current user.
		users.get(0).addQuiz(new Quiz("CS TEST QUIZ", users.get(0).getQuizzes().size() - 1, users.get(0).getEmail(), "Computer Science", 0));
		users.get(0).addQuiz(new Quiz("CS EASY QUIZ", users.get(0).getQuizzes().size() - 1, users.get(0).getEmail(), "Computer Science", 0));
		users.get(0).addQuiz(new Quiz("CS MIDTERM REVIEW QUIZ", users.get(0).getQuizzes().size() - 1, users.get(0).getEmail(), "Computer Science", 0));
		
		String[] options = {"T", "F"};
		String[] answers = {"T.True", "F.False"};
		users.get(0).getQuizzes().get(0).addQuestion(new Question("QUESTION 1:", "Do cows have 4 legs?", answers, "T", options));
		
		String[] options2 = {"A", "B", "C", "D"};
		String[] answers2 = {"A.Pig", "B.Cow", "C.Dog", "D.Chicken"};
		users.get(0).getQuizzes().get(0).addQuestion(new Question("QUESTION 2:", "What animal goes Mooooo?", answers2, "B", options2));
		
		users.add(new User("Christian", "Gomez", "cgomez", "4321", "cgomez@miners.utep.edu", users.size() - 1));
		
		//Adding quizzes to current user.
		users.get(1).addQuiz(new Quiz("CS TEST!!!!", users.get(1).getQuizzes().size() - 1, users.get(1).getEmail(), "Computer Science", 0));
		users.get(1).addQuiz(new Quiz("CS QUIZZZZZ", users.get(1).getQuizzes().size() - 1, users.get(1).getEmail(), "Computer Science", 0));
		
		users.add(new User("Sponge", "Bob", "sbob", "abc", "sbob@miners.utep.edu", users.size() - 1));
		
		//Adding quizzes to current user.
		users.get(2).addQuiz(new Quiz("CS TEST PRACTICE", users.get(2).getQuizzes().size() - 1, users.get(2).getEmail(), "Computer Science", 0));
		users.get(2).addQuiz(new Quiz("ENGLISH QUIZZZZZ", users.get(2).getQuizzes().size() - 1, users.get(2).getEmail(), "Computer Science", 0));
		
	}
}
