# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpackbillid | cpackbillid | cpackbillid | char(20) | √ |
| 2 | bpackbillflag | bpackbillflag | bpackbillflag | char(1) |
| 3 | casscustid | casscustid | casscustid | varchar2(20) |  |  | '~' |
| 4 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 5 | cbodywarehouseid | cbodywarehouseid | cbodywarehouseid | varchar2(20) |  |  | '~' |
| 6 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 7 | cffileid | cffileid | cffileid | varchar2(20) |  |  | '~' |
| 8 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 9 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 10 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 11 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 12 | corpvid | corpvid | corpvid | varchar2(20) |  |  | '~' |
| 13 | cpackbillhid | cpackbillhid | cpackbillhid | char(20) | √ |
| 14 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 15 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 16 | csourcebillbid | csourcebillbid | csourcebillbid | varchar2(20) |
| 17 | csourcebillhid | csourcebillhid | csourcebillhid | varchar2(20) |
| 18 | csourcetype | csourcetype | csourcetype | varchar2(20) |  |  | '~' |
| 19 | cstateid | cstateid | cstateid | varchar2(20) |  |  | '~' |
| 20 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 21 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 22 | dpackdate | dpackdate | dpackdate | char(19) |
| 23 | nbarnum | nbarnum | nbarnum | number(28, 8) |
| 24 | npackagenum | npackagenum | npackagenum | number(28, 8) |
| 25 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_serialcode | pk_serialcode | pk_serialcode | varchar2(20) |
| 30 | vbarcode | vbarcode | vbarcode | varchar2(128) |
| 31 | vbarcodesub | vbarcodesub | vbarcodesub | varchar2(50) |
| 32 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 33 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 34 | vnotebody | vnotebody | vnotebody | varchar2(181) |
| 35 | vpackcode | vpackcode | vpackcode | varchar2(50) |
| 36 | vpickbillcode | vpickbillcode | vpickbillcode | varchar2(40) |
| 37 | vserialcode | vserialcode | vserialcode | varchar2(128) |
| 38 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 39 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 40 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 41 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 42 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 43 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 44 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 45 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 46 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 47 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |