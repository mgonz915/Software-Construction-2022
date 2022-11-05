
public class Question {

	private String title;
	private String content;
	private int id;
	private String category;
	private char answer;
	private char[] options;
	
	public Question() {}

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

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public char[] getOptions() {
		return options;
	}

	public void setOptions(char[] options) {
		this.options = options;
	}
	
	
}
