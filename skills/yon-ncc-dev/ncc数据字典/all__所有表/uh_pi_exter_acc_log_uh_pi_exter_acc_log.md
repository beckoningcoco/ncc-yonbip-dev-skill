# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exteracc | pk_exteracc | pk_exteracc | char(20) | √ |
| 2 | code_card | code_card | code_card | varchar2(100) |
| 3 | create_time | create_time | create_time | char(19) |
| 4 | event_obj | event_obj | event_obj | varchar2(50) |
| 5 | exception_info | exception_info | exception_info | varchar2(2000) |
| 6 | name_method | name_method | name_method | varchar2(50) |
| 7 | process_status | process_status | process_status | varchar2(50) |
| 8 | receive_info | receive_info | receive_info | varchar2(2000) |
| 9 | send_info | send_info | send_info | varchar2(2000) |
| 10 | serial_num | serial_num | serial_num | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |