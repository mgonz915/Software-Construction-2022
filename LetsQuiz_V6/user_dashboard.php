<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="quiz_page_css.css">
  </head>
  <body>
    <div class="page-container">
      <div class="content-wrap">
      <img src="Lets-Quiz-Logo.png" alt="Logo" class="logo">


        <nav>
              <ul>
                  <!--Add Redirect Links-->
                  <li><a href="main_page.php">HOME</a></li>
                  <li><a href="contact_page.php">CONTACT</a></li>
                  <li><a href="about_page.php">ABOUT</a></li>
                  <li><a href="logout.php">LOG OUT</a></li>
                  
              </ul>
        </nav>

        <br><br>
        <?php
                    session_start();
                    require_once("config.php");
                    //include_once "check_users.php";
                    //$_SESSION['logged_in'] = false;

                    //if user is logged in
                    if (isset($_SESSION['user'])){
                        $username = $_SESSION['user'];
                        print "<h1>Welcome Back $username</h1>";
                        }else {

                            print "<li><a href='user_Log_in.html'> LOGIN</a></li><br> ";
                        }
                    ?>
        <br>
        <p class="description">YOUR ONE STOP TO RAISING COMPUTER SCIENCE KNOWLEDGE AND UNDERSTANDING.</p></center>
        <p class="description">MAKE SURE TO LOGIN FOR THE FULL EXPERIENCE!.</p>
        <br>

        
          <div id="userQuizSection" style="padding-left:16px; height: 400px">
                
          </div>

      </div>
    </div>
  
    </body>
    <script src="quiz_controller.js"></script>
  </html>