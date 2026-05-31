# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | varchar2(20) | √ |  | '~' |
| 2 | accountnum | accountnum | accountnum | varchar2(40) |
| 3 | accounttype | accounttype | accounttype | number(38, 0) |
| 4 | agentreceivelocal | agentreceivelocal | agentreceivelocal | number(28, 8) |
| 5 | agentreceiveprimal | agentreceiveprimal | agentreceiveprimal | number(28, 8) |
| 6 | bankmsg | bankmsg | bankmsg | varchar2(300) |
| 7 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 8 | billcode | billcode | billcode | varchar2(80) |
| 9 | billdate | billdate | billdate | char(19) |
| 10 | billtime | billtime | billtime | char(19) |
| 11 | busilineno | busilineno | busilineno | number(38, 0) |
| 12 | changebalance | changebalance | changebalance | number(28, 8) |
| 13 | changerate | changerate | changerate | number(15, 8) |
| 14 | checkcount | checkcount | checkcount | number(38, 0) |
| 15 | checkdate | checkdate | checkdate | char(19) |
| 16 | code | code | code | varchar2(1024) |
| 17 | commitdate | commitdate | commitdate | char(19) |
| 18 | commpayer | commpayer | commpayer | varchar2(20) |  |  | '~' |
| 19 | commpaystatus | commpaystatus | commpaystatus | number(38, 0) |
| 20 | commpaytime | commpaytime | commpaytime | char(19) |
| 21 | commpaytype | commpaytype | commpaytype | number(38, 0) |
| 22 | def_note | def_note | def_note | varchar2(100) |
| 23 | def_sno | def_sno | def_sno | varchar2(200) |
| 24 | direction | direction | direction | number(38, 0) |
| 25 | direct_ecds | direct_ecds | direct_ecds | char(1) |
| 26 | editedflag | editedflag | editedflag | char(1) |
| 27 | execdate | execdate | execdate | char(19) |
| 28 | exectime | exectime | exectime | char(19) |
| 29 | expectate_date | expectate_date | expectate_date | char(19) |
| 30 | failurereason | failurereason | failurereason | varchar2(272) |
| 31 | fundformcode | fundformcode | fundformcode | number(38, 0) |
| 32 | fundsflag | fundsflag | fundsflag | number(38, 0) |
| 33 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 34 | globalcommreceivelocal | globalcommreceivelocal | globalcommreceivelocal | number(28, 8) |
| 35 | globalpaylocal | globalpaylocal | globalpaylocal | number(28, 8) |
| 36 | globalpaylocal_last | globalpaylocal_last | globalpaylocal_last | number(28, 8) |
| 37 | globalpayrate_last | globalpayrate_last | globalpayrate_last | number(15, 8) |
| 38 | globalrate | globalrate | globalrate | number(15, 8) |
| 39 | globalreceivelocal | globalreceivelocal | globalreceivelocal | number(28, 8) |
| 40 | groupcommreceivelocal | groupcommreceivelocal | groupcommreceivelocal | number(28, 8) |
| 41 | grouppaylocal | grouppaylocal | grouppaylocal | number(28, 8) |
| 42 | grouppaylocal_last | grouppaylocal_last | grouppaylocal_last | number(28, 8) |
| 43 | grouppayrate_last | grouppayrate_last | grouppayrate_last | number(15, 8) |
| 44 | grouprate | grouprate | grouprate | number(15, 8) |
| 45 | groupreceivelocal | groupreceivelocal | groupreceivelocal | number(28, 8) |
| 46 | handworkedupdate | handworkedupdate | handworkedupdate | char(1) |
| 47 | isacccord | isacccord | isacccord | char(1) |
| 48 | isbillrecord | isbillrecord | isbillrecord | char(1) |
| 49 | isnetbankpay | isnetbankpay | isnetbankpay | char(1) |
| 50 | isrefused | isrefused | isrefused | char(1) |
| 51 | issamebank | issamebank | issamebank | number(38, 0) |
| 52 | issamecity | issamecity | issamecity | number(38, 0) |
| 53 | lastest_paydate | lastest_paydate | lastest_paydate | char(19) |
| 54 | localrate | localrate | localrate | number(15, 8) |
| 55 | memo | memo | memo | varchar2(272) |
| 56 | modifyflag | modifyflag | modifyflag | varchar2(64) |
| 57 | notedirection | notedirection | notedirection | number(38, 0) |
| 58 | notenumber | notenumber | notenumber | varchar2(100) |
| 59 | oppaccname | oppaccname | oppaccname | varchar2(200) |
| 60 | oppaccount | oppaccount | oppaccount | varchar2(100) |
| 61 | oppbank | oppbank | oppbank | varchar2(100) |
| 62 | orgbusidate | orgbusidate | orgbusidate | char(10) |
| 63 | orgbusitime | orgbusitime | orgbusitime | char(19) |
| 64 | orgsettledate | orgsettledate | orgsettledate | char(10) |
| 65 | orgsettletime | orgsettletime | orgsettletime | char(19) |
| 66 | orgsigndate | orgsigndate | orgsigndate | char(10) |
| 67 | orgsigntime | orgsigntime | orgsigntime | char(19) |
| 68 | pay | pay | pay | number(28, 8) |
| 69 | paybillcode | paybillcode | paybillcode | varchar2(30) |
| 70 | paydate | paydate | paydate | char(19) |
| 71 | paylocal | paylocal | paylocal | number(28, 8) |
| 72 | paylocalrate_last | paylocalrate_last | paylocalrate_last | number(15, 8) |
| 73 | paylocal_last | paylocal_last | paylocal_last | number(28, 8) |
| 74 | payreason | payreason | payreason | varchar2(272) |
| 75 | pay_last | pay_last | pay_last | number(28, 8) |
| 76 | pay_type | pay_type | pay_type | number(38, 0) |
| 77 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 78 | pk_agentsettleacc | pk_agentsettleacc | pk_agentsettleacc | varchar2(20) |  |  | '~' |
| 79 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 80 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 81 | pk_bill | pk_bill | pk_bill | varchar2(40) |
| 82 | pk_billbalatype | pk_billbalatype | pk_billbalatype | varchar2(20) |  |  | '~' |
| 83 | pk_billdetail | pk_billdetail | pk_billdetail | varchar2(20) |  |  | '~' |
| 84 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 85 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 86 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(20) |  |  | '~' |
| 87 | pk_busiorg_v | pk_busiorg_v | pk_busiorg_v | varchar2(20) |  |  | '~' |
| 88 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 89 | pk_cashaccount | pk_cashaccount | pk_cashaccount | char(20) |
| 90 | pk_cashflow | pk_cashflow | pk_cashflow | varchar2(30) |  |  | '~' |
| 91 | pk_costsubj | pk_costsubj | pk_costsubj | varchar2(30) |  |  | '~' |
| 92 | pk_cubasdoc | pk_cubasdoc | pk_cubasdoc | varchar2(20) |  |  | '~' |
| 93 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 94 | pk_currtype_last | pk_currtype_last | pk_currtype_last | varchar2(20) |
| 95 | pk_deptdoc | pk_deptdoc | pk_deptdoc | varchar2(20) |  |  | '~' |
| 96 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 97 | pk_ftsbill | pk_ftsbill | pk_ftsbill | varchar2(20) |  |  | '~' |
| 98 | pk_ftsbilldetail | pk_ftsbilldetail | pk_ftsbilldetail | varchar2(20) |  |  | '~' |
| 99 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 100 | pk_inneraccount | pk_inneraccount | pk_inneraccount | varchar2(20) |  |  | '~' |
| 101 | pk_innerorg | pk_innerorg | pk_innerorg | varchar2(20) |  |  | '~' |
| 102 | pk_invbasdoc | pk_invbasdoc | pk_invbasdoc | varchar2(20) |  |  | '~' |
| 103 | pk_invcl | pk_invcl | pk_invcl | varchar2(20) |  |  | '~' |
| 104 | pk_job | pk_job | pk_job | varchar2(30) |  |  | '~' |
| 105 | pk_jobphase | pk_jobphase | pk_jobphase | varchar2(30) |  |  | '~' |
| 106 | pk_notenumber | pk_notenumber | pk_notenumber | varchar2(20) |  |  | '~' |
| 107 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 108 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(20) |  |  | '~' |
| 109 | pk_oppbank | pk_oppbank | pk_oppbank | varchar2(20) |  |  | '~' |
| 110 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 111 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 112 | pk_paybill | pk_paybill | pk_paybill | varchar2(20) |  |  | '~' |
| 113 | pk_paytype | pk_paytype | pk_paytype | varchar2(50) |
| 114 | pk_payuser | pk_payuser | pk_payuser | varchar2(20) |  |  | '~' |
| 115 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 116 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 117 | pk_plansubj | pk_plansubj | pk_plansubj | varchar2(30) |  |  | '~' |
| 118 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 119 | pk_receivetype | pk_receivetype | pk_receivetype | varchar2(50) |
| 120 | pk_rescenter | pk_rescenter | pk_rescenter | varchar2(20) |  |  | '~' |
| 121 | pk_settlement | pk_settlement | pk_settlement | char(20) |
| 122 | pk_suggestnotetype | pk_suggestnotetype | pk_suggestnotetype | varchar2(20) |  |  | '~' |
| 123 | pk_trader | pk_trader | pk_trader | varchar2(20) |  |  | '~' |
| 124 | processtype | processtype | processtype | number(38, 0) |
| 125 | receive | receive | receive | number(28, 8) |
| 126 | receivelocal | receivelocal | receivelocal | number(28, 8) |
| 127 | refusereason | refusereason | refusereason | varchar2(272) |
| 128 | settlelineno | settlelineno | settlelineno | number(38, 0) |
| 129 | settlestatus | settlestatus | settlestatus | number(38, 0) |
| 130 | signdate | signdate | signdate | char(19) |
| 131 | systemcode | systemcode | systemcode | varchar2(20) |  |  | '~' |
| 132 | tallydate | tallydate | tallydate | char(19) |
| 133 | tallystatus | tallystatus | tallystatus | number(38, 0) |
| 134 | tradername | tradername | tradername | varchar2(272) |
| 135 | tradertype | tradertype | tradertype | number(38, 0) |
| 136 | transerial | transerial | transerial | varchar2(50) |
| 137 | transtype | transtype | transtype | number(38, 0) |
| 138 | def1 | def1 | def1 | varchar2(101) |
| 139 | def2 | def2 | def2 | varchar2(101) |
| 140 | def3 | def3 | def3 | varchar2(101) |
| 141 | def4 | def4 | def4 | varchar2(101) |
| 142 | def5 | def5 | def5 | varchar2(101) |
| 143 | def6 | def6 | def6 | varchar2(101) |
| 144 | def7 | def7 | def7 | varchar2(101) |
| 145 | def8 | def8 | def8 | varchar2(101) |
| 146 | def9 | def9 | def9 | varchar2(101) |
| 147 | def10 | def10 | def10 | varchar2(101) |
| 148 | def11 | def11 | def11 | varchar2(101) |
| 149 | def12 | def12 | def12 | varchar2(101) |
| 150 | def13 | def13 | def13 | varchar2(101) |
| 151 | def14 | def14 | def14 | varchar2(101) |
| 152 | def15 | def15 | def15 | varchar2(101) |
| 153 | def16 | def16 | def16 | varchar2(101) |
| 154 | def17 | def17 | def17 | varchar2(101) |
| 155 | def18 | def18 | def18 | varchar2(101) |
| 156 | def19 | def19 | def19 | varchar2(101) |
| 157 | def20 | def20 | def20 | varchar2(101) |
| 158 | creationtime | creationtime | creationtime | char(19) |
| 159 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 160 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 161 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 162 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 163 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |