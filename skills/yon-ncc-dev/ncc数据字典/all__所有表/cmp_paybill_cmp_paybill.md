# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 2 | appendix_no | appendix_no | appendix_no | number(38, 0) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_date | approve_date | approve_date | char(19) |
| 5 | approve_time | approve_time | approve_time | char(19) |
| 6 | audit_accounting_period | audit_accounting_period | audit_accounting_period | char(2) |
| 7 | audit_accounting_year | audit_accounting_year | audit_accounting_year | char(4) |
| 8 | bank_comfirm_date | bank_comfirm_date | bank_comfirm_date | char(19) |
| 9 | bank_comfirm_period | bank_comfirm_period | bank_comfirm_period | char(2) |
| 10 | bank_comfirm_year | bank_comfirm_year | bank_comfirm_year | char(4) |
| 11 | billclass | billclass | billclass | varchar2(2) | √ |
| 12 | billmaker | billmaker | billmaker | varchar2(20) | √ |
| 13 | billmaker_date | billmaker_date | billmaker_date | char(19) |
| 14 | bill_accounting_period | bill_accounting_period | bill_accounting_period | char(2) |
| 15 | bill_accounting_year | bill_accounting_year | bill_accounting_year | char(4) |
| 16 | bill_date | bill_date | bill_date | char(19) | √ |
| 17 | bill_no | bill_no | bill_no | varchar2(40) |
| 18 | bill_status | bill_status | bill_status | number(38, 0) | √ |
| 19 | bill_type | bill_type | bill_type | varchar2(2) | √ |
| 20 | cf_begindate | cf_begindate | cf_begindate | char(19) |
| 21 | cf_enddate | cf_enddate | cf_enddate | char(19) |
| 22 | consignagreement | consignagreement | consignagreement | varchar2(20) |  |  | '~' |
| 23 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 24 | creditorreference | creditorreference | creditorreference | varchar2(200) |
| 25 | customername | customername | customername | varchar2(300) |
| 26 | down_billtype | down_billtype | down_billtype | varchar2(50) |
| 27 | down_tradetype | down_tradetype | down_tradetype | varchar2(50) |
| 28 | duty_issue | duty_issue | duty_issue | varchar2(20) |  |  | '~' |
| 29 | dz_date | dz_date | dz_date | char(19) |
| 30 | effect_date | effect_date | effect_date | char(19) |
| 31 | effect_flag | effect_flag | effect_flag | number(38, 0) |
| 32 | effect_period | effect_period | effect_period | char(2) |
| 33 | effect_year | effect_year | effect_year | char(4) |
| 34 | endapprover | endapprover | endapprover | varchar2(20) |  |  | '~' |
| 35 | expectdealdate | expectdealdate | expectdealdate | char(19) |
| 36 | globallocal | globallocal | globallocal | number(28, 8) |
| 37 | globalrate | globalrate | globalrate | number(15, 8) |
| 38 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 39 | grouprate | grouprate | grouprate | number(15, 8) |
| 40 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 41 | isfromindependent | isfromindependent | isfromindependent | char(1) |
| 42 | isnetready | isnetready | isnetready | char(1) |
| 43 | isreded | isreded | isreded | char(1) |
| 44 | isrefused | isrefused | isrefused | char(1) |
| 45 | istbbonapprove | istbbonapprove | istbbonapprove | char(1) |
| 46 | is_cf | is_cf | is_cf | char(1) |
| 47 | jz_date | jz_date | jz_date | char(19) |
| 48 | local_money | local_money | local_money | number(28, 8) |
| 49 | memo | memo | memo | varchar2(272) |
| 50 | mon_account | mon_account | mon_account | varchar2(20) |  |  | '~' |
| 51 | note_no | note_no | note_no | varchar2(20) |  |  | '~' |
| 52 | objecttype | objecttype | objecttype | number(38, 0) |
| 53 | officialprint_date | officialprint_date | officialprint_date | char(19) |
| 54 | paydate | paydate | paydate | char(19) |
| 55 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 56 | payreason | payreason | payreason | varchar2(50) |
| 57 | paystatus | paystatus | paystatus | number(38, 0) |
| 58 | payway | payway | payway | number(38, 0) |
| 59 | pk_bank_comfirmer | pk_bank_comfirmer | pk_bank_comfirmer | varchar2(20) |  |  | '~' |
| 60 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 61 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 62 | pk_comfirmer | pk_comfirmer | pk_comfirmer | varchar2(20) |  |  | '~' |
| 63 | pk_downbill | pk_downbill | pk_downbill | char(20) |
| 64 | pk_effect_user | pk_effect_user | pk_effect_user | varchar2(20) |  |  | '~' |
| 65 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 66 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 67 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 68 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 69 | pk_jobid | pk_jobid | pk_jobid | varchar2(20) |  |  | '~' |
| 70 | pk_jobobjpha | pk_jobobjpha | pk_jobobjpha | varchar2(20) |  |  | '~' |
| 71 | pk_officialprinter | pk_officialprinter | pk_officialprinter | varchar2(20) |  |  | '~' |
| 72 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 73 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 74 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 75 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 76 | pk_subjct | pk_subjct | pk_subjct | varchar2(20) |  |  | '~' |
| 77 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 78 | pk_upbill | pk_upbill | pk_upbill | char(20) |
| 79 | primal_money | primal_money | primal_money | number(28, 8) |
| 80 | recman | recman | recman | varchar2(20) |  |  | '~' |
| 81 | res_issue | res_issue | res_issue | varchar2(20) |  |  | '~' |
| 82 | reversalreason | reversalreason | reversalreason | varchar2(50) |
| 83 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 84 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 85 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 86 | saga_status | saga_status | saga_status | number(38, 0) |
| 87 | savedate | savedate | savedate | char(19) |
| 88 | sddreversalflag | sddreversalflag | sddreversalflag | char(1) |
| 89 | settlenum | settlenum | settlenum | varchar2(30) |
| 90 | source_flag | source_flag | source_flag | varchar2(20) |  |  | '~' |
| 91 | structuredstandard | structuredstandard | structuredstandard | varchar2(50) |
| 92 | suppliername | suppliername | suppliername | varchar2(300) |
| 93 | trade_type | trade_type | trade_type | varchar2(50) |  |  | '~' |
| 94 | up_billtype | up_billtype | up_billtype | varchar2(50) |
| 95 | up_tradetype | up_tradetype | up_tradetype | varchar2(50) |
| 96 | voucher | voucher | voucher | varchar2(50) |
| 97 | ys_period | ys_period | ys_period | varchar2(2) |
| 98 | def1 | def1 | def1 | varchar2(101) |
| 99 | def2 | def2 | def2 | varchar2(101) |
| 100 | def3 | def3 | def3 | varchar2(101) |
| 101 | def4 | def4 | def4 | varchar2(101) |
| 102 | def5 | def5 | def5 | varchar2(101) |
| 103 | def6 | def6 | def6 | varchar2(101) |
| 104 | def7 | def7 | def7 | varchar2(101) |
| 105 | def8 | def8 | def8 | varchar2(101) |
| 106 | def9 | def9 | def9 | varchar2(101) |
| 107 | def10 | def10 | def10 | varchar2(101) |
| 108 | def11 | def11 | def11 | varchar2(101) |
| 109 | def12 | def12 | def12 | varchar2(101) |
| 110 | def13 | def13 | def13 | varchar2(101) |
| 111 | def14 | def14 | def14 | varchar2(101) |
| 112 | def15 | def15 | def15 | varchar2(101) |
| 113 | def16 | def16 | def16 | varchar2(101) |
| 114 | def17 | def17 | def17 | varchar2(101) |
| 115 | def18 | def18 | def18 | varchar2(101) |
| 116 | def19 | def19 | def19 | varchar2(101) |
| 117 | def20 | def20 | def20 | varchar2(101) |
| 118 | def21 | def21 | def21 | varchar2(101) |
| 119 | def22 | def22 | def22 | varchar2(101) |
| 120 | def23 | def23 | def23 | varchar2(101) |
| 121 | def24 | def24 | def24 | varchar2(101) |
| 122 | def25 | def25 | def25 | varchar2(101) |
| 123 | def26 | def26 | def26 | varchar2(101) |
| 124 | def27 | def27 | def27 | varchar2(101) |
| 125 | def28 | def28 | def28 | varchar2(101) |
| 126 | def29 | def29 | def29 | varchar2(101) |
| 127 | def30 | def30 | def30 | varchar2(101) |
| 128 | creationtime | creationtime | creationtime | char(19) | √ |
| 129 | creator | creator | creator | varchar2(20) | √ |
| 130 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 131 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 132 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 133 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |