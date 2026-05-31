# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8198.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenselistunit | pk_expenselistunit | pk_expenselistunit | char(20) | √ |
| 2 | billdetailnum | billdetailnum | billdetailnum | varchar2(20) |
| 3 | billmakedate | billmakedate | billmakedate | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | chargedate | chargedate | chargedate | char(19) |
| 6 | costtotal | costtotal | costtotal | number(28, 4) |
| 7 | detalisttype | detalisttype | detalisttype | varchar2(50) |
| 8 | glcrate | glcrate | glcrate | number(28, 4) |
| 9 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 4) |
| 10 | gllcrate | gllcrate | gllcrate | number(28, 4) |
| 11 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 4) |
| 12 | intopooldate | intopooldate | intopooldate | char(19) |
| 13 | olccosttotal | olccosttotal | olccosttotal | number(28, 4) |
| 14 | olcrate | olcrate | olcrate | number(28, 4) |
| 15 | pk_billcurr | pk_billcurr | pk_billcurr | varchar2(20) |  |  | '~' |
| 16 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 17 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 18 | pk_funorg | pk_funorg | pk_funorg | varchar2(20) |  |  | '~' |
| 19 | pk_funorg_v | pk_funorg_v | pk_funorg_v | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 24 | srctype | srctype | srctype | varchar2(50) |
| 25 | voucherdate | voucherdate | voucherdate | char(19) |
| 26 | voucherflag | voucherflag | voucherflag | char(1) |
| 27 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 28 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 29 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 30 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 31 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 32 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 33 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 34 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 35 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 36 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 37 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 38 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 39 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 40 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 41 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 42 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 43 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 44 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 45 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 46 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 47 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |