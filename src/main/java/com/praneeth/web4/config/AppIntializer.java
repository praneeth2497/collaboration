package com.praneeth.web4.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class AppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return new Class[] {AppConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
    	return new Class[]{Dbconfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        return new String[] {"/"};
    }
}
