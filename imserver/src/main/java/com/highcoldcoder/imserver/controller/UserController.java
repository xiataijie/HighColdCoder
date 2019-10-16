package com.highcoldcoder.imserver.controller;


import com.alibaba.fastjson.JSON;
import com.highcoldcoder.imserver.model.response.LoginResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户模块
 */
@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 注册
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public String register() {
        return "register";
    }

    /**
     * 登录
     * @return
     */
    @PostMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String login() {

        LoginResponse.ResultEntity resultEntity = new LoginResponse.ResultEntity();
        resultEntity.setId("t1hWCOGvX");
        resultEntity.setToken("B0DA/kKanJviD5xxUzhwsEFIJad0/86YwGxBwz1417WFQi/Vr2OJay26s5IFDffGZaUYRMAkvN0ikvOcTl7RN9JilKZlosfQ");
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setCode(200);
        loginResponse.setResult(resultEntity);
        return JSON.toJSONString(loginResponse);
    }

    /**
     * 验证验证码是否正确(必选先用手机号码调sendcode)
     * @return
     */
    @RequestMapping("/verify_code")
    @ResponseBody
    public String verifyCode() {
        return "verify_code";
    }

    /**
     * 检查手机是否被注册
     * @return
     */
    @RequestMapping("/check_phone_available")
    @ResponseBody
    public String checkPhoneAvailable() {
        return "";
    }

    /**
     * 发送验证码
     * @return
     */
    @RequestMapping("user/send_code")
    @ResponseBody
    public String sendCode() {
        return "";
    }

    /**
     * 获取 token 前置条件需要登录   502 坏的网关 测试环境用户已达上限
     * @return
     */
    @RequestMapping("user/get_token")
    @ResponseBody
    public String getToken() {
        return "";
    }

    //设置自己的昵称
    @PostMapping("/set_nickname")
    @ResponseBody
    public String setName() {
        return "";
    }

    /**
     * 设置用户头像
     * @return
     */
    @PostMapping("user/set_portrait_uri")
    @ResponseBody
    public String setPortrait() {
        return "";
    }

    /**
     * 当前登录用户通过旧密码设置新密码  前置条件需要登录才能访问
     * @return
     */
    @PostMapping("user/change_password")
    @ResponseBody
    public String changePassword() {
        return "";
    }

    /**
     * 通过手机验证码重置密码
     * @return
     */
    @PostMapping("user/reset_password")
    @ResponseBody
    public String restPassword() {
        return "";
    }

    /**
     * 根据 id 去服务端查询用户信息
     * @param userid
     * @return
     */
    @GetMapping()
    public String getUserInfoById(String userid) {
        return "";
    }

    /**
     * 通过国家码和手机号查询用户信息
     * @param region
     * @param phone
     * @return
     */
    @GetMapping("/find")
    @ResponseBody
    public String getUserInfoFromPhone(String region, String phone) {
        return "";
    }

}
