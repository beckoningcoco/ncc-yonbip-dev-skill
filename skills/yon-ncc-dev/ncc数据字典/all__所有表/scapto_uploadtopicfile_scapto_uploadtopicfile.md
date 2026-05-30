# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicuploadfile | pk_topicuploadfile | pk_topicuploadfile | char(20) | √ |
| 2 | file_id | file_id | file_id | varchar2(50) | √ |
| 3 | file_name | file_name | file_name | varchar2(200) |
| 4 | file_path | file_path | file_path | varchar2(2000) |
| 5 | file_type | file_type | file_type | varchar2(400) |
| 6 | meeting_id | meeting_id | meeting_id | varchar2(50) |
| 7 | subject_id | subject_id | subject_id | char(20) | √ |
| 8 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 9 | upload_time | upload_time | upload_time | char(19) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |