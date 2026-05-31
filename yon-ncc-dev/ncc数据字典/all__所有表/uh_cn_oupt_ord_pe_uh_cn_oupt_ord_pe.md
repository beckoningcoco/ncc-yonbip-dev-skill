# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpe | pk_ordpe | pk_ordpe | char(20) | √ |
| 2 | code_pe | code_pe | code_pe | varchar2(256) |
| 3 | cycle | cycle | cycle | number(28, 8) |
| 4 | date_fm | date_fm | date_fm | char(19) |
| 5 | date_ll | date_ll | date_ll | char(19) |
| 6 | date_lm | date_lm | date_lm | char(19) |
| 7 | date_tum | date_tum | date_tum | char(19) |
| 8 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 9 | desc_opt | desc_opt | desc_opt | varchar2(256) |
| 10 | desc_treat | desc_treat | desc_treat | varchar2(256) |
| 11 | diag_pe | diag_pe | diag_pe | varchar2(256) |
| 12 | disease_hist | disease_hist | disease_hist | varchar2(256) |
| 13 | duration | duration | duration | number(28, 8) |
| 14 | eu_status | eu_status | eu_status | number(38, 0) |
| 15 | exam_aux | exam_aux | exam_aux | varchar2(256) |
| 16 | flag_met | flag_met | flag_met | char(1) |
| 17 | flag_pe | flag_pe | flag_pe | char(1) |
| 18 | part_body | part_body | part_body | varchar2(256) |
| 19 | part_tum | part_tum | part_tum | varchar2(256) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |
| 21 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |
| 23 | samp | samp | samp | varchar2(256) |
| 24 | sign | sign | sign | varchar2(256) |
| 25 | size_tum | size_tum | size_tum | varchar2(256) |
| 26 | spd_tum | spd_tum | spd_tum | varchar2(256) |
| 27 | symp | symp | symp | varchar2(256) |
| 28 | ts_abt | ts_abt | ts_abt | number(14, 2) |
| 29 | ts_labor | ts_labor | ts_labor | number(14, 2) |
| 30 | ts_pren | ts_pren | ts_pren | number(14, 2) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |