# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code | code | code | varchar2(30) |
| 2 | code_std | code_std | code_std | varchar2(30) |
| 3 | datasource_dttype | datasource_dttype | datasource_dttype | varchar2(50) |
| 4 | datasource_prop | datasource_prop | datasource_prop | varchar2(256) |
| 5 | datasource_sql | datasource_sql | datasource_sql | varchar2(4000) |
| 6 | data_format | data_format | data_format | varchar2(50) |
| 7 | data_std_max | data_std_max | data_std_max | varchar2(50) |
| 8 | data_std_min | data_std_min | data_std_min | varchar2(50) |
| 9 | date_publish | date_publish | date_publish | char(19) |
| 10 | dedef | dedef | dedef | number(38, 0) |
| 11 | delen | delen | delen | number(38, 0) |
| 12 | demax | demax | demax | number(38, 0) |
| 13 | demin | demin | demin | number(38, 0) |
| 14 | denote | denote | denote | varchar2(256) |
| 15 | doctype | doctype | doctype | number(38, 0) |
| 16 | dt_detype | dt_detype | dt_detype | varchar2(20) |
| 17 | dt_ecddevaltype | dt_ecddevaltype | dt_ecddevaltype | varchar2(20) |
| 18 | eu_applyphase | eu_applyphase | eu_applyphase | number(38, 0) |
| 19 | eu_phaseid | eu_phaseid | eu_phaseid | number(38, 0) |
| 20 | flag_active | flag_active | flag_active | char(1) |
| 21 | flag_assign | flag_assign | flag_assign | char(1) |
| 22 | flag_null | flag_null | flag_null | char(1) |
| 23 | flag_sync | flag_sync | flag_sync | char(1) |
| 24 | mnecode | mnecode | mnecode | varchar2(50) |
| 25 | name | name | name | varchar2(50) |
| 26 | pk_de | pk_de | pk_de | char(20) | √ |
| 27 | pk_decate | pk_decate | pk_decate | varchar2(20) |  |  | '~' |
| 28 | pk_detype | pk_detype | pk_detype | varchar2(20) |  |  | '~' |
| 29 | pk_ecddevaltype | pk_ecddevaltype | pk_ecddevaltype | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | verno | verno | verno | varchar2(50) |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |