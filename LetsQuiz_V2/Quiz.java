import java.util.ArrayList;
import java.util.List;

public class Quiz {
	
	private String title;
	private String authorEmail;
	private String topic;
	private double grade = 0.0;
	private int id;	
	private List<Question> questions = new ArrayList<Question>();
	
	public Quiz(String title, String authorEmail, String topic, double grade, int id) {
		super();
		this.title = title;
		this.authorEmail = authorEmail;
		this.topic = topic;
		this.grade = grade;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
		
	//Methods
	public int getQuestionCount() {
		return this.questions.size();
	}
	public Question getQuestion(int id) {
		return this.questions.get(id);
	}
	public void gradeQuiz() {
		double sum = 0.0;
		for(int i = 0; i < this.getQuestionCount(); i++) {
			if(this.questions.get(i).isCorrect()) {
				sum++;
			}
		}
		if(sum == 0.0) {
			this.grade = 0.0;
		}
		else {
			this.grade = (sum/this.getQuestionCount())*100.0;
		}
	}
	public Quiz getQuiz() {
		return this;
	}
	public void addQuestion(Question question) {
		this.questions.add(question);
	}
	public void removeQuestion(int id) {
		this.questions.remove(id);
	}
	
	
}
