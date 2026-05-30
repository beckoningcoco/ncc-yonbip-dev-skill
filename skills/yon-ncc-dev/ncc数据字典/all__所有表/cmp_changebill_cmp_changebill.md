# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_changebill | pk_changebill | pk_changebill | char(20) | √ |
| 2 | appendix_no | appendix_no | appendix_no | number(38, 0) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_date | approve_date | approve_date | char(19) |
| 5 | approve_time | approve_time | approve_time | char(19) |
| 6 | audit_accounting_period | audit_accounting_period | audit_accounting_period | varchar2(2) |
| 7 | audit_accounting_year | audit_accounting_year | audit_accounting_year | varchar2(50) |
| 8 | bank_comfirm_date | bank_comfirm_date | bank_comfirm_date | char(19) |
| 9 | bank_comfirm_period | bank_comfirm_period | bank_comfirm_period | varchar2(2) |
| 10 | bank_comfirm_year | bank_comfirm_year | bank_comfirm_year | varchar2(4) |
| 11 | billclass | billclass | billclass | varchar2(2) |
| 12 | billmaker | billmaker | billmaker | varchar2(20) | √ |  | '~' |
| 13 | billmaker_date | billmaker_date | billmaker_date | char(19) | √ |
| 14 | bill_accounting_period | bill_accounting_period | bill_accounting_period | varchar2(50) |
| 15 | bill_accounting_year | bill_accounting_year | bill_accounting_year | varchar2(50) |
| 16 | bill_date | bill_date | bill_date | char(19) | √ |
| 17 | bill_no | bill_no | bill_no | varchar2(40) |
| 18 | bill_status | bill_status | bill_status | number(38, 0) | √ |
| 19 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 20 | customername | customername | customername | varchar2(300) |
| 21 | ddhbbm | ddhbbm | ddhbbm | varchar2(20) |  |  | '~' |
| 22 | down_billtype | down_billtype | down_billtype | varchar2(20) |  |  | '~' |
| 23 | down_tradetype | down_tradetype | down_tradetype | varchar2(20) |  |  | '~' |
| 24 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 25 | dz_date | dz_date | dz_date | char(19) |
| 26 | effect_date | effect_date | effect_date | char(19) |
| 27 | effect_flag | effect_flag | effect_flag | number(38, 0) |
| 28 | effect_period | effect_period | effect_period | varchar2(2) |
| 29 | effect_year | effect_year | effect_year | varchar2(4) |
| 30 | endapprover | endapprover | endapprover | varchar2(20) |  |  | '~' |
| 31 | globallocal | globallocal | globallocal | number(28, 8) |
| 32 | globalrate | globalrate | globalrate | number(15, 8) |
| 33 | global_local_pay | global_local_pay | global_local_pay | number(28, 8) |
| 34 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 35 | grouprate | grouprate | grouprate | number(15, 8) |
| 36 | group_local_pay | group_local_pay | group_local_pay | number(28, 8) |
| 37 | isfromindependent | isfromindependent | isfromindependent | char(1) |
| 38 | isjszxzf | isjszxzf | isjszxzf | char(1) |
| 39 | isnetready | isnetready | isnetready | char(1) |
| 40 | isreded | isreded | isreded | char(1) |
| 41 | isrefused | isrefused | isrefused | char(1) |
| 42 | jz_date | jz_date | jz_date | char(19) |
| 43 | local_money | local_money | local_money | number(28, 8) |
| 44 | local_rate | local_rate | local_rate | number(15, 8) |
| 45 | memo | memo | memo | varchar2(272) |
| 46 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 47 | note_no | note_no | note_no | varchar2(50) |
| 48 | officialprint_date | officialprint_date | officialprint_date | char(19) |
| 49 | oppaccountcode | oppaccountcode | oppaccountcode | varchar2(50) |
| 50 | passman | passman | passman | varchar2(20) |  |  | '~' |
| 51 | paydate | paydate | paydate | char(19) |
| 52 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 53 | paystatus | paystatus | paystatus | number(38, 0) |
| 54 | payway | payway | payway | number(38, 0) |
| 55 | pay_local | pay_local | pay_local | number(28, 8) |
| 56 | pay_primal | pay_primal | pay_primal | number(28, 8) |
| 57 | pk_bank_comfirmer | pk_bank_comfirmer | pk_bank_comfirmer | varchar2(20) |  |  | '~' |
| 58 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 59 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 60 | pk_comfirmer | pk_comfirmer | pk_comfirmer | varchar2(20) |  |  | '~' |
| 61 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 62 | pk_downbill | pk_downbill | pk_downbill | varchar2(20) |  |  | '~' |
| 63 | pk_effect_user | pk_effect_user | pk_effect_user | varchar2(20) |  |  | '~' |
| 64 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 65 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 67 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 68 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 69 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(50) |
| 70 | pk_note_id | pk_note_id | pk_note_id | varchar2(20) |  |  | '~' |
| 71 | pk_officialprinter | pk_officialprinter | pk_officialprinter | varchar2(20) |  |  | '~' |
| 72 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 73 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 74 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 75 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 76 | pk_signdate | pk_signdate | pk_signdate | char(19) |
| 77 | pk_signer | pk_signer | pk_signer | varchar2(20) |  |  | '~' |
| 78 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 79 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 80 | pk_upbill | pk_upbill | pk_upbill | varchar2(20) |  |  | '~' |
| 81 | primal_money | primal_money | primal_money | number(28, 8) |
| 82 | savedate | savedate | savedate | char(19) |
| 83 | settlenum | settlenum | settlenum | varchar2(30) |
| 84 | source_flag | source_flag | source_flag | varchar2(20) |  |  | '~' |
| 85 | suppliername | suppliername | suppliername | varchar2(300) |
| 86 | trade_type | trade_type | trade_type | varchar2(50) |  |  | '~' |
| 87 | up_billtype | up_billtype | up_billtype | varchar2(20) |  |  | '~' |
| 88 | up_tradetype | up_tradetype | up_tradetype | varchar2(20) |  |  | '~' |
| 89 | voucher | voucher | voucher | varchar2(50) |
| 90 | ys_period | ys_period | ys_period | varchar2(2) |
| 91 | zz_status | zz_status | zz_status | varchar2(50) |
| 92 | def1 | def1 | def1 | varchar2(101) |
| 93 | def2 | def2 | def2 | varchar2(101) |
| 94 | def3 | def3 | def3 | varchar2(101) |
| 95 | def4 | def4 | def4 | varchar2(101) |
| 96 | def5 | def5 | def5 | varchar2(101) |
| 97 | def6 | def6 | def6 | varchar2(101) |
| 98 | def7 | def7 | def7 | varchar2(101) |
| 99 | def8 | def8 | def8 | varchar2(101) |
| 100 | def9 | def9 | def9 | varchar2(101) |
| 101 | def10 | def10 | def10 | varchar2(101) |
| 102 | def11 | def11 | def11 | varchar2(101) |
| 103 | def12 | def12 | def12 | varchar2(101) |
| 104 | def13 | def13 | def13 | varchar2(101) |
| 105 | def14 | def14 | def14 | varchar2(101) |
| 106 | def15 | def15 | def15 | varchar2(101) |
| 107 | def16 | def16 | def16 | varchar2(101) |
| 108 | def17 | def17 | def17 | varchar2(101) |
| 109 | def18 | def18 | def18 | varchar2(101) |
| 110 | def19 | def19 | def19 | varchar2(101) |
| 111 | def20 | def20 | def20 | varchar2(101) |
| 112 | def21 | def21 | def21 | varchar2(101) |
| 113 | def22 | def22 | def22 | varchar2(101) |
| 114 | def23 | def23 | def23 | varchar2(101) |
| 115 | def24 | def24 | def24 | varchar2(101) |
| 116 | def25 | def25 | def25 | varchar2(101) |
| 117 | def26 | def26 | def26 | varchar2(101) |
| 118 | def27 | def27 | def27 | varchar2(101) |
| 119 | def28 | def28 | def28 | varchar2(101) |
| 120 | def29 | def29 | def29 | varchar2(101) |
| 121 | def30 | def30 | def30 | varchar2(101) |
| 122 | creationtime | creationtime | creationtime | char(19) | √ |
| 123 | creator | creator | creator | varchar2(20) | √ |  | '~' |
| 124 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 125 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 126 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 127 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |