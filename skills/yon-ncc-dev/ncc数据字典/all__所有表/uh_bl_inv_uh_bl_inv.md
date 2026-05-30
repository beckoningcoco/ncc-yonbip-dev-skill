# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inv | pk_inv | pk_inv | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | amount_pati | amount_pati | amount_pati | number(28, 8) |
| 4 | date_canc | date_canc | date_canc | char(19) |
| 5 | date_inv | date_inv | date_inv | char(19) |
| 6 | desc_reason_canc | desc_reason_canc | desc_reason_canc | varchar2(256) |
| 7 | desc_resion_canc | desc_resion_canc | desc_resion_canc | varchar2(256) |
| 8 | dt_reason_canc | dt_reason_canc | dt_reason_canc | char(20) |
| 9 | dt_resion_canc | dt_resion_canc | dt_resion_canc | varchar2(50) |
| 10 | flag_blcc | flag_blcc | flag_blcc | char(1) |
| 11 | flag_blcc_canc | flag_blcc_canc | flag_blcc_canc | char(1) |
| 12 | flag_canc | flag_canc | flag_canc | char(1) |
| 13 | invno | invno | invno | varchar2(30) |
| 14 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 15 | name_psn_inv | name_psn_inv | name_psn_inv | varchar2(50) |
| 16 | note | note | note | varchar2(4000) |
| 17 | pk_blcc | pk_blcc | pk_blcc | varchar2(20) |  |  | '~' |
| 18 | pk_blcc_canc | pk_blcc_canc | pk_blcc_canc | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |
| 21 | pk_invisspk | pk_invisspk | pk_invisspk | varchar2(50) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 24 | pk_psn_inv | pk_psn_inv | pk_psn_inv | varchar2(20) |  |  | '~' |
| 25 | times_prt | times_prt | times_prt | number(38, 0) |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | def5 | def5 | def5 | varchar2(101) |
| 31 | def6 | def6 | def6 | varchar2(101) |
| 32 | def7 | def7 | def7 | varchar2(101) |
| 33 | def8 | def8 | def8 | varchar2(101) |
| 34 | def9 | def9 | def9 | varchar2(101) |
| 35 | def10 | def10 | def10 | varchar2(101) |
| 36 | def11 | def11 | def11 | varchar2(101) |
| 37 | def12 | def12 | def12 | varchar2(101) |
| 38 | def13 | def13 | def13 | varchar2(101) |
| 39 | def14 | def14 | def14 | varchar2(101) |
| 40 | def15 | def15 | def15 | varchar2(101) |
| 41 | def16 | def16 | def16 | varchar2(101) |
| 42 | def17 | def17 | def17 | varchar2(101) |
| 43 | def18 | def18 | def18 | varchar2(101) |
| 44 | def19 | def19 | def19 | varchar2(101) |
| 45 | def20 | def20 | def20 | varchar2(101) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |