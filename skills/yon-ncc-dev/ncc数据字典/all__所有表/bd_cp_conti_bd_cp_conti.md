# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6824.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cpconti | pk_cpconti | pk_cpconti | char(20) | √ |
| 2 | code_conti | code_conti | code_conti | varchar2(30) |
| 3 | contitype | contitype | contitype | number(38, 0) |
| 4 | dt_op | dt_op | dt_op | varchar2(50) |
| 5 | fldname | fldname | fldname | varchar2(100) |
| 6 | name_conti | name_conti | name_conti | varchar2(50) |
| 7 | pk_cp | pk_cp | pk_cp | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_op | pk_op | pk_op | varchar2(50) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | sqls | sqls | sqls | varchar2(4000) |
| 12 | tblname | tblname | tblname | varchar2(100) |
| 13 | val_conti | val_conti | val_conti | varchar2(256) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |