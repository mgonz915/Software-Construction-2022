import java.util.*;

public class LetsQuizController {
	
	private List<User> userList = new ArrayList<User>();
	private User user;
	private int quizID;
	
	private LetsQuizView display = new LetsQuizView();
	private Scanner scn = new Scanner(System.in);
	
	public void loggin() {
		display.welcomeMSG();
		
		boolean isValid = false;
		while(!isValid) {
			display.headerMSG("LOGGIN PAGE");
			display.inputMSG("\tUsername");
			String username = scn.next();
			display.inputMSG("\tPassword");
			String password = scn.next();
			
			for(int i = 0; i < userList.size(); i++) {
				if(userList.get(i).getUsername().equals(username) && userList.get(i).getPassword().equals(password)) {
					this.user = userList.get(i).getUser();
					display.footerMSG();
					display.successMSG();
					isValid = true;
					break;
				}
			}
			if(!isValid) {
				display.footerMSG();
				display.inputErrorMSG("USER");
			}
		}
	}
	
	public String menu() {
		boolean isLoggedOn = true;
		while(isLoggedOn) {
			display.headerMSG("MAIN MENU");
			display.menu();
			display.footerMSG();
			display.inputMSG("Select Option");
			String option = scn.next();
			
			switch(option){
				case "a":
					return "a";
				case "b":
					return "b";
				case "c":
					return "c";
				case "d":
					return "d";
				case "e":
					return "e";
				default:
					display.inputErrorMSG("INPUT");
					break;
			}
		}
		return null;
	}
	
	public void startQuiz() {
		Quiz quiz = user.getQuizzes().get(quizID);
		display.headerMSG(quiz.getTitle());
		display.quizInformation(quiz.getTitle(), quiz.getTopic(), quiz.getAuthorEmail(), quiz.getQuestionCount());
		display.footerMSG();
	}
	
	public void startQuestions() {
		Quiz quiz = user.getQuizzes().get(quizID);
		String option = " ";
		for(int i = 0; i < quiz.getQuestionCount(); i++) {
			
			boolean isValid = false;
			while(!isValid) {
				display.headerMSG("Question "+(i+1));
				display.question(i, quiz.getQuestion(i).getQuestion(), quiz.getQuestion(i).getQuestionAnswers());
				display.footerMSG();
				display.inputMSG("Select Answer");
				option = scn.next();
				
				String[] answerChoices = quiz.getQuestion(i).getQuestionAnswers();
				for(int j = 0; j < answerChoices.length; i++) {
					if(answerChoices[i].equals(option)) {
						quiz.getQuestion(i).setAnswer(option);
						isValid = true;
						break;
					}
				}
			}
			
		}
	}
	
	public void viewUserInformation() {
		display.headerMSG("USER INFORMATION");
		display.viewUserInformation(user.getName(), user.getEmail(), user.getId(), user.getQuizCount());
		display.footerMSG();
	}
	
	public void viewQuizzes() {
		display.headerMSG("USER QUIZZES");
		display.quizzes(user.getQuizzes());
		display.footerMSG();
	}
	
	public void selectQuizzes() {
		boolean isValid = false;
		while(!isValid) {
			display.headerMSG("USER QUIZZES");
			display.quizzes(user.getQuizzes());
			display.footerMSG();
			display.inputMSG("Select Option");
			String option = scn.next();
			
			try {
				if(0 <= Integer.parseInt(option) && Integer.parseInt(option) < user.getQuizCount()) {
					isValid = true;
					quizID = Integer.parseInt(option);
				}
				else {
					display.inputErrorMSG("INPUT");
				}
			}
			catch(Exception e) {
				display.inputErrorMSG("INPUT");
			}
		}			
	}
	
	public void viewGrades() {
		display.headerMSG("USER QUIZ GRADES");
		display.viewQuizGrades(user.getQuizzes());
		display.footerMSG();
	}
	
	public void loggout() {
		display.loggoutMSG();
		user = null;
		quizID = -1;
	}
	
	public void generateTempUser() {
		//New User Test Purposes Only
		//Adds new user.
		userList.add(new User("Alan", "Verdin", "averdin", "1234", "averdin@miners.utep.edu", userList.size()));
				
		//Adding quizzes to current user.
		userList.get(0).addQuiz(new Quiz("CS TEST QUIZ", userList.get(0).getEmail(), "Computer Science", 0.0, userList.get(0).getQuizzes().size()));
		userList.get(0).addQuiz(new Quiz("CS EASY QUIZ", userList.get(0).getEmail(), "Computer Science", 0.0, userList.get(0).getQuizzes().size()));
		userList.get(0).addQuiz(new Quiz("CS MIDTERM REVIEW QUIZ", userList.get(0).getEmail(), "Computer Science", 0.0, userList.get(0).getQuizzes().size()));
		
		String[] options = {"T", "F"};
		String[] answers = {"T.True", "F.False"};
		userList.get(0).getQuizzes().get(0).addQuestion(new Question("QUESTION 1:", "Do cows have 4 legs?", answers, "T", options, userList.get(0).getQuizzes().get(0).getQuestionCount()));
		
		String[] options2 = {"A", "B", "C", "D"};
		String[] answers2 = {"A.Pig", "B.Cow", "C.Dog", "D.Chicken"};
		userList.get(0).getQuizzes().get(0).addQuestion(new Question("QUESTION 2:", "What animal goes Mooooo?", answers2, "B", options2, userList.get(0).getQuizzes().get(0).getQuestionCount()));
	}
}
