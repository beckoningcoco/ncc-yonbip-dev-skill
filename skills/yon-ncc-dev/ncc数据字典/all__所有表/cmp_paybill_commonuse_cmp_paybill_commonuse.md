# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 2 | accountcode | accountcode | accountcode | varchar2(50) |
| 3 | accountname | accountname | accountname | varchar2(300) |
| 4 | accountopenbank | accountopenbank | accountopenbank | varchar2(200) |
| 5 | accounttype | accounttype | accounttype | number(38, 0) |
| 6 | appendix_no | appendix_no | appendix_no | number(38, 0) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | approve_date | approve_date | approve_date | char(19) |
| 9 | audit_accounting_period | audit_accounting_period | audit_accounting_period | char(2) |
| 10 | audit_accounting_year | audit_accounting_year | audit_accounting_year | char(4) |
| 11 | bank_comfirm_date | bank_comfirm_date | bank_comfirm_date | char(19) |
| 12 | bank_comfirm_period | bank_comfirm_period | bank_comfirm_period | char(2) |
| 13 | bank_comfirm_year | bank_comfirm_year | bank_comfirm_year | char(4) |
| 14 | billclass | billclass | billclass | varchar2(2) | √ |
| 15 | billmaker | billmaker | billmaker | varchar2(20) | √ |
| 16 | billmaker_date | billmaker_date | billmaker_date | char(19) |
| 17 | bill_accounting_period | bill_accounting_period | bill_accounting_period | char(2) |
| 18 | bill_accounting_year | bill_accounting_year | bill_accounting_year | char(4) |
| 19 | bill_date | bill_date | bill_date | char(19) | √ |
| 20 | bill_no | bill_no | bill_no | varchar2(40) |
| 21 | bill_status | bill_status | bill_status | number(38, 0) | √ |
| 22 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 23 | cf_begindate | cf_begindate | cf_begindate | char(19) |
| 24 | cf_enddate | cf_enddate | cf_enddate | char(19) |
| 25 | customername | customername | customername | varchar2(300) |
| 26 | cydjbm | cydjbm | cydjbm | varchar2(20) |
| 27 | cydjmc | cydjmc | cydjmc | varchar2(50) |
| 28 | cydjms | cydjms | cydjms | varchar2(120) |
| 29 | down_billtype | down_billtype | down_billtype | varchar2(50) |
| 30 | down_tradetype | down_tradetype | down_tradetype | varchar2(50) |
| 31 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 32 | dz_date | dz_date | dz_date | char(19) |
| 33 | effect_date | effect_date | effect_date | char(19) |
| 34 | effect_flag | effect_flag | effect_flag | number(38, 0) |
| 35 | effect_period | effect_period | effect_period | char(2) |
| 36 | effect_year | effect_year | effect_year | char(4) |
| 37 | globallocal | globallocal | globallocal | number(28, 8) |
| 38 | globalrate | globalrate | globalrate | number(15, 8) |
| 39 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 40 | grouprate | grouprate | grouprate | number(15, 8) |
| 41 | isfromindependent | isfromindependent | isfromindependent | char(1) |
| 42 | isnetready | isnetready | isnetready | char(1) |
| 43 | isreded | isreded | isreded | char(1) |
| 44 | isrefused | isrefused | isrefused | char(1) |
| 45 | is_cf | is_cf | is_cf | char(1) |
| 46 | jz_date | jz_date | jz_date | char(19) |
| 47 | local_money | local_money | local_money | number(28, 8) |
| 48 | local_rate | local_rate | local_rate | number(15, 8) |
| 49 | memo | memo | memo | varchar2(272) |
| 50 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 51 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 52 | objecttype | objecttype | objecttype | number(38, 0) |
| 53 | officialprint_date | officialprint_date | officialprint_date | char(19) |
| 54 | paydate | paydate | paydate | char(19) |
| 55 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 56 | paystatus | paystatus | paystatus | number(38, 0) |
| 57 | payway | payway | payway | number(38, 0) |
| 58 | pk_bank_comfirmer | pk_bank_comfirmer | pk_bank_comfirmer | varchar2(20) |  |  | '~' |
| 59 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 60 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 61 | pk_comfirmer | pk_comfirmer | pk_comfirmer | varchar2(20) |  |  | '~' |
| 62 | pk_downbill | pk_downbill | pk_downbill | char(20) |
| 63 | pk_effect_user | pk_effect_user | pk_effect_user | varchar2(20) |  |  | '~' |
| 64 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 65 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 67 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 68 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 69 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(50) |
| 70 | pk_officialprinter | pk_officialprinter | pk_officialprinter | varchar2(20) |  |  | '~' |
| 71 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 72 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 73 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 74 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 75 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 76 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 77 | pk_upbill | pk_upbill | pk_upbill | char(20) |
| 78 | primal_money | primal_money | primal_money | number(28, 8) |
| 79 | recman | recman | recman | varchar2(20) |  |  | '~' |
| 80 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 81 | savedate | savedate | savedate | char(19) |
| 82 | settlenum | settlenum | settlenum | varchar2(30) |
| 83 | source_flag | source_flag | source_flag | varchar2(20) |  |  | '~' |
| 84 | suppliername | suppliername | suppliername | varchar2(300) |
| 85 | trade_type | trade_type | trade_type | varchar2(50) |  |  | '~' |
| 86 | up_billtype | up_billtype | up_billtype | varchar2(50) |
| 87 | up_tradetype | up_tradetype | up_tradetype | varchar2(50) |
| 88 | voucher | voucher | voucher | varchar2(50) |
| 89 | ys_period | ys_period | ys_period | varchar2(2) |
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
| 110 | def21 | def21 | def21 | varchar2(101) |
| 111 | def22 | def22 | def22 | varchar2(101) |
| 112 | def23 | def23 | def23 | varchar2(101) |
| 113 | def24 | def24 | def24 | varchar2(101) |
| 114 | def25 | def25 | def25 | varchar2(101) |
| 115 | def26 | def26 | def26 | varchar2(101) |
| 116 | def27 | def27 | def27 | varchar2(101) |
| 117 | def28 | def28 | def28 | varchar2(101) |
| 118 | def29 | def29 | def29 | varchar2(101) |
| 119 | def30 | def30 | def30 | varchar2(101) |
| 120 | creationtime | creationtime | creationtime | char(19) | √ |
| 121 | creator | creator | creator | varchar2(20) | √ |
| 122 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 123 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 124 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 125 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |