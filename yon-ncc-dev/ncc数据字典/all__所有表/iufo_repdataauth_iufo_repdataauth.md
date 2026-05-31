# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repdataauth | pk_repdataauth | pk_repdataauth | char(20) | √ |
| 2 | auth_type | auth_type | auth_type | number(38, 0) |
| 3 | iscontainorg | iscontainorg | iscontainorg | char(1) |
| 4 | name_report | name_report | name_report | varchar2(50) |
| 5 | org_condition | org_condition | org_condition | blob |
| 6 | org_content | org_content | org_content | blob |
| 7 | org_con_sql | org_con_sql | org_con_sql | varchar2(2048) |
| 8 | org_display | org_display | org_display | varchar2(2048) |
| 9 | org_type | org_type | org_type | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_report | pk_report | pk_report | varchar2(20) |
| 13 | pk_role | pk_role | pk_role | varchar2(20) |  |  | '~' |
| 14 | pk_task | pk_task | pk_task | varchar2(20) |
| 15 | pk_user | pk_user | pk_user | varchar2(20) |
| 16 | querycondition | querycondition | querycondition | blob |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |