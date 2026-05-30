# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcpl | pk_repayprcpl | pk_repayprcpl | char(20) | √ |
| 2 | agentbankmgt | agentbankmgt | agentbankmgt | char(1) |  |  | 'N' |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | busistatus | busistatus | busistatus | number(38, 0) |
| 9 | calcultype | calcultype | calcultype | varchar2(20) |
| 10 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 11 | enlendingflag | enlendingflag | enlendingflag | char(1) |  |  | 'N' |
| 12 | exglcrate | exglcrate | exglcrate | number(28, 8) |
| 13 | exgllcrate | exgllcrate | exgllcrate | number(28, 8) |
| 14 | exolcrate | exolcrate | exolcrate | number(28, 8) |
| 15 | exrate | exrate | exrate | number(28, 8) |
| 16 | exrepayglcmny | exrepayglcmny | exrepayglcmny | number(28, 8) |
| 17 | exrepaygllcmny | exrepaygllcmny | exrepaygllcmny | number(28, 8) |
| 18 | exrepaymny | exrepaymny | exrepaymny | number(28, 8) |
| 19 | exrepayolcmny | exrepayolcmny | exrepayolcmny | number(28, 8) |
| 20 | exreplayflag | exreplayflag | exreplayflag | char(1) |
| 21 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 22 | fin_repayintstmny | fin_repayintstmny | fin_repayintstmny | number(28, 8) |
| 23 | fixhrateflag | fixhrateflag | fixhrateflag | char(1) |  |  | 'N' |
| 24 | glcrate | glcrate | glcrate | number(28, 8) |
| 25 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 26 | initflag | initflag | initflag | char(1) |  |  | 'N' |
| 27 | interestmny | interestmny | interestmny | number(28, 8) |
| 28 | intrstoffbyprcplflag | intrstoffbyprcplflag | intrstoffbyprcplflag | char(1) |  |  | 'N' |
| 29 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 30 | isadvancerepay | isadvancerepay | isadvancerepay | char(1) |
| 31 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 32 | makevdate | makevdate | makevdate | char(19) |
| 33 | makevtime | makevtime | makevtime | char(19) |
| 34 | memo | memo | memo | varchar2(200) |
| 35 | olcinterestmny | olcinterestmny | olcinterestmny | number(28, 8) |
| 36 | olcrate | olcrate | olcrate | number(28, 8) |
| 37 | overdueflag | overdueflag | overdueflag | char(1) |  |  | 'N' |
| 38 | overseasinterestrate | overseasinterestrate | overseasinterestrate | number(28, 8) |
| 39 | paytotalintstflag | paytotalintstflag | paytotalintstflag | char(1) |  |  | 'N' |
| 40 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 41 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 42 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 43 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 44 | pk_currtype_financepay | pk_currtype_financepay | pk_currtype_financepay | varchar2(20) |  |  | '~' |
| 45 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 46 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 47 | pk_debitprof_v | pk_debitprof_v | pk_debitprof_v | varchar2(20) |  |  | '~' |
| 48 | pk_exbankacc | pk_exbankacc | pk_exbankacc | varchar2(20) |  |  | '~' |
| 49 | pk_excurrtpe | pk_excurrtpe | pk_excurrtpe | varchar2(20) |  |  | '~' |
| 50 | pk_financepay | pk_financepay | pk_financepay | varchar2(20) |  |  | '~' |
| 51 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 52 | pk_loanbankacc | pk_loanbankacc | pk_loanbankacc | varchar2(20) |  |  | '~' |
| 53 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 54 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 55 | pk_repayplanitem | pk_repayplanitem | pk_repayplanitem | varchar2(20) |  |  | '~' |
| 56 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 57 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 58 | prcplorder | prcplorder | prcplorder | varchar2(50) |
| 59 | qimoratestring | qimoratestring | qimoratestring | varchar2(50) |
| 60 | ratedays | ratedays | ratedays | varchar2(50) |
| 61 | regenrepayplan | regenrepayplan | regenrepayplan | char(1) |  |  | 'Y' |
| 62 | releasecreditflag | releasecreditflag | releasecreditflag | char(1) |  |  | 'N' |
| 63 | releasegrtflag | releasegrtflag | releasegrtflag | char(1) |  |  | 'N' |
| 64 | repaydate | repaydate | repaydate | char(19) |
| 65 | repayglcmny | repayglcmny | repayglcmny | number(28, 8) |
| 66 | repaygllcmny | repaygllcmny | repaygllcmny | number(28, 8) |
| 67 | repaymny | repaymny | repaymny | number(28, 8) |
| 68 | repayolcmny | repayolcmny | repayolcmny | number(28, 8) |
| 69 | repaytype | repaytype | repaytype | varchar2(50) |
| 70 | rep_fin_rate | rep_fin_rate | rep_fin_rate | number(28, 8) |
| 71 | rep_fin_repmny | rep_fin_repmny | rep_fin_repmny | number(28, 8) |
| 72 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 73 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 74 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 75 | saga_status | saga_status | saga_status | number(38, 0) |
| 76 | shdpaytotlintstgllmny | shdpaytotlintstgllmny | shdpaytotlintstgllmny | number(28, 8) |
| 77 | shdpaytotlintstglmny | shdpaytotlintstglmny | shdpaytotlintstglmny | number(28, 8) |
| 78 | shdpaytotlintstmny | shdpaytotlintstmny | shdpaytotlintstmny | number(28, 8) |
| 79 | shdpaytotlintstolmny | shdpaytotlintstolmny | shdpaytotlintstolmny | number(28, 8) |
| 80 | submitdate | submitdate | submitdate | char(19) |
| 81 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 82 | substituteflag | substituteflag | substituteflag | char(1) |  |  | 'N' |
| 83 | unrepayglcmny | unrepayglcmny | unrepayglcmny | number(28, 8) |
| 84 | unrepaygllcmny | unrepaygllcmny | unrepaygllcmny | number(28, 8) |
| 85 | unrepaymny | unrepaymny | unrepaymny | number(28, 8) |
| 86 | unrepayolcmny | unrepayolcmny | unrepayolcmny | number(28, 8) |
| 87 | vbillno | vbillno | vbillno | varchar2(50) |
| 88 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 89 | voucherflag | voucherflag | voucherflag | char(1) |  |  | 'N' |
| 90 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 91 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 92 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 93 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 94 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 95 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 96 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 97 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 98 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 99 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 100 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 101 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 102 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 103 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 104 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 105 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 106 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 107 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 108 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 109 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 110 | creationtime | creationtime | creationtime | char(19) |
| 111 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 112 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 113 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 114 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 115 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |