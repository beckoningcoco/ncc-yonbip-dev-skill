# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetuploadfile | pk_meetuploadfile | pk_meetuploadfile | char(20) | √ |
| 2 | file_id | file_id | file_id | varchar2(50) | √ |
| 3 | file_name | file_name | file_name | varchar2(300) |
| 4 | file_path | file_path | file_path | varchar2(2000) |
| 5 | file_type | file_type | file_type | varchar2(400) |
| 6 | meeting_id | meeting_id | meeting_id | char(20) | √ |
| 7 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 8 | upload_time | upload_time | upload_time | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |