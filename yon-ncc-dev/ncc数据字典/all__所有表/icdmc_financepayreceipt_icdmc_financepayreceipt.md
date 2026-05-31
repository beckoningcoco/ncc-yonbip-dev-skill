# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financepayreceipt | pk_financepayreceipt | pk_financepayreceipt | char(20) | √ |
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
| 21 | busistatus | busistatus | busistatus | number(38, 0) |
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
| 42 | extcompinterest | extcompinterest | extcompinterest | char(1) |
| 43 | extfloatpoint | extfloatpoint | extfloatpoint | number(28, 8) |
| 44 | extfloatscale | extfloatscale | extfloatscale | number(28, 8) |
| 45 | financecorpid | financecorpid | financecorpid | varchar2(20) |  |  | '~' |
| 46 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 47 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 48 | finishdate | finishdate | finishdate | char(19) |
| 49 | fixrate | fixrate | fixrate | char(1) |
| 50 | floatpoint | floatpoint | floatpoint | number(28, 8) |
| 51 | floatscale | floatscale | floatscale | number(28, 8) |
| 52 | glccontractmny | glccontractmny | glccontractmny | number(28, 8) |
| 53 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 54 | glcrate | glcrate | glcrate | number(28, 8) |
| 55 | glctotalintstmny | glctotalintstmny | glctotalintstmny | number(28, 8) |
| 56 | glcunpaymny | glcunpaymny | glcunpaymny | number(28, 8) |
| 57 | glcunrepayintstmny | glcunrepayintstmny | glcunrepayintstmny | number(28, 8) |
| 58 | gllccontractmny | gllccontractmny | gllccontractmny | number(28, 8) |
| 59 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 60 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 61 | gllctotalintstmny | gllctotalintstmny | gllctotalintstmny | number(28, 8) |
| 62 | gllcunpaymny | gllcunpaymny | gllcunpaymny | number(28, 8) |
| 63 | gllcunrepayintstmny | gllcunrepayintstmny | gllcunrepayintstmny | number(28, 8) |
| 64 | initflag | initflag | initflag | char(1) |
| 65 | innerdueaccount | innerdueaccount | innerdueaccount | varchar2(20) |  |  | '~' |
| 66 | innerloanaccount | innerloanaccount | innerloanaccount | varchar2(20) |  |  | '~' |
| 67 | interestmny | interestmny | interestmny | number(28, 8) |
| 68 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 69 | isautogenrepayplan | isautogenrepayplan | isautogenrepayplan | char(1) |
| 70 | isfixhrate | isfixhrate | isfixhrate | char(1) |
| 71 | ishistory | ishistory | ishistory | char(1) |
| 72 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 73 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 74 | loanaccount | loanaccount | loanaccount | varchar2(20) |  |  | '~' |
| 75 | loandate | loandate | loandate | char(19) |
| 76 | loanmny | loanmny | loanmny | number(28, 8) |
| 77 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 78 | makevdate | makevdate | makevdate | char(19) |
| 79 | makevtime | makevtime | makevtime | char(19) |
| 80 | maxversion | maxversion | maxversion | number(38, 0) |
| 81 | memo | memo | memo | varchar2(200) |
| 82 | message | message | message | varchar2(200) |
| 83 | olccontractmny | olccontractmny | olccontractmny | number(28, 8) |
| 84 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 85 | olcrate | olcrate | olcrate | number(28, 8) |
| 86 | olctotalintstmny | olctotalintstmny | olctotalintstmny | number(28, 8) |
| 87 | olcunpaymny | olcunpaymny | olcunpaymny | number(28, 8) |
| 88 | olcunrepayintstmny | olcunrepayintstmny | olcunrepayintstmny | number(28, 8) |
| 89 | oneinterest | oneinterest | oneinterest | char(1) |
| 90 | openingbillpool | openingbillpool | openingbillpool | char(1) |
| 91 | payplan | payplan | payplan | varchar2(20) |  |  | '~' |
| 92 | payreleaseauth | payreleaseauth | payreleaseauth | char(1) |
| 93 | payreleasemny | payreleasemny | payreleasemny | char(1) |
| 94 | period | period | period | varchar2(50) |
| 95 | periodcount | periodcount | periodcount | number(38, 0) |
| 96 | periodunit | periodunit | periodunit | varchar2(50) |
| 97 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 98 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 99 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 100 | pk_financepay | pk_financepay | pk_financepay | varchar2(20) |  |  | '~' |
| 101 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 102 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 103 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 104 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 105 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 106 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 107 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 108 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 109 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 110 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 111 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 112 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 113 | pk_version | pk_version | pk_version | varchar2(50) |
| 114 | prepayinterest | prepayinterest | prepayinterest | char(1) |
| 115 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 116 | rate | rate | rate | number(28, 8) |
| 117 | rateexplan | rateexplan | rateexplan | varchar2(50) |
| 118 | realrate | realrate | realrate | number(28, 8) |
| 119 | releaseorgbillpool | releaseorgbillpool | releaseorgbillpool | number(28, 8) |
| 120 | releaseshareorgbillpool | releaseshareorgbillpool | releaseshareorgbillpool | number(28, 8) |
| 121 | remark | remark | remark | varchar2(200) |
| 122 | repaytype | repaytype | repaytype | varchar2(50) |
| 123 | replacement | replacement | replacement | char(1) |
| 124 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 125 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 126 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 127 | saga_status | saga_status | saga_status | number(38, 0) |
| 128 | settlefailreason | settlefailreason | settlefailreason | varchar2(200) |
| 129 | settleflag | settleflag | settleflag | number(38, 0) |
| 130 | signdata | signdata | signdata | varchar2(200) |
| 131 | signuserid | signuserid | signuserid | varchar2(200) |
| 132 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 133 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 134 | summary | summary | summary | varchar2(200) |
| 135 | tallydate | tallydate | tallydate | char(19) |
| 136 | tallyflag | tallyflag | tallyflag | char(1) |
| 137 | tallyoperator | tallyoperator | tallyoperator | varchar2(20) |  |  | '~' |
| 138 | tallytime | tallytime | tallytime | char(19) |
| 139 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 140 | terminatedate | terminatedate | terminatedate | char(19) |
| 141 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 142 | totalintstmny | totalintstmny | totalintstmny | number(28, 8) |
| 143 | tranevent | tranevent | tranevent | varchar2(200) |
| 144 | trantypeid | trantypeid | trantypeid | varchar2(50) |
| 145 | unpaymny | unpaymny | unpaymny | number(28, 8) |
| 146 | unrepayintstmny | unrepayintstmny | unrepayintstmny | number(28, 8) |
| 147 | usecontractrate | usecontractrate | usecontractrate | char(1) |
| 148 | vbillno | vbillno | vbillno | varchar2(50) |
| 149 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 150 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 151 | versionmark | versionmark | versionmark | varchar2(100) |
| 152 | versionno | versionno | versionno | number(38, 0) |
| 153 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 154 | versiontime | versiontime | versiontime | char(19) |
| 155 | voucherflag | voucherflag | voucherflag | char(1) |
| 156 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 157 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 158 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 159 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 160 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 161 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 162 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 163 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 164 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 165 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 166 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 167 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 168 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 169 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 170 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 171 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 172 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 173 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 174 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 175 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 176 | creationtime | creationtime | creationtime | char(19) |
| 177 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 178 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 179 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 180 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 181 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |