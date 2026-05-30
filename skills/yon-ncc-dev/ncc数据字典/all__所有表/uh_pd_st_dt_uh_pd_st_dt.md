# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdstdt | pk_pdstdt | pk_pdstdt | char(20) | √ |
| 2 | amt_p | amt_p | amt_p | number(28, 2) |
| 3 | amt_pay | amt_pay | amt_pay | number(28, 2) |
| 4 | amt_s | amt_s | amt_s | number(28, 2) |
| 5 | batchcode | batchcode | batchcode | varchar2(50) |
| 6 | date_chk | date_chk | date_chk | char(19) |
| 7 | date_expiry | date_expiry | date_expiry | char(19) |
| 8 | date_expiry_str | date_expiry_str | date_expiry_str | varchar2(20) |
| 9 | date_fac | date_fac | date_fac | char(19) |
| 10 | disc | disc | disc | number(28, 2) |
| 11 | dt_sttype | dt_sttype | dt_sttype | varchar2(20) |
| 12 | eu_validunit | eu_validunit | eu_validunit | number(38, 0) |
| 13 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 14 | factor_fb | factor_fb | factor_fb | varchar2(50) |
| 15 | flag_chk | flag_chk | flag_chk | char(1) |
| 16 | flag_finish | flag_finish | flag_finish | char(1) |
| 17 | flag_pay | flag_pay | flag_pay | char(1) |
| 18 | invno | invno | invno | varchar2(50) |
| 19 | note | note | note | varchar2(50) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 24 | pk_pdpay | pk_pdpay | pk_pdpay | varchar2(50) |
| 25 | pk_pdst | pk_pdst | pk_pdst | varchar2(20) |
| 26 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 27 | price_p_cur | price_p_cur | price_p_cur | number(28, 4) |
| 28 | price_s_cur | price_s_cur | price_s_cur | number(28, 4) |
| 29 | quan_base | quan_base | quan_base | number(28, 2) |
| 30 | quan_cur | quan_cur | quan_cur | number(28, 2) |
| 31 | quan_issue_base | quan_issue_base | quan_issue_base | number(28, 2) |
| 32 | sortno | sortno | sortno | number(38, 0) |
| 33 | validno | validno | validno | number(38, 0) |
| 34 | def1 | def1 | def1 | varchar2(50) |
| 35 | def2 | def2 | def2 | varchar2(50) |
| 36 | def3 | def3 | def3 | varchar2(50) |
| 37 | def4 | def4 | def4 | varchar2(50) |
| 38 | def5 | def5 | def5 | varchar2(50) |
| 39 | def6 | def6 | def6 | varchar2(50) |
| 40 | def7 | def7 | def7 | varchar2(50) |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |