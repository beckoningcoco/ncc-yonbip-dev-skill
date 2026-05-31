# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 2 | accountenablestate | accountenablestate | accountenablestate | number(38, 0) |  |  | 1 |
| 3 | accounttype | accounttype | accounttype | number(38, 0) | √ |  | 1 |
| 4 | assetenablestate | assetenablestate | assetenablestate | number(38, 0) |  |  | 1 |
| 5 | assettype | assettype | assettype | number(38, 0) | √ |  | 1 |
| 6 | bookproperties | bookproperties | bookproperties | varchar2(50) | √ |  | '~' |
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
| 17 | materialenablestate | materialenablestate | materialenablestate | number(38, 0) |  |  | 1 |
| 18 | materialtype | materialtype | materialtype | number(38, 0) | √ |  | 1 |
| 19 | mnecode | mnecode | mnecode | varchar2(50) |
| 20 | name | name | name | varchar2(300) | √ |
| 21 | name2 | name2 | name2 | varchar2(300) |
| 22 | name3 | name3 | name3 | varchar2(300) |
| 23 | name4 | name4 | name4 | varchar2(300) |
| 24 | name5 | name5 | name5 | varchar2(300) |
| 25 | name6 | name6 | name6 | varchar2(300) |
| 26 | paraccount | paraccount | paraccount | char(1) |
| 27 | pk_accountcurr | pk_accountcurr | pk_accountcurr | varchar2(20) |  |  | '~' |
| 28 | pk_accountperiod | pk_accountperiod | pk_accountperiod | varchar2(20) |  |  | '~' |
| 29 | pk_assetperiod | pk_assetperiod | pk_assetperiod | varchar2(20) |  |  | '~' |
| 30 | pk_costcenaccperiod | pk_costcenaccperiod | pk_costcenaccperiod | varchar2(20) |  |  | '~' |
| 31 | pk_costestimationperiod | pk_costestimationperiod | pk_costestimationperiod | varchar2(20) |  |  | '~' |
| 32 | pk_curraccchart | pk_curraccchart | pk_curraccchart | varchar2(20) |  |  | '~' |
| 33 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) | √ |
| 34 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_itemcostperiod | pk_itemcostperiod | pk_itemcostperiod | varchar2(20) |  |  | '~' |
| 37 | pk_materialperiod | pk_materialperiod | pk_materialperiod | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_productcostperiod | pk_productcostperiod | pk_productcostperiod | varchar2(20) |  |  | '~' |
| 40 | pk_relorg | pk_relorg | pk_relorg | varchar2(20) |  |  | '~' |
| 41 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) | √ |
| 42 | pk_specialcostperiod | pk_specialcostperiod | pk_specialcostperiod | varchar2(20) |  |  | '~' |
| 43 | pk_standardcostperiod | pk_standardcostperiod | pk_standardcostperiod | varchar2(20) |  |  | '~' |
| 44 | pk_taxperiod | pk_taxperiod | pk_taxperiod | varchar2(20) |  |  | '~' |
| 45 | prodcosttype | prodcosttype | prodcosttype | number(38, 0) | √ |  | 1 |
| 46 | productcostenablestate | productcostenablestate | productcostenablestate | number(38, 0) |  |  | 1 |
| 47 | shortname | shortname | shortname | varchar2(300) |
| 48 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 49 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 50 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 51 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 52 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 53 | specialcostenablestate | specialcostenablestate | specialcostenablestate | number(38, 0) |  |  | 1 |
| 54 | specialcosttype | specialcosttype | specialcosttype | number(38, 0) |
| 55 | standardcostenablestate | standardcostenablestate | standardcostenablestate | number(38, 0) |  |  | 1 |
| 56 | standardcosttype | standardcosttype | standardcosttype | number(38, 0) | √ |  | 1 |
| 57 | taxenablestate | taxenablestate | taxenablestate | number(38, 0) |  |  | 1 |
| 58 | creationtime | creationtime | creationtime | char(19) |
| 59 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 62 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |