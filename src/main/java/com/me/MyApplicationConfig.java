package com.me;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class MyApplicationConfig extends Application {

@Override
public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
    //addRestResourceClasses(resources);
    //resources.add(MultiPartFeature.class);
    //resources.add(JettisonFeature.class);
    return resources;
}

@Override
public Set<Object> getSingletons() {
    final Set<Object> instances = new HashSet<Object>();

    instances.add(new JacksonJsonProvider()); 
    return instances;
}
/**
 * Do not modify addRestResourceClasses() method.
 * It is automatically populated with
 * all resources defined in the project.
 * If required, comment out calling this method in getClasses().
 */
private void addRestResourceClasses(Set<Class<?>> resources) {
    //resources.add(org.glassfish.jersey.media.multipart.MultiPartProperties.Feature.MultiPartContextResolver.class);
    //resources.add(org.glassfish.jersey.media.multipart.MultiPartProperties.Feature.MultiPartContextResolver.class);

}
}