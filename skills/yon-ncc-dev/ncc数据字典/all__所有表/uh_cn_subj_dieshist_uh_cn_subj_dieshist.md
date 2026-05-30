# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnsubjdieshist | pk_cnsubjdieshist | pk_cnsubjdieshist | char(20) | √ |
| 2 | dt_unit_peri | dt_unit_peri | dt_unit_peri | varchar2(50) |
| 3 | name_dies | name_dies | name_dies | varchar2(50) |
| 4 | name_sym | name_sym | name_sym | varchar2(50) |
| 5 | name_unit_peri | name_unit_peri | name_unit_peri | varchar2(50) |
| 6 | pk_cnsubj | pk_cnsubj | pk_cnsubj | varchar2(20) |  |  | '~' |
| 7 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 11 | pk_sym | pk_sym | pk_sym | varchar2(20) |  |  | '~' |
| 12 | pk_unit_peri | pk_unit_peri | pk_unit_peri | varchar2(20) |  |  | '~' |
| 13 | sortno | sortno | sortno | number(38, 0) |
| 14 | val_peri | val_peri | val_peri | number(14, 2) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |