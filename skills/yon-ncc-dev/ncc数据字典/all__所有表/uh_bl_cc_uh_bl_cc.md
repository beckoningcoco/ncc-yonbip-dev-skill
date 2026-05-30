# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blcc | pk_blcc | pk_blcc | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | amt_ins | amt_ins | amt_ins | number(14, 2) |
| 4 | amt_inv | amt_inv | amt_inv | number(14, 2) |
| 5 | amt_piprepay | amt_piprepay | amt_piprepay | number(14, 2) |
| 6 | amt_piprepay_ret | amt_piprepay_ret | amt_piprepay_ret | number(14, 2) |
| 7 | amt_prepay | amt_prepay | amt_prepay | number(14, 2) |
| 8 | amt_prepay_rtn | amt_prepay_rtn | amt_prepay_rtn | number(14, 2) |
| 9 | amt_pvprepay | amt_pvprepay | amt_pvprepay | number(14, 2) |
| 10 | amt_pvprepay_ret | amt_pvprepay_ret | amt_pvprepay_ret | number(14, 2) |
| 11 | amt_return | amt_return | amt_return | number(14, 2) |
| 12 | amt_st | amt_st | amt_st | number(14, 2) |
| 13 | amt_st_ret | amt_st_ret | amt_st_ret | number(14, 2) |
| 14 | date_begin | date_begin | date_begin | char(19) |
| 15 | date_cc | date_cc | date_cc | char(19) |
| 16 | date_clear | date_clear | date_clear | char(19) |
| 17 | date_end | date_end | date_end | char(19) |
| 18 | dt_cctype | dt_cctype | dt_cctype | varchar2(20) |
| 19 | flag_canc | flag_canc | flag_canc | char(1) |
| 20 | flag_clear | flag_clear | flag_clear | char(1) |
| 21 | invcn | invcn | invcn | number(38, 0) |
| 22 | invcn_canc | invcn_canc | invcn_canc | number(38, 0) |
| 23 | invcn_pvprepay | invcn_pvprepay | invcn_pvprepay | number(38, 0) |
| 24 | invcn_pvprepay_ret | invcn_pvprepay_ret | invcn_pvprepay_ret | number(38, 0) |
| 25 | invnos | invnos | invnos | varchar2(256) |
| 26 | invnos_pvprepay | invnos_pvprepay | invnos_pvprepay | varchar2(256) |
| 27 | invnos_pvprepay_ret | invnos_pvprepay_ret | invnos_pvprepay_ret | varchar2(4000) |
| 28 | invs_canc | invs_canc | invs_canc | varchar2(4000) |
| 29 | name_psn | name_psn | name_psn | varchar2(50) |
| 30 | pk_blcl | pk_blcl | pk_blcl | varchar2(20) |  |  | '~' |
| 31 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |