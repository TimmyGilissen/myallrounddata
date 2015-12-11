/**
 * Created by timmygilissen on 11/12/15.
 */
angular.module('starter.services', ['ngResource'])
  .factory('Users',function($resource){
    return $resource('http://users.timmygilissen.svc.tutum.io:8000/users')
  });
