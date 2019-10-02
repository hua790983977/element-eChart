package com.java110.web.components.ownerRepair;

import com.java110.core.context.IPageData;
import com.java110.web.smo.ownerRepair.IAddOwnerRepairSMO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * 添加业主报修组件
 */
@Component("addOwnerRepair")
public class AddOwnerRepairComponent {

    @Autowired
    private IAddOwnerRepairSMO addOwnerRepairSMOImpl;

    /**
     * 添加业主报修数据
     * @param pd 页面数据封装
     * @return ResponseEntity 对象
     */
    public ResponseEntity<String> save(IPageData pd){
        return addOwnerRepairSMOImpl.saveOwnerRepair(pd);
    }

    public IAddOwnerRepairSMO getAddOwnerRepairSMOImpl() {
        return addOwnerRepairSMOImpl;
    }

    public void setAddOwnerRepairSMOImpl(IAddOwnerRepairSMO addOwnerRepairSMOImpl) {
        this.addOwnerRepairSMOImpl = addOwnerRepairSMOImpl;
    }
}