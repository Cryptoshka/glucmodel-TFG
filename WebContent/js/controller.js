'use strict';

/* Controllers */

var appMedico = angular.module('appMedico', []);

appMedico.controller('PatientListCtrl', ['$scope', '$http', function($scope, $http) {
  $http.get('json_examples/lista_pacientes.json').success(function(data) {
    $scope.phones = data;
  });

  $scope.orderProp = 'id';
}]);