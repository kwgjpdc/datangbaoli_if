package com.bywin.baoli.conf;

import cn.hutool.json.JSONNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * 解决一下问题
 * HuTool的JSON里用JSONNull对象代替了null，而且JSONNull类没有适用于Jackson序列化的序列化器。
 * 　　如果接口返回值对象里使用了HuTool的JSON，又凑巧存在被JSONNull对象代替了的null值，则序列化时会出现以上报错。
 */
@JsonComponent
public class JsonNullSerializer extends JsonSerializer<JSONNull> {
    @Override
    public void serialize(JSONNull jsonNull, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNull();
    }
}