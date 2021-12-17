package dev.spring.springboot.devspringspringboot.functions.fileupload.service;

import dev.spring.springboot.devspringspringboot.functions.fileupload.dto.BoardDto;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {

    void insertBoard(BoardDto boardDto, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;

}
