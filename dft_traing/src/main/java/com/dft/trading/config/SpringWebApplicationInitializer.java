package com.dft.trading.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/** 구닥다리인 대신, 상세설정이 가능함.
 public class SpringWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootAppConfig.class);

		// Manage the lifecycle of the root application context
		// servletContext.addListener(new ContextLoaderListener(rootContext));
		ContextLoaderListener listener = new ContextLoaderListener(rootContext);
		servletContext.addListener(listener);
		
		// Create the dispatcher servlet's Spring application context.
		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
		servletAppContext.register(ServletAppContext.class);

		// DispatcherServlet Settings.
		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

		// Parameter Encoding Settings.
		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		filter.setInitParameter("encoding", "UTF-8");
		filter.setInitParameter("forceEncoding", "true");
		filter.addMappingForServletNames(null, false, "/*");
	}
}
*/

public class SpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	// Bean Settings.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootAppConfig.class };
	}

	// Spring MVC Project Settings.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletAppContext.class };
	}

	// Dispatcher Servlet Mapping Address Settings.
	@Override
	protected String[] getServletMappings() {

		return new String[] {"/"};
	}
	 
	// Parameter Encoding.
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] { encodingFilter };
	}
}
