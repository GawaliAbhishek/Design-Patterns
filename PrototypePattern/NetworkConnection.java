package PrototypePattern;

// Suppose this class take time while connecting with the network
// we have to make it clonable so implment cloneble interface

public class NetworkConnection implements Cloneable {

  private String ip;
  private String impdata;

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getImpdata() {
    return impdata;
  }

  public void setImpdata(String impdata) {
    this.impdata = impdata;
  }

  // So this will take time to load the Data
  public void loadImpData() throws InterruptedException{
    this.impdata="Hey its very Imp data";
    Thread.sleep(6000);
  }

@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

@Override
public String toString() {
    return "NetworkConnection [ip=" + ip + ", impdata=" + impdata + "]";
}

  
}
