# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | datatype | datatype | datatype | varchar2(50) |
| 3 | pk_measure | pk_measure | pk_measure | varchar2(50) |
| 4 | pk_parent_measure | pk_parent_measure | pk_parent_measure | char(20) | √ |
| 5 | def1 | def1 | def1 | varchar2(100) |
| 6 | def2 | def2 | def2 | varchar2(100) |
| 7 | def3 | def3 | def3 | varchar2(100) |
| 8 | def4 | def4 | def4 | varchar2(100) |
| 9 | def5 | def5 | def5 | varchar2(100) |
| 10 | def6 | def6 | def6 | varchar2(100) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |