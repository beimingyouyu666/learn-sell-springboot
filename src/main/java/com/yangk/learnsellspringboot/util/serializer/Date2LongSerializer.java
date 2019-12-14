package com.yangk.learnsellspringboot.util.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @Description 后端的date类型转化为long类型传到前端，将量级除以1000，json转化的时候起作用
 * @Author yangkun
 * @Date 2019/12/4
 * @Version 1.0
 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(value.getTime()/1000);
    }
}
