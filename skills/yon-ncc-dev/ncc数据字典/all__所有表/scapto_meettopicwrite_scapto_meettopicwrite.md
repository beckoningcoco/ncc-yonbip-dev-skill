# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meettopicwrite | pk_meettopicwrite | pk_meettopicwrite | char(20) | √ |
| 2 | adopt_flag | adopt_flag | adopt_flag | varchar2(50) |
| 3 | approval_flag | approval_flag | approval_flag | varchar2(50) |
| 4 | item_code | item_code | item_code | varchar2(128) |
| 5 | meeting_id | meeting_id | meeting_id | varchar2(50) | √ |
| 6 | nc_ts | nc_ts | nc_ts | char(19) |
| 7 | oper_type | oper_type | oper_type | varchar2(50) |
| 8 | pass_flag | pass_flag | pass_flag | varchar2(50) |
| 9 | pk_meetingwrite | pk_meetingwrite | pk_meetingwrite | char(20) | √ |
| 10 | pk_meettopic | pk_meettopic | pk_meettopic | varchar2(20) |
| 11 | pk_topicreport | pk_topicreport | pk_topicreport | varchar2(20) |
| 12 | rel_company_id | rel_company_id | rel_company_id | varchar2(64) |
| 13 | rel_meet_code | rel_meet_code | rel_meet_code | varchar2(50) |
| 14 | rel_subject_code | rel_subject_code | rel_subject_code | varchar2(64) |
| 15 | remark | remark | remark | varchar2(2000) |
| 16 | source_name | source_name | source_name | varchar2(1024) |
| 17 | special_name | special_name | special_name | varchar2(1024) |
| 18 | subject_code | subject_code | subject_code | varchar2(100) |
| 19 | subject_id | subject_id | subject_id | varchar2(50) | √ |
| 20 | subject_name | subject_name | subject_name | varchar2(1024) |
| 21 | subject_order | subject_order | subject_order | varchar2(64) |
| 22 | subject_result | subject_result | subject_result | varchar2(1024) |
| 23 | supervise_flag | supervise_flag | supervise_flag | varchar2(50) |
| 24 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 25 | upload_time | upload_time | upload_time | char(19) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |