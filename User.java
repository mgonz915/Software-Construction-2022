import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private int id;
	private List<Quiz> quizzes = new ArrayList<Quiz>();
	
	public User(String firstName, String lastName, String username, String password, String email, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(List<Quiz> quizzes) {
		this.quizzes = quizzes;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return this;
	}

	//Methods
	public String getName() {
		return this.firstName+" "+this.lastName;
	}
	public int getQuizCount() {
		return this.quizzes.size();
	}
	public void addQuiz(Quiz quiz) {
		this.quizzes.add(quiz);
	}
	public void removeQuiz(int id) {
		this.quizzes.remove(id);
	}
	
	
}
