# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | attendee_id | attendee_id | attendee_id | char(20) | √ |
| 2 | attendee_name | attendee_name | attendee_name | varchar2(1536) |
| 3 | meeting_id | meeting_id | meeting_id | char(20) | √ |
| 4 | reason | reason | reason | varchar2(768) |
| 5 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 6 | upload_time | upload_time | upload_time | char(19) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |