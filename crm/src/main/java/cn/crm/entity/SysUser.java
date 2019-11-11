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
**类  名：SysUser
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(sys_user)
*
*@author changsheng-yu
*/
public class SysUser implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7329781885478404099L;

    /** 用户id */
    private Long userId;

    /** 用户账号 */
    private String userCode;

    /** 用户名称 */
    private String userName;

    /** 用户密码 */
    private String userPassword;

    /** 1:正常,0:暂停 */
    private Integer userState;

    /**
     * 获取用户id
     * 
     * @return 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 设置用户id
     * 
     * @param userId
     *          用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户账号
     * 
     * @return 用户账号
     */
    public String getUserCode() {
        return this.userCode;
    }

    /**
     * 设置用户账号
     * 
     * @param userCode
     *          用户账号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取用户名称
     * 
     * @return 用户名称
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置用户名称
     * 
     * @param userName
     *          用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     * 
     * @return 用户密码
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * 设置用户密码
     * 
     * @param userPassword
     *          用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取1:正常,0:暂停
     * 
     * @return 1:正常
     */
    public Integer getUserState() {
        return this.userState;
    }

    /**
     * 设置1:正常,0:暂停
     * 
     * @param userState
     *          1:正常
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }
}