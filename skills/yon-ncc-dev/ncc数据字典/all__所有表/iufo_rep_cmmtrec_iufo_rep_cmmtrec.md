# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9686.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | pk_record | pk_record | char(20) | √ |
| 2 | action | action | action | number(38, 0) |
| 3 | action_times | action_times | action_times | number(38, 0) |
| 4 | alone_id | alone_id | alone_id | varchar2(50) |
| 5 | final_operator | final_operator | final_operator | char(20) |
| 6 | final_oper_time | final_oper_time | final_oper_time | char(19) |
| 7 | operate_time | operate_time | operate_time | char(19) |
| 8 | operator | operator | operator | char(20) |
| 9 | pk_report | pk_report | pk_report | char(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |