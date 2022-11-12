<!--
/**
 * Module Name: Quiz Class
 * Author: Alan Verdin
 * Description: Class represents the attributes of a quiz.
 */
-->
<?php
class Quiz{

    //Quiz Attributes
    private $title;
    private $authorEmail;
    private $topic;
    private $grade;
    private $id;

    //Constructor
    function __construct($title, $authorEmail, $topic, $grade, $id){
        $this->title = $title;
        $this->authorEmail = $authorEmail;
        $this->topic = $topic;
        $this->grade = $grade;
        $this->id = $id;
    }

    //Getters and Setters
    function getTitle(){
        return $this->title;
    }
    function setTitle($title){
        $this->title;
    }
    function getAuthorEmail(){
        return $this->authorEmail;
    }
    function setAuthorEmail($authorEmail){
        $this->authorEmail;
    }
    function getTopic(){
        return $this->topic;
    }
    function setTopic($topic){
        $this->topic;
    }
    function getGrade(){
        return $this->grade;
    }
    function setGrade($grade){
        $this->grade;
    }
    function getID(){
        return $this->id;
    }
    function setID($id){
        $this->id;
    }
}
?>