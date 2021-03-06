package com.wjj.studentmanager.common;

public enum ResponseEnum {
    INNER_ERROR(2001, "内部错误"),
    LOGIN_SUCCESS(20000, "登录成功"),
    NEED_USER_NAME(10001, "用户名不能为空"),
    NEED_PASSWORD(10002, "密码不能为空"),
    LOGIN_FAILED(3000, "登录失败，账号或密码错误"),
    ACCOUNT_NOT_FOUND(2002, "账号不存在，请先注册"),
    ACCOUNT_NOT_LOGIN(50008, "账号未登录"),
    INVALID_PARAM(40001, "参数非法"),
    USERNAME_EXIST(3002, "用户名已存在"),
    REGISTE_SUCCESS(20000, "注册成功"),
    UPDATE_SUCCESS(20000, "修改成功"),
    UPDATE_FAILED(20001, "修改失败，原密码错误"),
    UPDATE_STUDENT_FAILED(5000,"修改学生信息失败"),
    UPDATE_TEACHER_FAILED(6000,"修改教师信息失败"),
    UPDATE_CLAZZ_FAILED(6000,"修改班级信息失败"),
    PASSWORD_SAME(10022, "新旧密码不能相同"),
    NEW_PASSWORD_SAME(10023, "两次新密码不相同"),
    GET_SUCCESS(20000, "数据获取成功"),
    ADD_SUCCESS(20000, "添加成功"),
    CLAZZ_EXIST(3002, "班级已存在"),
    DELETE_SUCCESS(20000, "删除成功"),
    NEED_ADMIN(10062, "无管理员权限"),
    DELETE_FIALED(30000, "删除失败，班级学生人数不为0"),
    ;
    Integer code;		//响应码
    String message;		//响应信息

    ResponseEnum(Integer code, String message){
        this.code = code;
        this.message = message;

    }
}