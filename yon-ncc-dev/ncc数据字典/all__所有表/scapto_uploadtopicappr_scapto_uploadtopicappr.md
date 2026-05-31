# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | deliberation_id | deliberation_id | deliberation_id | char(20) | √ |
| 2 | deliberation_personnel | deliberation_personnel | deliberation_personnel | varchar2(1536) |
| 3 | deliberation_result | deliberation_result | deliberation_result | varchar2(200) |
| 4 | meeting_id | meeting_id | meeting_id | varchar2(50) |
| 5 | subject_id | subject_id | subject_id | char(20) | √ |
| 6 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 7 | upload_time | upload_time | upload_time | char(19) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |