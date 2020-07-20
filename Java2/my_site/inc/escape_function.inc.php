<?php

function escape_data(array &$data) {
	
	global $db; // makes the database connection ($db) available to the function
	
	foreach($data as $key => $value) {
		$value = strip_tags($value);
		if(ini_get('magic_quotes_gpc')) {
			$value = stripslashes($value);
			
		}
		$data[$key] = mysqli_real_escape_string($db, trim($value) );
	}
	
}

escape_data($_POST);
escape_data($_GET);

?>