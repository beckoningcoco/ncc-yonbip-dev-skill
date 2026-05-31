# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetfilewrite | pk_meetfilewrite | pk_meetfilewrite | char(20) | √ |
| 2 | file_id | file_id | file_id | varchar2(50) | √ |
| 3 | file_name | file_name | file_name | varchar2(200) |
| 4 | file_path | file_path | file_path | varchar2(2000) |
| 5 | file_type | file_type | file_type | varchar2(400) |
| 6 | meeting_id | meeting_id | meeting_id | varchar2(50) | √ |
| 7 | pk_meetingwrite | pk_meetingwrite | pk_meetingwrite | char(20) | √ |
| 8 | pk_meet_doc | pk_meet_doc | pk_meet_doc | varchar2(20) |
| 9 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 10 | upload_time | upload_time | upload_time | char(19) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |