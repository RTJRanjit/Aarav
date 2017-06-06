<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


 
 
 <!DOCTYPE html>
<html>
<head>

    <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="869236959557-2hfjvglmo1ia2tbnmbqa0l76oniq9m37.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="<c:url value="/static/css/custom/home.css"/>"
	rel="stylesheet" type="text/css">

<link href="<c:url value="/static/css/lib/w3.css"/>" rel="stylesheet"
	type="text/css">
	
	<script
	src="<c:url value="/static/js/lib/angular.min.js"/>"></script>
	
	
	<script
	src="<c:url value="/static/js/custom/home.js"/>"></script>

</head>
<body ng-app="myApp" ng-controller="myCtrl">

<div
		class="bgimg w3-display-container w3-animate-opacity w3-text-white">
		<div>
			<div class="w3-display-topleft w3-padding-large w3-xlarge">
				Logo</div>
			<div>
				<a href="#"
					class="w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white"
					title="My Account"><img src="/static/images/custom/PowerIcon.png"  id="myBtn"
					class="w3-circle" style="height: 25px; width: 25px" alt="Avatar"></a>
			</div>
		</div>
		<div class="w3-display-middle">
			<h1 class="w3-jumbo w3-animate-top">COMING SOON</h1>
			<hr class="w3-border-grey" style="margin: auto; width: 40%">
			<p class="w3-large w3-center">35 days left</p>
			  <div id="test"></div>
			<!-- Trigger/Open The Modal -->

		</div>
		<div class="w3-display-bottomleft w3-padding-large">
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				target="_blank">w3.css</a>
		</div>
	</div>






<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <div align="center">
 

 <div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
    </div>
    
  </div>

</div>

<script>
// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>




 <script>
    
    $(document).ready(function(){
        $("p").click(function(){
            alert("The paragraph was clicked.");
        });
    });
    
      function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        	var imgurl= profile.getImageUrl();
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
        
        $('#test').empty().append('<img src="'+imgurl+'" height="64px" width="64px">');
        modal.style.display = "none";
      };
    </script>

</body>
</html>
 