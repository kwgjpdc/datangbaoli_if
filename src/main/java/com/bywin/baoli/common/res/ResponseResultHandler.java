package com.bywin.baoli.common.res;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;

import static cn.hutool.http.ContentType.JSON;


/**
 * @Author: zhubao
 * @Description: 返回数据后  拦截封装响应体
 * @DateTime: 2022/9/13 9:51
 * @Params:
 * @Return
 */
@Slf4j
@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {

    //标记名称
    private static final String PRESENT_NA_ANN = "PRESENT_NA_ANN";

    /*判断是否需要包装返回，不需要直接返回即可*/
    public boolean supports(@NotNull MethodParameter returnType,
                            @NotNull Class<? extends HttpMessageConverter<?>> converterType) {
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest request = requestAttributes.getRequest();
        //根据标记名获取对象   在ResponseResultInterceptor类写入
        ResponseResult rue = (ResponseResult) request.getAttribute(PRESENT_NA_ANN);
        return rue == null;
    }

    /**
     * 判断body是否属于返回体的类，属于直接返回body否则封装后在返回
     *
     * @param body
     * @param returnType            返回类型
     * @param selectedContentType
     * @param selectedConverterType
     * @param request
     * @param response
     * @return
     */
    public Object beforeBodyWrite(Object body, @NotNull MethodParameter returnType,
                                  @NotNull MediaType selectedContentType,
                                  @NotNull Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  @NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response) {
        if (body instanceof Result) {
            log.debug("beforeBodyWrite instanceof Result");
            return body;
        }
        //处理404的问题
        if (body instanceof LinkedHashMap) {
            LinkedHashMap map = (LinkedHashMap) body;//强转
            if (map.get("status") != null) {
                int status = (int) map.get("status");
                String error = (String) map.get("error");
                String message = (String) map.get("message");
                String path = (String) map.get("path");
                return new Result(status, "请求：" + path + ",错误：" + (StrUtil.isNotBlank(error) ?
                        error : message));
            }
        }
        if (body instanceof String) {
            Result result = new Result(ResultCode.SUCCESS, body);
            return JSONUtil.toJsonStr(result);
        }
        return new Result(ResultCode.SUCCESS, body);
    }

}