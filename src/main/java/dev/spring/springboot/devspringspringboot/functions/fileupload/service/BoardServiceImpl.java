package dev.spring.springboot.devspringspringboot.functions.fileupload.service;

import dev.spring.springboot.devspringspringboot.common.FileUtils;
import dev.spring.springboot.devspringspringboot.functions.fileupload.dto.BoardFileDto;
import dev.spring.springboot.devspringspringboot.functions.fileupload.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;
    private final FileUtils fileUtils;

    @Override
    public void insertBoard(BoardDto boardDto, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
        boardMapper.insertBoard(boardDto);
        List<BoardFileDto> list = fileUtils.parseFileInfo(boardDto.getBoardIdx(), multipartHttpServletRequest);
        if (CollectionUtils.isEmpty(list) == false){
            boardMapper.insertBoardFileList(list);
        }
    }

}
