package com.wzg.jcatstoreback.service;

import com.wzg.jcatstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);

}
