package com.example.minigame.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


/**
 * @author Administrator
 * 封装返回结果信息
 */
@RestControllerAdvice(basePackages = "com.example.minigame.controller")
public class ResultAdvice implements ResponseBodyAdvice {

    protected static final Logger logger = LoggerFactory.getLogger(ResultAdvice.class);
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if(o instanceof ResultBase){
            return o;
        }else if(o instanceof String){
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(ResultBase.ok(o));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }else{
            return ResultBase.ok(o);
        }
    }
}
