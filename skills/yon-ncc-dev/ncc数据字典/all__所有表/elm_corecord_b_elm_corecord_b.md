# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chgoilrecord_b | pk_chgoilrecord_b | pk_chgoilrecord_b | char(20) | √ |
| 2 | act_chgoil_date | act_chgoil_date | act_chgoil_date | char(19) |
| 3 | act_chgoil_quantity | act_chgoil_quantity | act_chgoil_quantity | number(28, 8) |
| 4 | chgoil_memo | chgoil_memo | chgoil_memo | varchar2(200) |
| 5 | chgoil_period | chgoil_period | chgoil_period | number(38, 0) |
| 6 | chgoil_period_unit | chgoil_period_unit | chgoil_period_unit | number(38, 0) |
| 7 | chgoil_responer | chgoil_responer | chgoil_responer | varchar2(20) |  |  | '~' |
| 8 | executed | executed | executed | char(1) |
| 9 | lubr_count | lubr_count | lubr_count | number(38, 0) |
| 10 | lubr_location | lubr_location | lubr_location | varchar2(50) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | next_chgoil_date | next_chgoil_date | next_chgoil_date | char(19) |
| 13 | pk_act_chgoil | pk_act_chgoil | pk_act_chgoil | varchar2(20) |  |  | '~' |
| 14 | pk_chgoilrecord | pk_chgoilrecord | pk_chgoilrecord | char(20) | √ |
| 15 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_lubrcard | pk_lubrcard | pk_lubrcard | varchar2(20) |  |  | '~' |
| 18 | pk_lubr_method | pk_lubr_method | pk_lubr_method | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_replace_oil | pk_replace_oil | pk_replace_oil | varchar2(20) |  |  | '~' |
| 22 | pk_responer | pk_responer | pk_responer | varchar2(20) |  |  | '~' |
| 23 | pk_stated_oil | pk_stated_oil | pk_stated_oil | varchar2(20) |  |  | '~' |
| 24 | plan_chgoil_date | plan_chgoil_date | plan_chgoil_date | char(19) |
| 25 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 26 | src_body_ts | src_body_ts | src_body_ts | varchar2(50) |
| 27 | src_head_ts | src_head_ts | src_head_ts | varchar2(50) |
| 28 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 29 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 30 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 31 | src_transitype | src_transitype | src_transitype | varchar2(50) |
| 32 | std_chgoil_quantity | std_chgoil_quantity | std_chgoil_quantity | number(28, 8) |
| 33 | unit | unit | unit | varchar2(20) |  |  | '~' |
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