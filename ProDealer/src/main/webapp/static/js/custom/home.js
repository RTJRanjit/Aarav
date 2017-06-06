/**
 * http://usejsdoc.org/
 */
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.firstname = "John";
    $scope.lastname = "Doe";   
    
    $scope.openmodel=function(){
    	alert("in");
    }
    
    
    
});