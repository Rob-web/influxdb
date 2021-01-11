package com.luo.constants;

public enum CodeEnum {
    /**
     * 成功状态
     **/
    OK(0, "OK"),
    /**
     * 内部服务错误
     **/
    FAIL(500, "sever error"),
    /**
     * 内部服务错误
     **/
    PARAM_ERROR(501, "param error"),

    /**
     * 统一用户操作失败状态，减少前端工作量
     */
    OPERATION_FAIL(1000, "operation fail"),
    /**
     * 验证码失效
     */
    CODE_INVALID(1001, "validate code is Invalid"),

    /**
     * 外层异常梳理返回code
     */
    OPERATION_EXCEPTION(1002, "operation exception"),
    /**
     * session异常
     */
    SESSION_INVALIDE(-1, "operation fail");
    private int code;

    private String value;

    CodeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

}
