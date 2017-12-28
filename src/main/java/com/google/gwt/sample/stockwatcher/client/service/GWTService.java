/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gwt.sample.stockwatcher.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author matheus
 */
@RemoteServiceRelativePath("service/gwtservice")
public interface GWTService extends RemoteService {

    public String myMethod(String s);
}
