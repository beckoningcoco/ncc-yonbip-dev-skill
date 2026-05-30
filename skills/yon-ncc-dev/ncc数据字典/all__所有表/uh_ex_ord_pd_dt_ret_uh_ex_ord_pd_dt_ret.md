# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpdret | pk_ordpdret | pk_ordpdret | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | code_cg | code_cg | code_cg | varchar2(30) |
| 4 | code_st | code_st | code_st | varchar2(30) |
| 5 | date_deli | date_deli | date_deli | char(19) |
| 6 | dt_pdtype | dt_pdtype | dt_pdtype | varchar2(50) |
| 7 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 8 | factor_bc | factor_bc | factor_bc | number(28, 8) |
| 9 | flag_bl | flag_bl | flag_bl | char(19) |
| 10 | flag_ex | flag_ex | flag_ex | char(19) |
| 11 | flag_st | flag_st | flag_st | char(19) |
| 12 | name_pd | name_pd | name_pd | varchar2(50) |
| 13 | name_srv | name_srv | name_srv | varchar2(50) |
| 14 | note | note | note | varchar2(200) |
| 15 | pk_cg | pk_cg | pk_cg | char(20) |
| 16 | pk_exordpddeli | pk_exordpddeli | pk_exordpddeli | char(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | char(20) |
| 19 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | char(20) |
| 20 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | char(20) |
| 21 | pk_ord | pk_ord | pk_ord | char(20) |
| 22 | pk_ordpd | pk_ordpd | pk_ordpd | char(20) |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_pd | pk_pd | pk_pd | char(20) |
| 25 | pk_pdtype | pk_pdtype | pk_pdtype | char(20) |
| 26 | pk_psn_deli | pk_psn_deli | pk_psn_deli | char(20) |
| 27 | pk_srv | pk_srv | pk_srv | char(20) |
| 28 | pk_srvtype | pk_srvtype | pk_srvtype | char(20) |
| 29 | pk_st | pk_st | pk_st | char(20) |
| 30 | price_base | price_base | price_base | number(28, 8) |
| 31 | price_cur | price_cur | price_cur | number(28, 8) |
| 32 | quan_base_deli | quan_base_deli | quan_base_deli | number(28, 8) |
| 33 | quan_base_requ | quan_base_requ | quan_base_requ | number(28, 8) |
| 34 | quan_cur_deli | quan_cur_deli | quan_cur_deli | number(28, 8) |
| 35 | quan_cur_requ | quan_cur_requ | quan_cur_requ | number(28, 8) |
| 36 | spec_pd | spec_pd | spec_pd | varchar2(256) |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |