package com.dsy.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author trueway
 * 业务编写
 */

public interface ContentService {

    /**
     * 1.将解析数据放到索引中
     * @param keyword  要搜索的参数
     * @throws IOException  要搜索的参数
     * @return true 代表成功
     *
     * */
    public Boolean parseContent(String keyword) throws IOException;

    /**
     * 2.获取这些数据实现搜索功能
     * @param keyword
     * @param pageNo
     * @param pageSize
     * @return
     * @throws IOException
     */
    public List<Map<String,Object>> searchPage(String keyword, int pageNo, int pageSize) throws IOException;
    /**
     * 3.获取这些数据实现高亮搜索功能
     * @param keyword
     * @param pageNo
     * @param pageSize
     * @return
     * @throws IOException
     */
    public List<Map<String,Object>> searchPageHighlightBuilder(String keyword, int pageNo, int pageSize) throws IOException;
}
