# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerkeep | pk_innerkeep | pk_innerkeep | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 4 | applydate | applydate | applydate | char(19) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(1024) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | approvetime | approvetime | approvetime | char(19) |
| 9 | autoreceive | autoreceive | autoreceive | char(1) |
| 10 | billmakedate | billmakedate | billmakedate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 13 | busistatus | busistatus | busistatus | number(38, 0) |
| 14 | glcrate | glcrate | glcrate | number(28, 8) |
| 15 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 18 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 19 | initflag | initflag | initflag | char(1) |
| 20 | innerkeepplan | innerkeepplan | innerkeepplan | varchar2(20) |  |  | '~' |
| 21 | inpooldate | inpooldate | inpooldate | char(19) |
| 22 | keepdate | keepdate | keepdate | char(19) |
| 23 | olcrate | olcrate | olcrate | number(28, 8) |
| 24 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 25 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 29 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_inputorg | pk_inputorg | pk_inputorg | varchar2(20) |  |  | '~' |
| 32 | pk_inputorg_v | pk_inputorg_v | pk_inputorg_v | varchar2(20) |  |  | '~' |
| 33 | pk_keepunit | pk_keepunit | pk_keepunit | varchar2(20) |  |  | '~' |
| 34 | pk_keepunit_v | pk_keepunit_v | pk_keepunit_v | varchar2(20) |  |  | '~' |
| 35 | pk_occupyctmanage | pk_occupyctmanage | pk_occupyctmanage | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 39 | rateversion | rateversion | rateversion | number(38, 0) |
| 40 | receivedate | receivedate | receivedate | char(19) |
| 41 | remark | remark | remark | varchar2(181) |
| 42 | returndate | returndate | returndate | char(19) |
| 43 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 44 | returnreason | returnreason | returnreason | varchar2(181) |
| 45 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 46 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 47 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 48 | saga_status | saga_status | saga_status | number(38, 0) |
| 49 | submitdate | submitdate | submitdate | char(19) |
| 50 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 51 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 52 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 53 | trusttype | trusttype | trusttype | varchar2(50) |
| 54 | vbillno | vbillno | vbillno | varchar2(50) |
| 55 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 56 | voucherdate | voucherdate | voucherdate | char(19) |
| 57 | voucherflag | voucherflag | voucherflag | char(1) |
| 58 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 59 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 60 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 61 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 62 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 63 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 64 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 65 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 66 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 67 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 68 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 69 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 70 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 71 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 72 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 73 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 74 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 75 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 76 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 77 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 78 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 79 | creationtime | creationtime | creationtime | char(19) |
| 80 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 81 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 82 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 83 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 84 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |