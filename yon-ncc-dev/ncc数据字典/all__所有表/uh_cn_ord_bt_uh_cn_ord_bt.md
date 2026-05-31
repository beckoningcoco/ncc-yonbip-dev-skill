# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordbt | pk_ordbt | pk_ordbt | char(20) | √ |
| 2 | aim | aim | aim | number(38, 0) |
| 3 | alt | alt | alt | varchar2(50) |
| 4 | bbnos | bbnos | bbnos | varchar2(50) |
| 5 | blo_res | blo_res | blo_res | varchar2(50) |
| 6 | blo_trigger | blo_trigger | blo_trigger | varchar2(50) |
| 7 | btcont | btcont | btcont | number(38, 0) |
| 8 | count_bb | count_bb | count_bb | number(38, 0) |
| 9 | date_bp | date_bp | date_bp | char(19) |
| 10 | date_bt_app | date_bt_app | date_bt_app | char(19) |
| 11 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 12 | dt_blood_abo | dt_blood_abo | dt_blood_abo | varchar2(50) |
| 13 | dt_blood_rec | dt_blood_rec | dt_blood_rec | varchar2(50) |
| 14 | dt_blood_rh | dt_blood_rh | dt_blood_rh | varchar2(50) |
| 15 | dt_bttype | dt_bttype | dt_bttype | varchar2(20) |  |  | '~' |
| 16 | eu_status | eu_status | eu_status | number(38, 0) |
| 17 | flag_alhist | flag_alhist | flag_alhist | char(1) |
| 18 | flag_bp | flag_bp | flag_bp | char(1) |
| 19 | flag_bthist | flag_bthist | flag_bthist | char(1) |
| 20 | flag_lab | flag_lab | flag_lab | char(1) |
| 21 | flag_preghist | flag_preghist | flag_preghist | char(1) |
| 22 | flag_urgent | flag_urgent | flag_urgent | char(1) |
| 23 | hbsag | hbsag | hbsag | number(38, 0) |
| 24 | hct | hct | hct | varchar2(50) |
| 25 | hcv | hcv | hcv | number(38, 0) |
| 26 | hgb | hgb | hgb | varchar2(50) |
| 27 | hiv | hiv | hiv | number(38, 0) |
| 28 | name_psn_bp | name_psn_bp | name_psn_bp | varchar2(50) |
| 29 | note_bt | note_bt | note_bt | varchar2(50) |
| 30 | notsign_reason | notsign_reason | notsign_reason | varchar2(50) |
| 31 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_psn_bp | pk_psn_bp | pk_psn_bp | varchar2(20) |  |  | '~' |
| 36 | plt | plt | plt | varchar2(50) |
| 37 | quan_bt | quan_bt | quan_bt | number(28, 2) |
| 38 | signed_consent | signed_consent | signed_consent | char(1) |
| 39 | territorial | territorial | territorial | number(38, 0) |
| 40 | tp | tp | tp | number(38, 0) |
| 41 | unit_bt | unit_bt | unit_bt | varchar2(50) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |