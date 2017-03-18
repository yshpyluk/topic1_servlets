package com.yshpyluk.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by yshpyluk on 3/18/17.
 */
public class LoggerFilter implements Filter {
	FilterConfig conf;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		conf = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("Hey I'm executed before servlet LoggerFilter");

		filterChain.doFilter(servletRequest, servletResponse);

		System.out.println("Hey I'm executed after servlet LoggerFilter");
	}

	@Override
	public void destroy() {

	}
}
