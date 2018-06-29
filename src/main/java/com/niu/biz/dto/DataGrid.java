package com.niu.biz.dto;

import lombok.Data;

import java.util.List;

@Data
public class DataGrid<T> {
    private int code;

    private String msg;
    /**
     * 总记录数
     */
    private long count;

    /**
     * 数据对象
     */
    private List<T> data;

    public DataGrid() {
    }

    public DataGrid(int code, String msg, long count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
