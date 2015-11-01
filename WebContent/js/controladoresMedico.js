'use strict';

/* Controlador de la lista de pacientes */

var appMedico = angular.module('appMedico', []);

appMedico.controller('PatientListCtrl', ['$scope', '$http', function($scope, $http) {
  $http.get('json_examples/lista_pacientes.json').success(function(data) {
    $scope.pacientes = data;
  });

  $scope.orderProp = 'age';
}]);