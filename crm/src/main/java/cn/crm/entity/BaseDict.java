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
**类  名：BaseDict
**描  述：
**创建者：changsheng-yu
**创建时间：2019-11-0811:22:29
****************************************************************/

package cn.crm.entity;

/**
*(base_dict)
*
*@author changsheng-yu
*/
public class BaseDict implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7379037810301801593L;

    /** 数据字典id(主键) */
    private Long dictId;

    /** 数据字典类别代码 */
    private String dictTypeCode;

    /** 数据字典类别名称 */
    private String dictTypeName;

    /** 数据字典项目名称 */
    private String dictItemName;

    /** 数据字典项目(可为空) */
    private String dictItemCode;

    /** 排序字段 */
    private Integer dictSort;

    /** 1:使用 0:停用 */
    private Integer dictEnable;

    /** 备注 */
    private String dictMemo;

    /**
     * 获取数据字典id(主键)
     * 
     * @return 数据字典id(主键)
     */
    public Long getDictId() {
        return this.dictId;
    }

    /**
     * 设置数据字典id(主键)
     * 
     * @param dictId
     *          数据字典id(主键)
     */
    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    /**
     * 获取数据字典类别代码
     * 
     * @return 数据字典类别代码
     */
    public String getDictTypeCode() {
        return this.dictTypeCode;
    }

    /**
     * 设置数据字典类别代码
     * 
     * @param dictTypeCode
     *          数据字典类别代码
     */
    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    /**
     * 获取数据字典类别名称
     * 
     * @return 数据字典类别名称
     */
    public String getDictTypeName() {
        return this.dictTypeName;
    }

    /**
     * 设置数据字典类别名称
     * 
     * @param dictTypeName
     *          数据字典类别名称
     */
    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    /**
     * 获取数据字典项目名称
     * 
     * @return 数据字典项目名称
     */
    public String getDictItemName() {
        return this.dictItemName;
    }

    /**
     * 设置数据字典项目名称
     * 
     * @param dictItemName
     *          数据字典项目名称
     */
    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    /**
     * 获取数据字典项目(可为空)
     * 
     * @return 数据字典项目(可为空)
     */
    public String getDictItemCode() {
        return this.dictItemCode;
    }

    /**
     * 设置数据字典项目(可为空)
     * 
     * @param dictItemCode
     *          数据字典项目(可为空)
     */
    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    /**
     * 获取排序字段
     * 
     * @return 排序字段
     */
    public Integer getDictSort() {
        return this.dictSort;
    }

    /**
     * 设置排序字段
     * 
     * @param dictSort
     *          排序字段
     */
    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    /**
     * 获取1:使用 0:停用
     * 
     * @return 1:使用 0:停用
     */
    public Integer getDictEnable() {
        return this.dictEnable;
    }

    /**
     * 设置1:使用 0:停用
     * 
     * @param dictEnable
     *          1:使用 0:停用
     */
    public void setDictEnable(Integer dictEnable) {
        this.dictEnable = dictEnable;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getDictMemo() {
        return this.dictMemo;
    }

    /**
     * 设置备注
     * 
     * @param dictMemo
     *          备注
     */
    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }
}