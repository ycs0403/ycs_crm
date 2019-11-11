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
**类  名：CstLinkman
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(cst_linkman)
*
*@author changsheng-yu
*/
public class CstLinkman implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -9060016813234116239L;

    /** 联系人编号(主键) */
    private Long lkmId;

    /** 联系人姓名 */
    private String lkmName;

    /** 客户id */
    private Long lkmCustId;

    /** 联系人性别 */
    private Integer lkmGender;

    /** 联系人办公电话 */
    private String lkmPhone;

    /** 联系人手机 */
    private String lkmMobile;

    /** 联系人邮箱 */
    private String lkmEmail;

    /** 联系人qq */
    private String lkmQq;

    /** 联系人职位 */
    private String lkmPosition;

    /** 联系人备注 */
    private String lkmMemo;

    /**
     * 获取联系人编号(主键)
     * 
     * @return 联系人编号(主键)
     */
    public Long getLkmId() {
        return this.lkmId;
    }

    /**
     * 设置联系人编号(主键)
     * 
     * @param lkmId
     *          联系人编号(主键)
     */
    public void setLkmId(Long lkmId) {
        this.lkmId = lkmId;
    }

    /**
     * 获取联系人姓名
     * 
     * @return 联系人姓名
     */
    public String getLkmName() {
        return this.lkmName;
    }

    /**
     * 设置联系人姓名
     * 
     * @param lkmName
     *          联系人姓名
     */
    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    /**
     * 获取客户id
     * 
     * @return 客户id
     */
    public Long getLkmCustId() {
        return this.lkmCustId;
    }

    /**
     * 设置客户id
     * 
     * @param lkmCustId
     *          客户id
     */
    public void setLkmCustId(Long lkmCustId) {
        this.lkmCustId = lkmCustId;
    }

    /**
     * 获取联系人性别
     * 
     * @return 联系人性别
     */
    public Integer getLkmGender() {
        return this.lkmGender;
    }

    /**
     * 设置联系人性别
     * 
     * @param lkmGender
     *          联系人性别
     */
    public void setLkmGender(Integer lkmGender) {
        this.lkmGender = lkmGender;
    }

    /**
     * 获取联系人办公电话
     * 
     * @return 联系人办公电话
     */
    public String getLkmPhone() {
        return this.lkmPhone;
    }

    /**
     * 设置联系人办公电话
     * 
     * @param lkmPhone
     *          联系人办公电话
     */
    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    /**
     * 获取联系人手机
     * 
     * @return 联系人手机
     */
    public String getLkmMobile() {
        return this.lkmMobile;
    }

    /**
     * 设置联系人手机
     * 
     * @param lkmMobile
     *          联系人手机
     */
    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    /**
     * 获取联系人邮箱
     * 
     * @return 联系人邮箱
     */
    public String getLkmEmail() {
        return this.lkmEmail;
    }

    /**
     * 设置联系人邮箱
     * 
     * @param lkmEmail
     *          联系人邮箱
     */
    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    /**
     * 获取联系人qq
     * 
     * @return 联系人qq
     */
    public String getLkmQq() {
        return this.lkmQq;
    }

    /**
     * 设置联系人qq
     * 
     * @param lkmQq
     *          联系人qq
     */
    public void setLkmQq(String lkmQq) {
        this.lkmQq = lkmQq;
    }

    /**
     * 获取联系人职位
     * 
     * @return 联系人职位
     */
    public String getLkmPosition() {
        return this.lkmPosition;
    }

    /**
     * 设置联系人职位
     * 
     * @param lkmPosition
     *          联系人职位
     */
    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    /**
     * 获取联系人备注
     * 
     * @return 联系人备注
     */
    public String getLkmMemo() {
        return this.lkmMemo;
    }

    /**
     * 设置联系人备注
     * 
     * @param lkmMemo
     *          联系人备注
     */
    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }
}