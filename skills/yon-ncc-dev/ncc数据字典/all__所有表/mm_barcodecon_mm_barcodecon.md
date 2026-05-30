# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodecon | pk_barcodecon | pk_barcodecon | char(20) | √ |
| 2 | bshowpickm | bshowpickm | bshowpickm | char(1) |
| 3 | cbillbid | cbillbid | cbillbid | char(20) |
| 4 | cbillgid | cbillgid | cbillgid | char(20) |
| 5 | cbillhid | cbillhid | cbillhid | char(20) |
| 6 | ccustmaterialid | ccustmaterialid | ccustmaterialid | varchar2(20) |  |  | '~' |
| 7 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 8 | cdeliveryorgid | cdeliveryorgid | cdeliveryorgid | varchar2(20) |  |  | '~' |
| 9 | cdeliveryorgvid | cdeliveryorgvid | cdeliveryorgvid | varchar2(20) |  |  | '~' |
| 10 | cdeliverystockid | cdeliverystockid | cdeliverystockid | varchar2(20) |  |  | '~' |
| 11 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 12 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 13 | cffileid | cffileid | cffileid | varchar2(20) |
| 14 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 15 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 16 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 17 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 18 | cshiftid | cshiftid | cshiftid | varchar2(20) |  |  | '~' |
| 19 | cteamid | cteamid | cteamid | varchar2(20) |  |  | '~' |
| 20 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 21 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 22 | cworkman | cworkman | cworkman | varchar2(20) |  |  | '~' |
| 23 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 24 | fscanbilltype | fscanbilltype | fscanbilltype | number(38, 0) |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | vbatchcode | vbatchcode | vbatchcode | varchar2(60) |
| 29 | vbatchid | vbatchid | vbatchid | varchar2(50) |  |  | '~' |
| 30 | vbillbarcode | vbillbarcode | vbillbarcode | varchar2(60) |
| 31 | vbillcode | vbillcode | vbillcode | varchar2(60) |
| 32 | vrccode | vrccode | vrccode | varchar2(60) |
| 33 | vrctypeid | vrctypeid | vrctypeid | varchar2(20) |  |  | '~' |
| 34 | vrowno | vrowno | vrowno | varchar2(60) |
| 35 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 36 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 37 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 38 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 39 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 40 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 41 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 42 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 43 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 44 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |