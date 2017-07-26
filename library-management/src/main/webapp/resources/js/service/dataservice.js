angular.module('managementapp').service(
		'dataService',
		[
				"$http",
				function($http) {
					result = {};
					result = {
						"login" : {
							validateLogin : function(loginName, password) {
								return $http.get(
										'/login/validate/?time='
												+ new Date().getTime()
												+ '&username=' + loginName
												+ '&password=' + password)
										.then(function(result) {
											return result.data;
										});
							}
						}

					}
					return result;
				}

		]);