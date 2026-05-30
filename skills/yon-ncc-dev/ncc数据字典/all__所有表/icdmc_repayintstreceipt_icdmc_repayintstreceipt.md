# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9022.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintstreceipt | pk_repayintstreceipt | pk_repayintstreceipt | char(20) | √ |
| 2 | accept_date | accept_date | accept_date | char(19) |
| 3 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(50) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | attrname0 | attrname0 | attrname0 | varchar2(50) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | commitdate | commitdate | commitdate | char(19) |
| 12 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 13 | contractcode | contractcode | contractcode | varchar2(50) |
| 14 | contractmny | contractmny | contractmny | number(28, 8) |
| 15 | debittoloan | debittoloan | debittoloan | char(1) |
| 16 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 17 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 18 | fixrate | fixrate | fixrate | char(1) |
| 19 | glccontractmny | glccontractmny | glccontractmny | number(28, 8) |
| 20 | glcpayintmoney | glcpayintmoney | glcpayintmoney | number(28, 8) |
| 21 | glcpaytotalintstmny | glcpaytotalintstmny | glcpaytotalintstmny | number(28, 8) |
| 22 | glcrate | glcrate | glcrate | number(28, 8) |
| 23 | glcshdpayintmny | glcshdpayintmny | glcshdpayintmny | number(28, 8) |
| 24 | glcunpayintmoney | glcunpayintmoney | glcunpayintmoney | number(28, 8) |
| 25 | gllccontractmny | gllccontractmny | gllccontractmny | number(28, 8) |
| 26 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 27 | gllpayintmoney | gllpayintmoney | gllpayintmoney | number(28, 8) |
| 28 | gllpaytotalintstmny | gllpaytotalintstmny | gllpaytotalintstmny | number(28, 8) |
| 29 | gllshdpayintmny | gllshdpayintmny | gllshdpayintmny | number(28, 8) |
| 30 | gllunpayintmoney | gllunpayintmoney | gllunpayintmoney | number(28, 8) |
| 31 | iabillid | iabillid | iabillid | varchar2(200) |
| 32 | informent | informent | informent | varchar2(50) |
| 33 | initflag | initflag | initflag | char(1) |
| 34 | isfirstpayintst | isfirstpayintst | isfirstpayintst | char(1) |
| 35 | ispaytotalintst | ispaytotalintst | ispaytotalintst | char(1) |
| 36 | issettlement | issettlement | issettlement | char(1) |
| 37 | loanaccount | loanaccount | loanaccount | varchar2(20) |  |  | '~' |
| 38 | loanbegindate | loanbegindate | loanbegindate | char(19) |
| 39 | loancode | loancode | loancode | varchar2(20) |  |  | '~' |
| 40 | loandate | loandate | loandate | char(19) |
| 41 | loanmny | loanmny | loanmny | number(28, 8) |
| 42 | loanunitid | loanunitid | loanunitid | varchar2(20) |  |  | '~' |
| 43 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 44 | makevdate | makevdate | makevdate | char(19) |
| 45 | makevtime | makevtime | makevtime | char(19) |
| 46 | memo | memo | memo | varchar2(200) |
| 47 | oclpayintmoney | oclpayintmoney | oclpayintmoney | number(28, 8) |
| 48 | oclunpayintmoney | oclunpayintmoney | oclunpayintmoney | number(28, 8) |
| 49 | olccontractmny | olccontractmny | olccontractmny | number(28, 8) |
| 50 | olcpaytotalintstmny | olcpaytotalintstmny | olcpaytotalintstmny | number(28, 8) |
| 51 | olcrate | olcrate | olcrate | number(28, 8) |
| 52 | olcshdpayintmny | olcshdpayintmny | olcshdpayintmny | number(28, 8) |
| 53 | payintmoney | payintmoney | payintmoney | number(28, 8) |
| 54 | paytotalintstmny | paytotalintstmny | paytotalintstmny | number(28, 8) |
| 55 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 56 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 57 | pk_contract_icdmc | pk_contract_icdmc | pk_contract_icdmc | varchar2(20) |  |  | '~' |
| 58 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 59 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 60 | pk_debitunit | pk_debitunit | pk_debitunit | varchar2(20) |  |  | '~' |
| 61 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 62 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 63 | pk_innerloanpay | pk_innerloanpay | pk_innerloanpay | varchar2(20) |  |  | '~' |
| 64 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 65 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 66 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 67 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 68 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 69 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 70 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 71 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 72 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 73 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 74 | repaytointerest | repaytointerest | repaytointerest | char(1) |
| 75 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 76 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 77 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 78 | saga_status | saga_status | saga_status | number(38, 0) |
| 79 | settleflag | settleflag | settleflag | number(38, 0) |
| 80 | shdpayintmny | shdpayintmny | shdpayintmny | number(28, 8) |
| 81 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 82 | subfinstitutionid | subfinstitutionid | subfinstitutionid | varchar2(20) |  |  | '~' |
| 83 | tallydate | tallydate | tallydate | char(19) |
| 84 | tallyflag | tallyflag | tallyflag | char(1) |
| 85 | tallyoperator | tallyoperator | tallyoperator | varchar2(20) |  |  | '~' |
| 86 | tallytime | tallytime | tallytime | char(19) |
| 87 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 88 | transacter | transacter | transacter | varchar2(20) |  |  | '~' |
| 89 | transacterdate | transacterdate | transacterdate | char(19) |
| 90 | transactertime | transactertime | transactertime | char(19) |
| 91 | unpayintmoney | unpayintmoney | unpayintmoney | number(28, 8) |
| 92 | vbillno | vbillno | vbillno | varchar2(50) |  |  | '~' |
| 93 | voucherflag | voucherflag | voucherflag | char(1) |
| 94 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 95 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 96 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 97 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 98 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 99 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 100 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 101 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 102 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 103 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 104 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 105 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 106 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 107 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 108 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 109 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 110 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 111 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 112 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 113 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 114 | creationtime | creationtime | creationtime | char(19) |
| 115 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 116 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 117 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 118 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 119 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |