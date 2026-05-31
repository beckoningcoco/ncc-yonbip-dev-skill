# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_onhanddim | pk_onhanddim | pk_onhanddim | char(20) | √ |
| 2 | casscustid | casscustid | casscustid | varchar2(20) |  |  | '~' |
| 3 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 4 | cffileid | cffileid | cffileid | varchar2(20) |  |  | '~' |
| 5 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 6 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 7 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 8 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 9 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 10 | cstateid | cstateid | cstateid | varchar2(20) |  |  | '~' |
| 11 | ctplcustomerid | ctplcustomerid | ctplcustomerid | varchar2(20) |  |  | '~' |
| 12 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 13 | cvmivenderid | cvmivenderid | cvmivenderid | varchar2(20) |  |  | '~' |
| 14 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) | √ |
| 15 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | char(20) | √ |
| 17 | pk_org | pk_org | pk_org | char(20) | √ |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 20 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 21 | vhashcode | vhashcode | vhashcode | varchar2(100) | √ |
| 22 | vsubhashcode | vsubhashcode | vsubhashcode | varchar2(100) | √ |
| 23 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 24 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 25 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 26 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 27 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 28 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 29 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 30 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 31 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 32 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |