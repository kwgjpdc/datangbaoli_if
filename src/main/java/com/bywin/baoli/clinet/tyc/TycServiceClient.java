package com.bywin.baoli.clinet.tyc;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.bywin.baoli.aspect.WebLog;
import com.bywin.baoli.clinet.tyc.dto.TycVo;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;


/**
 * @author 朱宝
 * @version 1.0
 * @description: 天眼查相关接口
 * @date 2024/7/31 下午3:48
 */
@Slf4j
@Service
public class TycServiceClient {

    /**
     * @description:
     * @param: keyWord
     * tycApi 请求地址
     * tycToken token
     * @return: json
     * @author 朱宝
     * @date: 2024/7/31 下午4:23
     */
    public JSONObject tycApi(String keyWord, String tycApi, String tycToken) {
        String url = tycApi + "?keyword=" + keyWord;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Authorization", tycToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String data = Objects.requireNonNull(response.body()).string();
            // 如果响应成功，返回响应体字符串并解析为 JSON 对象
            return new JSONObject(data);
        } catch (IOException e) {
            log.error("天眼查接口请求异常{}", e);
            throw new RuntimeException(e);
        }
    }
}

