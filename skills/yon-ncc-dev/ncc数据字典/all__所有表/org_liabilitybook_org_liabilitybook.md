# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liabilitybook | pk_liabilitybook | pk_liabilitybook | char(20) | √ |
| 2 | bookproperties | bookproperties | bookproperties | varchar2(50) | √ |
| 3 | code | code | code | varchar2(40) | √ |
| 4 | costcenaccenablestate | costcenaccenablestate | costcenaccenablestate | number(38, 0) |  |  | 1 |
| 5 | costcenacctype | costcenacctype | costcenacctype | number(38, 0) | √ |  | 1 |
| 6 | costestimationenablestate | costestimationenablestate | costestimationenablestate | number(38, 0) |  |  | 1 |
| 7 | costestimationtype | costestimationtype | costestimationtype | number(38, 0) | √ |  | 1 |
| 8 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 9 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 10 | liabilityenablestate | liabilityenablestate | liabilityenablestate | number(38, 0) |
| 11 | liabilitytype | liabilitytype | liabilitytype | number(38, 0) | √ |  | 1 |
| 12 | materialenablestate | materialenablestate | materialenablestate | number(38, 0) |  |  | 1 |
| 13 | materialtype | materialtype | materialtype | number(38, 0) | √ |  | 1 |
| 14 | mnecode | mnecode | mnecode | varchar2(50) |
| 15 | name | name | name | varchar2(300) | √ |
| 16 | name2 | name2 | name2 | varchar2(300) |
| 17 | name3 | name3 | name3 | varchar2(300) |
| 18 | name4 | name4 | name4 | varchar2(300) |
| 19 | name5 | name5 | name5 | varchar2(300) |
| 20 | name6 | name6 | name6 | varchar2(300) |
| 21 | pk_accountcurr | pk_accountcurr | pk_accountcurr | varchar2(20) |  |  | '~' |
| 22 | pk_costcenaccperiod | pk_costcenaccperiod | pk_costcenaccperiod | varchar2(20) |  |  | '~' |
| 23 | pk_costestimationperiod | pk_costestimationperiod | pk_costestimationperiod | varchar2(20) |  |  | '~' |
| 24 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) | √ |
| 25 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_liabilityperiod | pk_liabilityperiod | pk_liabilityperiod | varchar2(20) |  |  | '~' |
| 28 | pk_materialperiod | pk_materialperiod | pk_materialperiod | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_productcostperiod | pk_productcostperiod | pk_productcostperiod | varchar2(20) |  |  | '~' |
| 31 | pk_relorg | pk_relorg | pk_relorg | varchar2(20) |  |  | '~' |
| 32 | pk_resaccchart | pk_resaccchart | pk_resaccchart | varchar2(20) |  |  | '~' |
| 33 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 34 | pk_specialcostperiod | pk_specialcostperiod | pk_specialcostperiod | varchar2(20) |  |  | '~' |
| 35 | pk_standardcostperiod | pk_standardcostperiod | pk_standardcostperiod | varchar2(20) |  |  | '~' |
| 36 | productcostenablestate | productcostenablestate | productcostenablestate | number(38, 0) |
| 37 | shortname | shortname | shortname | varchar2(300) |
| 38 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 39 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 40 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 41 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 42 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 43 | specialcostenablestate | specialcostenablestate | specialcostenablestate | number(38, 0) |  |  | 1 |
| 44 | specialcosttype | specialcosttype | specialcosttype | number(38, 0) |
| 45 | standardcostenablestate | standardcostenablestate | standardcostenablestate | number(38, 0) |  |  | 1 |
| 46 | standardcosttype | standardcosttype | standardcosttype | number(38, 0) | √ |  | 1 |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |