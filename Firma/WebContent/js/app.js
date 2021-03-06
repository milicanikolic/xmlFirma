'use strict'
var app = angular.module('app', [ 'ui.router', 'ngMaterial',
		'nya.bootstrap.select' ]);

app.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/login');

	$stateProvider.state('login', {
		url : '/login',
		templateUrl : 'stranice/login.html',
		controller : 'loginCtrl'
	})
	$stateProvider.state('pocetna', {
		url : '/pocetna',
		templateUrl : 'stranice/pocetna.html',
		controller : 'loginCtrl'
	})

	$stateProvider.state('nalogZaPrenos', {
		url : '/nalogZaPrenos',
		templateUrl : 'stranice/nalogZaPrenos.html',
		controller : 'nalogCtrl'
	})
	$stateProvider.state('zahtevIzvod', {
		url : '/zahtevIzvod',
		templateUrl : 'stranice/zahtevIzvod.html',
		controller : 'zahtevCtrl'
	})

	$stateProvider.state('naruciStavke', {
		url : '/naruciStavke',
		templateUrl : 'stranice/naruciStavke.html',
		controller : 'fakturaCtrl'
	})

	$stateProvider.state('fakture', {
		url : '/fakture',
		templateUrl : 'stranice/faktura.html',
		controller : 'fakturaCtrl'
	})
	$stateProvider.state('presek', {
		url : '/presek',
		templateUrl : 'stranice/presek.html',
		controller : 'zahtevCtrl'
	})
});
