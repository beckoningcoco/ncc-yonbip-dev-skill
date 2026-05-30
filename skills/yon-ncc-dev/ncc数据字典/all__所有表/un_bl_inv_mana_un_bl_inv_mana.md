# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivnmana | pk_ivnmana | pk_ivnmana | char(20) | √ |
| 2 | code_book | code_book | code_book | varchar2(30) |
| 3 | date_inv | date_inv | date_inv | char(19) |
| 4 | eu_status | eu_status | eu_status | number(38, 0) |
| 5 | flag_active | flag_active | flag_active | char(1) |
| 6 | invno_begin | invno_begin | invno_begin | varchar2(30) |
| 7 | invno_cur | invno_cur | invno_cur | varchar2(30) |
| 8 | invno_end | invno_end | invno_end | varchar2(30) |
| 9 | name_psn_inv | name_psn_inv | name_psn_inv | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_psn_inv | pk_psn_inv | pk_psn_inv | char(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |