# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logevaluate | pk_logevaluate | pk_logevaluate | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) |
| 3 | evaluate_date | evaluate_date | evaluate_date | char(19) |
| 4 | newdep | newdep | newdep | number(28, 8) |
| 5 | newnetvalue | newnetvalue | newnetvalue | number(28, 8) |
| 6 | newsalvage | newsalvage | newsalvage | number(28, 8) |
| 7 | newservicemonth | newservicemonth | newservicemonth | number(38, 0) |
| 8 | newvalue | newvalue | newvalue | number(28, 8) |
| 9 | newworkloan | newworkloan | newworkloan | number(28, 8) |
| 10 | olddep | olddep | olddep | number(28, 8) |
| 11 | oldnetvalue | oldnetvalue | oldnetvalue | number(28, 8) |
| 12 | oldsalvage | oldsalvage | oldsalvage | number(28, 8) |
| 13 | oldservicemonth | oldservicemonth | oldservicemonth | number(38, 0) |
| 14 | oldvalue | oldvalue | oldvalue | number(28, 8) |
| 15 | oldworkloan | oldworkloan | oldworkloan | number(28, 8) |
| 16 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 17 | pk_card | pk_card | pk_card | char(20) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |