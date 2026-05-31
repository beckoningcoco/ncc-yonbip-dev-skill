# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message_inbox | pk_message_inbox | pk_message_inbox | char(20) | √ |
| 2 | attachment_obj_id | attachment_obj_id | attachment_obj_id | varchar2(200) |
| 3 | attachname | attachname | attachname | varchar2(100) |
| 4 | execute_time | execute_time | execute_time | varchar2(50) |  |  | '~' |
| 5 | pk_message_outbox | pk_message_outbox | pk_message_outbox | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |