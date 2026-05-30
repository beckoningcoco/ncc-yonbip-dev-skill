# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintsticdmcapply | pk_repayintsticdmcapply | pk_repayintsticdmcapply | char(20) | √ |
| 2 | accept_date | accept_date | accept_date | char(19) |
| 3 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 4 | applydate | applydate | applydate | char(19) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(50) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | begindate | begindate | begindate | char(19) |
| 9 | billmakedate | billmakedate | billmakedate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billmaketime | billmaketime | billmaketime | char(19) |
| 12 | busistatus | busistatus | busistatus | number(38, 0) |
| 13 | commitdate | commitdate | commitdate | char(19) |
| 14 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 15 | consigndate | consigndate | consigndate | char(19) |
| 16 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 17 | contractcode | contractcode | contractcode | varchar2(50) |
| 18 | contractmny | contractmny | contractmny | number(28, 8) |
| 19 | debittoloan | debittoloan | debittoloan | char(1) |
| 20 | enddate | enddate | enddate | char(19) |
| 21 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 22 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 23 | fixrate | fixrate | fixrate | char(1) |
| 24 | glccontractmny | glccontractmny | glccontractmny | number(28, 8) |
| 25 | glcpayintmoney | glcpayintmoney | glcpayintmoney | number(28, 8) |
| 26 | glcpaytotalintstmny | glcpaytotalintstmny | glcpaytotalintstmny | number(28, 8) |
| 27 | glcrate | glcrate | glcrate | number(28, 8) |
| 28 | glcshdpayintmny | glcshdpayintmny | glcshdpayintmny | number(28, 8) |
| 29 | glcunpayintmoney | glcunpayintmoney | glcunpayintmoney | number(28, 8) |
| 30 | gllccontractmny | gllccontractmny | gllccontractmny | number(28, 8) |
| 31 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 32 | gllpayintmoney | gllpayintmoney | gllpayintmoney | number(28, 8) |
| 33 | gllpaytotalintstmny | gllpaytotalintstmny | gllpaytotalintstmny | number(28, 8) |
| 34 | gllshdpayintmny | gllshdpayintmny | gllshdpayintmny | number(28, 8) |
| 35 | gllunpayintmoney | gllunpayintmoney | gllunpayintmoney | number(28, 8) |
| 36 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 37 | iabillid | iabillid | iabillid | varchar2(200) |
| 38 | informent | informent | informent | varchar2(50) |
| 39 | initflag | initflag | initflag | char(1) |
| 40 | isconsignstate | isconsignstate | isconsignstate | char(1) |
| 41 | isfirstpayintst | isfirstpayintst | isfirstpayintst | char(1) |
| 42 | ispaytotalintst | ispaytotalintst | ispaytotalintst | char(1) |
| 43 | isreturn | isreturn | isreturn | char(1) |
| 44 | issettlement | issettlement | issettlement | char(1) |
| 45 | loanaccount | loanaccount | loanaccount | varchar2(20) |  |  | '~' |
| 46 | loanbegindate | loanbegindate | loanbegindate | char(19) |
| 47 | loancode | loancode | loancode | varchar2(20) |  |  | '~' |
| 48 | loandate | loandate | loandate | char(19) |
| 49 | loanmny | loanmny | loanmny | number(28, 8) |
| 50 | loanunitid | loanunitid | loanunitid | varchar2(20) |  |  | '~' |
| 51 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 52 | makevdate | makevdate | makevdate | char(19) |
| 53 | makevtime | makevtime | makevtime | char(19) |
| 54 | memo | memo | memo | varchar2(200) |
| 55 | oclpayintmoney | oclpayintmoney | oclpayintmoney | number(28, 8) |
| 56 | oclunpayintmoney | oclunpayintmoney | oclunpayintmoney | number(28, 8) |
| 57 | olccontractmny | olccontractmny | olccontractmny | number(28, 8) |
| 58 | olcpaytotalintstmny | olcpaytotalintstmny | olcpaytotalintstmny | number(28, 8) |
| 59 | olcrate | olcrate | olcrate | number(28, 8) |
| 60 | olcshdpayintmny | olcshdpayintmny | olcshdpayintmny | number(28, 8) |
| 61 | payintmoney | payintmoney | payintmoney | number(28, 8) |
| 62 | paytotalintstmny | paytotalintstmny | paytotalintstmny | number(28, 8) |
| 63 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 64 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 65 | pk_contract_icdmc | pk_contract_icdmc | pk_contract_icdmc | varchar2(20) |  |  | '~' |
| 66 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 67 | pk_debitunit | pk_debitunit | pk_debitunit | varchar2(20) |  |  | '~' |
| 68 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 69 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 70 | pk_innerloanpay | pk_innerloanpay | pk_innerloanpay | varchar2(20) |  |  | '~' |
| 71 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 72 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 73 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 74 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 75 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 76 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 77 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 78 | repaytointerest | repaytointerest | repaytointerest | char(1) |
| 79 | returndate | returndate | returndate | char(19) |
| 80 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 81 | returnreason | returnreason | returnreason | varchar2(200) |
| 82 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 83 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 84 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 85 | saga_status | saga_status | saga_status | number(38, 0) |
| 86 | settleflag | settleflag | settleflag | number(38, 0) |
| 87 | shdpayintmny | shdpayintmny | shdpayintmny | number(28, 8) |
| 88 | sourcesystypecode | sourcesystypecode | sourcesystypecode | number(38, 0) |
| 89 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 90 | subfinstitutionid | subfinstitutionid | subfinstitutionid | varchar2(20) |  |  | '~' |
| 91 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 92 | transacter | transacter | transacter | varchar2(20) |  |  | '~' |
| 93 | transacterdate | transacterdate | transacterdate | char(19) |
| 94 | transactertime | transactertime | transactertime | char(19) |
| 95 | unpayintmoney | unpayintmoney | unpayintmoney | number(28, 8) |
| 96 | vbillno | vbillno | vbillno | varchar2(50) |  |  | '~' |
| 97 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 98 | voucherflag | voucherflag | voucherflag | char(1) |
| 99 | yrate | yrate | yrate | number(28, 8) |
| 100 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 101 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 102 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 103 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 104 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 105 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 106 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 107 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 108 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 109 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 110 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 111 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 112 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 113 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 114 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 115 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 116 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 117 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 118 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 119 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 120 | creationtime | creationtime | creationtime | char(19) |
| 121 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 122 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 123 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 124 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 125 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |