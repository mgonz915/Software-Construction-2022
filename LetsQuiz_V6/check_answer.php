<?php
            
                require_once "config.php";
                require_once "quiz_page.php";
                
                
                    try {
                        $pdo = new PDO($atrr, $username, $password, $opts);
                    }catch (PDOException $e){
                        throw new PDOException($e->getMessage(), (int)$e->getCode());
                    }
        //            $answer = $_POST['answer'];

                    if(isset($_GET['type'])){
                        $type = $_GET['type'];
                        if ($type == 0){
                            $subject = $_GET['subject'];
                            $query = "SELECT * FROM Question WHERE subject='".$subject."';";

                        }else{
                            $quizID = $_GET['quizID'];
                            $query = "SELECT * FROM Question WHERE quizID='".$quizID."';";
                        }
                    }
                    $result = $pdo->query($query);

                    while($row = $result->fetch()){
                        $correct_answer = htmlspecialchars($row['answer']);
                        $title = htmlspecialchars($row['title']);
                        $title2 = str_replace(" ", "", $title);
                        //header("Location: user_dashboard.php");
                        if($_POST[$title2] == $correct_answer){
                            print"<h1 class='Correct'> correct </h1>";
                        } else{
                            print"<h1 class='Wrong'> incorrect </h1>";
                        }
                        
                    }
        //            else{
        //                    echo "quiz not found.";
        //                }
                
            
                ?>