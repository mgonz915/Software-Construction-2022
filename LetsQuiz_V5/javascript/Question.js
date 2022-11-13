
function Question(title,question,questionAnswers,answer,answerOptions,id,isCorrect){
    this.title = title;
    this.question = question;
    this.questionAnswers = questionAnswers;
    this.answer = answer;
    this.answerOptions = answerOptions;
    this.id = id;
    this.isCorrect = isCorrect;
}

//Getters & Setters
function getTitle(){
    return this.title;
}
function getQuestion(){
    return this.question;
}
function getQuestionAnswer(){
    return this.questionAnswers;
}
function getAnswer(){
    return this.answer;
}
function getAnswerOptions(){
    return this.answerOptions;
}
function getId(){
    return this.id;
}
function getIsCorrect(){
    return this.isCorrect;
}
function setTitle(title){
    this.title = title;
}
function setQuestion(question){
    this.question = question;
}
function setQuestionAnswers(questionAnswers){
    this.questionAnswers = questionAnswers;
}
function setAnswer(answer){
    this.answer = answer;
}
function setAnswerOptions(answerOptions){
    this.answerOptions = answerOptions;
}
function setId(id){
    this.id = id;
}
function setIsCorrect(isCorrect){
    this.isCorrect = isCorrect;
}