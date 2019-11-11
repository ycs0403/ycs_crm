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
**类  名：SaleVisit
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

import java.util.Date;

/**
*(sale_visit)
*
*@author changsheng-yu
*/
public class SaleVisit implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8974994600839863607L;

    /** visitId */
    private String visitId;

    /** 客户id */
    private Long visitCustId;

    /** 负责人id */
    private Long visitUserId;

    /** 联系人id */
    private Long visitLkmId;

    /** 拜访时间 */
    private Date visitTime;

    /** 拜访地点 */
    private String visitAddr;

    /** 拜访详情 */
    private String visitDetail;

    /** 下次拜访时间 */
    private Date visitNexttime;

    /**
     * 获取visitId
     * 
     * @return visitId
     */
    public String getVisitId() {
        return this.visitId;
    }

    /**
     * 设置visitId
     * 
     * @param visitId
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * 获取客户id
     * 
     * @return 客户id
     */
    public Long getVisitCustId() {
        return this.visitCustId;
    }

    /**
     * 设置客户id
     * 
     * @param visitCustId
     *          客户id
     */
    public void setVisitCustId(Long visitCustId) {
        this.visitCustId = visitCustId;
    }

    /**
     * 获取负责人id
     * 
     * @return 负责人id
     */
    public Long getVisitUserId() {
        return this.visitUserId;
    }

    /**
     * 设置负责人id
     * 
     * @param visitUserId
     *          负责人id
     */
    public void setVisitUserId(Long visitUserId) {
        this.visitUserId = visitUserId;
    }

    /**
     * 获取联系人id
     * 
     * @return 联系人id
     */
    public Long getVisitLkmId() {
        return this.visitLkmId;
    }

    /**
     * 设置联系人id
     * 
     * @param visitLkmId
     *          联系人id
     */
    public void setVisitLkmId(Long visitLkmId) {
        this.visitLkmId = visitLkmId;
    }

    /**
     * 获取拜访时间
     * 
     * @return 拜访时间
     */
    public Date getVisitTime() {
        return this.visitTime;
    }

    /**
     * 设置拜访时间
     * 
     * @param visitTime
     *          拜访时间
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * 获取拜访地点
     * 
     * @return 拜访地点
     */
    public String getVisitAddr() {
        return this.visitAddr;
    }

    /**
     * 设置拜访地点
     * 
     * @param visitAddr
     *          拜访地点
     */
    public void setVisitAddr(String visitAddr) {
        this.visitAddr = visitAddr;
    }

    /**
     * 获取拜访详情
     * 
     * @return 拜访详情
     */
    public String getVisitDetail() {
        return this.visitDetail;
    }

    /**
     * 设置拜访详情
     * 
     * @param visitDetail
     *          拜访详情
     */
    public void setVisitDetail(String visitDetail) {
        this.visitDetail = visitDetail;
    }

    /**
     * 获取下次拜访时间
     * 
     * @return 下次拜访时间
     */
    public Date getVisitNexttime() {
        return this.visitNexttime;
    }

    /**
     * 设置下次拜访时间
     * 
     * @param visitNexttime
     *          下次拜访时间
     */
    public void setVisitNexttime(Date visitNexttime) {
        this.visitNexttime = visitNexttime;
    }
}