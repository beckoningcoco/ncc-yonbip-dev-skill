# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11308.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | meeting_id | meeting_id | meeting_id | char(20) | √ |
| 2 | item_id | item_id | item_id | varchar2(50) |
| 3 | list_id | list_id | list_id | varchar2(50) |
| 4 | meeting_order | meeting_order | meeting_order | varchar2(50) |
| 5 | type_code | type_code | type_code | varchar2(100) |
| 6 | type_name | type_name | type_name | varchar2(200) |
| 7 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 8 | upload_time | upload_time | upload_time | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |