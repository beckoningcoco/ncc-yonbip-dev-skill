# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpldt | pk_pdpldt | pk_pdpldt | char(20) | √ |
| 2 | date_deli | date_deli | date_deli | char(19) |
| 3 | date_reqr | date_reqr | date_reqr | char(19) |
| 4 | date_reqr_str | date_reqr_str | date_reqr_str | varchar2(50) |
| 5 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 6 | factor_fb | factor_fb | factor_fb | varchar2(50) |
| 7 | favtor_cur | favtor_cur | favtor_cur | varchar2(50) |
| 8 | flag_finish | flag_finish | flag_finish | char(1) |
| 9 | note | note | note | varchar2(50) |
| 10 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 15 | pk_pdpl | pk_pdpl | pk_pdpl | varchar2(20) |  |  | '~' |
| 16 | pk_psn_deli | pk_psn_deli | pk_psn_deli | varchar2(20) |  |  | '~' |
| 17 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 18 | pk_sup | pk_sup | pk_sup | varchar2(20) |  |  | '~' |
| 19 | quan_deli_base | quan_deli_base | quan_deli_base | number(28, 8) |
| 20 | quan_pl_base | quan_pl_base | quan_pl_base | number(28, 8) |
| 21 | quan_pl_cur | quan_pl_cur | quan_pl_cur | number(28, 8) |
| 22 | quan_rq_base | quan_rq_base | quan_rq_base | number(28, 8) |
| 23 | quan_rq_cur | quan_rq_cur | quan_rq_cur | number(28, 8) |
| 24 | sortno | sortno | sortno | number(38, 0) |
| 25 | unit_cur | unit_cur | unit_cur | varchar2(50) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |