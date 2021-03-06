app.controller('nalogCtrl', function($scope, $window, $rootScope, nalogS) {

	$scope.init = function() {
		$scope.ulogovanaFirma = $rootScope.firmaUlogovana;
	//	$scope.jednaFirma = $rootScope.jednaFirma;
		$scope.uzmiSveFakture();
		$("#myModal2").hide();

	}

	$scope.uzmiSveFakture = function() {

		console.log('PIBBBB' + $scope.ulogovanaFirma.PIB);
		nalogS.uzmiSveFakture($scope.ulogovanaFirma.PIB)

		.then(function(response) {
			$scope.fakture = response.data;
			console.log($scope.fakture);
		})
	}

	$scope.popuniFakturu = function(faktura) {
		$scope.faktura = faktura;
	}
	$scope.plati = function(faktura) {
		var nalog = {};
		var today = new Date();
		nalog.idPoruke = faktura.zaglavljeFakture.idPoruke;
		nalog.duznik = faktura.zaglavljeFakture.nazivKupac;
		
		nalog.svrhaPlacanja = "SVRHA PLACANJA";
		nalog.primalac =  faktura.zaglavljeFakture.nazivDobavljac;
		nalog.datumNaloga = today;
		nalog.datumValute = today;
		nalog.racunDuznik = $scope.ulogovanaFirma.brojRacuna;
		nalog.modelZaduzenja = 11;
		nalog.pozivNaBrZaduzenja = 1111;
		nalog.racunPoverioca = faktura.zaglavljeFakture.uplataNaRacun;
		nalog.modelOdobrenja = 11;
		nalog.pozivNaBrOdobrenja = 1111;
		nalog.iznos = faktura.zaglavljeFakture.iznosZaUplatu;
		nalog.oznakaValute = faktura.zaglavljeFakture.valuta;
		nalog.hitno = "";
		$scope.nalog = nalog;

	}

	$scope.obavestenje = function() {
		$("#myModal2").show();
		$("#myModal2").fadeTo(2000, 500).slideUp(500, function() {
			$("#myModal2").slideUp(500);
			$window.location.href = '#/pocetna';
		});

	}

	$scope.posaljiNalog = function(nalog) {
		nalog.duznik = $scope.ulogovanaFirma.username;
		console.log("duznik nalog " + nalog.duznik);
		console.log($scope.dobavljacUsername);
		nalog.primalac = $scope.dobavljacUsername
		console.log("prim nalog " + nalog.primalac);
		console.log(nalog);
		nalogS.posaljiNalog(nalog).then(function(response) {
			$scope.obavestenje();
		})

	}
	
	$scope.uzmiDobavljaca = function(pib) {
		nalogS.uzmiDobavljaca(pib)
		.then(function(response) {
			$scope.dobavljacUsername = response.data;
			console.log($scope.dobavljacUsername);
		})
	}

})