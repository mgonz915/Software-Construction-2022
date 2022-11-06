
public class Question {

	private String title;
	private String content;
	private int id;
	private String category;
	private String[] answers;
	private String answer;
	private String[] options;
	private boolean isCorrect = false;
	
	public Question(String title, String content, String[] answers, String answer, String[] options) {
		this.title = title;
		this.content = content;
		this.answers = answers;
		this.answer = answer;
		this.options = options;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void getAnswers(String[] questions) {
		this.answers = questions;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
	
}
