# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskcommit | pk_taskcommit | pk_taskcommit | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | char(32) |
| 3 | commit_state | commit_state | commit_state | number(38, 0) |
| 4 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 5 | firstcommittime | firstcommittime | firstcommittime | char(19) |
| 6 | flag_hasten | flag_hasten | flag_hasten | char(1) |
| 7 | flag_late | flag_late | flag_late | char(1) |
| 8 | flag_request | flag_request | flag_request | char(1) |
| 9 | input_person | input_person | input_person | char(20) |
| 10 | input_time | input_time | input_time | char(19) |
| 11 | lastcommittime | lastcommittime | lastcommittime | char(19) |
| 12 | lastoperator | lastoperator | lastoperator | char(20) |
| 13 | lastopertime | lastopertime | lastopertime | char(19) |
| 14 | last_action | last_action | last_action | number(38, 0) |
| 15 | pk_task | pk_task | pk_task | char(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |