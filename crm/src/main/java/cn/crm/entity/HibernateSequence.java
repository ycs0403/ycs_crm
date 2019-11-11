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
**类  名：HibernateSequence
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(hibernate_sequence)
*
*@author changsheng-yu
*/
public class HibernateSequence implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8370027860987292108L;

    /** nextVal */
    private Long nextVal;

    /**
     * 获取nextVal
     * 
     * @return nextVal
     */
    public Long getNextVal() {
        return this.nextVal;
    }

    /**
     * 设置nextVal
     * 
     * @param nextVal
     */
    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }
}