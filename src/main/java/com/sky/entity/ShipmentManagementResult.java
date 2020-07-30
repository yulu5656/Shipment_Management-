package com.sky.entity;

import lombok.Data;

/**
 * Description:
 *
 * @author sky
 * @create 2020/7/2823:29
 */
@Data
public class ShipmentManagementResult {

    private Integer totalNum;

    private Integer splitOneNum;

    private Integer splitTwoNum;

    private Integer splitThreeNum;

    private Integer mergeNum;
}
