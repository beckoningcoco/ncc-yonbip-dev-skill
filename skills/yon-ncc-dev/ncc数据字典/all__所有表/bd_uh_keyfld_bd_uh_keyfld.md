# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patikeyfld | pk_patikeyfld | pk_patikeyfld | char(20) | √ |
| 2 | code_fld | code_fld | code_fld | varchar2(50) |
| 3 | code_tbl | code_tbl | code_tbl | varchar2(50) |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | name_fld | name_fld | name_fld | varchar2(50) |
| 6 | note | note | note | varchar2(256) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |