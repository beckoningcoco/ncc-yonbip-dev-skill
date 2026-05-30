# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialbindle | pk_materialbindle | pk_materialbindle | char(20) | √ |
| 2 | bindlenum | bindlenum | bindlenum | number(38, 0) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enddate | enddate | enddate | char(19) |
| 5 | pk_bindle | pk_bindle | pk_bindle | char(20) | √ |
| 6 | pk_materialsale | pk_materialsale | pk_materialsale | char(20) | √ |
| 7 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 8 | price | price | price | number(20, 8) |
| 9 | pricetype | pricetype | pricetype | number(38, 0) | √ |  | 0 |
| 10 | def1 | def1 | def1 | varchar2(101) |
| 11 | def2 | def2 | def2 | varchar2(101) |
| 12 | def3 | def3 | def3 | varchar2(101) |
| 13 | def4 | def4 | def4 | varchar2(101) |
| 14 | def5 | def5 | def5 | varchar2(101) |
| 15 | def6 | def6 | def6 | varchar2(101) |
| 16 | def7 | def7 | def7 | varchar2(101) |
| 17 | def8 | def8 | def8 | varchar2(101) |
| 18 | def9 | def9 | def9 | varchar2(101) |
| 19 | def10 | def10 | def10 | varchar2(101) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |