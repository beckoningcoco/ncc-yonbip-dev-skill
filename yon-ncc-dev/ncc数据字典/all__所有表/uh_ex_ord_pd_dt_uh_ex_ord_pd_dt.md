# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddt | pk_ordpddt | pk_ordpddt | char(20) | √ |
| 2 | amount_back | amount_back | amount_back | number(14, 2) |
| 3 | amount_cg | amount_cg | amount_cg | number(14, 2) |
| 4 | amount_deli | amount_deli | amount_deli | number(14, 2) |
| 5 | amount_reqr | amount_reqr | amount_reqr | number(14, 2) |
| 6 | amount_ret | amount_ret | amount_ret | number(28, 8) |
| 7 | batch_pd | batch_pd | batch_pd | varchar2(30) |
| 8 | code_pd | code_pd | code_pd | varchar2(300) |
| 9 | code_srv | code_srv | code_srv | varchar2(50) |
| 10 | days_ord | days_ord | days_ord | number(38, 0) |
| 11 | desc_ord | desc_ord | desc_ord | varchar2(4000) |
| 12 | dt_dispmode | dt_dispmode | dt_dispmode | varchar2(50) |
| 13 | dt_pdtype | dt_pdtype | dt_pdtype | varchar2(50) |
| 14 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 15 | dt_usage | dt_usage | dt_usage | varchar2(20) |
| 16 | dt_usagenote | dt_usagenote | dt_usagenote | varchar2(50) |
| 17 | eu_medicontr | eu_medicontr | eu_medicontr | number(38, 0) |
| 18 | eu_status | eu_status | eu_status | number(38, 0) |
| 19 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 20 | name_ord | name_ord | name_ord | varchar2(50) |
| 21 | note | note | note | varchar2(4000) |
| 22 | ords | ords | ords | number(38, 0) |
| 23 | ords_back | ords_back | ords_back | number(38, 0) |
| 24 | ords_cg | ords_cg | ords_cg | number(38, 0) |
| 25 | ords_deli | ords_deli | ords_deli | number(38, 0) |
| 26 | ords_ret | ords_ret | ords_ret | number(38, 0) |
| 27 | pk_batch_pd | pk_batch_pd | pk_batch_pd | char(20) |
| 28 | pk_dispmode | pk_dispmode | pk_dispmode | varchar2(20) |  |  | '~' |
| 29 | pk_fac | pk_fac | pk_fac | varchar2(20) |  |  | '~' |
| 30 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | varchar2(20) |  |  | '~' |
| 33 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(20) |  |  | '~' |
| 34 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |  |  | '~' |
| 35 | pk_ord | pk_ord | pk_ord | char(20) |  |  | '~' |
| 36 | pk_ordpd | pk_ordpd | pk_ordpd | varchar2(20) |  |  | '~' |
| 37 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(50) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 40 | pk_pdtype | pk_pdtype | pk_pdtype | varchar2(20) |  |  | '~' |
| 41 | pk_sp | pk_sp | pk_sp | varchar2(20) |  |  | '~' |
| 42 | pk_sp_temp | pk_sp_temp | pk_sp_temp | varchar2(20) |  |  | '~' |
| 43 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 44 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 45 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 46 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(20) |  |  | '~' |
| 47 | price_sp | price_sp | price_sp | number(14, 8) |
| 48 | purprice_sp | purprice_sp | purprice_sp | number(14, 8) |
| 49 | quan_base_back | quan_base_back | quan_base_back | number(14, 2) |
| 50 | quan_base_cg | quan_base_cg | quan_base_cg | number(14, 2) |
| 51 | quan_base_deli | quan_base_deli | quan_base_deli | number(14, 2) |
| 52 | quan_base_reqr | quan_base_reqr | quan_base_reqr | number(14, 2) |
| 53 | quan_base_ret | quan_base_ret | quan_base_ret | number(14, 2) |
| 54 | quan_cur_back | quan_cur_back | quan_cur_back | number(14, 2) |
| 55 | quan_cur_cg | quan_cur_cg | quan_cur_cg | number(14, 2) |
| 56 | quan_cur_deli | quan_cur_deli | quan_cur_deli | number(14, 2) |
| 57 | quan_cur_reqr | quan_cur_reqr | quan_cur_reqr | number(14, 2) |
| 58 | quan_cur_ret | quan_cur_ret | quan_cur_ret | number(14, 2) |
| 59 | quan_med | quan_med | quan_med | number(28, 8) |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |