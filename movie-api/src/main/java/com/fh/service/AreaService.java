package com.fh.service;

import com.fh.model.Area;
import com.fh.model.ConditionQuery;
import com.fh.model.DataTableResult;

public interface AreaService {
    DataTableResult queryAreaList(ConditionQuery conditionQuery);

    void deleteArea(Integer id);

    void addArea(Area area);
}
