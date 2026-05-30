# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | record_id | record_id | record_id | char(20) | √ |
| 2 | company_id | company_id | company_id | varchar2(50) |
| 3 | company_name | company_name | company_name | varchar2(500) |
| 4 | condition_code | condition_code | condition_code | varchar2(1024) |
| 5 | decision_flag | decision_flag | decision_flag | varchar2(500) |
| 6 | exception_count | exception_count | exception_count | number(38, 0) |
| 7 | execution_count | execution_count | execution_count | number(38, 0) |
| 8 | item_count | item_count | item_count | number(38, 0) |
| 9 | item_flag | item_flag | item_flag | varchar2(1024) |
| 10 | manage_code | manage_code | manage_code | varchar2(1024) |
| 11 | meeting_count | meeting_count | meeting_count | number(38, 0) |
| 12 | nc_ts | nc_ts | nc_ts | char(19) |
| 13 | oper_type | oper_type | oper_type | varchar2(50) |
| 14 | org_type | org_type | org_type | varchar2(50) |
| 15 | pk_enterprise_mainbody | pk_enterprise_mainbody | pk_enterprise_mainbody | varchar2(50) |
| 16 | rate | rate | rate | number(28, 8) |
| 17 | regulation_count | regulation_count | regulation_count | number(38, 0) |
| 18 | remark | remark | remark | varchar2(500) |
| 19 | structure_code | structure_code | structure_code | varchar2(200) |
| 20 | subject_count | subject_count | subject_count | number(38, 0) |
| 21 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 22 | upload_time | upload_time | upload_time | char(19) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |