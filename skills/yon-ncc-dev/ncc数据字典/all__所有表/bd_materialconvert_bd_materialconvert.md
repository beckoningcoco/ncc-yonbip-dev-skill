# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialconvert | pk_materialconvert | pk_materialconvert | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | fixedflag | fixedflag | fixedflag | char(1) |  |  | 'N' |
| 4 | flag_ip | flag_ip | flag_ip | char(1) |
| 5 | flag_op | flag_op | flag_op | char(1) |
| 6 | ispiecemangage | ispiecemangage | ispiecemangage | char(1) |  |  | 'N' |
| 7 | isprodmeasdoc | isprodmeasdoc | isprodmeasdoc | char(1) |  |  | 'N' |
| 8 | ispumeasdoc | ispumeasdoc | ispumeasdoc | char(1) |  |  | 'N' |
| 9 | isretailmeasdoc | isretailmeasdoc | isretailmeasdoc | char(1) |  |  | 'N' |
| 10 | issalemeasdoc | issalemeasdoc | issalemeasdoc | char(1) |  |  | 'N' |
| 11 | isstockmeasdoc | isstockmeasdoc | isstockmeasdoc | char(1) |  |  | 'N' |
| 12 | isstorebalance | isstorebalance | isstorebalance | char(1) |  |  | 'Y' |
| 13 | measrate | measrate | measrate | varchar2(50) | √ |
| 14 | pk_apartmeasdoc | pk_apartmeasdoc | pk_apartmeasdoc | varchar2(20) |  |  | '~' |
| 15 | pk_material | pk_material | pk_material | char(20) | √ |
| 16 | pk_measdoc | pk_measdoc | pk_measdoc | char(20) | √ |
| 17 | showorder | showorder | showorder | number(38, 0) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | def6 | def6 | def6 | varchar2(101) |
| 24 | def7 | def7 | def7 | varchar2(101) |
| 25 | def8 | def8 | def8 | varchar2(101) |
| 26 | def9 | def9 | def9 | varchar2(101) |
| 27 | def10 | def10 | def10 | varchar2(101) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |