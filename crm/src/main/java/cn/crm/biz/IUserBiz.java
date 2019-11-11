package cn.crm.biz;

import cn.crm.entity.SysUser;

/**
* @ClassName: IUserBiz
* @author: ycs
* @date: 2019年11月10日 下午9:30:29 
* @Description:IUserBiz层接口
*/
public interface IUserBiz {

	/**   
	 * @Title: getUser   
	 * @Description: 用户登录  
	 * @param: @param userId
	 * @param: @return      
	 * @return: SysUser      
	 * @throws   
	 */  
	void regist(SysUser sysUser);
}
