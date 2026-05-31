# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_state | pk_state | pk_state | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | char(32) |
| 3 | commit_state | commit_state | commit_state | number(38, 0) |
| 4 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 5 | firstcommittime | firstcommittime | firstcommittime | char(19) |
| 6 | flag_hasten | flag_hasten | flag_hasten | char(1) |
| 7 | flag_input | flag_input | flag_input | char(1) |
| 8 | flag_late | flag_late | flag_late | char(1) |
| 9 | flag_request | flag_request | flag_request | char(1) |
| 10 | input_person | input_person | input_person | varchar2(20) |  |  | '~' |
| 11 | input_task | input_task | input_task | varchar2(50) |
| 12 | input_time | input_time | input_time | char(19) |
| 13 | lastcalctime | lastcalctime | lastcalctime | char(19) |
| 14 | lastcommittime | lastcommittime | lastcommittime | char(19) |
| 15 | lastoperator | lastoperator | lastoperator | varchar2(20) |  |  | '~' |
| 16 | lastopertime | lastopertime | lastopertime | char(19) |
| 17 | last_action | last_action | last_action | number(38, 0) |
| 18 | pk_report | pk_report | pk_report | varchar2(20) |  |  | '~' |
| 19 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |