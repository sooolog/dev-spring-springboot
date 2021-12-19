package dev.spring.springboot.devspringspringboot.functions.fileupload.service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {

    void insertBoard(BoardDto boardDto, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;

}
