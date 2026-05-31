# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerloanpay | pk_innerloanpay | pk_innerloanpay | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 4 | adjbegdate | adjbegdate | adjbegdate | char(19) |
| 5 | adjperiodunit | adjperiodunit | adjperiodunit | number(38, 0) |
| 6 | adjratemethod | adjratemethod | adjratemethod | varchar2(50) |
| 7 | advancefloatpoint | advancefloatpoint | advancefloatpoint | number(28, 8) |
| 8 | advancefloatscale | advancefloatscale | advancefloatscale | number(28, 8) |
| 9 | agentbankmgt | agentbankmgt | agentbankmgt | char(1) |
| 10 | alreadyloan | alreadyloan | alreadyloan | number(28, 8) |
| 11 | alterreason | alterreason | alterreason | varchar2(50) |
| 12 | amountuse | amountuse | amountuse | varchar2(200) |
| 13 | approvenote | approvenote | approvenote | varchar2(50) |
| 14 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 15 | autogenrepay | autogenrepay | autogenrepay | char(1) |
| 16 | beginrefdate | beginrefdate | beginrefdate | char(19) |
| 17 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 18 | billmaketime | billmaketime | billmaketime | char(19) |
| 19 | borrowmnysource | borrowmnysource | borrowmnysource | varchar2(50) |
| 20 | businessno | businessno | businessno | varchar2(50) |
| 21 | busistatus | busistatus | busistatus | varchar2(50) |
| 22 | canglcloanmny | canglcloanmny | canglcloanmny | number(28, 8) |
| 23 | cangllcloanmny | cangllcloanmny | cangllcloanmny | number(28, 8) |
| 24 | canloan | canloan | canloan | number(28, 8) |
| 25 | canloanmny | canloanmny | canloanmny | number(28, 8) |
| 26 | canolcloanmny | canolcloanmny | canolcloanmny | number(28, 8) |
| 27 | commitdate | commitdate | commitdate | char(19) |
| 28 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 29 | contenddate | contenddate | contenddate | char(19) |
| 30 | contractid | contractid | contractid | varchar2(20) |  |  | '~' |
| 31 | contractmny | contractmny | contractmny | number(28, 8) |
| 32 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 33 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 34 | datasource | datasource | datasource | varchar2(32) |
| 35 | debittoloan | debittoloan | debittoloan | char(1) |
| 36 | debitunitacctid | debitunitacctid | debitunitacctid | varchar2(20) |  |  | '~' |
| 37 | decidedate | decidedate | decidedate | char(19) |
| 38 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 39 | effecttype | effecttype | effecttype | varchar2(50) |
| 40 | employorgbillpool | employorgbillpool | employorgbillpool | number(28, 8) |
| 41 | employshareorgbillpool | employshareorgbillpool | employshareorgbillpool | number(28, 8) |
| 42 | enableplan | enableplan | enableplan | char(1) |
| 43 | enablerule | enablerule | enablerule | char(1) |
| 44 | extcompinterest | extcompinterest | extcompinterest | char(1) |
| 45 | extfloatpoint | extfloatpoint | extfloatpoint | number(28, 8) |
| 46 | extfloatscale | extfloatscale | extfloatscale | number(28, 8) |
| 47 | financecorpid | financecorpid | financecorpid | varchar2(20) |  |  | '~' |
| 48 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 49 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 50 | finishdate | finishdate | finishdate | char(19) |
| 51 | fixrate | fixrate | fixrate | char(1) |
| 52 | floatpoint | floatpoint | floatpoint | number(28, 8) |
| 53 | floatscale | floatscale | floatscale | number(28, 8) |
| 54 | glccontractmny | glccontractmny | glccontractmny | number(28, 8) |
| 55 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 56 | glcrate | glcrate | glcrate | number(28, 8) |
| 57 | glctotalintstmny | glctotalintstmny | glctotalintstmny | number(28, 8) |
| 58 | glcunpaymny | glcunpaymny | glcunpaymny | number(28, 8) |
| 59 | glcunrepayintstmny | glcunrepayintstmny | glcunrepayintstmny | number(28, 8) |
| 60 | gllccontractmny | gllccontractmny | gllccontractmny | number(28, 8) |
| 61 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 62 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 63 | gllctotalintstmny | gllctotalintstmny | gllctotalintstmny | number(28, 8) |
| 64 | gllcunpaymny | gllcunpaymny | gllcunpaymny | number(28, 8) |
| 65 | gllcunrepayintstmny | gllcunrepayintstmny | gllcunrepayintstmny | number(28, 8) |
| 66 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 67 | initflag | initflag | initflag | char(1) |
| 68 | innerdueaccount | innerdueaccount | innerdueaccount | varchar2(20) |  |  | '~' |
| 69 | innerloanaccount | innerloanaccount | innerloanaccount | varchar2(20) |  |  | '~' |
| 70 | interestmny | interestmny | interestmny | number(28, 8) |
| 71 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 72 | isautogenrepayplan | isautogenrepayplan | isautogenrepayplan | char(1) |
| 73 | isfixhrate | isfixhrate | isfixhrate | char(1) |
| 74 | ishistory | ishistory | ishistory | char(1) |
| 75 | ispayusecc | ispayusecc | ispayusecc | char(1) |
| 76 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 77 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 78 | lastsettledate | lastsettledate | lastsettledate | char(19) |
| 79 | loanaccount | loanaccount | loanaccount | varchar2(20) |  |  | '~' |
| 80 | loandate | loandate | loandate | char(19) |
| 81 | loanmny | loanmny | loanmny | number(28, 8) |
| 82 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 83 | makevdate | makevdate | makevdate | char(19) |
| 84 | makevtime | makevtime | makevtime | char(19) |
| 85 | maxversion | maxversion | maxversion | number(38, 0) |
| 86 | memo | memo | memo | varchar2(200) |
| 87 | message | message | message | varchar2(200) |
| 88 | olccontractmny | olccontractmny | olccontractmny | number(28, 8) |
| 89 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 90 | olcrate | olcrate | olcrate | number(28, 8) |
| 91 | olctotalintstmny | olctotalintstmny | olctotalintstmny | number(28, 8) |
| 92 | olcunpaymny | olcunpaymny | olcunpaymny | number(28, 8) |
| 93 | olcunrepayintstmny | olcunrepayintstmny | olcunrepayintstmny | number(28, 8) |
| 94 | oneinterest | oneinterest | oneinterest | char(1) |
| 95 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 96 | payplan | payplan | payplan | varchar2(20) |  |  | '~' |
| 97 | payreleaseauth | payreleaseauth | payreleaseauth | char(1) |
| 98 | payreleasemny | payreleasemny | payreleasemny | char(1) |
| 99 | period | period | period | varchar2(50) |
| 100 | periodcount | periodcount | periodcount | number(38, 0) |
| 101 | periodunit | periodunit | periodunit | varchar2(50) |
| 102 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 103 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 104 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 105 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 106 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 107 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 108 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 109 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 110 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 111 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 112 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 113 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 114 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 115 | pk_version | pk_version | pk_version | varchar2(50) |
| 116 | prcplorder | prcplorder | prcplorder | varchar2(50) |
| 117 | prepayinterest | prepayinterest | prepayinterest | char(1) |
| 118 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 119 | rate | rate | rate | number(28, 8) |
| 120 | rateexplan | rateexplan | rateexplan | varchar2(50) |
| 121 | realrate | realrate | realrate | number(28, 8) |
| 122 | regenrepayplan | regenrepayplan | regenrepayplan | varchar2(50) |
| 123 | remark | remark | remark | varchar2(200) |
| 124 | repaytype | repaytype | repaytype | varchar2(50) |
| 125 | replacement | replacement | replacement | char(1) |
| 126 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 127 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 128 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 129 | saga_status | saga_status | saga_status | number(38, 0) |
| 130 | settlefailreason | settlefailreason | settlefailreason | varchar2(200) |
| 131 | settleflag | settleflag | settleflag | number(38, 0) |
| 132 | signdata | signdata | signdata | varchar2(200) |
| 133 | signuserid | signuserid | signuserid | varchar2(200) |
| 134 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 135 | srcbillno | srcbillno | srcbillno | varchar2(20) |  |  | '~' |
| 136 | summary | summary | summary | varchar2(200) |
| 137 | terminatedate | terminatedate | terminatedate | char(19) |
| 138 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 139 | totalintstmny | totalintstmny | totalintstmny | number(28, 8) |
| 140 | tranevent | tranevent | tranevent | varchar2(200) |
| 141 | trantypeid | trantypeid | trantypeid | varchar2(50) |
| 142 | unpaymny | unpaymny | unpaymny | number(28, 8) |
| 143 | unrepayintstmny | unrepayintstmny | unrepayintstmny | number(28, 8) |
| 144 | usecontractrate | usecontractrate | usecontractrate | char(1) |
| 145 | vbillno | vbillno | vbillno | varchar2(50) |
| 146 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 147 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 148 | versionmark | versionmark | versionmark | varchar2(100) |
| 149 | versionno | versionno | versionno | number(38, 0) |
| 150 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 151 | versiontime | versiontime | versiontime | char(19) |
| 152 | voucherflag | voucherflag | voucherflag | char(1) |
| 153 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 154 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 155 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 156 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 157 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 158 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 159 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 160 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 161 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 162 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 163 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 164 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 165 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 166 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 167 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 168 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 169 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 170 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 171 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 172 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 173 | creationtime | creationtime | creationtime | char(19) |
| 174 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 175 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 176 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 177 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 178 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |