package com.wzg.jcatadministrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadministrationback.po.Return;


public interface ReturnService {

    Page<Return> search(Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
