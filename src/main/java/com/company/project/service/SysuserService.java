package com.company.project.service;
import com.company.project.model.Sysuser;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/05/04.
 */
public interface SysuserService extends Service<Sysuser> {
   public  Sysuser findUsernameByLogin(Sysuser sysuser);
}
