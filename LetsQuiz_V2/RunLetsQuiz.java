public class RunLetsQuiz {
		
	public static void main(String[] args) {
		LetsQuizController run = new LetsQuizController();
		run.generateTempUser();
		
		boolean isRunning = true;
		while(isRunning) {
			run.loggin();
			
			boolean inMenu = true;
			while(inMenu) {
				String option = run.menu();
				switch(option){
				case "a":
					run.viewUserInformation();
					break;
				case "b":
					run.viewQuizzes();
					break;
				case "c":
					run.selectQuizzes();
					run.startQuiz();
					run.startQuestions();
					break;
				case "d":
					run.viewGrades();
					break;
				case "e":
					run.loggout();
					inMenu = false;
					break;
				}
			}
		}
	}
}
