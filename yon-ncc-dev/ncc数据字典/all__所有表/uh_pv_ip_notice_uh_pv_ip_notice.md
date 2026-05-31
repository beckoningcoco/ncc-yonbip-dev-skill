# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvipnotice | pk_pvipnotice | pk_pvipnotice | char(20) | √ |
| 2 | amt_deposit | amt_deposit | amt_deposit | number(14, 2) |
| 3 | date_admit | date_admit | date_admit | char(19) |
| 4 | date_notice | date_notice | date_notice | char(19) |
| 5 | date_valid | date_valid | date_valid | char(19) |
| 6 | desc_diag_op_els | desc_diag_op_els | desc_diag_op_els | varchar2(256) |
| 7 | desc_diag_op_els_tcm | desc_diag_op_els_tcm | desc_diag_op_els_tcm | varchar2(256) |
| 8 | desc_diag_op_maj | desc_diag_op_maj | desc_diag_op_maj | varchar2(256) |
| 9 | desc_diag_op_maj_tcm | desc_diag_op_maj_tcm | desc_diag_op_maj_tcm | varchar2(256) |
| 10 | dt_bedtype | dt_bedtype | dt_bedtype | varchar2(50) |
| 11 | dt_disestatus | dt_disestatus | dt_disestatus | varchar2(50) |
| 12 | dt_sendway | dt_sendway | dt_sendway | varchar2(50) |
| 13 | etreat_type | etreat_type | etreat_type | varchar2(50) |
| 14 | eu_status | eu_status | eu_status | number(38, 0) |
| 15 | flag_prehosp | flag_prehosp | flag_prehosp | varchar2(20) |
| 16 | insurance | insurance | insurance | varchar2(20) |
| 17 | name_psn_notice | name_psn_notice | name_psn_notice | varchar2(50) |
| 18 | name_psn_phy_op | name_psn_phy_op | name_psn_phy_op | varchar2(50) |
| 19 | note | note | note | varchar2(256) |
| 20 | patienttype | patienttype | patienttype | varchar2(20) |
| 21 | pk_bedtype | pk_bedtype | pk_bedtype | varchar2(20) |  |  | '~' |
| 22 | pk_dept_ns_ip | pk_dept_ns_ip | pk_dept_ns_ip | varchar2(20) |  |  | '~' |
| 23 | pk_dept_op | pk_dept_op | pk_dept_op | varchar2(20) |  |  | '~' |
| 24 | pk_dept_phy_ip | pk_dept_phy_ip | pk_dept_phy_ip | varchar2(20) |  |  | '~' |
| 25 | pk_diag_op_maj | pk_diag_op_maj | pk_diag_op_maj | varchar2(20) |  |  | '~' |
| 26 | pk_diag_op_tcm | pk_diag_op_tcm | pk_diag_op_tcm | varchar2(20) |  |  | '~' |
| 27 | pk_disestatus | pk_disestatus | pk_disestatus | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 32 | pk_psn_notice | pk_psn_notice | pk_psn_notice | varchar2(20) |  |  | '~' |
| 33 | pk_psn_phy_op | pk_psn_phy_op | pk_psn_phy_op | varchar2(20) |  |  | '~' |
| 34 | pk_pv_ip | pk_pv_ip | pk_pv_ip | varchar2(20) |  |  | '~' |
| 35 | pk_pv_op | pk_pv_op | pk_pv_op | varchar2(20) |  |  | '~' |
| 36 | pk_sendway | pk_sendway | pk_sendway | char(20) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |