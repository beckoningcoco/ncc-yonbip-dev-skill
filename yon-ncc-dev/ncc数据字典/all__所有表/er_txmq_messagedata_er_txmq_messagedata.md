# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | number(38, 0) | √ |  | 0 |
| 2 | biz_id | biz_id | biz_id | varchar2(100) |  |  | '~' |
| 3 | channel_type | channel_type | channel_type | varchar2(50) | √ |
| 4 | delay_level | delay_level | delay_level | number(38, 0) | √ |  | 0 |
| 5 | message_body | message_body | message_body | varchar2(4000) | √ |  | '' |
| 6 | message_key | message_key | message_key | varchar2(300) | √ |  | '' |
| 7 | message_tag | message_tag | message_tag | varchar2(500) | √ |  | '' |
| 8 | message_topic | message_topic | message_topic | varchar2(200) | √ |  | '' |
| 9 | message_type | message_type | message_type | varchar2(50) | √ |  | '' |
| 10 | order_type | order_type | order_type | number(38, 0) | √ |  | 0 |
| 11 | parent_id | parent_id | parent_id | number(38, 0) | √ |
| 12 | position | position | position | varchar2(50) | √ |  | '' |
| 13 | producer_code | producer_code | producer_code | varchar2(50) | √ |  | '' |
| 14 | task_status | task_status | task_status | varchar2(50) | √ |
| 15 | version | version | version | number(38, 0) | √ |  | 0 |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |