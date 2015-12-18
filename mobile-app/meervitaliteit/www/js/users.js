/**
 * Created by timmygilissen on 11/12/15.
 */
angular.module('starter.users', ['ngResource'])
  .factory('Users',['$http',function($http, ApiEndpoint){

    var baseUrl = 'http://users.timmygilissen.svc.tutum.io:8000';
    var Users = {};

    Users.getAllKlanten = function(){
      return $http.get(baseUrl + '/users');
    };

    Users.getKlant = function(ref){
      return $http.get(baseUrl + '/users/' + ref);
    };

    Users.addKlant = function(klant){
      return $http.post(baseUrl + '/users/add',JSON.stringify(klant));
    };

    return Users;
  }]);
