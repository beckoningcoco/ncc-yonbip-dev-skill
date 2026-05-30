# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execadj | pk_execadj | pk_execadj | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | ccamount | ccamount | ccamount | number(28, 8) |
| 9 | execadjstatus | execadjstatus | execadjstatus | varchar2(50) |
| 10 | glcmny | glcmny | glcmny | number(28, 8) |
| 11 | glcrate | glcrate | glcrate | number(15, 8) |
| 12 | gllcmny | gllcmny | gllcmny | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 14 | interactfield | interactfield | interactfield | varchar2(1025) |
| 15 | olcmny | olcmny | olcmny | number(28, 8) |
| 16 | olcrate | olcrate | olcrate | number(15, 8) |
| 17 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 18 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 20 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 21 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 22 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_protocol | pk_protocol | pk_protocol | varchar2(20) |  |  | '~' |
| 29 | pk_usecompany | pk_usecompany | pk_usecompany | varchar2(20) |  |  | '~' |
| 30 | protocoltype | protocoltype | protocoltype | number(38, 0) |
| 31 | remark | remark | remark | varchar2(181) |
| 32 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 33 | updatedir | updatedir | updatedir | varchar2(50) |
| 34 | vbillno | vbillno | vbillno | varchar2(40) |
| 35 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 36 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 37 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 38 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 39 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 40 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 41 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 42 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 43 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 44 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 45 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 46 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 47 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 48 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 49 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 50 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 51 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 52 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 53 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 54 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 55 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |