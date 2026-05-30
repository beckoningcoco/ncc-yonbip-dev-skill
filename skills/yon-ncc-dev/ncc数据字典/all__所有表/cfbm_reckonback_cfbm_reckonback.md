# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7519.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reckonback | pk_reckonback | pk_reckonback | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | busistatus | busistatus | busistatus | number(38, 0) |
| 8 | fundorginterest | fundorginterest | fundorginterest | char(1) |
| 9 | glcrate | glcrate | glcrate | number(28, 8) |
| 10 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 11 | glcsumreckonamount | glcsumreckonamount | glcsumreckonamount | number(28, 8) |
| 12 | glcsumreckoninterest | glcsumreckoninterest | glcsumreckoninterest | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 14 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 15 | gllcsumreckonamount | gllcsumreckonamount | gllcsumreckonamount | number(28, 8) |
| 16 | gllcsumreckoninterest | gllcsumreckoninterest | gllcsumreckoninterest | number(28, 8) |
| 17 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 18 | olcrate | olcrate | olcrate | number(28, 8) |
| 19 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 20 | olcsumreckonamount | olcsumreckonamount | olcsumreckonamount | number(28, 8) |
| 21 | olcsumreckoninterest | olcsumreckoninterest | olcsumreckoninterest | number(28, 8) |
| 22 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 23 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_inneracc | pk_inneracc | pk_inneracc | varchar2(20) |  |  | '~' |
| 27 | pk_inorg | pk_inorg | pk_inorg | varchar2(20) |  |  | '~' |
| 28 | pk_inorg_inneracc | pk_inorg_inneracc | pk_inorg_inneracc | varchar2(20) |  |  | '~' |
| 29 | pk_inorg_v | pk_inorg_v | pk_inorg_v | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | pk_outorg | pk_outorg | pk_outorg | varchar2(20) |  |  | '~' |
| 33 | pk_outorg_fbacc | pk_outorg_fbacc | pk_outorg_fbacc | varchar2(20) |  |  | '~' |
| 34 | pk_outorg_inneracc | pk_outorg_inneracc | pk_outorg_inneracc | varchar2(20) |  |  | '~' |
| 35 | pk_outorg_v | pk_outorg_v | pk_outorg_v | varchar2(20) |  |  | '~' |
| 36 | pk_prereckonorg | pk_prereckonorg | pk_prereckonorg | varchar2(20) |  |  | '~' |
| 37 | pk_prereckonorg_v | pk_prereckonorg_v | pk_prereckonorg_v | varchar2(20) |  |  | '~' |
| 38 | pk_reckonacc | pk_reckonacc | pk_reckonacc | varchar2(20) |  |  | '~' |
| 39 | pk_reckonorg | pk_reckonorg | pk_reckonorg | varchar2(20) |  |  | '~' |
| 40 | pk_reckonorg_v | pk_reckonorg_v | pk_reckonorg_v | varchar2(20) |  |  | '~' |
| 41 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 42 | reckonbackamountplan | reckonbackamountplan | reckonbackamountplan | varchar2(20) |  |  | '~' |
| 43 | reckonbackintplan | reckonbackintplan | reckonbackintplan | varchar2(20) |  |  | '~' |
| 44 | reckondate | reckondate | reckondate | char(19) |
| 45 | reckon_direction | reckon_direction | reckon_direction | number(38, 0) |
| 46 | remark | remark | remark | varchar2(181) |
| 47 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 48 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 49 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 50 | saga_status | saga_status | saga_status | number(38, 0) |
| 51 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 52 | sumreckonamount | sumreckonamount | sumreckonamount | number(28, 8) |
| 53 | sumreckoninterest | sumreckoninterest | sumreckoninterest | number(28, 8) |
| 54 | tallydate | tallydate | tallydate | char(19) |
| 55 | tallyflag | tallyflag | tallyflag | char(1) |
| 56 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
| 57 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 58 | vbillno | vbillno | vbillno | varchar2(50) |
| 59 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 60 | voucherdate | voucherdate | voucherdate | char(19) |
| 61 | voucherflag | voucherflag | voucherflag | char(1) |
| 62 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 63 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 64 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 65 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 66 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 67 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 68 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 69 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 70 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 71 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 72 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 73 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 74 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 75 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 76 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 77 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 78 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 79 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 80 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 81 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 82 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 83 | creationtime | creationtime | creationtime | char(19) |
| 84 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 85 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 86 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 87 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 88 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |