# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | dealer | dealer | dealer | varchar2(200) |
| 3 | fsrcbilltypecode | fsrcbilltypecode | fsrcbilltypecode | varchar2(50) |
| 4 | glcrate | glcrate | glcrate | number(28, 8) |
| 5 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 6 | guapropertyid | guapropertyid | guapropertyid | varchar2(20) |
| 7 | iunitinid | iunitinid | iunitinid | varchar2(20) |  |  | '~' |
| 8 | makedate | makedate | makedate | char(19) |
| 9 | olcrate | olcrate | olcrate | number(28, 8) |
| 10 | owner | owner | owner | number(38, 0) |
| 11 | ownunit | ownunit | ownunit | varchar2(20) |  |  | '~' |
| 12 | partnerid | partnerid | partnerid | varchar2(20) |  |  | '~' |
| 13 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 14 | pk_fsrcbill | pk_fsrcbill | pk_fsrcbill | varchar2(50) |
| 15 | pk_fsrcbilltypeid | pk_fsrcbilltypeid | pk_fsrcbilltypeid | varchar2(50) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_guacontract | pk_guacontract | pk_guacontract | char(20) | √ |
| 18 | pk_guaguarantyinfo_b | pk_guaguarantyinfo_b | pk_guaguarantyinfo_b | varchar2(20) | √ |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 22 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 23 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 24 | pledgename | pledgename | pledgename | varchar2(200) |
| 25 | pledgeno | pledgeno | pledgeno | varchar2(20) |  |  | '~' |
| 26 | rate | rate | rate | varchar2(200) |
| 27 | restpledge | restpledge | restpledge | number(28, 8) |
| 28 | rowno | rowno | rowno | varchar2(50) |
| 29 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 30 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 31 | summary | summary | summary | varchar2(200) |
| 32 | totalpledge | totalpledge | totalpledge | number(28, 8) |
| 33 | unitname | unitname | unitname | varchar2(200) |
| 34 | usingamount | usingamount | usingamount | number(28, 8) |
| 35 | usinglcamount | usinglcamount | usinglcamount | number(28, 8) |
| 36 | vbillno | vbillno | vbillno | varchar2(50) |
| 37 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 38 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 39 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 40 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 41 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 42 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 43 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 44 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 45 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 46 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 47 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 48 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 49 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 50 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 51 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 52 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 53 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 54 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 55 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 56 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |