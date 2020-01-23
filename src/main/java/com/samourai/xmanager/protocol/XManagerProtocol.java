package com.samourai.xmanager.protocol;

public class XManagerProtocol {
  /** Current protocol version. */
  public static final String PROTOCOL_VERSION = "0.1";

  /** Header specifying the protocol version. */
  public static final String HEADER_PROTOCOL_VERSION = "xmanagerVersion";

  private static XManagerProtocol instance;

  private XManagerProtocol() {}

  public static XManagerProtocol getInstance() {
    if (instance == null) {
      instance = new XManagerProtocol();
    }
    return instance;
  }
}
