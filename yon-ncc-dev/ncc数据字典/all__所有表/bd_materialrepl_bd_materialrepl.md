# |<<

**12	substituterate	substituterate	substituterate	varchar2(50)	√		'1/1'**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialrepl | pk_materialrepl | pk_materialrepl | char(20) | √ |
| 2 | childnum | childnum | childnum | number(38, 0) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | fathernum | fathernum | fathernum | number(38, 0) |
| 5 | pk_material | pk_material | pk_material | char(20) | √ |
| 6 | pk_materialplan | pk_materialplan | pk_materialplan | char(20) | √ |
| 7 | pk_materialstock | pk_materialstock | pk_materialstock | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) | √ |
| 9 | pk_replace | pk_replace | pk_replace | char(20) | √ |
| 10 | pk_stockorg | pk_stockorg | pk_stockorg | char(20) |
| 11 | replaceorder | replaceorder | replaceorder | number(38, 0) |
| 12 | substituterate | substituterate | substituterate | varchar2(50) | √ |  | '1/1' |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | def6 | def6 | def6 | varchar2(101) |
| 19 | def7 | def7 | def7 | varchar2(101) |
| 20 | def8 | def8 | def8 | varchar2(101) |
| 21 | def9 | def9 | def9 | varchar2(101) |
| 22 | def10 | def10 | def10 | varchar2(101) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |