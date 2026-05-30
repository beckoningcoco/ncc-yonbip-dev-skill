# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | creditamount | creditamount | creditamount | number(28, 8) |
| 3 | debitamount | debitamount | debitamount | number(28, 8) |
| 4 | digest | digest | digest | varchar2(200) |
| 5 | hbprojectname | hbprojectname | hbprojectname | varchar2(200) |
| 6 | iorder | iorder | iorder | number(38, 0) |
| 7 | note | note | note | varchar2(200) |
| 8 | pk_countorg | pk_countorg | pk_countorg | varchar2(20) |  |  | '~' |
| 9 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 10 | pk_selforg | pk_selforg | pk_selforg | varchar2(20) |  |  | '~' |
| 11 | pk_vouchhead | pk_vouchhead | pk_vouchhead | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |