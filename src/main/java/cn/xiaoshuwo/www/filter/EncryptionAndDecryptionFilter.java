package cn.xiaoshuwo.www.filter;

import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @文件名：EncryptionAndDecryption.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/4/27
 * @功能描述：统一加密和解密过滤器
 */
public class EncryptionAndDecryptionFilter implements Filter {

    public static final String PARAM_NAME_EXCLUSIONS = "exclusions";
    public String[] excelPathArray = {};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String exclPath =  filterConfig.getInitParameter(PARAM_NAME_EXCLUSIONS);
        if (!StringUtils.isEmpty(exclPath)) {
            excelPathArray = exclPath.split(",");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        // 相当于只有一个参数param，获取到后解密，然后再把解密后的值设置进去，这样就修改了请求参数
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getParameter("param"));

        if (!isIgnored(httpServletRequest.getRequestURI())) {
            Object accessToken = httpServletRequest.getHeader("accessToken");
            if (!StringUtils.isEmpty(accessToken)) {

                PrintWriter out = servletResponse.getWriter();
                Map<String, String[]> parameterMap = new HashMap<>(httpServletRequest.getParameterMap());
                //修改请求参数
                parameterMap.put("param",new String[]{"44"});
                ParameterServletRequestWrapper req = new ParameterServletRequestWrapper(httpServletRequest, parameterMap);
                ParameterServletResponseWrapper resp = new ParameterServletResponseWrapper(httpServletResponse);

                //调用对应的controller
                filterChain.doFilter(req,resp);

                //对返回参数进行处理
                resp.setContentLength(resp.getResponseData().length+5);
                System.out.println("result:"+new String(resp.getResponseData()));
                out.println("22"+new String(resp.getResponseData()));
                out.flush();
                out.close();
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    /**
     * 判断是否是不被拦截的路径
     * @param requestURI
     * @return
     */
    private boolean isIgnored(String requestURI) {
        for (String excelPath : excelPathArray) {
            if (requestURI.contains(excelPath)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void destroy() {

    }
}
