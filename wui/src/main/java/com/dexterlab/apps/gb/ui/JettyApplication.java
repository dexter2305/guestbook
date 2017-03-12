/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb.ui;


import org.apache.wicket.protocol.http.ContextParamWebApplicationFactory;
import org.apache.wicket.protocol.http.WicketFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

/**
 * author : innsh
 * created on 08-02-2017
 */
public enum JettyApplication {

    INSTANCE;

    private static Logger logger = LoggerFactory.getLogger(JettyApplication.class);
    private boolean isRunning;
    private Server jettyServer;

    public synchronized void start() {
        jettyServer = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        FilterHolder wicketFilterHolder = new FilterHolder(WicketFilter.class);
        wicketFilterHolder.setInitParameter(ContextParamWebApplicationFactory.APP_CLASS_PARAM, GbApplication.class.getName());
        wicketFilterHolder.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*");
        handler.addFilter(wicketFilterHolder, "/*", EnumSet.of(DispatcherType.REQUEST, DispatcherType.ERROR));
        jettyServer.setHandler(handler);
        try {
            jettyServer.start();
            isRunning = true;
        } catch (Exception e) {
            logger.error("Error while running Jetty Server.", e);
        }
    }



    public synchronized void stop() throws Exception {
        jettyServer.stop();
    }
}
