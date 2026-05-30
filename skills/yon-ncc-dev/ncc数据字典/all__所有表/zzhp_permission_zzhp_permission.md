# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm | pk_perm | pk_perm | char(20) | √ |
| 2 | begin_time | begin_time | begin_time | char(19) | √ |
| 3 | charge_inhosp | charge_inhosp | charge_inhosp | char(19) | √ |
| 4 | charge_level | charge_level | charge_level | number(38, 0) | √ |
| 5 | charge_outpatient | charge_outpatient | charge_outpatient | char(19) | √ |
| 6 | charge_pharmacy | charge_pharmacy | charge_pharmacy | char(19) | √ |
| 7 | dept | dept | dept | varchar2(32) |
| 8 | end_time | end_time | end_time | char(19) |
| 9 | fertility | fertility | fertility | char(19) | √ |
| 10 | fixed_hosp_no | fixed_hosp_no | fixed_hosp_no | varchar2(50) | √ |
| 11 | group_code | group_code | group_code | varchar2(10) |
| 12 | group_name | group_name | group_name | varchar2(100) |
| 13 | his_code | his_code | his_code | varchar2(50) |
| 14 | hosp_level | hosp_level | hosp_level | number(38, 0) | √ |
| 15 | hosp_type | hosp_type | hosp_type | number(38, 0) | √ |
| 16 | invoice_cur | invoice_cur | invoice_cur | varchar2(50) |
| 17 | invoice_max | invoice_max | invoice_max | varchar2(50) |
| 18 | login_name | login_name | login_name | varchar2(32) | √ |
| 19 | login_pwd | login_pwd | login_pwd | varchar2(32) | √ |
| 20 | note | note | note | varchar2(500) |
| 21 | operator | operator | operator | varchar2(32) |
| 22 | operator_status | operator_status | operator_status | number(38, 0) | √ |
| 23 | opt_time | opt_time | opt_time | char(19) | √ |
| 24 | opt_total | opt_total | opt_total | char(19) | √ |
| 25 | pwd_change | pwd_change | pwd_change | char(19) | √ |
| 26 | retire | retire | retire | char(19) | √ |
| 27 | seal_no | seal_no | seal_no | varchar2(50) |
| 28 | srv_org_name | srv_org_name | srv_org_name | varchar2(100) | √ |
| 29 | srv_type | srv_type | srv_type | number(38, 0) | √ |
| 30 | staff_code | staff_code | staff_code | varchar2(32) | √ |
| 31 | staff_name | staff_name | staff_name | varchar2(32) | √ |
| 32 | st_lst | st_lst | st_lst | varchar2(50) |
| 33 | transfer | transfer | transfer | char(19) | √ |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |