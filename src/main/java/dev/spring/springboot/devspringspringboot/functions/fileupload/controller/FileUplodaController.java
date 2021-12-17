package dev.spring.springboot.devspringspringboot.functions.fileupload.controller;

import dev.spring.springboot.devspringspringboot.functions.fileupload.dto.BoardDto;
import dev.spring.springboot.devspringspringboot.functions.fileupload.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RequiredArgsConstructor
@Controller
public class FileUplodaController {

    private final BoardService boardService;

    @PostMapping("/fileupload")
    public String fileUpload1(BoardDto boardDto, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
        boardService.insertBoard(boardDto, multipartHttpServletRequest);
        return "redirect:/fileupload";

    }

    @GetMapping("/fileupload")
    public String fileUpload2() throws Exception{
        return "/fileUpload/fileUpload";
    }

}
