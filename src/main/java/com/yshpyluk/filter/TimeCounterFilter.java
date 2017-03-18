package com.yshpyluk.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by yshpyluk on 3/18/17.
 */
public class TimeCounterFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		long before = System.currentTimeMillis();
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		request.getRequestURI();
		request.getQueryString();

		filterChain.doFilter(servletRequest, servletResponse);

		long after = System.currentTimeMillis();

		System.out.println("request " + request.getRequestURI() + "?" + request.getQueryString() + " was rendered " + (after - before) + " milliseconds");
	}

	@Override
	public void destroy() {

	}
}
