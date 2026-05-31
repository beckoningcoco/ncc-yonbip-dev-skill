# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7199.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phrec | pk_phrec | pk_phrec | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | datasource | datasource | datasource | varchar2(100) |
| 4 | datasource_dttype | datasource_dttype | datasource_dttype | varchar2(20) |  |  | '~' |
| 5 | data_format | data_format | data_format | varchar2(50) |
| 6 | data_std_max | data_std_max | data_std_max | varchar2(50) |
| 7 | data_std_min | data_std_min | data_std_min | varchar2(50) |
| 8 | date_publish | date_publish | date_publish | char(19) |
| 9 | dt_recdatatype | dt_recdatatype | dt_recdatatype | varchar2(20) |  |  | '~' |
| 10 | dt_rectype | dt_rectype | dt_rectype | varchar2(20) |  |  | '~' |
| 11 | flag_active | flag_active | flag_active | char(1) |
| 12 | flag_null | flag_null | flag_null | char(1) |
| 13 | flag_pisyn | flag_pisyn | flag_pisyn | char(1) |
| 14 | name | name | name | varchar2(50) |
| 15 | name2 | name2 | name2 | varchar2(50) |
| 16 | name3 | name3 | name3 | varchar2(50) |
| 17 | name4 | name4 | name4 | varchar2(50) |
| 18 | name5 | name5 | name5 | varchar2(50) |
| 19 | name6 | name6 | name6 | varchar2(50) |
| 20 | name_dm | name_dm | name_dm | varchar2(50) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_phdg | pk_phdg | pk_phdg | varchar2(50) |
| 25 | pk_phdm | pk_phdm | pk_phdm | varchar2(20) |  |  | '~' |
| 26 | pk_phdmcate | pk_phdmcate | pk_phdmcate | varchar2(20) |  |  | '~' |
| 27 | pk_phds | pk_phds | pk_phds | varchar2(20) |  |  | '~' |
| 28 | recdef | recdef | recdef | varchar2(50) |
| 29 | reclen | reclen | reclen | number(38, 0) |
| 30 | recmax | recmax | recmax | number(38, 0) |
| 31 | recmin | recmin | recmin | number(38, 0) |
| 32 | recnote | recnote | recnote | varchar2(256) |
| 33 | sortno | sortno | sortno | number(38, 0) |
| 34 | verno | verno | verno | varchar2(50) |
| 35 | weight | weight | weight | number(14, 2) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |