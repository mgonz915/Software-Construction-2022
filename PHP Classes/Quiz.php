<?php
class Quiz{
    private $title;
    private $authorEmail;
    private $topic;
    private $grade;
    private $id;

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