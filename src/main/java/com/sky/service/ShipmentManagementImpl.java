package com.sky.service;

import com.sky.Interface.IShipmentManagement;
import com.sky.entity.ShipmentManagementResult;

/**
 * Description:
 *
 * @author sky
 * @create 2020/7/2823:28
 */
public class ShipmentManagementImpl implements IShipmentManagement {


    @Override
    public ShipmentManagementResult doAction(Integer number) {
        ShipmentManagementResult result = new ShipmentManagementResult();
        result.setSplitOneNum(number/10*2);
        result.setSplitTwoNum(number/10*3);
        result.setSplitThreeNum(number/10*5);
        result.setMergeNum(number/10*8);
        return result;
    }
}
