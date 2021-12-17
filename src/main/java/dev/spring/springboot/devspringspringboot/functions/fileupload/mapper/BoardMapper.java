package dev.spring.springboot.devspringspringboot.functions.fileupload.mapper;

import dev.spring.springboot.devspringspringboot.functions.fileupload.dto.BoardDto;
import dev.spring.springboot.devspringspringboot.functions.fileupload.dto.BoardFileDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void insertBoard(BoardDto boardDto) throws Exception;

    void insertBoardFileList(List<BoardFileDto> list) throws Exception;

}
