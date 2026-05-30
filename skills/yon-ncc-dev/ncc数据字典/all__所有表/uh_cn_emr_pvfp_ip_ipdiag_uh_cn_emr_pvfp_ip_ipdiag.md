# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrfpdiag | pk_emrfpdiag | pk_emrfpdiag | char(20) | √ |
| 2 | code_diag | code_diag | code_diag | varchar2(30) |
| 3 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 4 | dt_emrfpdiagcase | dt_emrfpdiagcase | dt_emrfpdiagcase | varchar2(20) |
| 5 | flag_maj | flag_maj | flag_maj | char(1) |
| 6 | name_diag | name_diag | name_diag | varchar2(50) |
| 7 | note | note | note | varchar2(256) |
| 8 | order_num | order_num | order_num | number(38, 0) |
| 9 | pk_diag | pk_diag | pk_diag | varchar2(20) |
| 10 | pk_emrfp | pk_emrfp | pk_emrfp | varchar2(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |
| 13 | sortno | sortno | sortno | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |