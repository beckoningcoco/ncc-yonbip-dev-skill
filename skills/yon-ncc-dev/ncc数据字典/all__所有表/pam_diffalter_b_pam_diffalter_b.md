# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diffalter_b | pk_diffalter_b | pk_diffalter_b | varchar2(50) | √ |
| 2 | alter_flag | alter_flag | alter_flag | char(1) |
| 3 | checkusername | checkusername | checkusername | varchar2(20) |
| 4 | check_date | check_date | check_date | char(19) |
| 5 | dealresult | dealresult | dealresult | varchar2(200) |
| 6 | diffalert_reason | diffalert_reason | diffalert_reason | varchar2(20) |  |  | '~' |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | pk_assetuser_after | pk_assetuser_after | pk_assetuser_after | varchar2(20) |  |  | '~' |
| 9 | pk_assetuser_before | pk_assetuser_before | pk_assetuser_before | varchar2(20) |  |  | '~' |
| 10 | pk_diffalter | pk_diffalter | pk_diffalter | char(20) | √ |
| 11 | pk_equip | pk_equip | pk_equip | varchar2(20) | √ |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_mandept_after | pk_mandept_after | pk_mandept_after | varchar2(20) |  |  | '~' |
| 14 | pk_mandept_after_v | pk_mandept_after_v | pk_mandept_after_v | varchar2(20) |  |  | '~' |
| 15 | pk_mandept_before | pk_mandept_before | pk_mandept_before | varchar2(20) |  |  | '~' |
| 16 | pk_mandept_before_v | pk_mandept_before_v | pk_mandept_before_v | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_position_after | pk_position_after | pk_position_after | varchar2(20) |  |  | '~' |
| 20 | pk_position_before | pk_position_before | pk_position_before | varchar2(20) |  |  | '~' |
| 21 | pk_usedept_after | pk_usedept_after | pk_usedept_after | varchar2(20) |  |  | '~' |
| 22 | pk_usedept_after_v | pk_usedept_after_v | pk_usedept_after_v | varchar2(20) |  |  | '~' |
| 23 | pk_usedept_before | pk_usedept_before | pk_usedept_before | varchar2(20) |  |  | '~' |
| 24 | pk_usedept_before_v | pk_usedept_before_v | pk_usedept_before_v | varchar2(20) |  |  | '~' |
| 25 | pk_usedunit_after | pk_usedunit_after | pk_usedunit_after | varchar2(20) |  |  | '~' |
| 26 | pk_usedunit_after_v | pk_usedunit_after_v | pk_usedunit_after_v | varchar2(20) |  |  | '~' |
| 27 | pk_usedunit_before | pk_usedunit_before | pk_usedunit_before | varchar2(20) |  |  | '~' |
| 28 | pk_usedunit_before_v | pk_usedunit_before_v | pk_usedunit_before_v | varchar2(20) |  |  | '~' |
| 29 | pk_usingstatus_after | pk_usingstatus_after | pk_usingstatus_after | varchar2(20) |  |  | '~' |
| 30 | pk_usingstatus_before | pk_usingstatus_before | pk_usingstatus_before | varchar2(20) |  |  | '~' |
| 31 | rowno | rowno | rowno | varchar2(30) |
| 32 | status_date_after | status_date_after | status_date_after | char(19) |
| 33 | status_date_before | status_date_before | status_date_before | char(19) |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | def11 | def11 | def11 | varchar2(101) |
| 45 | def12 | def12 | def12 | varchar2(101) |
| 46 | def13 | def13 | def13 | varchar2(101) |
| 47 | def14 | def14 | def14 | varchar2(101) |
| 48 | def15 | def15 | def15 | varchar2(101) |
| 49 | def16 | def16 | def16 | varchar2(101) |
| 50 | def17 | def17 | def17 | varchar2(101) |
| 51 | def18 | def18 | def18 | varchar2(101) |
| 52 | def19 | def19 | def19 | varchar2(101) |
| 53 | def20 | def20 | def20 | varchar2(101) |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |