<?php   
include('inc/header.inc.php');

$first_name = $_POST['first_name'];
$last_name = $_POST['last_name'];
$email = $_POST['email'];
$comments = $_POST['comments'];


if($_SERVER['REQUEST_METHOD'] == 'POST') {
	$problem = false;
	
	if(empty($_POST['first_name'])){
		$problem = true;
		$error_message1 = '<h5 class="error">Please enter your first name.</h5>';
	}
	if(empty($_POST['last_name'])){
		$problem = true;
		$error_message2 = '<h5 class="error">Please enter your last name.</h5>';
	}
	if(empty($_POST['email'])){
		$problem = true;
		$error_message3 = '<h5 class="error">Please enter your email.</h5>';
	}
	$pattern = '/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/';
	
	if(!preg_match($pattern, stripslashes(trim($_POST['email']))) && !empty($_POST['email'])) {
		$problem = true;
		$error_message4 = '<h5 class="error">Please enter a valid email.</h5>'; 
	}
	if(!$problem){
		echo  "<h3 class='success'>Your message has been sent. I appreciate your interest in me $first_name $last_name!</h3>";
		 
		$subject = 'Website Contact!';
		$message = "First name: $first_name
		Last name: $last_name
		Email: $email
		Comments: $comments";
		
		//sends email to administrator
		$to = 'joeysutliff@yahoo.com';
		mail($to, $subject, $message, 'From: joesutliffwebdev@site.com');
		
		$_POST = array();
	}
	
}

?>
	<div id="main_intro">
		<h1>Hi, I'm Joe Sutliff</h1>
        	<h2>I'm a Web Developer</h2>
         		<p>Welcome to my Portfolio</p>
           </div>
                
    </div>
    
    
  		<div id="About" class="two">
        	<h1 id="about_text">About Me</h1>
           
    <div id="profile_pic"><img id="profile" src="images/MeandAshton.jpg" height="167" width="200" alt="me and my son" /></div>
    	<div id="about">
    		<p>I just recently earned an associates degree in computer programming<br />and web development.<p>
    		<p>I've coded in Python, Java, C#, PHP, and Javascript. I'm willing to learn more!</p>
            <p>Database Management: Sql Server and Mysql.</p>
            <p>Content Management: Some Wordpress.
    		<p>I have experience working with Adobe Photoshop, Flash, and Illustrator.</p>
            <p>I love creating beautiful websites that stand out from the rest!</p>
            
       </div>
   
</div>
  			<div id="Projects" class="three">
            	<h1 id="projects_text">Projects</h1>
            	<div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw220/extracredit/site.php">
        	<img src="images/project1.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
</div>
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw229/extraCredit/SoapInterface/home.php">
        	<img src="images/project2.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
    </div>
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw217/Portfolio/index.php">
        	<img src="images/project10.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
     <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/week7/banner_ad.html">
        	<img src="images/project7.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
    <div class="gallery">
		<a href="http://joesutliff.cptcwebdev.com/">
        	<img src="images/project9.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
   
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw208/ExtraCredit/brandNameProductions.html">
        	<img src="images/project4.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
   
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw222/week6/number_game_inner.html">
        	<img src="images/project5.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
     <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw222/final.html">
        	<img src="images/project6.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw206/week9/lastAssignment.html">
        	<img src="images/project8.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/cpw208/ExtraCredit/zeusVape.jpg">
        	<img src="images/project11.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
    <div class="gallery">
		<a href="http://www.freetradesignals.com/cptc/2017/jsutliff/my_site/images/project12.jpg">
        	<img src="images/project12-t.jpg" height="225" width="300" alt="Joe Sutliff web developer"/>
    	</a>
        
    </div>
</div>


    
  		<div id="Contact" class="four">
        	<h1 id="contact_text">Contact Me</h1>
		<div id="form_div">
			<form action="<?php print $_SERVER['PHP_SELF']; ?>" method="post">
            <fieldset>
            	<?php if(!empty($error_message1)){ print $error_message1;} ?>
				<label class="label">First Name:</label><input type="text" name="first_name" 
     			value="<?php  if(isset($_POST['first_name'])){ print htmlspecialchars($_POST['first_name']);} ?>"/><br />
                
				
              	<?php if(!empty($error_message2)){ print $error_message2;} ?>
				<label class="label">Last Name:</label><input type="text" name="last_name" 
     			value="<?php  if(isset($_POST['last_name'])){ print htmlspecialchars($_POST['last_name']);} ?>" /><br />
               
				
               	<?php if(!empty($error_message3)){ print $error_message3;}if(!empty($error_message4)){ print $error_message4;} ?>
				<label class="label">Email:</label><input type="text" name="email" 
     			value="<?php  if(isset($_POST['email'])){ print htmlspecialchars($_POST['email']);} ?>"/><br />
                
                
                <label class="label">Comments:</label><br /><textarea name="comments" ><?php print $_POST['comments'];  ?></textarea>
               
        
        		<input type="submit" value="Submit" name="submit" <?php  if($problem){ ?>autofocus <?php }?>  />
             </fieldset>
			</form>
            
       </div>
    
        </div>

<?php
include('inc/footer.inc.php');
?>