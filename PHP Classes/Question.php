<!--
/**
 * Module Name: Question Class
 * Author: Christian Alberto Gomez
 */
-->
<?php
class Question{

    //Variables for Question
    private $title; //Question Title
    private $question; //Question stem
    private $questionAnswers; //Question Answers
    private $answer; //User's answer
    private $answerOptions; // Answer Options
    private $id; //Question ID
    private $isCorrect; //Check if user's answer is correct

    //Constructors
    public function __construct($title,$question,$questionAnswers,$answer,$answerOptions,$id,$isCorrect) {
        $this->title = $title;
        $this->question = $question;
        $this->questionAnswers = $questionAnswers;
        $this->answer = $answer;
        $this->answerOptions = $answerOptions;
        $this->id = $id;
        $this->isCorrect = $isCorrect;
    }

  //Getters and Setters

  /*
  * Setter in charge of setting a title.
  * @param String $title Title of the question
  */
  public function setTitle($title) {
    $this->title = $title;
  }

  /*
  * Getter in charge of getting a title.
  * @return title
  */
  public function getTitle() {
    return $this->title;
  }

  /*
  * Setter in charge of setting a question.
  * @param String $question stem question
  */
  public function setQuestion($question) {
    $this->question = $question;
  }

  /*
  * Getter in charge of getting a question.
  * @return question
  */
  public function getQuestion() {
    return $this->question;
  }

  /*
  * Setter in charge of setting the question answers.
  * @param String $questionAnswers question answers of the question.
  */
  public function setQuestionAnswers($questionAnswers) {
    $this->questionAnswers = $questionAnswers;
  }

  /*
  * Getter in charge of getting question answers.
  * @return questionAnswers
  */
  public function getQuestionAnswers() {
    return $this->questionAnswers;
  }

  /*
  * Setter in charge of setting an answer.
  * @param String $answer question answer
  */
  public function setAnswer($answer) {
    $this->answer = $answer;
  }

  /*
  * Getter in charge of getting an answer.
  * @return answer
  */
  public function getAnswer() {
    return $this->answer;
  }

  /*
  * Setter in charge of setting answer options.
  * @param String $answerOptions answer options of the question
  */
  public function setAnswerOptions($answerOptions) {
    $this->answerOptions = $answerOptions;
  }

  /*
  * Getter in charge of getting answer options
  * @return answerOptions
  */
  public function getAnswerOptions() {
    return $this->answerOptions;
  }

  /*
  * Setter in charge of setting an ID.
  * @param int $id Question ID
  */
  public function setId($id) {
    $this->id = $id;
  }

  /*
  * Getter in charge of getting an ID.
  * @return id
  */
  public function getId() {
    return $this->id;
  }

  /*
  * Setter in charge of setting isCorrect.
  * @param bool $isCorrect check if answer is correct.
  */
  public function setIsCorrect($isCorrect) {
    $this->isCorrect = $isCorrect;
  }

  /*
  * Getter in charge of getting isCorrect.
  * @return isCorrect
  */
  public function getIsCorrect() {
    return $this->isCorrect;
  }
}

?>
