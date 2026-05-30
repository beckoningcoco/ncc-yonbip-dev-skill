# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordlis | pk_ordlis | pk_ordlis | char(20) | √ |
| 2 | code_samp | code_samp | code_samp | varchar2(50) |
| 3 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 4 | dt_colltype | dt_colltype | dt_colltype | varchar2(50) |
| 5 | dt_contype | dt_contype | dt_contype | varchar2(50) |
| 6 | dt_samptype | dt_samptype | dt_samptype | varchar2(50) |
| 7 | eu_status | eu_status | eu_status | number(38, 0) |
| 8 | flag_prt | flag_prt | flag_prt | char(1) |
| 9 | flag_urgent | flag_urgent | flag_urgent | char(1) |
| 10 | note_lis | note_lis | note_lis | varchar2(4000) |
| 11 | pk_colltype | pk_colltype | pk_colltype | varchar2(20) |  |  | '~' |
| 12 | pk_contype | pk_contype | pk_contype | varchar2(20) |  |  | '~' |
| 13 | pk_dept_coll | pk_dept_coll | pk_dept_coll | varchar2(20) |  |  | '~' |
| 14 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_samptype | pk_samptype | pk_samptype | varchar2(20) |  |  | '~' |
| 19 | purpose_lis | purpose_lis | purpose_lis | varchar2(256) |
| 20 | def1 | def1 | def1 | varchar2(100) |
| 21 | def2 | def2 | def2 | varchar2(100) |
| 22 | def3 | def3 | def3 | varchar2(100) |
| 23 | def4 | def4 | def4 | varchar2(100) |
| 24 | def5 | def5 | def5 | varchar2(100) |
| 25 | def6 | def6 | def6 | varchar2(100) |
| 26 | def7 | def7 | def7 | varchar2(100) |
| 27 | def8 | def8 | def8 | varchar2(100) |
| 28 | def9 | def9 | def9 | varchar2(100) |
| 29 | def10 | def10 | def10 | varchar2(100) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |