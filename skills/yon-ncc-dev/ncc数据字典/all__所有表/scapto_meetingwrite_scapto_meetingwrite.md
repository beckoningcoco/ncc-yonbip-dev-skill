# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetingwrite | pk_meetingwrite | pk_meetingwrite | char(20) | √ |
| 2 | company_id | company_id | company_id | varchar2(64) | √ |
| 3 | company_name | company_name | company_name | varchar2(512) |
| 4 | meeting_code | meeting_code | meeting_code | varchar2(64) |
| 5 | meeting_form | meeting_form | meeting_form | varchar2(100) |
| 6 | meeting_id | meeting_id | meeting_id | varchar2(50) | √ |
| 7 | meeting_name | meeting_name | meeting_name | varchar2(1024) | √ |
| 8 | meeting_time | meeting_time | meeting_time | varchar2(50) |
| 9 | meeting_type_code | meeting_type_code | meeting_type_code | varchar2(50) |
| 10 | meeting_type_name | meeting_type_name | meeting_type_name | varchar2(100) |
| 11 | moderator | moderator | moderator | varchar2(50) |
| 12 | nc_ts | nc_ts | nc_ts | char(19) |
| 13 | oper_type | oper_type | oper_type | varchar2(50) |
| 14 | org_type | org_type | org_type | varchar2(50) |
| 15 | pk_meetingreport | pk_meetingreport | pk_meetingreport | varchar2(20) |
| 16 | release_time | release_time | release_time | varchar2(50) |
| 17 | remark | remark | remark | varchar2(2000) |
| 18 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 19 | upload_time | upload_time | upload_time | char(19) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |