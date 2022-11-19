var myQuestions = [ 
    {
      question: "What is 10/2?",
      answers: {
        a: '3',
        b: '5',
        c: '115'
      },
      correctAnswer: 'b',
      Author: "Michael",
    },
    {
      question: "What is 30/3?",
      answers: {
        a: '3',
        b: '5',
        c: '10'
      },
      correctAnswer: 'c',
      Author: "Michael",
    },
    {
      question: "What is 9+10?",
      answers: {
        a: '3',
        b: '5',
        c: '10'
      },
      correctAnswer: 'c',
      Author: "Alexis",
    },
  ];

// Replace Above with a way to get the 3-6 latest quizzes made 

//this class may be a sub function needed in quiz view/contrtoller


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

      categories = ["Java","C","Python","D","E","F","G","H" ];
      for (var i=0; i< 8; i++ ){
        output.push(
        '<div class="topicContainer">'
            +  '<a href=quiz_page.php?subject='+ categories[i]  +' >' 
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
        var answers;
    
        // for each question...
        for(var i=0; i<3; i++){
          console.log(questions[i])
          
          
        
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

}