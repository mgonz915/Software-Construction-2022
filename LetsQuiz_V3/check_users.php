<?php 
session_start();
require_once "config.php";
require_once "login.php";

#this is to be able to connect to the database in the local host
try {
    $pdo = new PDO($atrr, $username, $password, $opts);
}catch (PDOException $e){
    throw new PDOException($e->getMessage(), (int)$e->getCode());
}

#To verify the correct fields were submited from the front end
if(!empty($_POST)){
    if(isset($_POST['Submit'])){
        if(isset($_POST['username']) && isset($_POST['password'])){
            $input_username = $_POST['username'];
            $input_password = $_POST['password'];
            
            #submitting a query into the database, allowing us to retrieve 
            $query = "SELECT * FROM users WHERE username='" . $input_username ."and WHERE password='". $input_password . "';";
            $result = $pdo->query($query);

            if($row = $result->fetch()){
                $_SESSION['user'] = $row['first_name']; //will send the first name of the user into the main page
                header("Location: main_page.php");
            }//END IF
        }//END USERNAME AND PASSWORD POST
    }//END SUBMIT IF
}//END POST IF

?>