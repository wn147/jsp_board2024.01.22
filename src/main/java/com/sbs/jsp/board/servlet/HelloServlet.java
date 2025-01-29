package com.sbs.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");//들어오는 데이터를 utf 8 로 해석 /(한글 변환)
    resp.setCharacterEncoding("UTF-8");//완성되는 html의 인코딩을 변환
    resp.setContentType("text/html;charset=UTF-8");// 브라우저에 의미 전달
    resp.getWriter().append("안녕하세요!!!");
  }
}
