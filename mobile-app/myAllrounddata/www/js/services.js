/**
 * Created by timmygilissen on 2/08/15.
 */
angular.module('starter.services',['ngResource'])
.factory('UserSession',function($resource){

    var urlBase = 'http://myallrounddata-zuul.timmygilissen.svc.tutum.io/u/';

    var userFactory = {};

        userFactory.getCustomers = function(){
          return $resource(urlBase + 'users');
        };

    return userFactory;

});