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
**类  名：CstCustomerDetail
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(cst_customer_detail)
*
*@author changsheng-yu
*/
public class CstCustomerDetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3270225049425458580L;

    /** custId */
    private Long custId;

    /** 客户地区 */
    private String custRegion;

    /** 客户邮政编码 */
    private String custZip;

    /** 客户联系地址 */
    private String custAddress;

    /** 客户传真 */
    private String custFax;

    /** 客户网址 */
    private String custWebsite;

    /** 客户营业执照注册号 */
    private String custLicence;

    /** 企业法人 */
    private String custCorporation;

    /** 客户注册资金 */
    private Long custCapital;

    /** 开户银行及账号 */
    private String custBank;

    /** 客户简介 */
    private String custMemo;

    /**
     * 获取custId
     * 
     * @return custId
     */
    public Long getCustId() {
        return this.custId;
    }

    /**
     * 设置custId
     * 
     * @param custId
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * 获取客户地区
     * 
     * @return 客户地区
     */
    public String getCustRegion() {
        return this.custRegion;
    }

    /**
     * 设置客户地区
     * 
     * @param custRegion
     *          客户地区
     */
    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion;
    }

    /**
     * 获取客户邮政编码
     * 
     * @return 客户邮政编码
     */
    public String getCustZip() {
        return this.custZip;
    }

    /**
     * 设置客户邮政编码
     * 
     * @param custZip
     *          客户邮政编码
     */
    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    /**
     * 获取客户联系地址
     * 
     * @return 客户联系地址
     */
    public String getCustAddress() {
        return this.custAddress;
    }

    /**
     * 设置客户联系地址
     * 
     * @param custAddress
     *          客户联系地址
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * 获取客户传真
     * 
     * @return 客户传真
     */
    public String getCustFax() {
        return this.custFax;
    }

    /**
     * 设置客户传真
     * 
     * @param custFax
     *          客户传真
     */
    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    /**
     * 获取客户网址
     * 
     * @return 客户网址
     */
    public String getCustWebsite() {
        return this.custWebsite;
    }

    /**
     * 设置客户网址
     * 
     * @param custWebsite
     *          客户网址
     */
    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite;
    }

    /**
     * 获取客户营业执照注册号
     * 
     * @return 客户营业执照注册号
     */
    public String getCustLicence() {
        return this.custLicence;
    }

    /**
     * 设置客户营业执照注册号
     * 
     * @param custLicence
     *          客户营业执照注册号
     */
    public void setCustLicence(String custLicence) {
        this.custLicence = custLicence;
    }

    /**
     * 获取企业法人
     * 
     * @return 企业法人
     */
    public String getCustCorporation() {
        return this.custCorporation;
    }

    /**
     * 设置企业法人
     * 
     * @param custCorporation
     *          企业法人
     */
    public void setCustCorporation(String custCorporation) {
        this.custCorporation = custCorporation;
    }

    /**
     * 获取客户注册资金
     * 
     * @return 客户注册资金
     */
    public Long getCustCapital() {
        return this.custCapital;
    }

    /**
     * 设置客户注册资金
     * 
     * @param custCapital
     *          客户注册资金
     */
    public void setCustCapital(Long custCapital) {
        this.custCapital = custCapital;
    }

    /**
     * 获取开户银行及账号
     * 
     * @return 开户银行及账号
     */
    public String getCustBank() {
        return this.custBank;
    }

    /**
     * 设置开户银行及账号
     * 
     * @param custBank
     *          开户银行及账号
     */
    public void setCustBank(String custBank) {
        this.custBank = custBank;
    }

    /**
     * 获取客户简介
     * 
     * @return 客户简介
     */
    public String getCustMemo() {
        return this.custMemo;
    }

    /**
     * 设置客户简介
     * 
     * @param custMemo
     *          客户简介
     */
    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo;
    }
}