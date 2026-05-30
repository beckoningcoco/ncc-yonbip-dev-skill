# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_messagemeta | pk_wf_messagemeta | pk_wf_messagemeta | char(20) | √ |
| 2 | activity_id | activity_id | activity_id | char(36) |
| 3 | billid | billid | billid | char(20) |
| 4 | billno | billno | billno | varchar2(200) |
| 5 | billtype | billtype | billtype | varchar2(50) |
| 6 | message_type | message_type | message_type | varchar2(50) |
| 7 | pk_checkflow | pk_checkflow | pk_checkflow | char(20) |
| 8 | pk_group | pk_group | pk_group | char(20) |  |  | '~' |
| 9 | pk_message | pk_message | pk_message | char(20) |  |  | '~' |
| 10 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) |
| 11 | receiver | receiver | receiver | char(20) |  |  | '~' |
| 12 | senddate | senddate | senddate | char(19) |
| 13 | title | title | title | varchar2(2048) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |