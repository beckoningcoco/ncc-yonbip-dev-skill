# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpe | pk_ordpe | pk_ordpe | char(20) | √ |
| 2 | code_pe | code_pe | code_pe | varchar2(256) |
| 3 | cycle | cycle | cycle | number(28, 8) |
| 4 | date_diag | date_diag | date_diag | char(19) |
| 5 | date_fm | date_fm | date_fm | char(19) |
| 6 | date_ll | date_ll | date_ll | char(19) |
| 7 | date_lm | date_lm | date_lm | char(19) |
| 8 | date_tum | date_tum | date_tum | char(19) |
| 9 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 10 | desc_opt | desc_opt | desc_opt | varchar2(256) |
| 11 | desc_treat | desc_treat | desc_treat | varchar2(256) |
| 12 | diag_pe | diag_pe | diag_pe | varchar2(256) |
| 13 | disease_hist | disease_hist | disease_hist | varchar2(256) |
| 14 | duration | duration | duration | number(28, 8) |
| 15 | eu_status | eu_status | eu_status | number(38, 0) |
| 16 | exam_aux | exam_aux | exam_aux | varchar2(256) |
| 17 | fixed_liquid | fixed_liquid | fixed_liquid | varchar2(256) |
| 18 | flag_che | flag_che | flag_che | char(1) |
| 19 | flag_met | flag_met | flag_met | char(1) |
| 20 | flag_pe | flag_pe | flag_pe | char(1) |
| 21 | hos_diag | hos_diag | hos_diag | varchar2(256) |
| 22 | met_body | met_body | met_body | varchar2(256) |
| 23 | me_his | me_his | me_his | varchar2(256) |
| 24 | name_infect | name_infect | name_infect | varchar2(256) |
| 25 | note | note | note | varchar2(256) |
| 26 | part_body | part_body | part_body | varchar2(256) |
| 27 | part_tum | part_tum | part_tum | varchar2(256) |
| 28 | pe_type | pe_type | pe_type | varchar2(256) |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | samp | samp | samp | varchar2(256) |
| 33 | sign | sign | sign | varchar2(256) |
| 34 | size_tum | size_tum | size_tum | varchar2(256) |
| 35 | spd_tum | spd_tum | spd_tum | varchar2(256) |
| 36 | symp | symp | symp | varchar2(256) |
| 37 | ts_abt | ts_abt | ts_abt | number(14, 2) |
| 38 | ts_labor | ts_labor | ts_labor | number(14, 2) |
| 39 | ts_pren | ts_pren | ts_pren | number(14, 2) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |