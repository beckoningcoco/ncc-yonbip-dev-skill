# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_changebill_detail | pk_changebill_detail | pk_changebill_detail | varchar2(20) | √ |  | '~' |
| 2 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 3 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 4 | bankroll_projet | bankroll_projet | bankroll_projet | varchar2(20) |  |  | '~' |
| 5 | billclass | billclass | billclass | varchar2(2) |
| 6 | billdetail_no | billdetail_no | billdetail_no | number(38, 0) |
| 7 | bill_date | bill_date | bill_date | char(19) | √ |
| 8 | bill_no | bill_no | bill_no | varchar2(40) |
| 9 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 10 | cash_item | cash_item | cash_item | varchar2(20) |  |  | '~' |
| 11 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 12 | contractno | contractno | contractno | varchar2(40) |
| 13 | customername | customername | customername | varchar2(300) |
| 14 | direction | direction | direction | number(38, 0) |
| 15 | djxtflag | djxtflag | djxtflag | char(1) |
| 16 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 17 | equipment_code | equipment_code | equipment_code | varchar2(20) |  |  | '~' |
| 18 | facard_no | facard_no | facard_no | char(80) |
| 19 | freeitemid | freeitemid | freeitemid | varchar2(20) |  |  | '~' |
| 20 | globallocal | globallocal | globallocal | number(28, 8) |
| 21 | global_local_pay | global_local_pay | global_local_pay | number(28, 8) |
| 22 | global_rate | global_rate | global_rate | number(15, 8) |
| 23 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 24 | group_local_pay | group_local_pay | group_local_pay | number(28, 8) |
| 25 | group_rate | group_rate | group_rate | number(15, 8) |
| 26 | jobphaseid | jobphaseid | jobphaseid | varchar2(20) |  |  | '~' |
| 27 | local_rate | local_rate | local_rate | number(15, 8) |
| 28 | memo | memo | memo | varchar2(272) |
| 29 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 30 | note_direction | note_direction | note_direction | varchar2(10) |
| 31 | note_no | note_no | note_no | varchar2(50) |
| 32 | note_type | note_type | note_type | varchar2(20) |  |  | '~' |
| 33 | objecttype | objecttype | objecttype | number(38, 0) |
| 34 | openbill_date | openbill_date | openbill_date | char(19) |
| 35 | oppaccountcode | oppaccountcode | oppaccountcode | varchar2(50) |
| 36 | paydate | paydate | paydate | char(19) |
| 37 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 38 | paystatus | paystatus | paystatus | number(38, 0) |
| 39 | pay_count | pay_count | pay_count | number(20, 8) |
| 40 | pay_local | pay_local | pay_local | number(28, 8) |
| 41 | pay_primal | pay_primal | pay_primal | number(28, 8) |
| 42 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 43 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 44 | pk_busiman | pk_busiman | pk_busiman | varchar2(20) |  |  | '~' |
| 45 | pk_changebill | pk_changebill | pk_changebill | char(20) | √ |
| 46 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 47 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 48 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 49 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 50 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 51 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 52 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 53 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 54 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 55 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(50) |
| 56 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 57 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 58 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 59 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 60 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 61 | pk_recproject | pk_recproject | pk_recproject | varchar2(20) |  |  | '~' |
| 62 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 63 | pk_sourcebill_detail | pk_sourcebill_detail | pk_sourcebill_detail | varchar2(20) |  |  | '~' |
| 64 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 65 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 66 | pk_trader | pk_trader | pk_trader | varchar2(20) |  |  | '~' |
| 67 | pk_upperbill | pk_upperbill | pk_upperbill | varchar2(20) |  |  | '~' |
| 68 | pk_upperbill_detail | pk_upperbill_detail | pk_upperbill_detail | char(20) |  |  | '~' |
| 69 | price | price | price | number(28, 8) |
| 70 | rec_count | rec_count | rec_count | number(20, 8) |
| 71 | rec_local | rec_local | rec_local | number(28, 8) |
| 72 | rec_primal | rec_primal | rec_primal | number(28, 8) |
| 73 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 74 | sanhu | sanhu | sanhu | char(20) |
| 75 | settlenum | settlenum | settlenum | varchar2(30) |
| 76 | source_billtype | source_billtype | source_billtype | varchar2(20) |  |  | '~' |
| 77 | suppliername | suppliername | suppliername | varchar2(300) |
| 78 | teade_type | teade_type | teade_type | varchar2(20) |  |  | '~' |
| 79 | trade_type | trade_type | trade_type | varchar2(20) | √ |  | '~' |
| 80 | upper_billtype | upper_billtype | upper_billtype | varchar2(20) |  |  | '~' |
| 81 | def1 | def1 | def1 | varchar2(101) |
| 82 | def2 | def2 | def2 | varchar2(101) |
| 83 | def3 | def3 | def3 | varchar2(101) |
| 84 | def4 | def4 | def4 | varchar2(101) |
| 85 | def5 | def5 | def5 | varchar2(101) |
| 86 | def6 | def6 | def6 | varchar2(101) |
| 87 | def7 | def7 | def7 | varchar2(101) |
| 88 | def8 | def8 | def8 | varchar2(101) |
| 89 | def9 | def9 | def9 | varchar2(101) |
| 90 | def10 | def10 | def10 | varchar2(101) |
| 91 | def11 | def11 | def11 | varchar2(101) |
| 92 | def12 | def12 | def12 | varchar2(101) |
| 93 | def13 | def13 | def13 | varchar2(101) |
| 94 | def14 | def14 | def14 | varchar2(101) |
| 95 | def15 | def15 | def15 | varchar2(101) |
| 96 | def16 | def16 | def16 | varchar2(101) |
| 97 | def17 | def17 | def17 | varchar2(101) |
| 98 | def18 | def18 | def18 | varchar2(101) |
| 99 | def19 | def19 | def19 | varchar2(101) |
| 100 | def20 | def20 | def20 | varchar2(101) |
| 101 | zyx21 | zyx21 | zyx21 | varchar2(100) |
| 102 | zyx22 | zyx22 | zyx22 | varchar2(100) |
| 103 | zyx23 | zyx23 | zyx23 | varchar2(100) |
| 104 | zyx24 | zyx24 | zyx24 | varchar2(100) |
| 105 | zyx25 | zyx25 | zyx25 | varchar2(100) |
| 106 | zyx26 | zyx26 | zyx26 | varchar2(100) |
| 107 | zyx27 | zyx27 | zyx27 | varchar2(100) |
| 108 | zyx28 | zyx28 | zyx28 | varchar2(100) |
| 109 | zyx29 | zyx29 | zyx29 | varchar2(100) |
| 110 | zyx30 | zyx30 | zyx30 | varchar2(100) |
| 111 | creationtime | creationtime | creationtime | char(19) | √ |
| 112 | creator | creator | creator | varchar2(20) | √ |  | '~' |
| 113 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 114 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 115 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 116 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |