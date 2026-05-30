# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivcmanadt | pk_ivcmanadt | pk_ivcmanadt | char(20) | √ |
| 2 | code_book | code_book | code_book | varchar2(30) |
| 3 | date_issue | date_issue | date_issue | char(19) |
| 4 | dt_invtype | dt_invtype | dt_invtype | char(20) |
| 5 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 6 | invcn | invcn | invcn | number(38, 0) |
| 7 | invno_begin | invno_begin | invno_begin | varchar2(30) |
| 8 | invno_end | invno_end | invno_end | varchar2(30) |
| 9 | name_psn_inv | name_psn_inv | name_psn_inv | varchar2(50) |
| 10 | name_psn_issue | name_psn_issue | name_psn_issue | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_psn_inv | pk_psn_inv | pk_psn_inv | char(20) |
| 14 | pk_psn_issue | pk_psn_issue | pk_psn_issue | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |