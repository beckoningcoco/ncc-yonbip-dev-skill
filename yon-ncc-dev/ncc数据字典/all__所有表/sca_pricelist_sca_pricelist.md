# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricelist | pk_pricelist | pk_pricelist | char(20) | √ |
| 2 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 3 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 4 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 5 | cmeasureid | cmeasureid | cmeasureid | varchar2(20) |  |  | '~' |
| 6 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 7 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 8 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 9 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 10 | effectivedate | effectivedate | effectivedate | char(20) |
| 11 | invaliddate | invaliddate | invaliddate | char(20) |
| 12 | materialhashkey | materialhashkey | materialhashkey | number(38, 0) |
| 13 | materialinfo | materialinfo | materialinfo | varchar2(1450) |
| 14 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 20 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 21 | price | price | price | number(28, 8) |
| 22 | pricetype | pricetype | pricetype | number(38, 0) |
| 23 | vnote | vnote | vnote | varchar2(200) |
| 24 | vfree1 | vfree1 | vfree1 | varchar2(101) |  |  | '~' |
| 25 | vfree2 | vfree2 | vfree2 | varchar2(101) |  |  | '~' |
| 26 | vfree3 | vfree3 | vfree3 | varchar2(101) |  |  | '~' |
| 27 | vfree4 | vfree4 | vfree4 | varchar2(101) |  |  | '~' |
| 28 | vfree5 | vfree5 | vfree5 | varchar2(101) |  |  | '~' |
| 29 | vfree6 | vfree6 | vfree6 | varchar2(101) |  |  | '~' |
| 30 | vfree7 | vfree7 | vfree7 | varchar2(101) |  |  | '~' |
| 31 | vfree8 | vfree8 | vfree8 | varchar2(101) |  |  | '~' |
| 32 | vfree9 | vfree9 | vfree9 | varchar2(101) |  |  | '~' |
| 33 | vfree10 | vfree10 | vfree10 | varchar2(101) |  |  | '~' |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |