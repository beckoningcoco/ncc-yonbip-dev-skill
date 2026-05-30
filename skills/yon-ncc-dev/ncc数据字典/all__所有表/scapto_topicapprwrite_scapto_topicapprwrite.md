# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicapprwrite | pk_topicapprwrite | pk_topicapprwrite | char(20) | √ |
| 2 | deliberation_id | deliberation_id | deliberation_id | varchar2(50) | √ |
| 3 | deliberation_personnel | deliberation_personnel | deliberation_personnel | varchar2(1024) |
| 4 | deliberation_result | deliberation_result | deliberation_result | varchar2(200) |
| 5 | meeting_id | meeting_id | meeting_id | varchar2(50) |
| 6 | pk_meettopicwrite | pk_meettopicwrite | pk_meettopicwrite | char(20) | √ |
| 7 | pk_topicapprove | pk_topicapprove | pk_topicapprove | varchar2(20) |
| 8 | subject_id | subject_id | subject_id | varchar2(50) | √ |
| 9 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 10 | upload_time | upload_time | upload_time | char(19) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |