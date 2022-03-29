// Create an MMS proxy address with a hostname. A network might not be
 // available, so supply a placeholder (0.0.0.0) IPv4 address to avoid DNS lookup.
 String host = "mms.example.com";
 byte[] ipAddress = new byte[4];
 InetAddress mmsProxy;
 try {
   mmsProxy = InetAddress.getByAddress(host, ipAddress);
 } catch (UnknownHostException e) {
   e.printStackTrace();
   return;
 }

 ApnSetting apn = new ApnSetting.Builder()
     .setApnTypeBitmask(ApnSetting.TYPE_DEFAULT | ApnSetting.TYPE_MMS)
     .setApnName("apn.example.com")
     .setEntryName("Example Carrier APN")
     .setMmsc(Uri.parse("http://mms.example.com:8002"))
     .setMmsProxyAddress(mmsProxy)
     .setMmsProxyPort(8799)
     .build();
