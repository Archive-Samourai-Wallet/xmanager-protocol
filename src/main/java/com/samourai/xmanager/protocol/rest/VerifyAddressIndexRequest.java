package com.samourai.xmanager.protocol.rest;

import javax.validation.constraints.NotEmpty;

public class VerifyAddressIndexRequest {
  @NotEmpty public String id;
  @NotEmpty public String address;
  @NotEmpty public int index;

  public VerifyAddressIndexRequest() {
    super();
  }

  public VerifyAddressIndexRequest(String id, String address, int index) {
    this.id = id;
    this.address = address;
    this.index = index;
  }
}
