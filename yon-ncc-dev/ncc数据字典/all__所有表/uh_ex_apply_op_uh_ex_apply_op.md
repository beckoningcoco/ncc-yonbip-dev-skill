# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applyop | pk_applyop | pk_applyop | char(20) | √ |
| 2 | code_apply | code_apply | code_apply | varchar2(30) |
| 3 | date_apply | date_apply | date_apply | char(19) |
| 4 | date_comfirm | date_comfirm | date_comfirm | char(19) |
| 5 | date_entry | date_entry | date_entry | char(19) |
| 6 | date_est_begin | date_est_begin | date_est_begin | char(19) |
| 7 | date_op_begin | date_op_begin | date_op_begin | char(19) |
| 8 | date_op_end | date_op_end | date_op_end | char(19) |
| 9 | desc_diag_bop | desc_diag_bop | desc_diag_bop | varchar2(256) |
| 10 | desc_op | desc_op | desc_op | varchar2(256) |
| 11 | dt_anae | dt_anae | dt_anae | varchar2(50) |
| 12 | dt_asepsis | dt_asepsis | dt_asepsis | varchar2(50) |
| 13 | dt_bodypart_op | dt_bodypart_op | dt_bodypart_op | varchar2(50) |
| 14 | dt_oplevel | dt_oplevel | dt_oplevel | varchar2(50) |
| 15 | eu_status | eu_status | eu_status | number(38, 0) |
| 16 | flag_urgent | flag_urgent | flag_urgent | char(1) |
| 17 | name_psn_anae | name_psn_anae | name_psn_anae | varchar2(50) |
| 18 | name_psn_apply | name_psn_apply | name_psn_apply | varchar2(50) |
| 19 | name_psn_asis | name_psn_asis | name_psn_asis | varchar2(50) |
| 20 | name_psn_asis2 | name_psn_asis2 | name_psn_asis2 | varchar2(50) |
| 21 | name_psn_entry | name_psn_entry | name_psn_entry | varchar2(50) |
| 22 | note | note | note | varchar2(4000) |
| 23 | pk_anae | pk_anae | pk_anae | varchar2(20) |  |  | '~' |
| 24 | pk_asepsis | pk_asepsis | pk_asepsis | varchar2(20) |  |  | '~' |
| 25 | pk_bodypart_op | pk_bodypart_op | pk_bodypart_op | varchar2(20) |  |  | '~' |
| 26 | pk_dept_apply | pk_dept_apply | pk_dept_apply | varchar2(20) |  |  | '~' |
| 27 | pk_dept_entry | pk_dept_entry | pk_dept_entry | varchar2(20) |
| 28 | pk_diag_bop | pk_diag_bop | pk_diag_bop | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_oplevel | pk_oplevel | pk_oplevel | varchar2(20) |  |  | '~' |
| 31 | pk_opt | pk_opt | pk_opt | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_apply | pk_org_apply | pk_org_apply | varchar2(20) |  |  | '~' |
| 34 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 35 | pk_psn_anae | pk_psn_anae | pk_psn_anae | varchar2(20) |  |  | '~' |
| 36 | pk_psn_apply | pk_psn_apply | pk_psn_apply | varchar2(20) |  |  | '~' |
| 37 | pk_psn_asis | pk_psn_asis | pk_psn_asis | varchar2(20) |  |  | '~' |
| 38 | pk_psn_asis2 | pk_psn_asis2 | pk_psn_asis2 | varchar2(20) |  |  | '~' |
| 39 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 40 | pk_psn_phy_op | pk_psn_phy_op | pk_psn_phy_op | varchar2(20) |  |  | '~' |
| 41 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 42 | pk_srv_op | pk_srv_op | pk_srv_op | varchar2(50) |  |  | '~' |
| 43 | ticketno | ticketno | ticketno | number(38, 0) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |