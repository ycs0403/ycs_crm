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
**类  名：SysRole
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(sys_role)
*
*@author changsheng-yu
*/
public class SysRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7153652243518076770L;

    /** roleId */
    private Long roleId;

    /** 角色名称 */
    private String roleName;

    /** 备注 */
    private String roleMemo;

    /**
     * 获取roleId
     * 
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置roleId
     * 
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     * 
     * @return 角色名称
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置角色名称
     * 
     * @param roleName
     *          角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRoleMemo() {
        return this.roleMemo;
    }

    /**
     * 设置备注
     * 
     * @param roleMemo
     *          备注
     */
    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }
}