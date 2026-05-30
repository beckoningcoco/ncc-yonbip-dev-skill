# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeploy | pk_redeploy | pk_redeploy | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | busistatus | busistatus | busistatus | number(38, 0) |
| 9 | commitdate | commitdate | commitdate | char(19) |
| 10 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 11 | disableflag | disableflag | disableflag | char(1) |
| 12 | glcrate | glcrate | glcrate | number(28, 8) |
| 13 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 14 | glcsumreckonamount | glcsumreckonamount | glcsumreckonamount | number(28, 8) |
| 15 | glcsumreckoninterest | glcsumreckoninterest | glcsumreckoninterest | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 18 | gllcsumreckonamount | gllcsumreckonamount | gllcsumreckonamount | number(28, 8) |
| 19 | gllcsumreckoninterest | gllcsumreckoninterest | gllcsumreckoninterest | number(28, 8) |
| 20 | olcrate | olcrate | olcrate | number(28, 8) |
| 21 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 22 | olcsumreckonamount | olcsumreckonamount | olcsumreckonamount | number(28, 8) |
| 23 | olcsumreckoninterest | olcsumreckoninterest | olcsumreckoninterest | number(28, 8) |
| 24 | outputflag | outputflag | outputflag | char(1) |
| 25 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_inorg | pk_inorg | pk_inorg | varchar2(20) |  |  | '~' |
| 31 | pk_inorg_fbacc | pk_inorg_fbacc | pk_inorg_fbacc | varchar2(20) |  |  | '~' |
| 32 | pk_inorg_inneracc | pk_inorg_inneracc | pk_inorg_inneracc | varchar2(20) |  |  | '~' |
| 33 | pk_inorg_v | pk_inorg_v | pk_inorg_v | varchar2(20) |  |  | '~' |
| 34 | pk_inpayorg | pk_inpayorg | pk_inpayorg | varchar2(20) |  |  | '~' |
| 35 | pk_inpayorg_inneracc | pk_inpayorg_inneracc | pk_inpayorg_inneracc | varchar2(20) |  |  | '~' |
| 36 | pk_inpayorg_v | pk_inpayorg_v | pk_inpayorg_v | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | reckonamount | reckonamount | reckonamount | number(28, 8) |
| 40 | reckondate | reckondate | reckondate | char(19) |
| 41 | redeploydate | redeploydate | redeploydate | char(19) |
| 42 | redeployflag | redeployflag | redeployflag | char(1) |
| 43 | remark | remark | remark | varchar2(181) |
| 44 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 45 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 46 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 47 | saga_status | saga_status | saga_status | number(38, 0) |
| 48 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 49 | sumreckoninterest | sumreckoninterest | sumreckoninterest | number(28, 8) |
| 50 | vbillno | vbillno | vbillno | varchar2(50) |
| 51 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 52 | voucherdate | voucherdate | voucherdate | char(19) |
| 53 | voucherflag | voucherflag | voucherflag | char(1) |
| 54 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 55 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 56 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 57 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 58 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 59 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 60 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 61 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 62 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 63 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 64 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 65 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 66 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 67 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 68 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 69 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 70 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 71 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 72 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 73 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 74 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 75 | creationtime | creationtime | creationtime | char(19) |
| 76 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 80 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |