# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | subject_id | subject_id | subject_id | char(20) | √ |
| 2 | adopt_flag | adopt_flag | adopt_flag | varchar2(50) |
| 3 | approval_flag | approval_flag | approval_flag | varchar2(50) |
| 4 | exception | exception | exception | varchar2(200) |
| 5 | item_code | item_code | item_code | varchar2(128) |
| 6 | meeting_id | meeting_id | meeting_id | char(20) | √ |
| 7 | nc_ts | nc_ts | nc_ts | char(19) |
| 8 | oper_type | oper_type | oper_type | varchar2(50) |
| 9 | pass_flag | pass_flag | pass_flag | varchar2(50) |
| 10 | rel_company_id | rel_company_id | rel_company_id | varchar2(64) |
| 11 | rel_subject_code | rel_subject_code | rel_subject_code | varchar2(64) |
| 12 | remark | remark | remark | varchar2(3000) |
| 13 | source_name | source_name | source_name | varchar2(1536) |
| 14 | special_name | special_name | special_name | varchar2(1536) |
| 15 | subject_code | subject_code | subject_code | varchar2(150) |
| 16 | subject_name | subject_name | subject_name | varchar2(1024) |
| 17 | subject_order | subject_order | subject_order | varchar2(64) |
| 18 | subject_result | subject_result | subject_result | varchar2(1536) |
| 19 | supervise_flag | supervise_flag | supervise_flag | varchar2(50) |
| 20 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 21 | upload_time | upload_time | upload_time | char(19) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |