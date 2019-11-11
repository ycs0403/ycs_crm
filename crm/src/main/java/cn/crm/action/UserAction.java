package cn.crm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.crm.biz.IUserBiz;
import cn.crm.entity.SysUser;

/**
 * @ClassName: UserAction
 * @author: ycs
 * @date: 2019年11月10日 下午9:35:46 
 * @Description:UserAction层
 */
public class UserAction extends ActionSupport implements ModelDriven<SysUser>{

	private IUserBiz iUserBiz;

	public void setiUserBiz(IUserBiz iUserBiz) {
		this.iUserBiz = iUserBiz;
	}

	private SysUser sysUser=new SysUser();//模型驱动使用的对象

	@Override
	public SysUser getModel() {
		// TODO Auto-generated method stub
		return sysUser;
	}

	/**   
	 * @Title: login   
	 * @Description: 注册
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String regist() {
		System.out.println("进入------") ;
		iUserBiz.regist(sysUser);
		return LOGIN;
	}


}
