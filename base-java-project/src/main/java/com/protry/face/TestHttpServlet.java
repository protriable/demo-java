package com.protry.face;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求的编码
        req.setCharacterEncoding("UTF-8");
        //设置响应内容的类型
        resp.setContentType("message/http");
        super.doGet(req, resp);
    }

    public static void main(String[] args) {
        HttpServlet servlet = new TestHttpServlet();
        servlet.getServletConfig().getInitParameter("");
        servlet.getServletContext().getInitParameter("");
    }
}
