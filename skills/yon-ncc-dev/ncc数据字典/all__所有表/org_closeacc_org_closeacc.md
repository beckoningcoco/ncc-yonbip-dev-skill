# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccbook | pk_closeaccbook | pk_closeaccbook | char(20) | √ |
| 2 | closeorgpks | closeorgpks | closeorgpks | varchar2(50) |  |  | '~' |
| 3 | closetime | closetime | closetime | char(19) |
| 4 | closeuser | closeuser | closeuser | varchar2(20) |  |  | '~' |
| 5 | code | code | code | varchar2(40) |
| 6 | endacctime | endacctime | endacctime | char(19) |
| 7 | endaccuser | endaccuser | endaccuser | varchar2(20) |  |  | '~' |
| 8 | isclose | isclose | isclose | char(1) |  |  | 'N' |
| 9 | isendacc | isendacc | isendacc | char(1) |  |  | 'N' |
| 10 | ispreclose | ispreclose | ispreclose | char(1) |  |  | 'N' |
| 11 | moduleid | moduleid | moduleid | varchar2(20) |  |  | '~' |
| 12 | name | name | name | varchar2(300) |
| 13 | name2 | name2 | name2 | varchar2(300) |
| 14 | name3 | name3 | name3 | varchar2(300) |
| 15 | name4 | name4 | name4 | varchar2(300) |
| 16 | name5 | name5 | name5 | varchar2(300) |
| 17 | name6 | name6 | name6 | varchar2(300) |
| 18 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 19 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(20) |  |  | '~' |
| 20 | pk_authorg | pk_authorg | pk_authorg | varchar2(20) |  |  | '~' |
| 21 | pk_checkaccbook | pk_checkaccbook | pk_checkaccbook | varchar2(20) |  |  | '~' |
| 22 | pk_costregion | pk_costregion | pk_costregion | varchar2(20) |  |  | '~' |
| 23 | pk_enableperiod | pk_enableperiod | pk_enableperiod | char(20) |
| 24 | pk_factory | pk_factory | pk_factory | varchar2(20) |  |  | '~' |
| 25 | pk_liabilitybook | pk_liabilitybook | pk_liabilitybook | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_resaorg | pk_resaorg | pk_resaorg | varchar2(20) |  |  | '~' |
| 28 | pk_storedoc | pk_storedoc | pk_storedoc | varchar2(20) |  |  | '~' |
| 29 | pk_taxaccbook | pk_taxaccbook | pk_taxaccbook | varchar2(20) |  |  | '~' |
| 30 | preclosetime | preclosetime | preclosetime | char(19) |
| 31 | precloseuser | precloseuser | precloseuser | varchar2(20) |  |  | '~' |
| 32 | unclosetime | unclosetime | unclosetime | char(19) |
| 33 | uncloseuser | uncloseuser | uncloseuser | varchar2(20) |  |  | '~' |
| 34 | unendacctime | unendacctime | unendacctime | char(19) |
| 35 | unendaccuser | unendaccuser | unendaccuser | varchar2(20) |  |  | '~' |
| 36 | unpreclosetime | unpreclosetime | unpreclosetime | char(19) |
| 37 | unprecloseuser | unprecloseuser | unprecloseuser | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |