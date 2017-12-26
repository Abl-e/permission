package com.tangguoxiang.common;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 封装json数据通用类
 * @author 唐国翔
 * @date 2017-12-26 13:21
 * <p>
 * 　　　　　　　　┏┓　　　┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　  ┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃　　　　Code is far away from bug with the animal protecting
 * 　　　　　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 **/
@Getter
@Setter
public class JsonData {

    private boolean ret;

    private String msg;

    private Object data;

    private JsonData(boolean ret){
        this.ret = ret;
    }

    /**
     * 成功返回方法
     * @return JsonData
     */
    public static JsonData successCode(){
        return new JsonData(true);
    }

    /**
     * 成功返回方法
     * @param msg 返回信息
     * @param data 数据
     * @return JsonData
     */
    public static JsonData successCodeAndData(String msg,Object data){
        JsonData jsonData = new JsonData(true);
        jsonData.msg = msg;
        jsonData.data = data;
        return jsonData;
    }

    /**
     * 成功返回方法
     * @param data 数据
     * @return JsonData
     */
    public static JsonData successData(Object data){
        JsonData jsonData = new JsonData(true);
        jsonData.data = data;
        return jsonData;
    }

    /**
     * 失败返回方法
     * @param msg 返回信息
     * @return JsonData
     */
    public static JsonData fail(String msg){
        JsonData jsonData = new JsonData(false);
        jsonData.msg = msg;
        return jsonData;
    }

    /**
     * 转换ModelAndView方法
     * @return
     */
    public Map<String,Object> toMap(){
        Map<String,Object> resultMap = Maps.newHashMap();
        resultMap.put("ret",ret);
        resultMap.put("msg",msg);
        resultMap.put("data",data);
        return resultMap;
    }

}
