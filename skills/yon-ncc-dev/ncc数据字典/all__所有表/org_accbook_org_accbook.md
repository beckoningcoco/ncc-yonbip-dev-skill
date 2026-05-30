# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbook | pk_accbook | pk_accbook | char(20) | √ |
| 2 | accountenablestate | accountenablestate | accountenablestate | number(38, 0) |  |  | 1 |
| 3 | accounttype | accounttype | accounttype | number(38, 0) | √ |  | 1 |
| 4 | assetenablestate | assetenablestate | assetenablestate | number(38, 0) |  |  | 1 |
| 5 | assettype | assettype | assettype | number(38, 0) | √ |  | 1 |
| 6 | bookproperties | bookproperties | bookproperties | varchar2(50) |
| 7 | code | code | code | varchar2(40) | √ |
| 8 | costcenaccenablestate | costcenaccenablestate | costcenaccenablestate | number(38, 0) |  |  | 1 |
| 9 | costcenacctype | costcenacctype | costcenacctype | number(38, 0) | √ |  | 1 |
| 10 | costestimationenablestate | costestimationenablestate | costestimationenablestate | number(38, 0) |  |  | 1 |
| 11 | costestimationtype | costestimationtype | costestimationtype | number(38, 0) | √ |  | 1 |
| 12 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 13 | enablestate | enablestate | enablestate | number(38, 0) |
| 14 | isconvert | isconvert | isconvert | char(1) |  |  | 'N' |
| 15 | itemcostenablestate | itemcostenablestate | itemcostenablestate | number(38, 0) |  |  | 1 |
| 16 | itemcosttype | itemcosttype | itemcosttype | number(38, 0) |
| 17 | liabilityenablestate | liabilityenablestate | liabilityenablestate | number(38, 0) |  |  | 1 |
| 18 | liabilitytype | liabilitytype | liabilitytype | number(38, 0) |
| 19 | materialenablestate | materialenablestate | materialenablestate | number(38, 0) |  |  | 1 |
| 20 | materialtype | materialtype | materialtype | number(38, 0) | √ |  | 1 |
| 21 | mnecode | mnecode | mnecode | varchar2(50) |
| 22 | name | name | name | varchar2(300) | √ |
| 23 | name2 | name2 | name2 | varchar2(300) |
| 24 | name3 | name3 | name3 | varchar2(300) |
| 25 | name4 | name4 | name4 | varchar2(300) |
| 26 | name5 | name5 | name5 | varchar2(300) |
| 27 | name6 | name6 | name6 | varchar2(300) |
| 28 | paraccount | paraccount | paraccount | char(1) |
| 29 | pk_accountcurr | pk_accountcurr | pk_accountcurr | varchar2(20) |  |  | '~' |
| 30 | pk_accountperiod | pk_accountperiod | pk_accountperiod | varchar2(20) |  |  | '~' |
| 31 | pk_assetperiod | pk_assetperiod | pk_assetperiod | varchar2(20) |  |  | '~' |
| 32 | pk_costcenaccperiod | pk_costcenaccperiod | pk_costcenaccperiod | varchar2(20) |  |  | '~' |
| 33 | pk_costestimationperiod | pk_costestimationperiod | pk_costestimationperiod | varchar2(20) |  |  | '~' |
| 34 | pk_curraccchart | pk_curraccchart | pk_curraccchart | varchar2(20) |  |  | '~' |
| 35 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) |  |  | '~' |
| 36 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_itemcostperiod | pk_itemcostperiod | pk_itemcostperiod | varchar2(20) |  |  | '~' |
| 39 | pk_liabilityperiod | pk_liabilityperiod | pk_liabilityperiod | varchar2(20) |  |  | '~' |
| 40 | pk_materialperiod | pk_materialperiod | pk_materialperiod | varchar2(20) |  |  | '~' |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 42 | pk_productcostperiod | pk_productcostperiod | pk_productcostperiod | varchar2(20) |  |  | '~' |
| 43 | pk_relorg | pk_relorg | pk_relorg | varchar2(20) | √ |
| 44 | pk_resaccchart | pk_resaccchart | pk_resaccchart | varchar2(20) |  |  | '~' |
| 45 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 46 | pk_specialcostperiod | pk_specialcostperiod | pk_specialcostperiod | varchar2(20) |  |  | '~' |
| 47 | pk_standardcostperiod | pk_standardcostperiod | pk_standardcostperiod | varchar2(20) |  |  | '~' |
| 48 | prodcosttype | prodcosttype | prodcosttype | number(38, 0) | √ |  | 1 |
| 49 | productcostenablestate | productcostenablestate | productcostenablestate | number(38, 0) |  |  | 1 |
| 50 | shortname | shortname | shortname | varchar2(300) |
| 51 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 52 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 53 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 54 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 55 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 56 | specialcostenablestate | specialcostenablestate | specialcostenablestate | number(38, 0) |  |  | 1 |
| 57 | specialcosttype | specialcosttype | specialcosttype | number(38, 0) |
| 58 | standardcostenablestate | standardcostenablestate | standardcostenablestate | number(38, 0) | √ |  | 1 |
| 59 | standardcosttype | standardcosttype | standardcosttype | number(38, 0) |
| 60 | creationtime | creationtime | creationtime | char(19) |
| 61 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 64 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |