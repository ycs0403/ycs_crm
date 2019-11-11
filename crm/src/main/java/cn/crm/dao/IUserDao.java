package cn.crm.dao;

import cn.crm.entity.SysUser;

/**
* @ClassName: IUserDao
* @author: ycs
* @date: 2019年11月10日 下午9:27:20 
* @Description:UserDao层接口
*/
public interface IUserDao {

	/**   
	 * @Title: getUser   
	 * @Description: 用户登录 
	 * @param: @param userId
	 * @param: @return      
	 * @return: SysUser      
	 * @throws   
	 */  
	void save(SysUser sysUser);
}
