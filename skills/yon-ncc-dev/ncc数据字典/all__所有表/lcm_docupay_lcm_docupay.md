# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payrcpt | pk_payrcpt | pk_payrcpt | char(20) | √ |
| 2 | adjbegdate | adjbegdate | adjbegdate | char(19) |
| 3 | adjperiodunit | adjperiodunit | adjperiodunit | varchar2(50) |
| 4 | adjratemethod | adjratemethod | adjratemethod | varchar2(50) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(1024) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | businessno | businessno | businessno | varchar2(40) |
| 12 | ccamount | ccamount | ccamount | number(28, 8) |
| 13 | contractamount | contractamount | contractamount | number(28, 8) |
| 14 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 15 | effecttype | effecttype | effecttype | varchar2(50) |
| 16 | emendenum | emendenum | emendenum | number(38, 0) |
| 17 | floatratescale | floatratescale | floatratescale | number(28, 8) |
| 18 | forceacct | forceacct | forceacct | char(1) |
| 19 | glcpayamount | glcpayamount | glcpayamount | number(28, 8) |
| 20 | glcrate | glcrate | glcrate | number(15, 8) |
| 21 | gllcpayamount | gllcpayamount | gllcpayamount | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 23 | headratescale | headratescale | headratescale | number(28, 8) |
| 24 | isinitial | isinitial | isinitial | char(1) |
| 25 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 26 | olcpayamount | olcpayamount | olcpayamount | number(28, 8) |
| 27 | olcrate | olcrate | olcrate | number(15, 8) |
| 28 | overratescale | overratescale | overratescale | number(28, 8) |
| 29 | payamount | payamount | payamount | number(28, 8) |
| 30 | payaslcrepay | payaslcrepay | payaslcrepay | char(1) |
| 31 | paydate | paydate | paydate | char(19) |
| 32 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 33 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 34 | pk_busitype | pk_busitype | pk_busitype | varchar2(50) |  |  | '~' |
| 35 | pk_calendar | pk_calendar | pk_calendar | varchar2(20) |  |  | '~' |
| 36 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 37 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 38 | pk_cont_v | pk_cont_v | pk_cont_v | varchar2(50) |
| 39 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 40 | pk_debitacct | pk_debitacct | pk_debitacct | varchar2(20) |  |  | '~' |
| 41 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 42 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 44 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 45 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 46 | pk_payplan | pk_payplan | pk_payplan | varchar2(20) |  |  | '~' |
| 47 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 48 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 49 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 50 | pk_srcbill | pk_srcbill | pk_srcbill | char(20) |
| 51 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |
| 52 | pk_version | pk_version | pk_version | varchar2(20) |
| 53 | remark | remark | remark | varchar2(200) |
| 54 | returnmode | returnmode | returnmode | varchar2(50) |
| 55 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 56 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 57 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 58 | saga_status | saga_status | saga_status | number(38, 0) |
| 59 | submitdate | submitdate | submitdate | char(19) |
| 60 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 61 | transtype | transtype | transtype | varchar2(10) |
| 62 | vbillno | vbillno | vbillno | varchar2(40) |
| 63 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 64 | versionno | versionno | versionno | number(38, 0) |
| 65 | versionres | versionres | versionres | varchar2(50) |
| 66 | versiontime | versiontime | versiontime | char(19) |
| 67 | voucherflag | voucherflag | voucherflag | char(1) |
| 68 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 69 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 70 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 71 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 72 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 73 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 74 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 75 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 76 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 77 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 78 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 79 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 80 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 81 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 82 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 83 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 84 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 85 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 86 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 87 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 88 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 89 | creationtime | creationtime | creationtime | char(19) |
| 90 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 91 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 92 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 93 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 94 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |