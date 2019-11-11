/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

/****************************************************************
**类  名：SaleChance
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

import java.util.Date;

/**
*(sale_chance)
*
*@author changsheng-yu
*/
public class SaleChance implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3181226252359552711L;

    /** 商机id */
    private String chanId;

    /** 商机名称 */
    private String chanName;

    /** 客户id */
    private Long chanCustId;

    /** 负责人id */
    private Long chanUserId;

    /** 商机金额 */
    private Integer chanMoney;

    /** 商机类型 */
    private String chanType;

    /** 商机来源 */
    private String chanSource;

    /** 商机状态 */
    private String chanState;

    /** 联系人id */
    private Long chanLkmId;

    /** 联系时间 */
    private Date chanLinktime;

    /** 机会描述 */
    private String chanDesc;

    /**
     * 获取商机id
     * 
     * @return 商机id
     */
    public String getChanId() {
        return this.chanId;
    }

    /**
     * 设置商机id
     * 
     * @param chanId
     *          商机id
     */
    public void setChanId(String chanId) {
        this.chanId = chanId;
    }

    /**
     * 获取商机名称
     * 
     * @return 商机名称
     */
    public String getChanName() {
        return this.chanName;
    }

    /**
     * 设置商机名称
     * 
     * @param chanName
     *          商机名称
     */
    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    /**
     * 获取客户id
     * 
     * @return 客户id
     */
    public Long getChanCustId() {
        return this.chanCustId;
    }

    /**
     * 设置客户id
     * 
     * @param chanCustId
     *          客户id
     */
    public void setChanCustId(Long chanCustId) {
        this.chanCustId = chanCustId;
    }

    /**
     * 获取负责人id
     * 
     * @return 负责人id
     */
    public Long getChanUserId() {
        return this.chanUserId;
    }

    /**
     * 设置负责人id
     * 
     * @param chanUserId
     *          负责人id
     */
    public void setChanUserId(Long chanUserId) {
        this.chanUserId = chanUserId;
    }

    /**
     * 获取商机金额
     * 
     * @return 商机金额
     */
    public Integer getChanMoney() {
        return this.chanMoney;
    }

    /**
     * 设置商机金额
     * 
     * @param chanMoney
     *          商机金额
     */
    public void setChanMoney(Integer chanMoney) {
        this.chanMoney = chanMoney;
    }

    /**
     * 获取商机类型
     * 
     * @return 商机类型
     */
    public String getChanType() {
        return this.chanType;
    }

    /**
     * 设置商机类型
     * 
     * @param chanType
     *          商机类型
     */
    public void setChanType(String chanType) {
        this.chanType = chanType;
    }

    /**
     * 获取商机来源
     * 
     * @return 商机来源
     */
    public String getChanSource() {
        return this.chanSource;
    }

    /**
     * 设置商机来源
     * 
     * @param chanSource
     *          商机来源
     */
    public void setChanSource(String chanSource) {
        this.chanSource = chanSource;
    }

    /**
     * 获取商机状态
     * 
     * @return 商机状态
     */
    public String getChanState() {
        return this.chanState;
    }

    /**
     * 设置商机状态
     * 
     * @param chanState
     *          商机状态
     */
    public void setChanState(String chanState) {
        this.chanState = chanState;
    }

    /**
     * 获取联系人id
     * 
     * @return 联系人id
     */
    public Long getChanLkmId() {
        return this.chanLkmId;
    }

    /**
     * 设置联系人id
     * 
     * @param chanLkmId
     *          联系人id
     */
    public void setChanLkmId(Long chanLkmId) {
        this.chanLkmId = chanLkmId;
    }

    /**
     * 获取联系时间
     * 
     * @return 联系时间
     */
    public Date getChanLinktime() {
        return this.chanLinktime;
    }

    /**
     * 设置联系时间
     * 
     * @param chanLinktime
     *          联系时间
     */
    public void setChanLinktime(Date chanLinktime) {
        this.chanLinktime = chanLinktime;
    }

    /**
     * 获取机会描述
     * 
     * @return 机会描述
     */
    public String getChanDesc() {
        return this.chanDesc;
    }

    /**
     * 设置机会描述
     * 
     * @param chanDesc
     *          机会描述
     */
    public void setChanDesc(String chanDesc) {
        this.chanDesc = chanDesc;
    }
}