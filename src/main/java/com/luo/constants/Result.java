package com.luo.constants;

import lombok.Data;

/**
 * @author zizuo.zdh
 * @ClassName Result
 * @Description TODO
 * @Date 2018/6/25 14:50
 * @Version 1.0
 **/
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态信息，错误描述
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public Result(){

    }
    public Result(Integer code, String msg, T data) {

        this.code = code;
        this.msg = msg;
        this.data = data;
    }

//    /**
//     * @return com.data.shuzi.datacollector.common.Result
//     * @author zizuo.zdh
//     * @Description TODO
//     * @Date 2018/6/25 14:59
//     * @Param [code, msg, data]
//     **/
//z    public static  Result isOK(Integer code, String msg, T data) {
//        return new Result(code, msg, data);
//    }


    /**
     * @return com.data.shuzi.datacollector.common.Result
     * @author zizuo.zdh
     * @Description TODO
     * @Date 2018/6/25 14:59
     * @Param [code, msg]
     **/
    public static Result isFail(Integer code, String msg) {
        return new Result(code, msg, null);
    }

    public static Result isOK(Integer code, String msg, Object o) {
        return new Result(code, msg, o);
    }
}
