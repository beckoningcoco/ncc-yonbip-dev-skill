# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerkeepapply | pk_innerkeepapply | pk_innerkeepapply | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 4 | applydate | applydate | applydate | char(19) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(1024) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | approvetime | approvetime | approvetime | char(19) |
| 9 | billmakedate | billmakedate | billmakedate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 12 | busistatus | busistatus | busistatus | number(38, 0) |
| 13 | commitdate | commitdate | commitdate | char(19) |
| 14 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 15 | glcrate | glcrate | glcrate | number(28, 8) |
| 16 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 17 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 18 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 19 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 20 | initflag | initflag | initflag | char(1) |
| 21 | innerkeepappplan | innerkeepappplan | innerkeepappplan | varchar2(20) |  |  | '~' |
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
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 35 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 36 | remark | remark | remark | varchar2(181) |
| 37 | returndate | returndate | returndate | char(19) |
| 38 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 39 | returnreason | returnreason | returnreason | varchar2(181) |
| 40 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 41 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 42 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 43 | saga_status | saga_status | saga_status | number(38, 0) |
| 44 | submitdate | submitdate | submitdate | char(19) |
| 45 | submittor | submittor | submittor | varchar2(20) |  |  | '~' |
| 46 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 47 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 48 | trusttype | trusttype | trusttype | varchar2(50) |
| 49 | vbillno | vbillno | vbillno | varchar2(50) |
| 50 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 51 | voucherdate | voucherdate | voucherdate | char(19) |
| 52 | voucherflag | voucherflag | voucherflag | char(1) |
| 53 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 54 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 55 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 56 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 57 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 58 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 59 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 60 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 61 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 62 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 63 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 64 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 65 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 66 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 67 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 68 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 69 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 70 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 71 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 72 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 73 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 74 | creationtime | creationtime | creationtime | char(19) |
| 75 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 76 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 77 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 78 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 79 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |