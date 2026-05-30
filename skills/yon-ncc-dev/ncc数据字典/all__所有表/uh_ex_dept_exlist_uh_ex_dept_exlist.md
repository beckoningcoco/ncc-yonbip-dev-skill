# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exlist | pk_exlist | pk_exlist | char(20) | √ |
| 2 | date_canc | date_canc | date_canc | char(19) |
| 3 | date_ex | date_ex | date_ex | char(19) |
| 4 | date_plan | date_plan | date_plan | char(19) |
| 5 | drip_speed | drip_speed | drip_speed | number(38, 0) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_base | flag_base | flag_base | char(1) |
| 8 | flag_canc | flag_canc | flag_canc | char(1) |
| 9 | flag_de | flag_de | flag_de | char(1) |
| 10 | flag_ex | flag_ex | flag_ex | char(1) |
| 11 | flag_print | flag_print | flag_print | char(1) |
| 12 | flag_print_exp | flag_print_exp | flag_print_exp | char(1) |  |  | 'N' |
| 13 | flag_print_sche | flag_print_sche | flag_print_sche | char(1) |
| 14 | flag_self | flag_self | flag_self | char(1) |
| 15 | flag_temp | flag_temp | flag_temp | number(38, 0) |  |  | 0 |
| 16 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 17 | name_psn_ex | name_psn_ex | name_psn_ex | varchar2(50) |
| 18 | pk_cg | pk_cg | pk_cg | varchar2(50) |
| 19 | pk_cg_canc | pk_cg_canc | pk_cg_canc | varchar2(50) |
| 20 | pk_deptpdde | pk_deptpdde | pk_deptpdde | varchar2(50) |
| 21 | pk_dept_canc | pk_dept_canc | pk_dept_canc | varchar2(50) |
| 22 | pk_dept_ex | pk_dept_ex | pk_dept_ex | varchar2(50) |
| 23 | pk_exet | pk_exet | pk_exet | varchar2(50) |
| 24 | pk_group | pk_group | pk_group | varchar2(50) |
| 25 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(50) |
| 26 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | char(20) |
| 27 | pk_ord | pk_ord | pk_ord | varchar2(50) |
| 28 | pk_org | pk_org | pk_org | varchar2(50) |
| 29 | pk_org_canc | pk_org_canc | pk_org_canc | varchar2(50) |
| 30 | pk_org_ex | pk_org_ex | pk_org_ex | varchar2(50) |
| 31 | pk_pdapdt | pk_pdapdt | pk_pdapdt | varchar2(50) |
| 32 | pk_pdapdt_canc | pk_pdapdt_canc | pk_pdapdt_canc | varchar2(50) |
| 33 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(50) |
| 34 | pk_psn_ex | pk_psn_ex | pk_psn_ex | varchar2(50) |
| 35 | pk_pv | pk_pv | pk_pv | varchar2(50) |
| 36 | quan | quan | quan | number(14, 2) |
| 37 | quan_ex | quan_ex | quan_ex | number(14, 4) |
| 38 | quan_ex_bak | quan_ex_bak | quan_ex_bak | number(14, 2) |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |