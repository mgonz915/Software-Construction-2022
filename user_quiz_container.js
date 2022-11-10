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
            + '<a href="./quiz_page.html">' 
              + '<div style="padding: 20px; margin: 20px; background-color: red;">'+ 'QUIZ_NAME: ' + questions[i].question+ '</div>'
            + '</a>'
           + '</div>'
          );

          


        }
    
        // finally combine our output list into one string of html and put it on the page
        quizContainer.innerHTML = output.join('');
      }