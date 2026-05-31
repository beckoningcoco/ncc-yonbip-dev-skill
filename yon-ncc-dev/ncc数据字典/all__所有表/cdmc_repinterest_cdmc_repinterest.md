# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | agencymanage | agencymanage | agencymanage | char(1) |
| 2 | approvenote | approvenote | approvenote | varchar2(50) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | billmakedate | billmakedate | billmakedate | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | busistatus | busistatus | busistatus | number(38, 0) |
| 8 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 9 | debittoloan | debittoloan | debittoloan | char(1) |
| 10 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 11 | glcpayintmoney | glcpayintmoney | glcpayintmoney | number(28, 8) |
| 12 | glcrate | glcrate | glcrate | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 14 | gllpayintmoney | gllpayintmoney | gllpayintmoney | number(28, 8) |
| 15 | iabillid | iabillid | iabillid | varchar2(200) |
| 16 | initflag | initflag | initflag | char(1) |
| 17 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 18 | isfirstpayintst | isfirstpayintst | isfirstpayintst | char(1) |
| 19 | ispaytotalintst | ispaytotalintst | ispaytotalintst | char(1) |
| 20 | issettlement | issettlement | issettlement | char(1) |
| 21 | loancode | loancode | loancode | varchar2(20) |  |  | '~' |
| 22 | loandate | loandate | loandate | char(19) |
| 23 | loanmny | loanmny | loanmny | number(28, 8) |
| 24 | loanunitid | loanunitid | loanunitid | varchar2(20) |  |  | '~' |
| 25 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 26 | makevdate | makevdate | makevdate | char(19) |
| 27 | makevtime | makevtime | makevtime | char(19) |
| 28 | oclpayintmoney | oclpayintmoney | oclpayintmoney | number(28, 8) |
| 29 | olcrate | olcrate | olcrate | number(28, 8) |
| 30 | payadjustbill | payadjustbill | payadjustbill | number(38, 0) |
| 31 | payintmoney | payintmoney | payintmoney | number(28, 8) |
| 32 | paytotalintstmny | paytotalintstmny | paytotalintstmny | number(28, 8) |
| 33 | paytype | paytype | paytype | number(38, 0) |
| 34 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 35 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 36 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 37 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 38 | pk_currtype_fin | pk_currtype_fin | pk_currtype_fin | varchar2(20) |
| 39 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 40 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 41 | pk_debitprof_v | pk_debitprof_v | pk_debitprof_v | varchar2(20) |  |  | '~' |
| 42 | pk_debitunit | pk_debitunit | pk_debitunit | varchar2(20) |  |  | '~' |
| 43 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 44 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 45 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 46 | pk_repayintst | pk_repayintst | pk_repayintst | char(20) | √ |
| 47 | pk_repayplanitem | pk_repayplanitem | pk_repayplanitem | varchar2(20) |  |  | '~' |
| 48 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 49 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) | √ |
| 50 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 51 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 52 | remark | remark | remark | varchar2(200) |
| 53 | repaytointerest | repaytointerest | repaytointerest | char(1) |
| 54 | rep_fin_rate | rep_fin_rate | rep_fin_rate | number(28, 8) |
| 55 | rep_fin_repmny | rep_fin_repmny | rep_fin_repmny | number(28, 8) |
| 56 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 57 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 58 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 59 | saga_status | saga_status | saga_status | number(38, 0) |
| 60 | settleflag | settleflag | settleflag | number(38, 0) |
| 61 | shdpayintmny | shdpayintmny | shdpayintmny | number(28, 8) |
| 62 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 63 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 64 | subfinstitutionid | subfinstitutionid | subfinstitutionid | varchar2(20) |  |  | '~' |
| 65 | submitdate | submitdate | submitdate | char(19) |
| 66 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 67 | summary | summary | summary | varchar2(200) |
| 68 | vbillno | vbillno | vbillno | varchar2(50) |  |  | '~' |
| 69 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 70 | voucherflag | voucherflag | voucherflag | char(1) |
| 71 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 72 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 73 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 74 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 75 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 76 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 77 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 78 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 79 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 80 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 81 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 82 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 83 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 84 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 85 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 86 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 87 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 88 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 89 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 90 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 91 | creationtime | creationtime | creationtime | char(19) |
| 92 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 93 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 94 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 95 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 96 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |