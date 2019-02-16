package com.swzl.controller;

import com.alibaba.fastjson.JSON;
import com.swzl.entity.User;
import com.swzl.service.UserService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * @Auther: hushuang
 * @Date: 2019/2/16 16:38
 * @Description:
 */
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    //appid: wx2afad5ac66e7188d
    //86146f4167ab31f4bcb1be39f37d8e02
    @GetMapping(value = "/sessionTcode")
    public Map login(String code){
        String url="https://api.weixin.qq.com/sns/jscode2session?appid=wx2afad5ac66e7188d&secret=86146f4167ab31f4bcb1be39f37d8e02&js_code="+code+"&grant_type=authorization_code";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);


        try {
            String responseBody = httpclient.execute(httpGet, new ResponseHandler<String>() {
                @Override
                public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            });
            Map map = JSON.parseObject(responseBody, Map.class);
            //使用openid查询数据库是否存在，如果存在说明授权过，如果不存在说明没有进行过授权
            String openid = (String) map.get("openid");
            User user = userService.queryUserByOpenId(openid);
            if(user!=null){
                map.put("isLogin",true);
            }else{
                map.put("isLogin",false);
            }

            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        System.out.println(user);
        int row = userService.addUser(user);
        if(row>0){
            return "ok";
        }else{
            return "error";
        }

    }

}
