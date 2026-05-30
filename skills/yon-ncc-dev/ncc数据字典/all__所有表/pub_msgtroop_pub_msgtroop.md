# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgtroop | pk_msgtroop | pk_msgtroop | char(20) | √ |
| 2 | group_code | group_code | group_code | varchar2(20) |
| 3 | group_name | group_name | group_name | varchar2(40) |
| 4 | owner | owner | owner | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |