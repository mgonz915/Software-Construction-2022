<?php 
session_start();
require_once "config.php";
require_once "login.php";

try {
    $pdo = new PDO($atrr, $username, $password, $opts);
}catch (PDOException $e){
    throw new PDOException($e->getMessage(), (int)$e->getCode());
}

if(!empty($_POST)){
    if(isset($_POST['Submit'])){
        if(isset($_POST['username']) && isset($_POST['password'])){

        }//END USERNAME AND PASSWORD POST
    }//END SUBMIT IF
}//END POST IF