package com.sky.Interface;

import com.sky.entity.ShipmentManagementResult;

/**
 * Description:
 *
 * @author sky
 * @create 2020/7/2823:26
 */
public interface IShipmentManagement {
    /***
     * calculate
     * @param number
     * @return
     */
    ShipmentManagementResult doAction(Integer number);
}
