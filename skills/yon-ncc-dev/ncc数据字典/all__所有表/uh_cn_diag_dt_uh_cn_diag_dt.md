# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiagdt | pk_cndiagdt | pk_cndiagdt | char(20) | √ |
| 2 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 3 | flag_infect | flag_infect | flag_infect | char(1) |
| 4 | flag_maj | flag_maj | flag_maj | char(1) |
| 5 | flag_susp | flag_susp | flag_susp | char(1) |
| 6 | note | note | note | varchar2(256) |
| 7 | pk_cndiag | pk_cndiag | pk_cndiag | char(20) |
| 8 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | sortno | sortno | sortno | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |