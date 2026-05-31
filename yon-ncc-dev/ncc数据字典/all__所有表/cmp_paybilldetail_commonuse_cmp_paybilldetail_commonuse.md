# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill_detail | pk_paybill_detail | pk_paybill_detail | char(20) | √ |
| 2 | accountcode | accountcode | accountcode | varchar2(50) |
| 3 | accountname | accountname | accountname | varchar2(300) |
| 4 | accountopenbank | accountopenbank | accountopenbank | varchar2(300) |
| 5 | accounttype | accounttype | accounttype | number(38, 0) |
| 6 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 7 | bankroll_projet | bankroll_projet | bankroll_projet | varchar2(20) |  |  | '~' |
| 8 | billclass | billclass | billclass | varchar2(2) | √ |
| 9 | billdetail_no | billdetail_no | billdetail_no | number(38, 0) |
| 10 | bill_date | bill_date | bill_date | char(19) | √ |
| 11 | bill_no | bill_no | bill_no | varchar2(40) |
| 12 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 13 | cash_item | cash_item | cash_item | varchar2(20) |  |  | '~' |
| 14 | cf_man | cf_man | cf_man | varchar2(20) |  |  | '~' |
| 15 | cf_status | cf_status | cf_status | number(38, 0) |
| 16 | cf_type | cf_type | cf_type | number(38, 0) |
| 17 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 18 | customername | customername | customername | varchar2(300) |
| 19 | direction | direction | direction | number(38, 0) | √ |
| 20 | djxtflag | djxtflag | djxtflag | char(1) |
| 21 | facard_no | facard_no | facard_no | varchar2(50) |
| 22 | freeitemid | freeitemid | freeitemid | char(20) |
| 23 | globallocal | globallocal | globallocal | number(28, 8) |
| 24 | globalrate | globalrate | globalrate | number(15, 8) |
| 25 | global_local_ts | global_local_ts | global_local_ts | number(28, 8) |
| 26 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 27 | grouprate | grouprate | grouprate | number(15, 8) |
| 28 | group_local_ts | group_local_ts | group_local_ts | number(28, 8) |
| 29 | is_refuse | is_refuse | is_refuse | char(1) |
| 30 | local_rate | local_rate | local_rate | number(15, 8) |
| 31 | memo | memo | memo | varchar2(272) |
| 32 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 33 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 34 | note_type | note_type | note_type | varchar2(20) |  |  | '~' |
| 35 | objecttype | objecttype | objecttype | number(38, 0) |
| 36 | openbill_date | openbill_date | openbill_date | char(19) |
| 37 | paydate | paydate | paydate | char(19) |
| 38 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 39 | paystatus | paystatus | paystatus | number(38, 0) |
| 40 | pay_count | pay_count | pay_count | number(20, 8) |
| 41 | pay_local | pay_local | pay_local | number(28, 8) |
| 42 | pay_primal | pay_primal | pay_primal | number(28, 8) |
| 43 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 44 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 46 | pk_busiman | pk_busiman | pk_busiman | varchar2(20) |  |  | '~' |
| 47 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 48 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 49 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 50 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 51 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 52 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 53 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 54 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 55 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(50) |
| 56 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 57 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 58 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 59 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 60 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 61 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 62 | pk_recproject | pk_recproject | pk_recproject | varchar2(20) |  |  | '~' |
| 63 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 64 | pk_sourcebill_detail | pk_sourcebill_detail | pk_sourcebill_detail | varchar2(20) |  |  | '~' |
| 65 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 66 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 67 | pk_trader | pk_trader | pk_trader | char(20) |
| 68 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 69 | pk_upperbill | pk_upperbill | pk_upperbill | varchar2(20) |  |  | '~' |
| 70 | pk_upperbill_detail | pk_upperbill_detail | pk_upperbill_detail | varchar2(20) |  |  | '~' |
| 71 | price | price | price | number(28, 8) |
| 72 | rec_flag | rec_flag | rec_flag | char(1) |
| 73 | refusenote | refusenote | refusenote | varchar2(181) |
| 74 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 75 | sanhu | sanhu | sanhu | char(20) |
| 76 | source_billtype | source_billtype | source_billtype | varchar2(20) |  |  | '~' |
| 77 | suppliername | suppliername | suppliername | varchar2(300) |
| 78 | teade_type | teade_type | teade_type | varchar2(20) |  |  | '~' |
| 79 | trade_type | trade_type | trade_type | varchar2(20) | √ |
| 80 | ts_local | ts_local | ts_local | number(28, 8) |
| 81 | ts_primal | ts_primal | ts_primal | number(28, 8) |
| 82 | upper_billtype | upper_billtype | upper_billtype | varchar2(20) |  |  | '~' |
| 83 | def1 | def1 | def1 | varchar2(101) |
| 84 | def2 | def2 | def2 | varchar2(101) |
| 85 | def3 | def3 | def3 | varchar2(101) |
| 86 | def4 | def4 | def4 | varchar2(101) |
| 87 | def5 | def5 | def5 | varchar2(101) |
| 88 | def6 | def6 | def6 | varchar2(101) |
| 89 | def7 | def7 | def7 | varchar2(101) |
| 90 | def8 | def8 | def8 | varchar2(101) |
| 91 | def9 | def9 | def9 | varchar2(101) |
| 92 | def10 | def10 | def10 | varchar2(101) |
| 93 | def11 | def11 | def11 | varchar2(101) |
| 94 | def12 | def12 | def12 | varchar2(101) |
| 95 | def13 | def13 | def13 | varchar2(101) |
| 96 | def14 | def14 | def14 | varchar2(101) |
| 97 | def15 | def15 | def15 | varchar2(101) |
| 98 | def16 | def16 | def16 | varchar2(101) |
| 99 | def17 | def17 | def17 | varchar2(101) |
| 100 | def18 | def18 | def18 | varchar2(101) |
| 101 | def19 | def19 | def19 | varchar2(101) |
| 102 | def20 | def20 | def20 | varchar2(101) |
| 103 | zyx21 | zyx21 | zyx21 | varchar2(101) |
| 104 | zyx22 | zyx22 | zyx22 | varchar2(101) |
| 105 | zyx23 | zyx23 | zyx23 | varchar2(101) |
| 106 | zyx24 | zyx24 | zyx24 | varchar2(101) |
| 107 | zyx25 | zyx25 | zyx25 | varchar2(101) |
| 108 | zyx26 | zyx26 | zyx26 | varchar2(101) |
| 109 | zyx27 | zyx27 | zyx27 | varchar2(101) |
| 110 | zyx28 | zyx28 | zyx28 | varchar2(101) |
| 111 | zyx29 | zyx29 | zyx29 | varchar2(101) |
| 112 | zyx30 | zyx30 | zyx30 | varchar2(101) |
| 113 | creationtime | creationtime | creationtime | char(19) | √ |
| 114 | creator | creator | creator | varchar2(20) | √ |
| 115 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 116 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 117 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 118 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |