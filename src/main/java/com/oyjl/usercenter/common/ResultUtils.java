package com.oyjl.usercenter.common;

/**
 * 返回工具类
 * @author oyjl
 */
public class ResultUtils {

    /**
     * 成功
     * @param data 成功返回的数据
     * @return 成功返回的结果
     * @param <T> 返回的数据类型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 失败返回的结果
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code 错误码
     * @param message 错误信息
     * @param description 错误描述
     * @return 失败返回的结果
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse(code, null, message, description);
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 失败返回的结果
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse(errorCode.getCode(), null, message, description);
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 失败返回的结果
     */
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse(errorCode.getCode(), errorCode.getMessage(), description);
    }
}
