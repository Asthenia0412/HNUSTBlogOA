package com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse;

import lombok.Data;
import java.io.Serializable;

@Data
public class BlogResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private String contentPreview;
    private String content;
    private boolean success;
    private String message;
    private String creationTime;
}
