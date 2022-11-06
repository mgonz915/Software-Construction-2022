import java.util.ArrayList;
import java.util.List;

public class Quiz {
	
	private String title;
	private int id;
	private String authorEmail;
	private String topic;
	private int grade;
	private List<Question> questions = new ArrayList<Question>();
	
	public Quiz(String title, int id, String authorEmail, String topic, int grade) {
		super();
		this.title = title;
		this.id = id;
		this.authorEmail = authorEmail;
		this.topic = topic;
		this.grade = grade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public Quiz getQuiz() {
		return this;
	}

	//Methods
	public void addQuestion(Question question) {
		this.questions.add(question);
	}
	public void removeQuestion(int id) {
		this.questions.remove(id);
	}
	public void gradeQuiz() {
		int sum = 0;
		for(int i = 0; i < this.questions.size(); i++) {
			if(this.questions.get(i).isCorrect()) {
				sum++;
			}
		}
		this.grade = sum/this.questions.size();
	}
	
	
	
}
