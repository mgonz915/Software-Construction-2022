<?php
session_start();
require_once "config.php";
require_once "user_Log_in.html";

    try {
        $pdo = new PDO($atrr, $username, $password, $opts);
    }catch (PDOException $e){
        throw new PDOException($e->getMessage(), (int)$e->getCode());
    }


#CREATE A READER METHOD TO READ THE HASHED PASSWORDS
    if(!empty($_POST)){
        if(isset($_POST['Submit'])){
            if(isset($_POST['username']) && isset($_POST['password'])){
                //verify the user password from the input
                    $input_username = $_POST['username'];
                    $input_password = $_POST['password'];
    
                    $query = "SELECT * FROM users WHERE userName='" . $input_username ."';";
                    $result = $pdo->query($query);
                    
                    //allows to enter log in info if right, if not it will print user not found if log in info is wrong
                    //if the input is from a user then will search in the user table
                    if($row = $result->fetch()){
                        //$_SESSION['user'] = $input_username;
                        $_SESSION['user'] = $row['firstName']; //will send the first name of the user into the main page
                        header("Location: user_dashboard.php");
                    }else{
                            echo "User not found.";
                        }
                      
                    }//END IF ELSE

             
            }else{
                echo "Password is invalid";
            
        }//end 3rd if
    }//end 2nd if

