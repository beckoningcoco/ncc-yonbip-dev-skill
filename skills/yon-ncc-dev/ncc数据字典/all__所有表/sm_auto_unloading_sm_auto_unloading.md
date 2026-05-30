# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11521.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auto | pk_auto | pk_auto | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | exec_time | exec_time | exec_time | number(38, 0) |
| 4 | last_excution | last_excution | last_excution | char(19) |
| 5 | objtype | objtype | objtype | number(38, 0) |
| 6 | paravalue | paravalue | paravalue | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_task | pk_task | pk_task | char(20) |
| 9 | save_path | save_path | save_path | varchar2(250) |
| 10 | trig_time | trig_time | trig_time | char(19) |
| 11 | type | type | type | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |