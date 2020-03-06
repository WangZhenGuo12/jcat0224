package io.cjf.jcartstoreback.service;

import com.wzg.jcatstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);

}
