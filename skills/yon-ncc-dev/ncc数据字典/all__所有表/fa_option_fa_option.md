# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_option | pk_option | pk_option | char(20) | √ |
| 2 | accyear | accyear | accyear | varchar2(4) |
| 3 | depall_flag | depall_flag | depall_flag | char(1) |
| 4 | depmethod_flag | depmethod_flag | depmethod_flag | char(1) |
| 5 | depperiod | depperiod | depperiod | number(38, 0) | √ |
| 6 | dep_flag | dep_flag | dep_flag | char(1) |
| 7 | jobfileadjust_flag | jobfileadjust_flag | jobfileadjust_flag | char(1) |
| 8 | jobmngfil_flag | jobmngfil_flag | jobmngfil_flag | number(38, 0) |
| 9 | newcate_flag | newcate_flag | newcate_flag | number(38, 0) |
| 10 | newmandept_flag | newmandept_flag | newmandept_flag | number(38, 0) |
| 11 | newusedept_flag | newusedept_flag | newusedept_flag | number(38, 0) |
| 12 | newusingstatus | newusingstatus | newusingstatus | char(1) |
| 13 | period | period | period | varchar2(4) |
| 14 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |
| 18 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 19 | servicemonth_flag | servicemonth_flag | servicemonth_flag | char(1) |
| 20 | workloan_flag | workloan_flag | workloan_flag | char(1) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |