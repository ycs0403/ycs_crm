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
**类  名：SysUserRole
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(sys_user_role)
*
*@author changsheng-yu
*/
public class SysUserRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2902087618611658827L;

    /** 角色id */
    private Long roleId;

    /** 用户id */
    private Long userId;

    /**
     * 获取角色id
     * 
     * @return 角色id
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置角色id
     * 
     * @param roleId
     *          角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

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
}