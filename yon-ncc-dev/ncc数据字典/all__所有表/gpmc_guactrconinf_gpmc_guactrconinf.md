# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guactrycontractinfo_b | pk_guactrycontractinfo_b | pk_guactrycontractinfo_b | char(20) | √ |
| 2 | contractid | contractid | contractid | varchar2(20) |
| 3 | contractno | contractno | contractno | varchar2(20) |  |  | '~' |
| 4 | contracttype | contracttype | contracttype | number(38, 0) |
| 5 | debtor | debtor | debtor | varchar2(200) |
| 6 | fsrcbilltypecode | fsrcbilltypecode | fsrcbilltypecode | varchar2(50) |
| 7 | glcrate | glcrate | glcrate | number(28, 8) |
| 8 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 9 | guaamount | guaamount | guaamount | number(28, 8) |
| 10 | guarantor | guarantor | guarantor | varchar2(200) |
| 11 | indebtor | indebtor | indebtor | varchar2(20) |  |  | '~' |
| 12 | inguarantor | inguarantor | inguarantor | varchar2(20) |  |  | '~' |
| 13 | olcrate | olcrate | olcrate | number(28, 8) |
| 14 | owerdebtor | owerdebtor | owerdebtor | varchar2(20) |  |  | '~' |
| 15 | owerguarantor | owerguarantor | owerguarantor | varchar2(20) |  |  | '~' |
| 16 | partdebtor | partdebtor | partdebtor | varchar2(20) |  |  | '~' |
| 17 | partguarantor | partguarantor | partguarantor | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_fsrcbill | pk_fsrcbill | pk_fsrcbill | varchar2(50) |
| 20 | pk_fsrcbilltypeid | pk_fsrcbilltypeid | pk_fsrcbilltypeid | varchar2(50) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_guacontract | pk_guacontract | pk_guacontract | char(20) | √ |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 26 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 27 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 28 | remark | remark | remark | varchar2(200) |
| 29 | rowno | rowno | rowno | varchar2(50) |
| 30 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 31 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 32 | usingprice | usingprice | usingprice | number(28, 8) |
| 33 | vbillno | vbillno | vbillno | varchar2(50) |
| 34 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 35 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 36 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 37 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 38 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 39 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 40 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 41 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 42 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 43 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 44 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 45 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 46 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 47 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 48 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 49 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 50 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 51 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 52 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 53 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |