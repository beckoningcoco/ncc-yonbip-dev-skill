# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdapdt | pk_deptpdapdt | pk_deptpdapdt | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | batch | batch | batch | varchar2(50) |
| 4 | code_pd | code_pd | code_pd | varchar2(50) |
| 5 | code_pres | code_pres | code_pres | varchar2(50) |
| 6 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 7 | code_srv | code_srv | code_srv | varchar2(50) |
| 8 | date_canc | date_canc | date_canc | char(19) |
| 9 | date_control | date_control | date_control | char(19) |
| 10 | date_stop | date_stop | date_stop | char(19) |
| 11 | days_ord | days_ord | days_ord | number(38, 0) |
| 12 | desc_exdeptpdstop | desc_exdeptpdstop | desc_exdeptpdstop | varchar2(256) |
| 13 | desc_ord | desc_ord | desc_ord | varchar2(4000) |
| 14 | dt_dispmode | dt_dispmode | dt_dispmode | varchar2(50) |
| 15 | dt_exdeptpdstop | dt_exdeptpdstop | dt_exdeptpdstop | varchar2(50) |
| 16 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 17 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 18 | dt_usagenote | dt_usagenote | dt_usagenote | varchar2(50) |
| 19 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 20 | eu_medicontr | eu_medicontr | eu_medicontr | number(38, 0) |
| 21 | eu_pdtype | eu_pdtype | eu_pdtype | number(38, 0) |
| 22 | eu_recur | eu_recur | eu_recur | number(38, 0) |
| 23 | factor_cb | factor_cb | factor_cb | varchar2(256) |
| 24 | flag_base | flag_base | flag_base | char(1) |
| 25 | flag_canc | flag_canc | flag_canc | char(1) |
| 26 | flag_control | flag_control | flag_control | char(1) |
| 27 | flag_de | flag_de | flag_de | char(1) |
| 28 | flag_disc | flag_disc | flag_disc | char(1) |
| 29 | flag_fin | flag_fin | flag_fin | char(1) |
| 30 | flag_pati | flag_pati | flag_pati | char(1) |
| 31 | flag_stop | flag_stop | flag_stop | char(1) |
| 32 | name_ord | name_ord | name_ord | varchar2(50) |
| 33 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(256) |
| 34 | name_psn_control | name_psn_control | name_psn_control | varchar2(50) |
| 35 | name_psn_stop | name_psn_stop | name_psn_stop | varchar2(50) |
| 36 | note | note | note | varchar2(50) |
| 37 | ords | ords | ords | number(38, 0) |
| 38 | pk_cg | pk_cg | pk_cg | varchar2(50) |
| 39 | pk_cgsrv | pk_cgsrv | pk_cgsrv | varchar2(50) |
| 40 | pk_deptpdap | pk_deptpdap | pk_deptpdap | varchar2(50) |
| 41 | pk_dispmode | pk_dispmode | pk_dispmode | varchar2(20) |
| 42 | pk_exdeptpdstop | pk_exdeptpdstop | pk_exdeptpdstop | varchar2(20) |
| 43 | pk_freq | pk_freq | pk_freq | varchar2(20) |
| 44 | pk_freq_srv | pk_freq_srv | pk_freq_srv | varchar2(20) |
| 45 | pk_group | pk_group | pk_group | varchar2(50) |
| 46 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | varchar2(50) |
| 47 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(50) |
| 48 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |
| 49 | pk_ord | pk_ord | pk_ord | varchar2(50) |
| 50 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(20) |
| 51 | pk_org | pk_org | pk_org | varchar2(50) |
| 52 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 53 | pk_pd | pk_pd | pk_pd | varchar2(50) |
| 54 | pk_pres | pk_pres | pk_pres | varchar2(50) |
| 55 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |
| 56 | pk_psn_control | pk_psn_control | pk_psn_control | varchar2(20) |
| 57 | pk_psn_stop | pk_psn_stop | pk_psn_stop | varchar2(50) |
| 58 | pk_pv | pk_pv | pk_pv | varchar2(50) |
| 59 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |
| 60 | pk_srv | pk_srv | pk_srv | varchar2(20) |
| 61 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |
| 62 | pk_usage | pk_usage | pk_usage | varchar2(20) |
| 63 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(20) |
| 64 | price | price | price | number(28, 8) |
| 65 | price_cost | price_cost | price_cost | number(28, 8) |
| 66 | price_sp | price_sp | price_sp | number(28, 8) |
| 67 | purprice_sp | purprice_sp | purprice_sp | number(28, 8) |
| 68 | quan_base | quan_base | quan_base | number(28, 8) |
| 69 | quan_cur | quan_cur | quan_cur | number(28, 8) |
| 70 | quan_med | quan_med | quan_med | number(28, 8) |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |