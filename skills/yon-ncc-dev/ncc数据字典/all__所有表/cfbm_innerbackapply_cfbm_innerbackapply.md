# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerbackapply | pk_innerbackapply | pk_innerbackapply | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 4 | applydate | applydate | applydate | char(19) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(1024) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | backdate | backdate | backdate | char(19) |
| 9 | billmakedate | billmakedate | billmakedate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billmaketime | billmaketime | billmaketime | char(19) |
| 12 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 13 | billpoolreturnflag | billpoolreturnflag | billpoolreturnflag | char(1) |
| 14 | busistatus | busistatus | busistatus | number(38, 0) |  |  | -1 |
| 15 | commitdate | commitdate | commitdate | char(19) |
| 16 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 17 | glcrate | glcrate | glcrate | number(28, 8) |
| 18 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 20 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 8) |
| 21 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 22 | innerbackappplan | innerbackappplan | innerbackappplan | varchar2(20) |  |  | '~' |
| 23 | modifer | modifer | modifer | varchar2(20) |  |  | '~' |
| 24 | olcrate | olcrate | olcrate | number(28, 8) |
| 25 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 8) |
| 26 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 27 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 30 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_innerfbacc | pk_innerfbacc | pk_innerfbacc | varchar2(20) |  |  | '~' |
| 33 | pk_inputorg | pk_inputorg | pk_inputorg | varchar2(20) |  |  | '~' |
| 34 | pk_inputorg_v | pk_inputorg_v | pk_inputorg_v | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 38 | remark | remark | remark | varchar2(181) |
| 39 | returndate | returndate | returndate | char(19) |
| 40 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 41 | returnreason | returnreason | returnreason | varchar2(181) |
| 42 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 43 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 44 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 45 | saga_status | saga_status | saga_status | number(38, 0) |
| 46 | submitdate | submitdate | submitdate | char(19) |
| 47 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 48 | sumbillamount | sumbillamount | sumbillamount | number(28, 8) |
| 49 | tallydate | tallydate | tallydate | char(19) |
| 50 | tallyflag | tallyflag | tallyflag | char(1) |
| 51 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
| 52 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 53 | trusttype | trusttype | trusttype | varchar2(50) |
| 54 | vbillno | vbillno | vbillno | varchar2(50) |
| 55 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |  |  | -1 |
| 56 | voucherdate | voucherdate | voucherdate | char(19) |
| 57 | voucherflag | voucherflag | voucherflag | char(1) |
| 58 | voucherid | voucherid | voucherid | varchar2(20) |  |  | '~' |
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
| 83 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |