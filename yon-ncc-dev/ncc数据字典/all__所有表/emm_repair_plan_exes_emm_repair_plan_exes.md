# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_exes | pk_repair_plan_exes | pk_repair_plan_exes | char(20) | √ |
| 2 | exesmoney | exesmoney | exesmoney | number(28, 8) |
| 3 | exestype | exestype | exestype | varchar2(50) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_inoutbusiclass | pk_inoutbusiclass | pk_inoutbusiclass | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_repair_plan_b | pk_repair_plan_b | pk_repair_plan_b | char(20) | √ |
| 10 | rowno | rowno | rowno | varchar2(30) |
| 11 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 12 | def1 | def1 | def1 | varchar2(101) |
| 13 | def2 | def2 | def2 | varchar2(101) |
| 14 | def3 | def3 | def3 | varchar2(101) |
| 15 | def4 | def4 | def4 | varchar2(101) |
| 16 | def5 | def5 | def5 | varchar2(101) |
| 17 | def6 | def6 | def6 | varchar2(101) |
| 18 | def7 | def7 | def7 | varchar2(101) |
| 19 | def8 | def8 | def8 | varchar2(101) |
| 20 | def9 | def9 | def9 | varchar2(101) |
| 21 | def10 | def10 | def10 | varchar2(101) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |