package com.vlad.web.dvdrental.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
    private long addressId;
    private String address;
    private String address2;
    private String district;
    private int cityId;
    private String postelCode;
    private String phone;
    private String lastUpdate;

    public AddressDTO(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public AddressDTO(String address, String address2, String district, int cityId, String postelCode, String phone) {
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.cityId = cityId;
        this.postelCode = postelCode;
        this.phone = phone;
    }
}
