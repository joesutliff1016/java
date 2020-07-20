// JavaScript Document
//<![CDATA[
function myFunction() {
	"use strict";
    document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
	"use strict";
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}; 

	
$(document).ready( function () {
	"use strict";
	var $bg = $("#background"),
		$h1 = $("h1").eq(0), 
		$h2 = $("h2").eq(0), 
		$p = $("p"),
		$progress = $(".progress"),
		tl;

	 
	CSSPlugin.defaultTransformPerspective = 800;


	tl = new TimelineLite({onUpdate:updateSlider});
    
    tl.from($bg, 0.8, {opacity:0})
      .from($h1, 0.5, {x:-200, opacity:0})
      .from($h2, 0.5, {x:200, opacity:0}, "-=0.25")
      .from($p, 0.8, {y:20, opacity:0}, "+=0.5")
      .from($progress, tl.duration(6), {scaleX:0, transformOrigin:"left", ease:Linear.easeNone}, 0)
      .to($progress, 0.2, {opacity:0, top:-8});


	//scripts for controls

	$("#play").click(function(){
		if(tl.progress() < 1){	
			tl.play();
		} else {
			tl.restart();
		}
	});

	$("#pause").click(function(){
		tl.pause();
	});

	$("#reverse").click(function(){
		tl.reverse();
	});

	$("#resume").click(function(){
		tl.resume();
	});

	$("#restart").click(function(){
		tl.restart();
	});

	$("#fastSpeed").click(function(){
		tl.timeScale(4);
	});

	$("#normalSpeed").click(function(){
		tl.timeScale(.5);
	});

	$("#slider").slider({
		min: 0,
		max: 100,
		step:0.1,
		slide: function ( event, ui ) {
			tl.pause();
			//adjust the timeline's progress() based on slider value
			tl.progress( ui.value/100 );
		}
	}); 

	function updateSlider() {
	  $("#slider").slider("value", tl.progress() *100);
	}   

	
});    


$(function(){
	"use strict";
	 var menu = $('#menu'),
	 pos = menu.offset();
	 
	 $(window).scroll(function(){
		 if($(this).scrollTop() > pos.top+menu.height() && menu.hasClass('default')){
			  menu.fadeOut('fast', function(){
				  $(this).removeClass('default').addClass('fixed').fadeIn('slow');

	        });

	      } else if($(this).scrollTop() <= pos.top && menu.hasClass('fixed')){

	        menu.fadeOut('fast', function(){

	          $(this).removeClass('fixed').addClass('default').fadeIn('fast');

	        });

	      }

	    });

	 

	});
//]]>