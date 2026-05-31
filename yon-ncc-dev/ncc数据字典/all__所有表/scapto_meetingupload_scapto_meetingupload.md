# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | meeting_id | meeting_id | meeting_id | char(20) | √ |
| 2 | company_id | company_id | company_id | varchar2(96) |
| 3 | company_name | company_name | company_name | varchar2(768) |
| 4 | meeting_code | meeting_code | meeting_code | varchar2(96) |
| 5 | meeting_form | meeting_form | meeting_form | varchar2(150) |
| 6 | meeting_name | meeting_name | meeting_name | varchar2(1536) |
| 7 | meeting_time | meeting_time | meeting_time | varchar2(50) |
| 8 | meeting_type_code | meeting_type_code | meeting_type_code | varchar2(75) |
| 9 | meeting_type_name | meeting_type_name | meeting_type_name | varchar2(150) |
| 10 | moderator | moderator | moderator | varchar2(75) |
| 11 | nc_ts | nc_ts | nc_ts | char(19) |
| 12 | oper_type | oper_type | oper_type | varchar2(50) |
| 13 | org_type | org_type | org_type | varchar2(50) |
| 14 | release_time | release_time | release_time | varchar2(50) |
| 15 | remark | remark | remark | varchar2(3000) |
| 16 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 17 | upload_time | upload_time | upload_time | char(19) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |