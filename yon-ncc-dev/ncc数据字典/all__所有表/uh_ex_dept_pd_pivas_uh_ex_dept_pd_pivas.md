# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpivas | pk_pdpivas | pk_pdpivas | char(20) | √ |
| 2 | barcode | barcode | barcode | varchar2(30) |
| 3 | date_admix | date_admix | date_admix | char(19) |
| 4 | date_exec | date_exec | date_exec | char(19) |
| 5 | date_instore | date_instore | date_instore | char(19) |
| 6 | date_outstore | date_outstore | date_outstore | char(19) |
| 7 | date_plan | date_plan | date_plan | char(19) |
| 8 | date_print | date_print | date_print | char(19) |
| 9 | date_sign | date_sign | date_sign | char(19) |
| 10 | desc_ord | desc_ord | desc_ord | varchar2(4000) |
| 11 | drip_speed | drip_speed | drip_speed | number(38, 0) |
| 12 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 13 | dt_usagenote | dt_usagenote | dt_usagenote | varchar2(50) |
| 14 | flag_admix | flag_admix | flag_admix | char(1) |
| 15 | flag_instore | flag_instore | flag_instore | char(1) |
| 16 | flag_outstore | flag_outstore | flag_outstore | char(1) |
| 17 | flag_print | flag_print | flag_print | char(1) |
| 18 | flag_sign | flag_sign | flag_sign | char(1) |
| 19 | flag_stop | flag_stop | flag_stop | char(1) |
| 20 | name_psn_admix | name_psn_admix | name_psn_admix | varchar2(50) |
| 21 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 22 | name_psn_instore | name_psn_instore | name_psn_instore | varchar2(50) |
| 23 | name_psn_outstore | name_psn_outstore | name_psn_outstore | varchar2(50) |
| 24 | name_psn_print | name_psn_print | name_psn_print | varchar2(50) |
| 25 | name_psn_sign | name_psn_sign | name_psn_sign | varchar2(50) |
| 26 | pk_dept_admix | pk_dept_admix | pk_dept_admix | varchar2(50) |
| 27 | pk_dept_ap | pk_dept_ap | pk_dept_ap | varchar2(50) |
| 28 | pk_exlist | pk_exlist | pk_exlist | varchar2(20) |
| 29 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_ivbatch | pk_ivbatch | pk_ivbatch | varchar2(50) |
| 32 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(50) |
| 33 | pk_ord | pk_ord | pk_ord | varchar2(50) |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_pati | pk_pati | pk_pati | varchar2(50) |
| 36 | pk_pd | pk_pd | pk_pd | varchar2(20) |
| 37 | pk_psn_admix | pk_psn_admix | pk_psn_admix | varchar2(20) |  |  | '~' |
| 38 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 39 | pk_psn_instore | pk_psn_instore | pk_psn_instore | varchar2(20) |  |  | '~' |
| 40 | pk_psn_outstore | pk_psn_outstore | pk_psn_outstore | varchar2(20) |  |  | '~' |
| 41 | pk_psn_print | pk_psn_print | pk_psn_print | varchar2(20) |  |  | '~' |
| 42 | pk_psn_sign | pk_psn_sign | pk_psn_sign | varchar2(20) |  |  | '~' |
| 43 | pk_pv | pk_pv | pk_pv | varchar2(50) |
| 44 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 45 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(50) |
| 46 | quan | quan | quan | number(38, 0) |
| 47 | quan_med | quan_med | quan_med | number(28, 8) |
| 48 | sortno | sortno | sortno | varchar2(50) |
| 49 | sortno_parent | sortno_parent | sortno_parent | varchar2(50) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |