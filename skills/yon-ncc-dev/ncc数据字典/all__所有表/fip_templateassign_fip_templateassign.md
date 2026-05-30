# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign | pk_assign | pk_assign | char(20) | √ |
| 2 | account_type | account_type | account_type | varchar2(20) |  |  | '~' |
| 3 | des_billtype | des_billtype | des_billtype | varchar2(101) |
| 4 | glvouchertype | glvouchertype | glvouchertype | varchar2(101) |  |  | '~' |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 6 | pk_glsumrule | pk_glsumrule | pk_glsumrule | varchar2(101) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_rasumrule | pk_rasumrule | pk_rasumrule | varchar2(101) |  |  | '~' |
| 10 | pk_transtemplate | pk_transtemplate | pk_transtemplate | varchar2(20) |  |  | '~' |
| 11 | ravouchertype | ravouchertype | ravouchertype | varchar2(101) |  |  | '~' |
| 12 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 13 | src_org | src_org | src_org | varchar2(20) |  |  | '~' |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | def6 | def6 | def6 | varchar2(101) |
| 20 | def7 | def7 | def7 | varchar2(101) |
| 21 | def8 | def8 | def8 | varchar2(101) |
| 22 | def9 | def9 | def9 | varchar2(101) |
| 23 | def10 | def10 | def10 | varchar2(101) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |