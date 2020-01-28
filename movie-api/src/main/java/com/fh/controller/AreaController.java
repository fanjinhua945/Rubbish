package com.fh.controller;

import com.fh.model.*;
import com.fh.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("AreaController")
@CrossOrigin
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("queryAreaList")
    public ServerResponse queryAreaList(ConditionQuery conditionQuery){
        DataTableResult dataTableResult = areaService.queryAreaList(conditionQuery);
            return ServerResponse.success(dataTableResult);
        }

    @RequestMapping("deleteArea")
    public ServerResponse deleteArea(Integer id){
        areaService.deleteArea(id);
        return ServerResponse.success();
    }

    @PostMapping("addArea")
    public ServerResponse addArea(Area area){
        areaService.addArea(area);
        return ServerResponse.success();
    }


    }




