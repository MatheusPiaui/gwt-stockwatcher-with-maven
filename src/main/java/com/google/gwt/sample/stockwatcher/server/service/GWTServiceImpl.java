/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gwt.sample.stockwatcher.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import com.google.gwt.sample.stockwatcher.client.service.GWTService;

/**
 *
 * @author matheus
 */
public class GWTServiceImpl extends RemoteServiceServlet implements GWTService {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Server says: " + s;
    }
}
