# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcpl_h | pk_repayprcpl_h | pk_repayprcpl_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | agentbankmgt | agentbankmgt | agentbankmgt | char(1) |  |  | 'N' |
| 4 | approvenote | approvenote | approvenote | varchar2(2048) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | beforerepayflag | beforerepayflag | beforerepayflag | char(1) |  |  | 'N' |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | businessno | businessno | businessno | varchar2(50) |
| 11 | busistatus | busistatus | busistatus | number(38, 0) |
| 12 | contenddate | contenddate | contenddate | char(19) |
| 13 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 14 | datasource | datasource | datasource | varchar2(50) |
| 15 | decidedate | decidedate | decidedate | char(19) |
| 16 | decider | decider | decider | varchar2(20) |  |  | '~' |
| 17 | enlendingflag | enlendingflag | enlendingflag | char(1) |  |  | 'N' |
| 18 | exglcrate | exglcrate | exglcrate | number(28, 8) |
| 19 | exgllcrate | exgllcrate | exgllcrate | number(28, 8) |
| 20 | exolcrate | exolcrate | exolcrate | number(28, 8) |
| 21 | exrate | exrate | exrate | number(28, 8) |
| 22 | exrepayglcmny | exrepayglcmny | exrepayglcmny | number(28, 8) |
| 23 | exrepaygllcmny | exrepaygllcmny | exrepaygllcmny | number(28, 8) |
| 24 | exrepaymny | exrepaymny | exrepaymny | number(28, 8) |
| 25 | exrepayolcmny | exrepayolcmny | exrepayolcmny | number(28, 8) |
| 26 | exreplayflag | exreplayflag | exreplayflag | char(1) |
| 27 | financecorpid | financecorpid | financecorpid | varchar2(20) |  |  | '~' |
| 28 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 29 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 30 | fixhrateflag | fixhrateflag | fixhrateflag | char(1) |  |  | 'N' |
| 31 | glcintstmny | glcintstmny | glcintstmny | number(28, 8) |
| 32 | glcrate | glcrate | glcrate | number(28, 8) |
| 33 | gllcintstmny | gllcintstmny | gllcintstmny | number(28, 8) |
| 34 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 35 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 36 | initflag | initflag | initflag | char(1) |  |  | 'N' |
| 37 | interestmny | interestmny | interestmny | number(28, 8) |
| 38 | intrstoffbyprcplflag | intrstoffbyprcplflag | intrstoffbyprcplflag | char(1) |  |  | 'N' |
| 39 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 40 | loanaccount | loanaccount | loanaccount | varchar2(20) |  |  | '~' |
| 41 | loandate | loandate | loandate | char(19) |
| 42 | loanmny | loanmny | loanmny | number(28, 8) |
| 43 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 44 | makevdate | makevdate | makevdate | char(19) |
| 45 | makevtime | makevtime | makevtime | char(19) |
| 46 | memo | memo | memo | varchar2(200) |
| 47 | olcintstmny | olcintstmny | olcintstmny | number(28, 8) |
| 48 | olcrate | olcrate | olcrate | number(28, 8) |
| 49 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 50 | overdueflag | overdueflag | overdueflag | char(1) |  |  | 'N' |
| 51 | paytotalintstflag | paytotalintstflag | paytotalintstflag | char(1) |  |  | 'N' |
| 52 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 53 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 54 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 55 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 56 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 57 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 58 | pk_debitprof_v | pk_debitprof_v | pk_debitprof_v | varchar2(20) |  |  | '~' |
| 59 | pk_exbankacc | pk_exbankacc | pk_exbankacc | varchar2(20) |  |  | '~' |
| 60 | pk_excurrtpe | pk_excurrtpe | pk_excurrtpe | varchar2(20) |  |  | '~' |
| 61 | pk_financepay | pk_financepay | pk_financepay | varchar2(20) |  |  | '~' |
| 62 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 63 | pk_innerdueaccount | pk_innerdueaccount | pk_innerdueaccount | varchar2(20) |  |  | '~' |
| 64 | pk_innerloanaccount | pk_innerloanaccount | pk_innerloanaccount | varchar2(20) |  |  | '~' |
| 65 | pk_loanbankacc | pk_loanbankacc | pk_loanbankacc | varchar2(20) |  |  | '~' |
| 66 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 67 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 68 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 69 | pk_repayplanitem | pk_repayplanitem | pk_repayplanitem | varchar2(20) |  |  | '~' |
| 70 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 71 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 72 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 73 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(50) |
| 74 | prcplorder | prcplorder | prcplorder | varchar2(50) |
| 75 | regenrepayplan | regenrepayplan | regenrepayplan | char(1) |  |  | 'Y' |
| 76 | releasecreditflag | releasecreditflag | releasecreditflag | char(1) |  |  | 'N' |
| 77 | releasegrtflag | releasegrtflag | releasegrtflag | char(1) |  |  | 'N' |
| 78 | releaseorgbillpool | releaseorgbillpool | releaseorgbillpool | number(28, 8) |
| 79 | releaseshareorgbillpool | releaseshareorgbillpool | releaseshareorgbillpool | number(28, 8) |
| 80 | repaydate | repaydate | repaydate | char(19) |
| 81 | repayglcmny | repayglcmny | repayglcmny | number(28, 8) |
| 82 | repaygllcmny | repaygllcmny | repaygllcmny | number(28, 8) |
| 83 | repaymny | repaymny | repaymny | number(28, 8) |
| 84 | repayolcmny | repayolcmny | repayolcmny | number(28, 8) |
| 85 | repayplanglcmny | repayplanglcmny | repayplanglcmny | number(28, 8) |
| 86 | repayplangllcmny | repayplangllcmny | repayplangllcmny | number(28, 8) |
| 87 | repayplanmny | repayplanmny | repayplanmny | number(28, 8) |
| 88 | repayplanolcmny | repayplanolcmny | repayplanolcmny | number(28, 8) |
| 89 | repaysource | repaysource | repaysource | varchar2(50) |
| 90 | repaytype | repaytype | repaytype | varchar2(50) |
| 91 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 92 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 93 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 94 | saga_status | saga_status | saga_status | number(38, 0) |
| 95 | shdpaytotlintstglcmny | shdpaytotlintstglcmny | shdpaytotlintstglcmny | number(28, 8) |
| 96 | shdpaytotlintstgllcmny | shdpaytotlintstgllcmny | shdpaytotlintstgllcmny | number(28, 8) |
| 97 | shdpaytotlintstmny | shdpaytotlintstmny | shdpaytotlintstmny | number(28, 8) |
| 98 | shdpaytotlintstolmny | shdpaytotlintstolmny | shdpaytotlintstolmny | number(28, 8) |
| 99 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 100 | submitdate | submitdate | submitdate | char(19) |
| 101 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 102 | substituteflag | substituteflag | substituteflag | char(1) |  |  | 'N' |
| 103 | unrepayglcmny | unrepayglcmny | unrepayglcmny | number(28, 8) |
| 104 | unrepaygllcmny | unrepaygllcmny | unrepaygllcmny | number(28, 8) |
| 105 | unrepaymny | unrepaymny | unrepaymny | number(28, 8) |
| 106 | unrepayolcmny | unrepayolcmny | unrepayolcmny | number(28, 8) |
| 107 | vbillno | vbillno | vbillno | varchar2(50) |
| 108 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 109 | voucherflag | voucherflag | voucherflag | char(1) |  |  | 'N' |
| 110 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 111 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 112 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 113 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 114 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 115 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 116 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 117 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 118 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 119 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 120 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 121 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 122 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 123 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 124 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 125 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 126 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 127 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 128 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 129 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 130 | creationtime | creationtime | creationtime | char(19) |
| 131 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 132 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 133 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 134 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 135 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |