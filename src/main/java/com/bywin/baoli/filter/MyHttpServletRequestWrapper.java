package com.bywin.baoli.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StreamUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

@Slf4j
public class MyHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private byte[] bytes = null;

    public MyHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        /**
         *不要在构造函数里直接读出，否则在使用 MultipartFile 上传文件的时候调试七八个小时就知道了
         */
        if (bytes == null) {
            bytes = StreamUtils.copyToByteArray(super.getRequest().getInputStream());
        }
//        log.info("bytes:\n" + new String(bytes));
        return new ServletInputStream() {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }
        };
    }

    @Override
    public BufferedReader getReader() throws IOException {
        if (bytes == null) bytes = StreamUtils.copyToByteArray(super.getInputStream());
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes)));
    }
}