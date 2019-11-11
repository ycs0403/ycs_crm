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
**类  名：CstCustomer
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(cst_customer)
*
*@author changsheng-yu
*/
public class CstCustomer implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1912087330929925434L;

    /** 客户编号(主键) */
    private Long custId;

    /** 客户名称(公司名称) */
    private String custName;

    /** 负责人id */
    private Long custUserId;

    /** 创建人id */
    private Long custCreateId;

    /** 客户信息来源 */
    private String custSource;

    /** 客户所属行业 */
    private String custIndustry;

    /** 客户级别 */
    private String custLevel;

    /** 联系人 */
    private String custLinkman;

    /** 固定电话 */
    private String custPhone;

    /** 移动电话 */
    private String custMobile;

    /**
     * 获取客户编号(主键)
     * 
     * @return 客户编号(主键)
     */
    public Long getCustId() {
        return this.custId;
    }

    /**
     * 设置客户编号(主键)
     * 
     * @param custId
     *          客户编号(主键)
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * 获取客户名称(公司名称)
     * 
     * @return 客户名称(公司名称)
     */
    public String getCustName() {
        return this.custName;
    }

    /**
     * 设置客户名称(公司名称)
     * 
     * @param custName
     *          客户名称(公司名称)
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取负责人id
     * 
     * @return 负责人id
     */
    public Long getCustUserId() {
        return this.custUserId;
    }

    /**
     * 设置负责人id
     * 
     * @param custUserId
     *          负责人id
     */
    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    /**
     * 获取创建人id
     * 
     * @return 创建人id
     */
    public Long getCustCreateId() {
        return this.custCreateId;
    }

    /**
     * 设置创建人id
     * 
     * @param custCreateId
     *          创建人id
     */
    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    /**
     * 获取客户信息来源
     * 
     * @return 客户信息来源
     */
    public String getCustSource() {
        return this.custSource;
    }

    /**
     * 设置客户信息来源
     * 
     * @param custSource
     *          客户信息来源
     */
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    /**
     * 获取客户所属行业
     * 
     * @return 客户所属行业
     */
    public String getCustIndustry() {
        return this.custIndustry;
    }

    /**
     * 设置客户所属行业
     * 
     * @param custIndustry
     *          客户所属行业
     */
    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    /**
     * 获取客户级别
     * 
     * @return 客户级别
     */
    public String getCustLevel() {
        return this.custLevel;
    }

    /**
     * 设置客户级别
     * 
     * @param custLevel
     *          客户级别
     */
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    /**
     * 获取联系人
     * 
     * @return 联系人
     */
    public String getCustLinkman() {
        return this.custLinkman;
    }

    /**
     * 设置联系人
     * 
     * @param custLinkman
     *          联系人
     */
    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    /**
     * 获取固定电话
     * 
     * @return 固定电话
     */
    public String getCustPhone() {
        return this.custPhone;
    }

    /**
     * 设置固定电话
     * 
     * @param custPhone
     *          固定电话
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    /**
     * 获取移动电话
     * 
     * @return 移动电话
     */
    public String getCustMobile() {
        return this.custMobile;
    }

    /**
     * 设置移动电话
     * 
     * @param custMobile
     *          移动电话
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }
}