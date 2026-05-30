# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | busistatus | busistatus | busistatus | number(38, 0) |
| 8 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 9 | debtid | debtid | debtid | varchar2(200) |
| 10 | debttype | debttype | debttype | varchar2(20) |  |  | '~' |
| 11 | direction | direction | direction | number(38, 0) |
| 12 | enddate | enddate | enddate | char(19) |
| 13 | glcamount | glcamount | glcamount | number(28, 8) |
| 14 | glcrate | glcrate | glcrate | number(28, 8) |
| 15 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | guaconquoteno | guaconquoteno | guaconquoteno | varchar2(50) |
| 18 | guacontractid | guacontractid | guacontractid | varchar2(20) |  |  | '~' |
| 19 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 20 | localamount | localamount | localamount | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(28, 8) |
| 22 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 23 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_guacontractquote | pk_guacontractquote | pk_guacontractquote | varchar2(50) |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 30 | pk_srcbillchild | pk_srcbillchild | pk_srcbillchild | varchar2(50) |
| 31 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 32 | quoteamount | quoteamount | quoteamount | number(28, 8) |
| 33 | quoteglcamount | quoteglcamount | quoteglcamount | number(28, 8) |
| 34 | quotegllcamount | quotegllcamount | quotegllcamount | number(28, 8) |
| 35 | quoteolcamount | quoteolcamount | quoteolcamount | number(28, 8) |
| 36 | quoteway | quoteway | quoteway | number(38, 0) |
| 37 | remark | remark | remark | varchar2(200) |
| 38 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 39 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 40 | startdate | startdate | startdate | char(19) |
| 41 | stopdate | stopdate | stopdate | char(19) |
| 42 | summary | summary | summary | varchar2(200) |
| 43 | vbillno | vbillno | vbillno | varchar2(50) |
| 44 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 45 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 46 | versionmark | versionmark | versionmark | varchar2(100) |
| 47 | versionno | versionno | versionno | number(38, 0) |
| 48 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 49 | versiontime | versiontime | versiontime | char(19) |
| 50 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 51 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 52 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 53 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 54 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 55 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 56 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 57 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 58 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 59 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 60 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 61 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 62 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 63 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 64 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 65 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 66 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 67 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 68 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 69 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 70 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 71 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 72 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 73 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 74 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 75 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 76 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 77 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 78 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 79 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 80 | creationtime | creationtime | creationtime | char(19) |
| 81 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 82 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 83 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 84 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 85 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |