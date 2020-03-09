package com.wzg.jcatadministrationback.service;

import com.wzg.jcatadministrationback.po.ReturnHistory;


import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);

}
