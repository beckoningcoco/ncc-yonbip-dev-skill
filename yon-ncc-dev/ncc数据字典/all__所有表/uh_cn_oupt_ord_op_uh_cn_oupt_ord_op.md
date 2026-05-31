# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12536.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordop | pk_ordop | pk_ordop | char(20) | √ |
| 2 | app_no | app_no | app_no | varchar2(50) |
| 3 | date_confirm | date_confirm | date_confirm | char(19) |
| 4 | date_est_begin | date_est_begin | date_est_begin | char(19) |
| 5 | date_op_begin | date_op_begin | date_op_begin | char(19) |
| 6 | date_op_end | date_op_end | date_op_end | char(19) |
| 7 | desc_diag_bop | desc_diag_bop | desc_diag_bop | varchar2(50) |
| 8 | desc_op | desc_op | desc_op | varchar2(256) |
| 9 | desc_op_sub | desc_op_sub | desc_op_sub | varchar2(50) |
| 10 | dt_anae | dt_anae | dt_anae | varchar2(50) |
| 11 | dt_asepsis | dt_asepsis | dt_asepsis | varchar2(50) |
| 12 | dt_bodypart_op | dt_bodypart_op | dt_bodypart_op | varchar2(50) |
| 13 | dt_oplevel | dt_oplevel | dt_oplevel | varchar2(50) |
| 14 | dt_posi | dt_posi | dt_posi | varchar2(50) |
| 15 | dt_slottype | dt_slottype | dt_slottype | varchar2(20) |
| 16 | eu_optype | eu_optype | eu_optype | varchar2(50) |
| 17 | eu_status | eu_status | eu_status | varchar2(50) |
| 18 | flag_emrop | flag_emrop | flag_emrop | char(1) |
| 19 | flag_finish | flag_finish | flag_finish | char(1) |
| 20 | flag_hbv | flag_hbv | flag_hbv | char(1) |
| 21 | flag_hcv | flag_hcv | flag_hcv | char(1) |
| 22 | flag_hiv | flag_hiv | flag_hiv | char(1) |
| 23 | flag_mdr | flag_mdr | flag_mdr | char(1) |
| 24 | flag_nil | flag_nil | flag_nil | char(1) |
| 25 | flag_noresult | flag_noresult | flag_noresult | char(1) |
| 26 | flag_other | flag_other | flag_other | char(1) |
| 27 | flag_syphilis | flag_syphilis | flag_syphilis | char(1) |
| 28 | name_psn_anae | name_psn_anae | name_psn_anae | varchar2(50) |
| 29 | name_psn_asis | name_psn_asis | name_psn_asis | varchar2(50) |
| 30 | name_psn_asis2 | name_psn_asis2 | name_psn_asis2 | varchar2(50) |
| 31 | name_psn_phy_op | name_psn_phy_op | name_psn_phy_op | varchar2(50) |
| 32 | note_op | note_op | note_op | varchar2(4000) |
| 33 | pk_diag_bop | pk_diag_bop | pk_diag_bop | varchar2(20) |
| 34 | pk_diag_op | pk_diag_op | pk_diag_op | varchar2(50) |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |
| 36 | pk_opt | pk_opt | pk_opt | varchar2(20) |
| 37 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |
| 39 | pk_psn_anae | pk_psn_anae | pk_psn_anae | varchar2(20) |
| 40 | pk_psn_asis | pk_psn_asis | pk_psn_asis | varchar2(20) |
| 41 | pk_psn_asis2 | pk_psn_asis2 | pk_psn_asis2 | varchar2(20) |
| 42 | pk_psn_phy_op | pk_psn_phy_op | pk_psn_phy_op | varchar2(20) |
| 43 | ticketno | ticketno | ticketno | number(38, 0) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |