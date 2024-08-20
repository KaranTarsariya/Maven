package com.telusko;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Myweblint extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		re	@Override
turn new Class[] {mvc_config.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]  {"/"};
	}


}
