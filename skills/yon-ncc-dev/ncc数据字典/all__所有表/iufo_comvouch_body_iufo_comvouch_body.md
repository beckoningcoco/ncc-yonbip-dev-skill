# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | creditamount | creditamount | creditamount | number(28, 8) |
| 3 | debitamount | debitamount | debitamount | number(28, 8) |
| 4 | digest | digest | digest | varchar2(50) |
| 5 | iorder | iorder | iorder | number(38, 0) |
| 6 | note | note | note | varchar2(1024) |
| 7 | pk_comvouch_head | pk_comvouch_head | pk_comvouch_head | varchar2(50) |
| 8 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |