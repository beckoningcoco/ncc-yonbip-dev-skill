# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_config | pk_config | pk_config | char(20) | √ |
| 2 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 3 | generateflag | generateflag | generateflag | number(38, 0) |
| 4 | generatemode | generatemode | generatemode | number(38, 0) |
| 5 | issum | issum | issum | char(1) |
| 6 | leachformula | leachformula | leachformula | varchar2(2000) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 9 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
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