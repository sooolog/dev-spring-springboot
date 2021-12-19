package dev.spring.springboot.devspringspringboot.functions.fileupload.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardFileDto {

    private int idx;
    private int boardIdx;
    private String originalFileName;
    private String storedFilePath;
    private long fileSize;


}
