package com.github.Evgenn91.controller;

import com.github.Evgenn91.dto.AdressDto;
import com.github.Evgenn91.dto.PledgeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerr {

    @GetMapping("/address")
    public List<AdressDto> getAddresses() {
        List<AdressDto> addresses = new ArrayList<>();
        addresses.add(getAdres());
        addresses.add(getAdres());
        addresses.add(getAdres());
        return addresses;
    }

    private AdressDto getAdres(){
        AdressDto adress = new AdressDto();
        adress.setAddress("г. Екатеринбург, ул. Стахановская, д. 4, кв. 55");
        adress.setLombardName("Ломбард №3");
        return adress;
    }

    @GetMapping("/pledge")
    public List<PledgeDto> getPledges() {
        List<PledgeDto> pledges = new ArrayList<>();
        pledges.add(getPledge());
        pledges.add(getPledge());
        pledges.add(getPledge());
        return pledges;
    }

    private PledgeDto getPledge(){
        PledgeDto pledge = new PledgeDto();
        pledge.setGuid("1432414");
        pledge.setGlobalGuid("324sfe");
        pledge.setLoan("1233");
        pledge.setDebt("214");
        return pledge;
    }
}
