# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | execution_id | execution_id | execution_id | char(20) | √ |
| 2 | company_id | company_id | company_id | varchar2(50) |
| 3 | company_name | company_name | company_name | varchar2(500) |
| 4 | description | description | description | varchar2(1024) |
| 5 | effect | effect | effect | varchar2(1024) |
| 6 | execution_status | execution_status | execution_status | varchar2(200) |
| 7 | nc_ts | nc_ts | nc_ts | char(19) |
| 8 | oper_type | oper_type | oper_type | varchar2(50) |
| 9 | org_type | org_type | org_type | varchar2(50) |
| 10 | pk_implementreport | pk_implementreport | pk_implementreport | varchar2(50) |
| 11 | remark | remark | remark | varchar2(500) |
| 12 | subject_code | subject_code | subject_code | varchar2(500) |
| 13 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 14 | upload_time | upload_time | upload_time | char(19) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |