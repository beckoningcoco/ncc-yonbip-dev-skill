# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topic | pk_topic | pk_topic | char(20) | √ |
| 2 | max_value | max_value | max_value | number(12, 4) |
| 3 | min_value | min_value | min_value | number(12, 4) |
| 4 | pk_corp | pk_corp | pk_corp | char(20) |
| 5 | pk_topic_type | pk_topic_type | pk_topic_type | char(20) |
| 6 | scale | scale | scale | number(38, 0) |
| 7 | topic_code | topic_code | topic_code | varchar2(40) |
| 8 | topic_desc | topic_desc | topic_desc | varchar2(500) |
| 9 | topic_style | topic_style | topic_style | number(38, 0) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |