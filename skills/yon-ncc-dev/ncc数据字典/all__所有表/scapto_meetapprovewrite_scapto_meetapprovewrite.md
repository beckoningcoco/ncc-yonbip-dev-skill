# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetapprovewrite | pk_meetapprovewrite | pk_meetapprovewrite | char(20) | √ |
| 2 | attendee_id | attendee_id | attendee_id | varchar2(50) | √ |
| 3 | attendee_name | attendee_name | attendee_name | varchar2(1024) |
| 4 | meeting_id | meeting_id | meeting_id | varchar2(50) | √ |
| 5 | pk_meetapprove | pk_meetapprove | pk_meetapprove | varchar2(20) |
| 6 | pk_meetingwrite | pk_meetingwrite | pk_meetingwrite | char(20) | √ |
| 7 | reason | reason | reason | varchar2(512) |
| 8 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 9 | upload_time | upload_time | upload_time | char(19) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |