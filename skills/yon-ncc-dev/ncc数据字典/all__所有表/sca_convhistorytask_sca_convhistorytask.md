# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ptk_historytask | ptk_historytask | ptk_historytask | char(20) | √ |
| 2 | circle_remarks | circle_remarks | circle_remarks | varchar2(500) |
| 3 | convdate | convdate | convdate | char(19) |
| 4 | execute_type | execute_type | execute_type | varchar2(50) |
| 5 | executor | executor | executor | varchar2(20) |  |  | '~' |
| 6 | history_code | history_code | history_code | varchar2(50) |
| 7 | history_name | history_name | history_name | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |