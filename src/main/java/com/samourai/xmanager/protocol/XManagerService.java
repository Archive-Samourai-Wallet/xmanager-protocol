package com.samourai.xmanager.protocol;

public enum XManagerService {
  XM000("bc1q6c4ss40ksxah386x6pn3avf8cn2ehp2v8fpekt", "tb1q6m3urxjc8j2l8fltqj93jarmzn0975nnxuymnx"),
  XM001("bc1qxx6ac3nmnwvejhhd45jeja8zghrnn5pefa76yv", "tb1q6y29zmgw2ajgmqrnpqrf0ejtyrqsh3ehd6wjlk"),
  XM003("bc1q6qv8mp9cupws478rlhdvvs02q5ws9ty8l307d6", "tb1qh4w64gvlkpfrhre503ed8unzzstd5vyl9x0am9"),
  XM004("bc1q5krzyysl04eaa0aqazn5z54aqvadhy06l4mr63", "tb1q6y29zmgw2ajgmqrnpqrf0ejtyrqsh3ehd6wjlk"),
  XM005("bc1qsdjyew2qpetjnexhfgsz3em5zc2g0x3gf2nhqk", "tb1q6y29zmgw2ajgmqrnpqrf0ejtyrqsh3ehd6wjlk"),
  XM006("3MiGEhAJH3QkJ5h84UahDBU3PzELyxuzZx", "tb1q6y29zmgw2ajgmqrnpqrf0ejtyrqsh3ehd6wjlk");

  private String defaultAddressMainnet;
  private String defaultAddressTestnet;

  private XManagerService(String defaultAddressMainnet, String defaultAddressTestnet) {
    this.defaultAddressMainnet = defaultAddressMainnet;
    this.defaultAddressTestnet = defaultAddressTestnet;
  }

  public String getDefaultAddressMainnet() {
    return defaultAddressMainnet;
  }

  public String getDefaultAddressTestnet() {
    return defaultAddressTestnet;
  }

  public String getDefaultAddress(boolean testnet) {
    return testnet ? defaultAddressTestnet : defaultAddressMainnet;
  }
}
