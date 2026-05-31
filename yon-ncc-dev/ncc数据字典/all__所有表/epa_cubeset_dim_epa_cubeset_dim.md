# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7915.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | haveall | haveall | haveall | char(1) |
| 3 | objcode | objcode | objcode | varchar2(50) |
| 4 | pk_dimdef | pk_dimdef | pk_dimdef | varchar2(50) |
| 5 | pk_dimhierarchy | pk_dimhierarchy | pk_dimhierarchy | varchar2(50) |
| 6 | pk_parent_dim | pk_parent_dim | pk_parent_dim | char(20) | √ |
| 7 | def1 | def1 | def1 | varchar2(100) |
| 8 | def2 | def2 | def2 | varchar2(100) |
| 9 | def3 | def3 | def3 | varchar2(100) |
| 10 | def4 | def4 | def4 | varchar2(100) |
| 11 | def5 | def5 | def5 | varchar2(100) |
| 12 | def6 | def6 | def6 | varchar2(100) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |