# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7563.html

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
| 13 | blanknote_no | blanknote_no | blanknote_no | varchar2(100) |
| 14 | cash_item | cash_item | cash_item | varchar2(20) |  |  | '~' |
| 15 | cf_man | cf_man | cf_man | varchar2(20) |  |  | '~' |
| 16 | cf_status | cf_status | cf_status | number(38, 0) |
| 17 | cf_type | cf_type | cf_type | number(38, 0) |
| 18 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 19 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 20 | customername | customername | customername | varchar2(300) |
| 21 | direction | direction | direction | number(38, 0) | √ |
| 22 | direct_ecds | direct_ecds | direct_ecds | char(1) |
| 23 | djxtflag | djxtflag | djxtflag | char(1) |
| 24 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 25 | facard_no | facard_no | facard_no | varchar2(50) |
| 26 | failurereason | failurereason | failurereason | varchar2(181) |
| 27 | freeitemid | freeitemid | freeitemid | char(20) |
| 28 | globallocal | globallocal | globallocal | number(28, 8) |
| 29 | globalrate | globalrate | globalrate | number(15, 8) |
| 30 | global_local_ts | global_local_ts | global_local_ts | number(28, 8) |
| 31 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 32 | grouprate | grouprate | grouprate | number(15, 8) |
| 33 | group_local_ts | group_local_ts | group_local_ts | number(28, 8) |
| 34 | innertransno | innertransno | innertransno | varchar2(50) |
| 35 | is_refuse | is_refuse | is_refuse | char(1) |
| 36 | local_rate | local_rate | local_rate | number(15, 8) |
| 37 | memo | memo | memo | varchar2(272) |
| 38 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 39 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 40 | note_type | note_type | note_type | varchar2(20) |  |  | '~' |
| 41 | objecttype | objecttype | objecttype | number(38, 0) |
| 42 | openbill_date | openbill_date | openbill_date | char(19) |
| 43 | paydate | paydate | paydate | char(19) |
| 44 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 45 | payreason | payreason | payreason | varchar2(50) |
| 46 | paystatus | paystatus | paystatus | number(38, 0) |
| 47 | pay_count | pay_count | pay_count | number(20, 8) |
| 48 | pay_local | pay_local | pay_local | number(28, 8) |
| 49 | pay_primal | pay_primal | pay_primal | number(28, 8) |
| 50 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 51 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 52 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 53 | pk_busiman | pk_busiman | pk_busiman | varchar2(20) |  |  | '~' |
| 54 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(20) |  |  | '~' |
| 55 | pk_busiorg_v | pk_busiorg_v | pk_busiorg_v | varchar2(20) |  |  | '~' |
| 56 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 57 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 58 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 59 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 60 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 61 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 62 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 63 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 64 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(20) |  |  | '~' |
| 65 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 66 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 67 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 68 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 69 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 70 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 71 | pk_recproject | pk_recproject | pk_recproject | varchar2(20) |  |  | '~' |
| 72 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 73 | pk_sourcebill_detail | pk_sourcebill_detail | pk_sourcebill_detail | varchar2(20) |  |  | '~' |
| 74 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 75 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 76 | pk_trader | pk_trader | pk_trader | char(20) |
| 77 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 78 | pk_upperbill | pk_upperbill | pk_upperbill | varchar2(20) |  |  | '~' |
| 79 | pk_upperbill_detail | pk_upperbill_detail | pk_upperbill_detail | varchar2(20) |  |  | '~' |
| 80 | price | price | price | number(28, 8) |
| 81 | rec_flag | rec_flag | rec_flag | char(1) |
| 82 | refusenote | refusenote | refusenote | varchar2(181) |
| 83 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 84 | sanhu | sanhu | sanhu | varchar2(20) |  |  | '~' |
| 85 | source_billtype | source_billtype | source_billtype | varchar2(20) |  |  | '~' |
| 86 | suppliername | suppliername | suppliername | varchar2(300) |
| 87 | teade_type | teade_type | teade_type | varchar2(20) |  |  | '~' |
| 88 | trade_type | trade_type | trade_type | varchar2(20) | √ |
| 89 | transerial | transerial | transerial | varchar2(50) |
| 90 | ts_local | ts_local | ts_local | number(28, 8) |
| 91 | ts_primal | ts_primal | ts_primal | number(28, 8) |
| 92 | upper_billtype | upper_billtype | upper_billtype | varchar2(20) |  |  | '~' |
| 93 | vrowno | vrowno | vrowno | varchar2(50) |
| 94 | def1 | def1 | def1 | varchar2(101) |
| 95 | def2 | def2 | def2 | varchar2(101) |
| 96 | def3 | def3 | def3 | varchar2(101) |
| 97 | def4 | def4 | def4 | varchar2(101) |
| 98 | def5 | def5 | def5 | varchar2(101) |
| 99 | def6 | def6 | def6 | varchar2(101) |
| 100 | def7 | def7 | def7 | varchar2(101) |
| 101 | def8 | def8 | def8 | varchar2(101) |
| 102 | def9 | def9 | def9 | varchar2(101) |
| 103 | def10 | def10 | def10 | varchar2(101) |
| 104 | def11 | def11 | def11 | varchar2(101) |
| 105 | def12 | def12 | def12 | varchar2(101) |
| 106 | def13 | def13 | def13 | varchar2(101) |
| 107 | def14 | def14 | def14 | varchar2(101) |
| 108 | def15 | def15 | def15 | varchar2(101) |
| 109 | def16 | def16 | def16 | varchar2(101) |
| 110 | def17 | def17 | def17 | varchar2(101) |
| 111 | def18 | def18 | def18 | varchar2(101) |
| 112 | def19 | def19 | def19 | varchar2(101) |
| 113 | def20 | def20 | def20 | varchar2(101) |
| 114 | zyx21 | zyx21 | zyx21 | varchar2(101) |
| 115 | zyx22 | zyx22 | zyx22 | varchar2(101) |
| 116 | zyx23 | zyx23 | zyx23 | varchar2(101) |
| 117 | zyx24 | zyx24 | zyx24 | varchar2(101) |
| 118 | zyx25 | zyx25 | zyx25 | varchar2(101) |
| 119 | zyx26 | zyx26 | zyx26 | varchar2(101) |
| 120 | zyx27 | zyx27 | zyx27 | varchar2(101) |
| 121 | zyx28 | zyx28 | zyx28 | varchar2(101) |
| 122 | zyx29 | zyx29 | zyx29 | varchar2(101) |
| 123 | zyx30 | zyx30 | zyx30 | varchar2(101) |
| 124 | creationtime | creationtime | creationtime | char(19) | √ |
| 125 | creator | creator | creator | varchar2(20) | √ |
| 126 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 127 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 128 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 129 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |