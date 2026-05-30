# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_icdmc | pk_contract_icdmc | pk_contract_icdmc | char(20) | √ |
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
| 26 | datasource | datasource | datasource | varchar2(50) |
| 27 | employorgbillpool | employorgbillpool | employorgbillpool | number(28, 8) |
| 28 | employshareorgbillpool | employshareorgbillpool | employshareorgbillpool | number(28, 8) |
| 29 | enddate | enddate | enddate | char(19) |
| 30 | extcompinte | extcompinte | extcompinte | char(1) |
| 31 | financorganization | financorganization | financorganization | varchar2(20) |  |  | '~' |
| 32 | finishdate | finishdate | finishdate | char(19) |
| 33 | floatpoint | floatpoint | floatpoint | number(28, 8) |
| 34 | floatrate | floatrate | floatrate | number(28, 8) |
| 35 | fmuseway | fmuseway | fmuseway | varchar2(200) |
| 36 | glcapplymny | glcapplymny | glcapplymny | number(28, 8) |
| 37 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 38 | glcrate | glcrate | glcrate | number(28, 8) |
| 39 | gllapplymny | gllapplymny | gllapplymny | number(28, 8) |
| 40 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 41 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 42 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 43 | iadate | iadate | iadate | varchar2(20) |  |  | '~' |
| 44 | initflag | initflag | initflag | char(1) |
| 45 | innercreditaccount | innercreditaccount | innercreditaccount | varchar2(20) |  |  | '~' |
| 46 | isagcybankcontrol | isagcybankcontrol | isagcybankcontrol | char(1) |
| 47 | isautotransfer | isautotransfer | isautotransfer | char(1) |
| 48 | isfixednumberrate | isfixednumberrate | isfixednumberrate | char(1) |
| 49 | isfixrate | isfixrate | isfixrate | char(1) |
| 50 | isinterestfirst | isinterestfirst | isinterestfirst | char(1) |
| 51 | ispayplan | ispayplan | ispayplan | char(1) |
| 52 | isrepayrelease | isrepayrelease | isrepayrelease | char(1) |
| 53 | isrepayrule | isrepayrule | isrepayrule | char(1) |
| 54 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 55 | loanmny | loanmny | loanmny | number(28, 8) |
| 56 | loanperiod | loanperiod | loanperiod | varchar2(50) |
| 57 | message | message | message | varchar2(200) |
| 58 | moneycalendar | moneycalendar | moneycalendar | varchar2(50) |
| 59 | olcapplymny | olcapplymny | olcapplymny | number(28, 8) |
| 60 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 61 | olcrate | olcrate | olcrate | number(28, 8) |
| 62 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 63 | originalid | originalid | originalid | varchar2(50) |
| 64 | payoccredit | payoccredit | payoccredit | char(1) |
| 65 | periodcount | periodcount | periodcount | number(38, 0) |
| 66 | periodunit | periodunit | periodunit | varchar2(50) |
| 67 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 68 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 69 | pk_cctypedoc | pk_cctypedoc | pk_cctypedoc | varchar2(20) |  |  | '~' |
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
| 82 | pk_version | pk_version | pk_version | varchar2(20) |
| 83 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 84 | projectid | projectid | projectid | varchar2(20) |  |  | '~' |
| 85 | rateid | rateid | rateid | varchar2(20) |  |  | '~' |
| 86 | remark | remark | remark | varchar2(50) |
| 87 | repayreleasegua | repayreleasegua | repayreleasegua | char(1) |
| 88 | repaytype | repaytype | repaytype | varchar2(50) |
| 89 | returnmode | returnmode | returnmode | varchar2(20) |  |  | '~' |
| 90 | signdate | signdate | signdate | char(19) |
| 91 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(20) |
| 92 | srcbillno | srcbillno | srcbillno | varchar2(20) |
| 93 | submitdate | submitdate | submitdate | char(19) |
| 94 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 95 | summary | summary | summary | varchar2(50) |
| 96 | terminatedate | terminatedate | terminatedate | char(19) |
| 97 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 98 | transactclass | transactclass | transactclass | varchar2(50) |
| 99 | transacttype | transacttype | transacttype | varchar2(20) |  |  | '~' |
| 100 | unitdebitaccount | unitdebitaccount | unitdebitaccount | varchar2(20) |  |  | '~' |
| 101 | vbillno | vbillno | vbillno | varchar2(50) |
| 102 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 103 | versiondate | versiondate | versiondate | char(19) |
| 104 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 105 | versionmark | versionmark | versionmark | varchar2(100) |
| 106 | versionno | versionno | versionno | number(38, 0) |
| 107 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 108 | versiontime | versiontime | versiontime | char(19) |
| 109 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 110 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 111 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 112 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 113 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 114 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 115 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 116 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 117 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 118 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 119 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 120 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 121 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 122 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 123 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 124 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 125 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 126 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 127 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 128 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 129 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 130 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 131 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 132 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 133 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 134 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 135 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 136 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 137 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 138 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 139 | creationtime | creationtime | creationtime | char(19) |
| 140 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 141 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 142 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 143 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 144 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |