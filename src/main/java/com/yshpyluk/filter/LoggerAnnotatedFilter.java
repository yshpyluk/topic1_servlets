package com.yshpyluk.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by yshpyluk on 3/18/17.
 */
@WebFilter(urlPatterns = "/games")
public class LoggerAnnotatedFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("Hey I'm executed before servlet LoggerAnnotatedFilter");

		filterChain.doFilter(servletRequest, servletResponse);

		System.out.println("Hey I'm executed after servlet LoggerAnnotatedFilter");
	}

	@Override
	public void destroy() {

	}
}
