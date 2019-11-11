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
**类  名：SysUserDetail
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(sys_user_detail)
*
*@author changsheng-yu
*/
public class SysUserDetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5715801710354131687L;

    /** userDetailId */
    private Long userDetailId;

    /** 年龄 */
    private Integer userAge;

    /** 员工住址 */
    private String userAddr;

    /** 简历 */
    private String userResume;

    /**
     * 获取userDetailId
     * 
     * @return userDetailId
     */
    public Long getUserDetailId() {
        return this.userDetailId;
    }

    /**
     * 设置userDetailId
     * 
     * @param userDetailId
     */
    public void setUserDetailId(Long userDetailId) {
        this.userDetailId = userDetailId;
    }

    /**
     * 获取年龄
     * 
     * @return 年龄
     */
    public Integer getUserAge() {
        return this.userAge;
    }

    /**
     * 设置年龄
     * 
     * @param userAge
     *          年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取员工住址
     * 
     * @return 员工住址
     */
    public String getUserAddr() {
        return this.userAddr;
    }

    /**
     * 设置员工住址
     * 
     * @param userAddr
     *          员工住址
     */
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    /**
     * 获取简历
     * 
     * @return 简历
     */
    public String getUserResume() {
        return this.userResume;
    }

    /**
     * 设置简历
     * 
     * @param userResume
     *          简历
     */
    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }
}