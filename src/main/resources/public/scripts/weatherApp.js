
angular.module('weatherAppDemo', [])
    .controller('cityListController', ['$scope', '$http', function($scope, $http) {
        $http.get("/cities").success(function(response) {
            $scope.data = {
                citySelect: null,
                availableOptions: response
            };
        });
        
    $scope.getWeather = function() {
        $http.get("/weather?city=" + $scope.data.citySelect)
        .success(function(response) {
                $scope.weatherData = response;
        });
    }
}]);


