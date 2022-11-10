<?php
        session_start();
        require_once("config.php");
        //include_once "check_users.php";
        //$_SESSION['logged_in'] = false;
        
        //if user is logged in
        if(isset($_SESSION['user'])){
            $username = $_SESSION['user'];
            print "
            user: $username
            <div class = 'form-group'>

                <a href='logout.php'>user log out</a><br><br> 
            </div>
            ";
            }else{
                
                print "<a style='position: absolute; right: 0;' href='user_Log_in.html'> LOGIN</a> ";
            }
      ?>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/quiz_page_css.css">
  </head>
  <body>
    <div id="page-container">
      <div id="content-wrap">

        <div class="topnav">
          <a class="active" href="/main_page.html">Home</a>
          <!-- <a href="/quiz_page.html">QUIZ</a> -->
          <a href="#contact">Contact</a>
          <a href="#about">About</a>
          
        </div>

        <div style="padding-left:16px">
        <center><p><?php echo $username ?></p></center>
          <center><h1>Welcome to Let's Quiz</h1></center>
          <center><p>Your one stop to rasing CS knowledge and understanding</p></center>
          <center><p>Let's Quiz is a quiz tool that will help you refresh your base CS knowledge with topics ranging from <b> Data Structures</b> to <b> Time Complexity </b></p></center>
        </div>

        
        <div style="padding-left:16px; height: 400px">
          <h3>Test your skills on our curated CS Quizzes.</h3>
          <div class="topicContainer">
            <a href="./quiz_page.html"> <!-- maybe make unique pages for specific quizes or find a way to pass a variable to them -->
              <div style="padding: 20px; margin: 20px; background-color: red;">Java</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: orange;">Python</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: green;">C</div>
              </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: blue;">PHP</div>
              </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> <!-- maybe make unique pages for specific quizes or find a way to pass a variable to them -->
              <div style="padding: 20px; margin: 20px; background-color: red;">Arrays</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: orange;">Queue</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: green;">Stack</div>
              </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: blue;">Hash Map</div>
              </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> <!-- maybe make unique pages for specific quizes or find a way to pass a variable to them -->
              <div style="padding: 20px; margin: 20px; background-color: red;">A</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: orange;">B</div>
            </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: green;">C</div>
              </a>
          </div>
          <div class="topicContainer">
            <a href="./quiz_page.html"> 
              <div style="padding: 20px; margin: 20px; background-color: blue;">D</div>
              </a>
          </div>
        </div>

        <div id="userQuizSection" style="padding-left:16px; height: 400px">
          <h3>Try other CS Quizzes desinged by other users.</h3> 
          
        </div>

      </div>
    </div>
  
    <footer class="credits">
      <div>
       <a class="social-Links" target="_blank" href="https://discord.gg" title="Join the W3schools community on Discord"><img src="/discord-logo.png" alt="Avatar" class="avatar" style="width:25px;height:25px;"></a>
       <a class="social-Links" target="_blank" href="https://www.linkedin.com/company/w3schools.com/" title="W3Schools on LinkedIn"><img src="/linkedIn-logo.png" alt="Avatar" class="avatar" style="width:25px;height:25px;"></a>
       <a class="social-Links" target="_blank" href="https://www.instagram.com/w3schools.com_official/" title="W3Schools on Instagram"><img src="/instagram-logo.png" alt="Avatar" class="avatar" style="width:25px;height:25px;"></a>
       <a class="social-Links" target="_blank" href="https://www.facebook.com/w3schoolscom/" title="W3Schools on Facebook"><img src="/facebook-logo.png" alt="Avatar" class="avatar" style="width:25px;height:25px;"></a>
       <p style="font-size: 15px; color: white;">
        Let's Quiz is a class project for Fall 2022 Software Contruction to understand and apply various learned topics. Let's Quiz is optimized for learning, testing, and training. Quizzes might be simplified to improve reading and basic understanding. We are constantly reviewing content submitted to avoid errors, but we cannot warrant full correctness of
        all content. While using this site, you agree to have read and accepted our <a href="/about/about_copyright.asp" style="text-decoration: underline; color:inherit">terms of use</a>, <a href="/about/about_privacy.asp" style="text-decoration: underline; color:inherit">cookie and privacy policy</a>.<br>
        <a href="/about/about_copyright.asp" style="text-decoration: underline; color:inherit">Copyright 2022</a> by Team 6. All Rights Reserved.<br><br></p>
      </div>
      
     </footer>

  </body>
  <script src="/user_quiz_container.js"></script>
</html>