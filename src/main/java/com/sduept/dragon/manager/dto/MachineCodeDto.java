package com.sduept.dragon.manager.dto;

import com.sduept.dragon.manager.entity.MachineCode;

import java.util.List;

public class MachineCodeDto {

    private Integer customerId;

    List<MachineCode> machineCodes;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<MachineCode> getMachineCodes() {
        return machineCodes;
    }

    public void setMachineCodes(List<MachineCode> machineCodes) {
        this.machineCodes = machineCodes;
    }
}
