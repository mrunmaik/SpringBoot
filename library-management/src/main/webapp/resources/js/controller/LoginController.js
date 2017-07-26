angular.module('managementapp', []).controller(
		"LoginController",
		[
				"$scope",
				"$http",
				"dataService",
				function($scope, $http, dataService) {
					$scope.doLogin = function() {
						alert("Angular test");
						alert($scope.loginUsername);
						alert($scope.loginPassword);
						dataService.login.validateLogin($scope.loginUsername,
								$scope.loginPassword).then(function(result) {
							if (result == "SUCCESS")
								$scope.result = "Logged in successfully!!";
							else
								$scope.result = "Error";
						});
					}
				} ]);