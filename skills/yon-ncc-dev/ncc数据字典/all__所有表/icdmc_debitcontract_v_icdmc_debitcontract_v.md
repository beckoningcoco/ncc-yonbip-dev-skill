# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 3 | alterperson | alterperson | alterperson | varchar2(20) |  |  | '~' |
| 4 | alterreason | alterreason | alterreason | varchar2(50) |
| 5 | altertime | altertime | altertime | char(19) |
| 6 | applymny | applymny | applymny | number(28, 8) |
| 7 | applyno | applyno | applyno | varchar2(50) |
| 8 | approvenote | approvenote | approvenote | varchar2(50) |
| 9 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 10 | bankaccbasid | bankaccbasid | bankaccbasid | varchar2(20) |  |  | '~' |
| 11 | begindate | begindate | begindate | char(19) |
| 12 | billmakedate | billmakedate | billmakedate | char(19) |
| 13 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 14 | billmaketime | billmaketime | billmaketime | char(19) |
| 15 | billtype | billtype | billtype | char(10) |
| 16 | busistatus | busistatus | busistatus | number(38, 0) |
| 17 | ccmny | ccmny | ccmny | number(28, 8) |
| 18 | contractno | contractno | contractno | varchar2(50) |
| 19 | contstatus | contstatus | contstatus | number(38, 0) |
| 20 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 21 | creditaccount | creditaccount | creditaccount | varchar2(20) |  |  | '~' |
| 22 | creditcc | creditcc | creditcc | number(28, 8) |
| 23 | cycleloan | cycleloan | cycleloan | char(1) |
| 24 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 25 | employorgbillpool | employorgbillpool | employorgbillpool | number(28, 8) |
| 26 | employshareorgbillpool | employshareorgbillpool | employshareorgbillpool | number(28, 8) |
| 27 | enddate | enddate | enddate | char(19) |
| 28 | extcompinte | extcompinte | extcompinte | char(1) |
| 29 | financorganization | financorganization | financorganization | varchar2(20) |  |  | '~' |
| 30 | finishdate | finishdate | finishdate | char(19) |
| 31 | floatpoint | floatpoint | floatpoint | varchar2(50) |
| 32 | floatrate | floatrate | floatrate | varchar2(50) |
| 33 | fmuseway | fmuseway | fmuseway | varchar2(200) |
| 34 | glcapplymny | glcapplymny | glcapplymny | number(28, 8) |
| 35 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 36 | glcrate | glcrate | glcrate | number(28, 8) |
| 37 | gllapplymny | gllapplymny | gllapplymny | number(28, 8) |
| 38 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 39 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 40 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 41 | iadate | iadate | iadate | varchar2(20) |  |  | '~' |
| 42 | initflag | initflag | initflag | char(1) |
| 43 | innercreditaccount | innercreditaccount | innercreditaccount | varchar2(20) |  |  | '~' |
| 44 | isagcybankcontrol | isagcybankcontrol | isagcybankcontrol | char(1) |
| 45 | isautotransfer | isautotransfer | isautotransfer | char(1) |
| 46 | isfixednumberrate | isfixednumberrate | isfixednumberrate | char(1) |
| 47 | isfixrate | isfixrate | isfixrate | char(1) |
| 48 | isinterestfirst | isinterestfirst | isinterestfirst | char(1) |
| 49 | ispayplan | ispayplan | ispayplan | char(1) |
| 50 | isrepayrule | isrepayrule | isrepayrule | char(1) |
| 51 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 52 | loanmny | loanmny | loanmny | number(28, 8) |
| 53 | loanperiod | loanperiod | loanperiod | varchar2(50) |
| 54 | message | message | message | varchar2(200) |
| 55 | moneycalendar | moneycalendar | moneycalendar | varchar2(50) |
| 56 | olcapplymny | olcapplymny | olcapplymny | number(28, 8) |
| 57 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 58 | olcrate | olcrate | olcrate | number(28, 8) |
| 59 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 60 | originalid | originalid | originalid | varchar2(50) |
| 61 | payoccredit | payoccredit | payoccredit | char(1) |
| 62 | periodcount | periodcount | periodcount | number(38, 0) |
| 63 | periodunit | periodunit | periodunit | varchar2(50) |
| 64 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 65 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 66 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 67 | pk_debitcontract_icdmc | pk_debitcontract_icdmc | pk_debitcontract_icdmc | char(20) | √ |
| 68 | pk_financorg | pk_financorg | pk_financorg | varchar2(20) |  |  | '~' |
| 69 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 70 | pk_loanorg | pk_loanorg | pk_loanorg | varchar2(20) |  |  | '~' |
| 71 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 72 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 73 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 74 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 75 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 76 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 77 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 78 | projectid | projectid | projectid | varchar2(20) |  |  | '~' |
| 79 | rateid | rateid | rateid | varchar2(20) |  |  | '~' |
| 80 | remark | remark | remark | varchar2(50) |
| 81 | repayreleasegua | repayreleasegua | repayreleasegua | char(1) |
| 82 | repaytype | repaytype | repaytype | varchar2(50) |
| 83 | returnmode | returnmode | returnmode | varchar2(20) |  |  | '~' |
| 84 | signdate | signdate | signdate | char(19) |
| 85 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 86 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 87 | submitdate | submitdate | submitdate | char(19) |
| 88 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 89 | summary | summary | summary | varchar2(50) |
| 90 | terminatedate | terminatedate | terminatedate | char(19) |
| 91 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 92 | transactclass | transactclass | transactclass | varchar2(50) |
| 93 | transacttype | transacttype | transacttype | varchar2(20) |  |  | '~' |
| 94 | unitdebitaccount | unitdebitaccount | unitdebitaccount | varchar2(20) |  |  | '~' |
| 95 | vbillno | vbillno | vbillno | varchar2(50) |
| 96 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 97 | versiondate | versiondate | versiondate | char(19) |
| 98 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 99 | versionmark | versionmark | versionmark | varchar2(100) |
| 100 | versionno | versionno | versionno | number(38, 0) |
| 101 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 102 | versiontime | versiontime | versiontime | char(19) |
| 103 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 104 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 105 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 106 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 107 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 108 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 109 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 110 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 111 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 112 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 113 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 114 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 115 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 116 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 117 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 118 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 119 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 120 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 121 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 122 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 123 | creationtime | creationtime | creationtime | char(19) |
| 124 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 125 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 126 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 127 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 128 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |