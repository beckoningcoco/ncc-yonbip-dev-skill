# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdmode | pk_bdmode | pk_bdmode | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | managemode | managemode | managemode | number(38, 0) | √ |
| 5 | mdclassid | mdclassid | mdclassid | varchar2(36) | √ |  | '~' |
| 6 | uniquescope | uniquescope | uniquescope | number(38, 0) | √ |
| 7 | visiblescope | visiblescope | visiblescope | number(38, 0) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |