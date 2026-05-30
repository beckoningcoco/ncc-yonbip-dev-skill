# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordsrv | pk_ordsrv | pk_ordsrv | char(20) | √ |
| 2 | code_newborn | code_newborn | code_newborn | varchar2(50) |
| 3 | code_pres | code_pres | code_pres | varchar2(50) |
| 4 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 5 | code_srv | code_srv | code_srv | varchar2(50) |
| 6 | date_begin | date_begin | date_begin | char(19) |
| 7 | date_bill | date_bill | date_bill | char(19) |
| 8 | date_exec | date_exec | date_exec | char(19) |
| 9 | date_exec_canc | date_exec_canc | date_exec_canc | char(19) |
| 10 | date_req | date_req | date_req | char(19) |
| 11 | date_stop | date_stop | date_stop | char(19) |
| 12 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 13 | eu_status_bill | eu_status_bill | eu_status_bill | number(38, 0) |
| 14 | eu_status_exec | eu_status_exec | eu_status_exec | number(38, 0) |  |  | 0 |
| 15 | flag_cn | flag_cn | flag_cn | char(1) |
| 16 | flag_newborn | flag_newborn | flag_newborn | char(1) |
| 17 | flag_pati | flag_pati | flag_pati | char(1) |
| 18 | flag_pd | flag_pd | flag_pd | char(1) |
| 19 | flag_req_pd | flag_req_pd | flag_req_pd | char(1) |
| 20 | flag_srvset | flag_srvset | flag_srvset | char(1) |
| 21 | flag_stop | flag_stop | flag_stop | char(1) |
| 22 | flag_stop_cg | flag_stop_cg | flag_stop_cg | char(1) |
| 23 | name_psn_ordsrv | name_psn_ordsrv | name_psn_ordsrv | varchar2(50) |
| 24 | name_usagenote | name_usagenote | name_usagenote | varchar2(50) |
| 25 | note | note | note | varchar2(512) |
| 26 | pk_dept_exec | pk_dept_exec | pk_dept_exec | varchar2(20) |  |  | '~' |
| 27 | pk_dept_ordsrv | pk_dept_ordsrv | pk_dept_ordsrv | varchar2(20) |  |  | '~' |
| 28 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |  |  | '~' |
| 31 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_exec | pk_org_exec | pk_org_exec | varchar2(20) |  |  | '~' |
| 34 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 35 | pk_pres | pk_pres | pk_pres | varchar2(50) |
| 36 | pk_psn_exec | pk_psn_exec | pk_psn_exec | char(19) |  |  | '~' |
| 37 | pk_psn_ordsrv | pk_psn_ordsrv | pk_psn_ordsrv | varchar2(20) |  |  | '~' |
| 38 | pk_psn_stop | pk_psn_stop | pk_psn_stop | varchar2(20) |
| 39 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 40 | pk_pvipnewborn | pk_pvipnewborn | pk_pvipnewborn | varchar2(50) |
| 41 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 42 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 43 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 44 | pk_usagenote | pk_usagenote | pk_usagenote | varchar2(20) |
| 45 | pk_wg_phy | pk_wg_phy | pk_wg_phy | varchar2(20) |  |  | '~' |
| 46 | price | price | price | number(14, 2) |
| 47 | quan | quan | quan | number(14, 2) |
| 48 | quan_total | quan_total | quan_total | number(14, 2) |
| 49 | srv_sortno | srv_sortno | srv_sortno | number(38, 0) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |