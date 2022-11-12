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
  public function setTitle($title) {
    $this->title = $title;
  }
  public function getTitle() {
    return $this->title;
  }

  public function setQuestion($question) {
    $this->question = $question;
  }
  public function getQuestion() {
    return $this->question;
  }

  public function setQuestionAnswers($questionAnswers) {
    $this->questionAnswers = $questionAnswers;
  }
  public function getQuestionAnswers() {
    return $this->questionAnswers;
  }

  public function setAnswer($answer) {
    $this->answer = $answer;
  }
  public function getAnswer() {
    return $this->answer;
  }

  public function setAnswerOptions($answerOptions) {
    $this->answerOptions = $answerOptions;
  }
  public function getAnswerOptions() {
    return $this->answerOptions;
  }

  public function setId($id) {
    $this->id = $id;
  }
  public function getId() {
    return $this->id;
  }

  public function setIsCorrect($isCorrect) {
    $this->isCorrect = $isCorrect;
  }
  public function getIsCorrect() {
    return $this->isCorrect;
  }
}

?>