# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7568.html

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
| 9 | blanknote_no | blanknote_no | blanknote_no | varchar2(100) |
| 10 | cash_item | cash_item | cash_item | varchar2(20) |  |  | '~' |
| 11 | cf_man | cf_man | cf_man | varchar2(20) |  |  | '~' |
| 12 | cf_status | cf_status | cf_status | number(38, 0) |
| 13 | cf_type | cf_type | cf_type | number(38, 0) |
| 14 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 15 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 16 | customername | customername | customername | varchar2(300) |
| 17 | direction | direction | direction | number(38, 0) | √ |
| 18 | djxtflag | djxtflag | djxtflag | char(1) |
| 19 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 20 | facard_no | facard_no | facard_no | varchar2(50) |
| 21 | failurereason | failurereason | failurereason | varchar2(181) |
| 22 | freeitemid | freeitemid | freeitemid | varchar2(20) |  |  | '~' |
| 23 | global_local_rec | global_local_rec | global_local_rec | number(28, 8) |
| 24 | global_local_ts | global_local_ts | global_local_ts | number(28, 8) |
| 25 | global_rate | global_rate | global_rate | number(15, 8) |
| 26 | group_local_rec | group_local_rec | group_local_rec | number(28, 8) |
| 27 | group_local_ts | group_local_ts | group_local_ts | number(28, 8) |
| 28 | group_rate | group_rate | group_rate | number(15, 8) |
| 29 | innertransno | innertransno | innertransno | varchar2(50) |
| 30 | is_refuse | is_refuse | is_refuse | char(1) |
| 31 | jobphaseid | jobphaseid | jobphaseid | varchar2(20) |  |  | '~' |
| 32 | local_rate | local_rate | local_rate | number(15, 8) |
| 33 | memo | memo | memo | varchar2(272) |
| 34 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 35 | note_direction | note_direction | note_direction | varchar2(10) |
| 36 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 37 | note_type | note_type | note_type | varchar2(20) |  |  | '~' |
| 38 | objecttype | objecttype | objecttype | number(38, 0) |
| 39 | oppaccountcode | oppaccountcode | oppaccountcode | varchar2(50) |
| 40 | oppaccountname | oppaccountname | oppaccountname | varchar2(300) |
| 41 | oppaccountopenbank | oppaccountopenbank | oppaccountopenbank | varchar2(200) |
| 42 | paydate | paydate | paydate | char(19) |
| 43 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 44 | payreason | payreason | payreason | varchar2(50) |
| 45 | paystatus | paystatus | paystatus | number(38, 0) |
| 46 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 47 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 48 | pk_busiman | pk_busiman | pk_busiman | varchar2(20) |  |  | '~' |
| 49 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(20) |  |  | '~' |
| 50 | pk_busiorg_v | pk_busiorg_v | pk_busiorg_v | varchar2(20) |  |  | '~' |
| 51 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 52 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 53 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 54 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 55 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 56 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 57 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 58 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 59 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(20) |  |  | '~' |
| 60 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 61 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 62 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 63 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 64 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 65 | pk_recbill | pk_recbill | pk_recbill | char(20) | √ |
| 66 | pk_recproject | pk_recproject | pk_recproject | varchar2(20) |  |  | '~' |
| 67 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 68 | pk_sourcebill_detail | pk_sourcebill_detail | pk_sourcebill_detail | varchar2(20) |  |  | '~' |
| 69 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 70 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 71 | pk_trader | pk_trader | pk_trader | char(20) |
| 72 | pk_upperbill | pk_upperbill | pk_upperbill | varchar2(20) |  |  | '~' |
| 73 | pk_upperbill_detail | pk_upperbill_detail | pk_upperbill_detail | varchar2(20) |  |  | '~' |
| 74 | price | price | price | number(28, 8) |
| 75 | rec_count | rec_count | rec_count | number(20, 8) |
| 76 | rec_flag | rec_flag | rec_flag | char(1) |
| 77 | rec_local | rec_local | rec_local | number(28, 8) |
| 78 | rec_primal | rec_primal | rec_primal | number(28, 8) |
| 79 | refusenote | refusenote | refusenote | varchar2(181) |
| 80 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 81 | sanhu | sanhu | sanhu | varchar2(20) |  |  | '~' |
| 82 | source_billtype | source_billtype | source_billtype | varchar2(20) |  |  | '~' |
| 83 | suppliername | suppliername | suppliername | varchar2(300) |
| 84 | teade_type | teade_type | teade_type | varchar2(20) |  |  | '~' |
| 85 | trade_type | trade_type | trade_type | varchar2(20) | √ |
| 86 | transerial | transerial | transerial | varchar2(50) |
| 87 | ts_local | ts_local | ts_local | number(28, 8) |
| 88 | ts_primal | ts_primal | ts_primal | number(28, 8) |
| 89 | upper_billtype | upper_billtype | upper_billtype | varchar2(20) |  |  | '~' |
| 90 | def1 | def1 | def1 | varchar2(101) |
| 91 | def2 | def2 | def2 | varchar2(101) |
| 92 | def3 | def3 | def3 | varchar2(101) |
| 93 | def4 | def4 | def4 | varchar2(101) |
| 94 | def5 | def5 | def5 | varchar2(101) |
| 95 | def6 | def6 | def6 | varchar2(101) |
| 96 | def7 | def7 | def7 | varchar2(101) |
| 97 | def8 | def8 | def8 | varchar2(101) |
| 98 | def9 | def9 | def9 | varchar2(101) |
| 99 | def10 | def10 | def10 | varchar2(101) |
| 100 | def11 | def11 | def11 | varchar2(101) |
| 101 | def12 | def12 | def12 | varchar2(101) |
| 102 | def13 | def13 | def13 | varchar2(101) |
| 103 | def14 | def14 | def14 | varchar2(101) |
| 104 | def15 | def15 | def15 | varchar2(101) |
| 105 | def16 | def16 | def16 | varchar2(101) |
| 106 | def17 | def17 | def17 | varchar2(101) |
| 107 | def18 | def18 | def18 | varchar2(101) |
| 108 | def19 | def19 | def19 | varchar2(101) |
| 109 | def20 | def20 | def20 | varchar2(101) |
| 110 | zyx21 | zyx21 | zyx21 | varchar2(101) |
| 111 | zyx22 | zyx22 | zyx22 | varchar2(101) |
| 112 | zyx23 | zyx23 | zyx23 | varchar2(101) |
| 113 | zyx24 | zyx24 | zyx24 | varchar2(101) |
| 114 | zyx25 | zyx25 | zyx25 | varchar2(101) |
| 115 | zyx26 | zyx26 | zyx26 | varchar2(101) |
| 116 | zyx27 | zyx27 | zyx27 | varchar2(101) |
| 117 | zyx28 | zyx28 | zyx28 | varchar2(101) |
| 118 | zyx29 | zyx29 | zyx29 | varchar2(101) |
| 119 | zyx30 | zyx30 | zyx30 | varchar2(101) |
| 120 | creationtime | creationtime | creationtime | char(19) | √ |
| 121 | creator | creator | creator | varchar2(20) | √ |
| 122 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 123 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 124 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 125 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |