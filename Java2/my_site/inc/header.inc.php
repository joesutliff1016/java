<?php   
ob_start();
session_start();
?>
<!doctype html>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Bangers" rel="stylesheet"> 
<link rel="stylesheet" href="js/jqueryUI/css/ui-lightness/jquery-ui-1.10.3.custom.min.css"/>
<link rel="stylesheet" href="style.css"/>
<meta name="keywords" content="web developer, front end web developer."/>
<meta name="description" content="Joe Sutliff's web development portfolio."/> 
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<meta charset="utf-8">
<title>Joe Sutliff | Web Developer</title>
<script src="js/gsap/TweenMax.js"></script>
<script src="js/jquery/jquery-1.10.1.min.js"></script>
<script src="js/jqueryUI/js/jquery-ui-1.10.3.custom.min.js"></script>
</head>

<body>
    <div id="content">

        <div id="Home" class="one">
            <div class="dropdown">
                <img src="../images/nav-menu.png" height="46" width="49" onclick="myFunction()" class="dropbtn" alt="menu" />
                <div id="myDropdown" class="dropdown-content">
                    <a href="#Home" title="Joe Sutliff's web development portfolio">Home</a>
                    <a href="#About" title="About Joe Sutliff web developer">About</a>
                    <a href="#Projects" title="Joe Sutliff's web development projects">Projects</a>
                    <a href="#Contact" title="Contact Joe Sutliff web developer">Contact</a>
                </div>
            </div>
            
            <div id="outer">
                <div id="menu" class="default">
                    <a href="#Home" title="Joe Sutliff's web development portfolio">Home</a>
                    <a href="#About" title="About Joe Sutliff web developer" >About</a>
                    <a href="#Projects" title="Joe Sutliff's web developent projects">Projects</a>
                    <a href="#Contact" title="Contact Joe Sutliff web developer">Contact</a>
                </div>

            </div>