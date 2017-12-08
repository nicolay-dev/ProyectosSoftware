'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('adminUniversidad', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'adminUniversidad.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/Facultad', {templateUrl: 'partials/Facultad.html', controller: 'FacultadCtrl'});
	$routeProvider.when('/Carrera', {templateUrl: 'partials/Carrera.html', controller: 'CarreraCtrl'});
	$routeProvider.when('/Municipio', {templateUrl: 'partials/Municipio.html', controller: 'MunicipioCtrl'});
        
        $routeProvider.when('/Estudiante', {templateUrl: 'partials/Estudiante.html', controller: 'EstudianteCtrl'});
        $routeProvider.when('/Profesor', {templateUrl: 'partials/Profesor.html', controller: 'ProfesorCtrl'});
        $routeProvider.when('/Materia', {templateUrl: 'partials/Materia.html', controller: 'MateriaCtrl'});
	
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("adminUniversidad.controllers",[]);