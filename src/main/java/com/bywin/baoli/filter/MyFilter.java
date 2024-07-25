package com.bywin.baoli.filter;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
 
@WebFilter//扫描@WebFilter需要在Application类中配置@ServletComponentScan注释
@Slf4j
public class MyFilter implements Filter {
 
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("httpServletRequestWrapper->MyHttpServletRequestWrapper");
        MyHttpServletRequestWrapper myHttpServletRequestWrapper=new MyHttpServletRequestWrapper((HttpServletRequest) servletRequest);
        filterChain.doFilter(myHttpServletRequestWrapper,servletResponse);
    }
}