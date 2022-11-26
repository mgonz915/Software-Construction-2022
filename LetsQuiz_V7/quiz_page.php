<!--
/**
 * Module Name: Quiz Page
 * Author: Alan Verdin
 * Description: Page creates the guest Quiz for Let's Quiz.
 */
-->
<html>
    <head>
        <title>>Let's Quiz Quiz Page</title>
        <!--Creates Reference To CSS File-->
        <link rel="stylesheet" href="quiz_page_css.css">
        <link rel="stylesheet" type="text/css" href="">
    </head>
  <body>
  <div class="page-container">
      <div class="content-wrap">
      <img src="Lets-Quiz-Logo.png" alt="Logo" class="logo">


        <nav>
              <ul>
                  <!--Add Redirect Links-->
                  <li><a href="main_page.php">Return</a></li>
                  </ul>
        </nav>

        <br><br>
        <h1>QUIZ TIME!!</h1>  

        <div id="quiz"></div>
        <?php
            session_start();
            require_once "config.php";

            try {
                $pdo = new PDO($atrr, $username, $password, $opts);
            }catch (PDOException $e){
                throw new PDOException($e->getMessage(), (int)$e->getCode());
            }

            if(isset($_GET['type'])){
                $type = $_GET['type'];
                if ($type == 0){
                    $subject = $_GET['subject'];
                    $query = "SELECT * FROM Question WHERE subject='".$subject."';";
                    print "
                    <div class = 'form-group' id='questions'>
                        <form action='check_answer.php?subject=$subject&type=0' method = 'POST'>
                    ";

                }else{
                    $quizID = $_GET['quizID'];
                    $query = "SELECT * FROM Question WHERE quizID='".$quizID."';";
                    print"
                    <div class = 'form-group'>
                    <form action='check_answer.php?quizID=$quizID&type=1' method = 'POST'>
                    ";
                }
            }
                    $counter = 1;
                    $result = $pdo->query($query);
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
                        <fieldset id='$title'>
                                <a>#$counter: $question </a><br><br> 
                                <input type='radio' id='a' name='$title' value='a'required>
                                <label for='a'>$op1</label><br>
                                <input type='radio' id='b' name='$title' value='b'required>
                                <label for='b'>$op2</label><br>
                                <input type='radio' id='c' name='$title' value='c'required>
                                <label for='c'>$op3</label><br>
                                <input type='radio' id='d' name='$title' value='d'required>
                                <label for='d'>$op4</label><br>
                        </fieldset>
                        
                        ";
                        $counter++;
                    }
                    print"
                    </div>";
            
        //else{
//                    echo "quiz not found.";
//            }
          
       
        ?>
    <button id="submit">
        Get Results
    </button>

    </main>
	<script src="quiz_controller.js"></script>
    
  </body>
</html>