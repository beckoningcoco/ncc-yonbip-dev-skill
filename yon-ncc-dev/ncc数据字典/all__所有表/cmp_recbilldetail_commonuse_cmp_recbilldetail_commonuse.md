# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7569.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recbill_detail | pk_recbill_detail | pk_recbill_detail | varchar2(20) | √ |  | '~' |
| 2 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 3 | bankroll_projet | bankroll_projet | bankroll_projet | varchar2(20) |  |  | '~' |
| 4 | billclass | billclass | billclass | varchar2(2) |
| 5 | billdetail_no | billdetail_no | billdetail_no | number(38, 0) |
| 6 | bill_date | bill_date | bill_date | char(19) | √ |
| 7 | bill_no | bill_no | bill_no | varchar2(40) |
| 8 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 9 | cash_item | cash_item | cash_item | varchar2(20) |  |  | '~' |
| 10 | cf_man | cf_man | cf_man | varchar2(20) |  |  | '~' |
| 11 | cf_status | cf_status | cf_status | number(38, 0) |
| 12 | cf_type | cf_type | cf_type | number(38, 0) |
| 13 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 14 | customername | customername | customername | varchar2(300) |
| 15 | direction | direction | direction | number(38, 0) | √ |
| 16 | djxtflag | djxtflag | djxtflag | char(1) |
| 17 | facard_no | facard_no | facard_no | varchar2(50) |
| 18 | freeitemid | freeitemid | freeitemid | varchar2(20) |  |  | '~' |
| 19 | global_local_rec | global_local_rec | global_local_rec | number(28, 8) |
| 20 | global_local_ts | global_local_ts | global_local_ts | number(28, 8) |
| 21 | global_rate | global_rate | global_rate | number(15, 8) |
| 22 | group_local_rec | group_local_rec | group_local_rec | number(28, 8) |
| 23 | group_local_ts | group_local_ts | group_local_ts | number(28, 8) |
| 24 | group_rate | group_rate | group_rate | number(15, 8) |
| 25 | is_refuse | is_refuse | is_refuse | char(1) |
| 26 | jobphaseid | jobphaseid | jobphaseid | varchar2(20) |  |  | '~' |
| 27 | local_rate | local_rate | local_rate | number(15, 8) |
| 28 | memo | memo | memo | varchar2(272) |
| 29 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 30 | note_direction | note_direction | note_direction | varchar2(10) |
| 31 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 32 | note_type | note_type | note_type | varchar2(20) |  |  | '~' |
| 33 | objecttype | objecttype | objecttype | number(38, 0) |
| 34 | oppaccountcode | oppaccountcode | oppaccountcode | varchar2(50) |
| 35 | oppaccountname | oppaccountname | oppaccountname | varchar2(300) |
| 36 | oppaccountopenbank | oppaccountopenbank | oppaccountopenbank | varchar2(200) |
| 37 | oppaccounttype | oppaccounttype | oppaccounttype | number(38, 0) |
| 38 | paydate | paydate | paydate | char(19) |
| 39 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 40 | paystatus | paystatus | paystatus | number(38, 0) |
| 41 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 42 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 43 | pk_busiman | pk_busiman | pk_busiman | varchar2(20) |  |  | '~' |
| 44 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 45 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 46 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 47 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 48 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 49 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 50 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 51 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 52 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | char(20) |
| 53 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 54 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 55 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 56 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 57 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 58 | pk_recbill | pk_recbill | pk_recbill | char(20) | √ |
| 59 | pk_recproject | pk_recproject | pk_recproject | varchar2(20) |  |  | '~' |
| 60 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 61 | pk_sourcebill_detail | pk_sourcebill_detail | pk_sourcebill_detail | varchar2(20) |  |  | '~' |
| 62 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 63 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 64 | pk_trader | pk_trader | pk_trader | char(20) |
| 65 | pk_upperbill | pk_upperbill | pk_upperbill | varchar2(20) |  |  | '~' |
| 66 | pk_upperbill_detail | pk_upperbill_detail | pk_upperbill_detail | varchar2(20) |  |  | '~' |
| 67 | price | price | price | number(28, 8) |
| 68 | rec_count | rec_count | rec_count | number(20, 8) |
| 69 | rec_flag | rec_flag | rec_flag | char(1) |
| 70 | rec_local | rec_local | rec_local | number(28, 8) |
| 71 | rec_primal | rec_primal | rec_primal | number(28, 8) |
| 72 | refusenote | refusenote | refusenote | varchar2(181) |
| 73 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 74 | sanhu | sanhu | sanhu | varchar2(20) |  |  | '~' |
| 75 | source_billtype | source_billtype | source_billtype | varchar2(20) |  |  | '~' |
| 76 | suppliername | suppliername | suppliername | varchar2(300) |
| 77 | teade_type | teade_type | teade_type | varchar2(20) |  |  | '~' |
| 78 | trade_type | trade_type | trade_type | varchar2(20) | √ |
| 79 | ts_local | ts_local | ts_local | number(28, 8) |
| 80 | ts_primal | ts_primal | ts_primal | number(28, 8) |
| 81 | upper_billtype | upper_billtype | upper_billtype | varchar2(20) |  |  | '~' |
| 82 | def1 | def1 | def1 | varchar2(101) |
| 83 | def2 | def2 | def2 | varchar2(101) |
| 84 | def3 | def3 | def3 | varchar2(101) |
| 85 | def4 | def4 | def4 | varchar2(101) |
| 86 | def5 | def5 | def5 | varchar2(101) |
| 87 | def6 | def6 | def6 | varchar2(101) |
| 88 | def7 | def7 | def7 | varchar2(101) |
| 89 | def8 | def8 | def8 | varchar2(101) |
| 90 | def9 | def9 | def9 | varchar2(101) |
| 91 | def10 | def10 | def10 | varchar2(101) |
| 92 | def11 | def11 | def11 | varchar2(101) |
| 93 | def12 | def12 | def12 | varchar2(101) |
| 94 | def13 | def13 | def13 | varchar2(101) |
| 95 | def14 | def14 | def14 | varchar2(101) |
| 96 | def15 | def15 | def15 | varchar2(101) |
| 97 | def16 | def16 | def16 | varchar2(101) |
| 98 | def17 | def17 | def17 | varchar2(101) |
| 99 | def18 | def18 | def18 | varchar2(101) |
| 100 | def19 | def19 | def19 | varchar2(101) |
| 101 | def20 | def20 | def20 | varchar2(101) |
| 102 | zyx21 | zyx21 | zyx21 | varchar2(101) |
| 103 | zyx22 | zyx22 | zyx22 | varchar2(101) |
| 104 | zyx23 | zyx23 | zyx23 | varchar2(101) |
| 105 | zyx24 | zyx24 | zyx24 | varchar2(101) |
| 106 | zyx25 | zyx25 | zyx25 | varchar2(101) |
| 107 | zyx26 | zyx26 | zyx26 | varchar2(101) |
| 108 | zyx27 | zyx27 | zyx27 | varchar2(101) |
| 109 | zyx28 | zyx28 | zyx28 | varchar2(101) |
| 110 | zyx29 | zyx29 | zyx29 | varchar2(101) |
| 111 | zyx30 | zyx30 | zyx30 | varchar2(101) |
| 112 | creationtime | creationtime | creationtime | char(19) | √ |
| 113 | creator | creator | creator | varchar2(20) | √ |
| 114 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 115 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 116 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 117 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |