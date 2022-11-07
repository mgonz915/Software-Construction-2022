
public class Question {

	private String title;
	private String question;
	private String[] questionAnswers;
	private String answer;
	private String[] answerOptions;
	private int id;
	private boolean isCorrect = false;
	
	public Question(String title, String question, String[] questionAnswers, String answer, String[] answerOptions, int id) {
		this.title = title;
		this.question = question;
		this.questionAnswers = questionAnswers;
		this.answer = answer;
		this.answerOptions = answerOptions;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getQuestionAnswers() {
		return questionAnswers;
	}
	public void setQuestionAnswers(String[] questionAnswers) {
		this.questionAnswers = questionAnswers;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String[] getAnswerOptions() {
		return answerOptions;
	}
	public void setAnswerOptions(String[] answerOptions) {
		this.answerOptions = answerOptions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
	
}
