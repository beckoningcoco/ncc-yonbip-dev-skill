# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8995.html

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
| 23 | ctrlmethod | ctrlmethod | ctrlmethod | number(38, 0) |
| 24 | cycleloan | cycleloan | cycleloan | char(1) |
| 25 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 26 | employorgbillpool | employorgbillpool | employorgbillpool | number(28, 8) |
| 27 | employshareorgbillpool | employshareorgbillpool | employshareorgbillpool | number(28, 8) |
| 28 | enddate | enddate | enddate | char(19) |
| 29 | extcompinte | extcompinte | extcompinte | char(1) |
| 30 | financorganization | financorganization | financorganization | varchar2(20) |  |  | '~' |
| 31 | finishdate | finishdate | finishdate | char(19) |
| 32 | floatpoint | floatpoint | floatpoint | varchar2(50) |
| 33 | floatrate | floatrate | floatrate | varchar2(50) |
| 34 | fmuseway | fmuseway | fmuseway | varchar2(200) |
| 35 | glcapplymny | glcapplymny | glcapplymny | number(28, 8) |
| 36 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 37 | glcrate | glcrate | glcrate | number(28, 8) |
| 38 | gllapplymny | gllapplymny | gllapplymny | number(28, 8) |
| 39 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 40 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 41 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 42 | iadate | iadate | iadate | varchar2(20) |  |  | '~' |
| 43 | initflag | initflag | initflag | char(1) |
| 44 | innercreditaccount | innercreditaccount | innercreditaccount | varchar2(20) |  |  | '~' |
| 45 | isagcybankcontrol | isagcybankcontrol | isagcybankcontrol | char(1) |
| 46 | isautotransfer | isautotransfer | isautotransfer | char(1) |
| 47 | isfixednumberrate | isfixednumberrate | isfixednumberrate | char(1) |
| 48 | isfixrate | isfixrate | isfixrate | char(1) |
| 49 | isinterestfirst | isinterestfirst | isinterestfirst | char(1) |
| 50 | ispayplan | ispayplan | ispayplan | char(1) |
| 51 | isrepayrelease | isrepayrelease | isrepayrelease | char(1) |
| 52 | isrepayrule | isrepayrule | isrepayrule | char(1) |
| 53 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 54 | loanmny | loanmny | loanmny | number(28, 8) |
| 55 | loanperiod | loanperiod | loanperiod | varchar2(50) |
| 56 | message | message | message | varchar2(200) |
| 57 | moneycalendar | moneycalendar | moneycalendar | varchar2(50) |
| 58 | olcapplymny | olcapplymny | olcapplymny | number(28, 8) |
| 59 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 60 | olcrate | olcrate | olcrate | number(28, 8) |
| 61 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 62 | originalid | originalid | originalid | varchar2(50) |
| 63 | payoccredit | payoccredit | payoccredit | char(1) |
| 64 | periodcount | periodcount | periodcount | number(38, 0) |
| 65 | periodunit | periodunit | periodunit | varchar2(50) |
| 66 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 67 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 68 | pk_cctypedoc | pk_cctypedoc | pk_cctypedoc | varchar2(20) |  |  | '~' |
| 69 | pk_contract_icdmc | pk_contract_icdmc | pk_contract_icdmc | char(20) |
| 70 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 71 | pk_financorg | pk_financorg | pk_financorg | varchar2(20) |  |  | '~' |
| 72 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 73 | pk_icccurrtype | pk_icccurrtype | pk_icccurrtype | varchar2(20) |  |  | '~' |
| 74 | pk_incprotocol | pk_incprotocol | pk_incprotocol | varchar2(20) |  |  | '~' |
| 75 | pk_loanorg | pk_loanorg | pk_loanorg | varchar2(20) |  |  | '~' |
| 76 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 77 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 78 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 79 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |
| 80 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 81 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 82 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 83 | projectid | projectid | projectid | varchar2(20) |  |  | '~' |
| 84 | rateid | rateid | rateid | varchar2(20) |  |  | '~' |
| 85 | remark | remark | remark | varchar2(50) |
| 86 | repayreleasegua | repayreleasegua | repayreleasegua | char(1) |
| 87 | repaytype | repaytype | repaytype | varchar2(50) |
| 88 | returnmode | returnmode | returnmode | varchar2(20) |  |  | '~' |
| 89 | signdate | signdate | signdate | char(19) |
| 90 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(20) |
| 91 | srcbillno | srcbillno | srcbillno | varchar2(20) |
| 92 | submitdate | submitdate | submitdate | char(19) |
| 93 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 94 | summary | summary | summary | varchar2(50) |
| 95 | terminatedate | terminatedate | terminatedate | char(19) |
| 96 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 97 | transactclass | transactclass | transactclass | varchar2(50) |
| 98 | transacttype | transacttype | transacttype | varchar2(20) |  |  | '~' |
| 99 | unitdebitaccount | unitdebitaccount | unitdebitaccount | varchar2(20) |  |  | '~' |
| 100 | vbillno | vbillno | vbillno | varchar2(50) |
| 101 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 102 | versiondate | versiondate | versiondate | char(19) |
| 103 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 104 | versionmark | versionmark | versionmark | varchar2(100) |
| 105 | versionno | versionno | versionno | number(38, 0) |
| 106 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 107 | versiontime | versiontime | versiontime | char(19) |
| 108 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 109 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 110 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 111 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 112 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 113 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 114 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 115 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 116 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 117 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 118 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 119 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 120 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 121 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 122 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 123 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 124 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 125 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 126 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 127 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 128 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 129 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 130 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 131 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 132 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 133 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 134 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 135 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 136 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 137 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 138 | creationtime | creationtime | creationtime | char(19) |
| 139 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 140 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 141 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 142 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 143 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |