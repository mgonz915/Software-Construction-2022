<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>My quiz Website</title>
    <link rel="stylesheet" href="quiz_page_css.css">
  </head>
  <body>
      
    <div class="topnav">
        <a class="active" href="main_page.php">Home</a>
        <a href="#contact">Contact</a>
        <a href="#about">About</a>
    </div>
    
    <main>
        <h1>Welcome to My Website</h1>  

        <div id="quiz"></div>
        <?php
            session_start();
            require_once "config.php";

            try {
                $pdo = new PDO($atrr, $username, $password, $opts);
            }catch (PDOException $e){
                throw new PDOException($e->getMessage(), (int)$e->getCode());
            }

            $quizID = $_GET['quizID'];
            $query = "SELECT * FROM Question WHERE quizID=$quizID";

            $result = $pdo->query($query);
            print "
            <div class = 'form-group'>
                <form action='check_answer.php' method = 'POST'>
                ";
            while($row = $result->fetch()){
                $title = htmlspecialchars($row['title']);
                // get rid of white space in the title
                $title = str_replace(" ", "", $title);
                $answer = htmlspecialchars($row['answer']);
                $question = htmlspecialchars($row['question']);
                $op1 = htmlspecialchars($row['op1']); 
                $op2 = htmlspecialchars($row['op2']); 
                $op3 = htmlspecialchars($row['op3']); 
                $op4 = htmlspecialchars($row['op4']); 
                //header("Location: user_dashboard.php");
                // can use either a dynamically created variable for name field or use question title
               print"
                        <a> $question </a><br><br> 
                        <input type='radio' id='a' name='.$title.' value='a'>
                        <label for='a'>$op1</label><br>
                        <input type='radio' id='b' name='.$title.' value='b'>
                        <label for='b'>$op2</label><br>
                        <input type='radio' id='c' name='.$title.' value='c'>
                        <label for='c'>$op3</label><br>
                        <input type='radio' id='d' name='.$title.' value='d'>
                        <label for='d'>$op4</label><br>
                </div>
                ";
            }
        //else{
//                    echo "quiz not found.";
//            }
          
       
        ?>
        <button id="submit">Get Results</button>
        <div id="results"></div>

        <a href="https://simplestepscode.com/javascript-quiz-tutorial/" target="_blank">Click here for the JavaScript quiz tutorial (in case you're on CodePen)</a>

    </main>
	<script src="quiz_controller.js"></script>
  </body>
</html>