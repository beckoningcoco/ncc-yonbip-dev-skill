# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phdm | pk_phdm | pk_phdm | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | code_gb | code_gb | code_gb | varchar2(30) |
| 4 | datasource | datasource | datasource | varchar2(100) |
| 5 | datasource_dttype | datasource_dttype | datasource_dttype | varchar2(20) |  |  | '~' |
| 6 | data_format | data_format | data_format | varchar2(50) |
| 7 | data_std_max | data_std_max | data_std_max | varchar2(50) |
| 8 | data_std_min | data_std_min | data_std_min | varchar2(50) |
| 9 | date_publish | date_publish | date_publish | char(19) |
| 10 | dt_recdatatype | dt_recdatatype | dt_recdatatype | varchar2(20) |  |  | '~' |
| 11 | dt_rectype | dt_rectype | dt_rectype | varchar2(20) |  |  | '~' |
| 12 | flag_active | flag_active | flag_active | char(1) |
| 13 | flag_null | flag_null | flag_null | char(1) |
| 14 | name | name | name | varchar2(50) |
| 15 | name2 | name2 | name2 | varchar2(50) |
| 16 | name3 | name3 | name3 | varchar2(50) |
| 17 | name4 | name4 | name4 | varchar2(50) |
| 18 | name5 | name5 | name5 | varchar2(50) |
| 19 | name6 | name6 | name6 | varchar2(50) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_phdmcate | pk_phdmcate | pk_phdmcate | varchar2(20) |  |  | '~' |
| 24 | recdef | recdef | recdef | varchar2(50) |
| 25 | reclen | reclen | reclen | number(38, 0) |
| 26 | recmax | recmax | recmax | number(38, 0) |
| 27 | recmin | recmin | recmin | number(38, 0) |
| 28 | recnote | recnote | recnote | varchar2(256) |
| 29 | verno | verno | verno | varchar2(50) |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |