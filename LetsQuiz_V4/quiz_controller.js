/**
 * Module Name: quiz_controller class
 * Author: Michael Gonzalez
 * Date Created: 11/11/22
 * Last modified by: Michael Gonzalez
 * Date last modified: 11/12/22
 */

    var quizContainer = document.getElementById('userQuizSection');

    showQuizContainer(myQuestions,quizContainer);

    var catContainer = document.getElementById('topicsContainerDiv');

    showQuizCategories(catContainer);

    var quizContainer = document.getElementById('quiz');
    var resultsContainer = document.getElementById('results');
    var submitButton = document.getElementById('submit');
    generateQuiz(myQuestions, quizContainer, resultsContainer, submitButton);

    function showQuizCategories(categoriesContainer){
      var output = [];

      categories = ["A","B","C","D","E","F","G","H" ];
      for (var i=0; i< 8; i++ ){
        output.push(
        '<div class="topicContainer">'
            +  '<a href="quiz_page.php?subject='+categories[i] +' ">' 
              +  '<div style="padding: 20px; margin: 20px; background-color: blue;">'+ categories[i]+'</div>'
            +    '</a>'
          +  '</div>'
        );

        categoriesContainer.innerHTML = output.join('');

      }

    }

    function showQuizContainer(questions, quizContainer){
        // we'll need a place to store the output and the answer choices
        var output = [];

        // for each question...
        for(var i=0; i<3; i++){

          // add this question and its answers to the output
          output.push(

            '<div class="userQuizContainer">' 
            + '<a href="/LetsQuiz_V4/html/quiz_page.html">' 
              + '<div style="padding: 20px; margin: 20px; background-color: red;">'+ 'QUIZ_NAME: ' + questions[i].question+ '</div>'
            + '</a>'
           + '</div>'
          );
        }
        // finally combine our output list into one string of html and put it on the page
        quizContainer.innerHTML = output.join('');

      }

  function generateQuiz(questions, quizContainer, resultsContainer, submitButton){

    showQuestions(questions, quizContainer);

    showResults(questions, quizContainer, resultsContainer)


  }

    function showQuestions(questions, quizContainer){
      // we'll need a place to store the output and the answer choices
      var output = [];
      var answers;
  
      // for each question...
      for(var i=0; i<questions.length; i++){
        
        // first reset the list of answers
        answers = [];
  
        // for each available answer...
        for(letter in questions[i].answers){
  
          // ...add an html radio button
          answers.push(
            '<label>'
              + '<input type="radio" name="question'+i+'" value="'+letter+'">'
              + letter + ': '
              + questions[i].answers[letter] + '<br>'
            + '</label>'
          );
        }
  
        // add this question and its answers to the output
        output.push(
          '<div class="question">' + questions[i].question + '</div>'
          + '<div class="answers">' + answers.join('') + '</div>'
        );
      }
  
      // finally combine our output list into one string of html and put it on the page
      quizContainer.innerHTML = output.join('');
    }
  
  
    function showResults(questions, quizContainer, resultsContainer){
      
      // gather answer containers from our quiz
      var answerContainers = quizContainer.querySelectorAll('.answers');
      
      // keep track of user's answers
      var userAnswer = '';
      var numCorrect = 0;
      
      // for each question...
      for(var i=0; i<questions.length; i++){
  
        // find selected answer
        userAnswer = (answerContainers[i].querySelector('input[name=question'+i+']:checked')||{}).value;
        
        // if answer is correct
        if(userAnswer===questions[i].correctAnswer){
          // add to the number of correct answers
          numCorrect++;
          
          // color the answers green
          answerContainers[i].style.color = 'lightgreen';
        }
        // if answer is wrong or blank
        else{
          // color the answers red
          answerContainers[i].style.color = 'red';
        }
      }
  
      // show number of correct answers out of total
      resultsContainer.innerHTML = numCorrect + ' out of ' + questions.length;
    }