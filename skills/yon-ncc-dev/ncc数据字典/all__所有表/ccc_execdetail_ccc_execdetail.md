# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execdetail | pk_execdetail | pk_execdetail | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | busiamt | busiamt | busiamt | number(28, 8) |
| 9 | busidate | busidate | busidate | char(19) |
| 10 | businesstype | businesstype | businesstype | varchar2(50) |
| 11 | ccleftamt | ccleftamt | ccleftamt | number(28, 8) |
| 12 | ccprotocoltype | ccprotocoltype | ccprotocoltype | number(38, 0) |
| 13 | ccreleaseamt | ccreleaseamt | ccreleaseamt | number(28, 8) |
| 14 | ccuseamt | ccuseamt | ccuseamt | number(28, 8) |
| 15 | execadjstatus | execadjstatus | execadjstatus | varchar2(50) |
| 16 | glcccreleaseamt | glcccreleaseamt | glcccreleaseamt | number(28, 8) |
| 17 | glcccuseamt | glcccuseamt | glcccuseamt | number(28, 8) |
| 18 | glcrate | glcrate | glcrate | number(15, 8) |
| 19 | gllcccreleaseamt | gllcccreleaseamt | gllcccreleaseamt | number(28, 8) |
| 20 | gllcccuseamt | gllcccuseamt | gllcccuseamt | number(28, 8) |
| 21 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 22 | olcbusiamt | olcbusiamt | olcbusiamt | number(28, 8) |
| 23 | olcccreleaseamt | olcccreleaseamt | olcccreleaseamt | number(28, 8) |
| 24 | olcccuseamt | olcccuseamt | olcccuseamt | number(28, 8) |
| 25 | olcrate | olcrate | olcrate | number(15, 8) |
| 26 | onlyclueno | onlyclueno | onlyclueno | varchar2(50) |
| 27 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 29 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 30 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 31 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 32 | pk_creditbank | pk_creditbank | pk_creditbank | varchar2(20) |  |  | '~' |
| 33 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 34 | pk_debitbill | pk_debitbill | pk_debitbill | varchar2(50) |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_loanbank | pk_loanbank | pk_loanbank | varchar2(20) |  |  | '~' |
| 37 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 40 | pk_protocol | pk_protocol | pk_protocol | varchar2(20) |  |  | '~' |
| 41 | pk_quotaorg | pk_quotaorg | pk_quotaorg | varchar2(20) |  |  | '~' |
| 42 | pk_quotaorg_v | pk_quotaorg_v | pk_quotaorg_v | char(20) |
| 43 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 44 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(20) |
| 45 | remark | remark | remark | varchar2(181) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |
| 50 | sourcesystem | sourcesystem | sourcesystem | varchar2(20) |  |  | '~' |
| 51 | srcoperation | srcoperation | srcoperation | number(38, 0) |
| 52 | updatedir | updatedir | updatedir | varchar2(50) |
| 53 | vbillno | vbillno | vbillno | varchar2(100) |
| 54 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
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