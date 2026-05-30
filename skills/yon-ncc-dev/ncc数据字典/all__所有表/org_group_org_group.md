# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10217.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | pk_group | pk_group | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | countryarea | countryarea | countryarea | varchar2(20) |  |  | '~' |
| 4 | countryzone | countryzone | countryzone | varchar2(20) |
| 5 | createdate | createdate | createdate | char(19) | √ |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 7 | ecotype | ecotype | ecotype | varchar2(20) |  |  | '~' |
| 8 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 9 | fax | fax | fax | varchar2(60) |
| 10 | groupno | groupno | groupno | char(4) |
| 11 | headaddress | headaddress | headaddress | varchar2(20) |  |  | '~' |
| 12 | industry | industry | industry | varchar2(20) |  |  | '~' |
| 13 | initflag | initflag | initflag | char(1) |
| 14 | innercode | innercode | innercode | varchar2(200) |
| 15 | introduction | introduction | introduction | varchar2(750) |
| 16 | memo | memo | memo | varchar2(750) |
| 17 | mnecode | mnecode | mnecode | varchar2(50) |
| 18 | name | name | name | varchar2(300) | √ |
| 19 | name2 | name2 | name2 | varchar2(300) |
| 20 | name3 | name3 | name3 | varchar2(300) |
| 21 | name4 | name4 | name4 | varchar2(300) |
| 22 | name5 | name5 | name5 | varchar2(300) |
| 23 | name6 | name6 | name6 | varchar2(300) |
| 24 | ncindustry | ncindustry | ncindustry | varchar2(20) | √ |
| 25 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | varchar2(20) |  |  | '~' |
| 26 | pk_currtype | pk_currtype | pk_currtype | char(20) | √ |
| 27 | pk_exratescheme | pk_exratescheme | pk_exratescheme | char(20) | √ |
| 28 | pk_fathergroup | pk_fathergroup | pk_fathergroup | varchar2(20) |  |  | '~' |
| 29 | service | service | service | varchar2(300) |
| 30 | shortname | shortname | shortname | varchar2(300) |
| 31 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 32 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 33 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 34 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 35 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 36 | tel | tel | tel | varchar2(60) |
| 37 | tenantid | tenantid | tenantid | varchar2(50) |
| 38 | tenantsecretkey | tenantsecretkey | tenantsecretkey | varchar2(2000) |
| 39 | workcalendar | workcalendar | workcalendar | varchar2(20) |  |  | '~' |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |