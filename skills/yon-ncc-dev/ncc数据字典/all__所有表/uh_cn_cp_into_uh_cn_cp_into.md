# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_into | pk_into | pk_into | char(20) | √ |
| 2 | code_diag | code_diag | code_diag | varchar2(32) |
| 3 | name_diag | name_diag | name_diag | varchar2(64) |
| 4 | pk_cp | pk_cp | pk_cp | varchar2(20) |  |  | '~' |
| 5 | pk_diag | pk_diag | pk_diag | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 7 | pk_org | pk_org | pk_org | char(20) | √ |
| 8 | remarks | remarks | remarks | varchar2(500) |
| 9 | type_into | type_into | type_into | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |