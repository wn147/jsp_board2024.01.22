package com.sbs.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")

public class GugudanServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");//들어오는 데이터를 utf 8 로 해석 /(한글 변환)
    resp.setCharacterEncoding("UTF-8");//완성되는 html의 인코딩을 변환
    resp.setContentType("text/html;charset=UTF-8");// 브라우저에 의미 전달

    int dan = Integer.parseInt(req.getParameter("dan"));
    int limit = Integer.parseInt(req.getParameter("limit"));

    resp.getWriter().append("<h1>%d단</h1>\n".formatted(dan));

    for(int i = 0; i <= limit; i++) {
      resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
    }

  }
}
