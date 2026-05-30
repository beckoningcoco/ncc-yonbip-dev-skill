# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | alldims | alldims | alldims | varchar2(1024) |
| 3 | balancecreditamount | balancecreditamount | balancecreditamount | number(28, 8) |
| 4 | balancedebitamount | balancedebitamount | balancedebitamount | number(28, 8) |
| 5 | creditamount | creditamount | creditamount | number(28, 8) |
| 6 | debitamount | debitamount | debitamount | number(28, 8) |
| 7 | digest | digest | digest | varchar2(200) |
| 8 | hbprojectname | hbprojectname | hbprojectname | varchar2(200) |
| 9 | iorder | iorder | iorder | number(38, 0) |
| 10 | note | note | note | varchar2(1024) |
| 11 | pk_countorg | pk_countorg | pk_countorg | varchar2(20) |  |  | '~' |
| 12 | pk_formula | pk_formula | pk_formula | varchar2(50) |
| 13 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 14 | pk_meethead | pk_meethead | pk_meethead | char(20) | √ |
| 15 | pk_selforg | pk_selforg | pk_selforg | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |