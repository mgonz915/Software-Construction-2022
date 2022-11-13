<?php
       
        require_once "config.php";
        require_once "quiz_page.php";
        
        
            try {
                $pdo = new PDO($atrr, $username, $password, $opts);
            }catch (PDOException $e){
                throw new PDOException($e->getMessage(), (int)$e->getCode());
            }
            $answer = $_POST['answer'];
        
            $query = "SELECT answer FROM Question";
            $result = $pdo->query($query);

            if($row = $result->fetch()){
                $correct_answer = htmlspecialchars($row['answer']);
                //header("Location: user_dashboard.php");
                if($answer == $correct_answer){
                    print"<h1> correct </h1>";
                } 
                
            }else{
                    echo "quiz not found.";
                }
          
       
        ?>