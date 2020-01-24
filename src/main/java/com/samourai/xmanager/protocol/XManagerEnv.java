package com.samourai.xmanager.protocol;

public enum XManagerEnv {
  MAINNET("https://xm.samourai.io:8080"),
  TESTNET("https://xm.samourai.io:8081");

  private String urlClear;

  XManagerEnv(String urlClear) {
    this.urlClear = urlClear;
  }

  public String getUrlClear() {
    return urlClear;
  }

  public static XManagerEnv get(boolean isTestnet) {
    return isTestnet ? XManagerEnv.TESTNET : XManagerEnv.MAINNET;
  }
}
