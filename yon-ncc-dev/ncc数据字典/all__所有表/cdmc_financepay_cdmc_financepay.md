# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7473.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financepay | pk_financepay | pk_financepay | char(20) | √ |
| 2 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 3 | adjbegdate | adjbegdate | adjbegdate | char(19) |
| 4 | adjperiodunit | adjperiodunit | adjperiodunit | number(38, 0) |
| 5 | adjratemethod | adjratemethod | adjratemethod | varchar2(50) |
| 6 | advancefloatpoint | advancefloatpoint | advancefloatpoint | number(28, 8) |
| 7 | advancefloatscale | advancefloatscale | advancefloatscale | number(28, 8) |
| 8 | agentbankmgt | agentbankmgt | agentbankmgt | char(1) |
| 9 | alreadyloan | alreadyloan | alreadyloan | number(28, 8) |
| 10 | alterreason | alterreason | alterreason | varchar2(50) |
| 11 | amountuse | amountuse | amountuse | varchar2(200) |
| 12 | approvenote | approvenote | approvenote | varchar2(50) |
| 13 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 14 | autogenrepay | autogenrepay | autogenrepay | char(1) |
| 15 | beginrefdate | beginrefdate | beginrefdate | char(19) |
| 16 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 17 | billmaketime | billmaketime | billmaketime | char(19) |
| 18 | busistatus | busistatus | busistatus | number(38, 0) |
| 19 | busitype | busitype | busitype | varchar2(50) |  |  | 'LOAN' |
| 20 | calcultype | calcultype | calcultype | varchar2(50) |
| 21 | canloan | canloan | canloan | number(28, 8) |
| 22 | commitdate | commitdate | commitdate | char(19) |
| 23 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 24 | contenddate | contenddate | contenddate | char(19) |
| 25 | contractid | contractid | contractid | varchar2(20) |  |  | '~' |
| 26 | contractmny | contractmny | contractmny | number(28, 8) |
| 27 | contractname | contractname | contractname | varchar2(500) |
| 28 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 29 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 30 | debittoloan | debittoloan | debittoloan | char(1) |
| 31 | debittoloantime | debittoloantime | debittoloantime | char(19) |
| 32 | debitunitacctid | debitunitacctid | debitunitacctid | varchar2(20) |  |  | '~' |
| 33 | effecttype | effecttype | effecttype | varchar2(50) |
| 34 | enablegraped | enablegraped | enablegraped | char(1) |
| 35 | enableplan | enableplan | enableplan | char(1) |
| 36 | enablerule | enablerule | enablerule | char(1) |
| 37 | extcompinterest | extcompinterest | extcompinterest | char(1) |
| 38 | extfloatpoint | extfloatpoint | extfloatpoint | number(28, 8) |
| 39 | extfloatscale | extfloatscale | extfloatscale | number(28, 8) |
| 40 | financecorpid | financecorpid | financecorpid | varchar2(20) |  |  | '~' |
| 41 | financorgid | financorgid | financorgid | varchar2(20) |  |  | '~' |
| 42 | fininstitutionid | fininstitutionid | fininstitutionid | varchar2(20) |  |  | '~' |
| 43 | finishdate | finishdate | finishdate | char(19) |
| 44 | fin_con_loanmny | fin_con_loanmny | fin_con_loanmny | number(28, 8) |
| 45 | fin_con_rate | fin_con_rate | fin_con_rate | number(28, 8) |
| 46 | fixrate | fixrate | fixrate | char(1) |
| 47 | floatpoint | floatpoint | floatpoint | number(28, 8) |
| 48 | floatscale | floatscale | floatscale | number(28, 8) |
| 49 | glcalreadyloan | glcalreadyloan | glcalreadyloan | number(28, 8) |
| 50 | glccanloan | glccanloan | glccanloan | number(28, 8) |
| 51 | glccontractmny | glccontractmny | glccontractmny | number(28, 8) |
| 52 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 53 | glcrate | glcrate | glcrate | number(28, 8) |
| 54 | glcrepayedintstmny | glcrepayedintstmny | glcrepayedintstmny | number(28, 8) |
| 55 | glcrepayedprcplmny | glcrepayedprcplmny | glcrepayedprcplmny | number(28, 8) |
| 56 | glctotalintstmny | glctotalintstmny | glctotalintstmny | number(28, 8) |
| 57 | glcunloanmny | glcunloanmny | glcunloanmny | number(28, 8) |
| 58 | glcunpaymny | glcunpaymny | glcunpaymny | number(28, 8) |
| 59 | glcunrepayintstmny | glcunrepayintstmny | glcunrepayintstmny | number(28, 8) |
| 60 | gllcalreadyloan | gllcalreadyloan | gllcalreadyloan | number(28, 8) |
| 61 | gllccanloan | gllccanloan | gllccanloan | number(28, 8) |
| 62 | gllccontractmny | gllccontractmny | gllccontractmny | number(28, 8) |
| 63 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 64 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 65 | gllcrepayedintstmny | gllcrepayedintstmny | gllcrepayedintstmny | number(28, 8) |
| 66 | gllcrepayedprcplmny | gllcrepayedprcplmny | gllcrepayedprcplmny | number(28, 8) |
| 67 | gllctotalintstmny | gllctotalintstmny | gllctotalintstmny | number(28, 8) |
| 68 | gllcunloanmny | gllcunloanmny | gllcunloanmny | number(28, 8) |
| 69 | gllcunpaymny | gllcunpaymny | gllcunpaymny | number(28, 8) |
| 70 | gllcunrepayintstmny | gllcunrepayintstmny | gllcunrepayintstmny | number(28, 8) |
| 71 | graped | graped | graped | number(38, 0) |
| 72 | grapedunit | grapedunit | grapedunit | varchar2(50) |
| 73 | initflag | initflag | initflag | char(1) |
| 74 | interestmny | interestmny | interestmny | number(28, 8) |
| 75 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 76 | isautogenrepayplan | isautogenrepayplan | isautogenrepayplan | char(1) |
| 77 | isfixhrate | isfixhrate | isfixhrate | char(1) |
| 78 | ishistory | ishistory | ishistory | char(1) |
| 79 | ispayusecc | ispayusecc | ispayusecc | char(1) |
| 80 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 81 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 82 | lastsettledate | lastsettledate | lastsettledate | char(19) |
| 83 | loandate | loandate | loandate | char(19) |
| 84 | loanmny | loanmny | loanmny | number(28, 8) |
| 85 | makervuser | makervuser | makervuser | varchar2(20) |  |  | '~' |
| 86 | makevdate | makevdate | makevdate | char(19) |
| 87 | makevtime | makevtime | makevtime | char(19) |
| 88 | maxversion | maxversion | maxversion | number(38, 0) |
| 89 | memo | memo | memo | varchar2(200) |
| 90 | message | message | message | varchar2(200) |
| 91 | olcalreadyloan | olcalreadyloan | olcalreadyloan | number(28, 8) |
| 92 | olccanloan | olccanloan | olccanloan | number(28, 8) |
| 93 | olccontractmny | olccontractmny | olccontractmny | number(28, 8) |
| 94 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 95 | olcrate | olcrate | olcrate | number(28, 8) |
| 96 | olcrepayedintstmny | olcrepayedintstmny | olcrepayedintstmny | number(28, 8) |
| 97 | olcrepayedprcplmny | olcrepayedprcplmny | olcrepayedprcplmny | number(28, 8) |
| 98 | olctotalintstmny | olctotalintstmny | olctotalintstmny | number(28, 8) |
| 99 | olcunloanmny | olcunloanmny | olcunloanmny | number(28, 8) |
| 100 | olcunpaymny | olcunpaymny | olcunpaymny | number(28, 8) |
| 101 | olcunrepayintstmny | olcunrepayintstmny | olcunrepayintstmny | number(28, 8) |
| 102 | oneinterest | oneinterest | oneinterest | char(1) |
| 103 | payplan | payplan | payplan | varchar2(20) |  |  | '~' |
| 104 | payreleaseauth | payreleaseauth | payreleaseauth | char(1) |
| 105 | payreleasemny | payreleasemny | payreleasemny | char(1) |
| 106 | period | period | period | varchar2(50) |
| 107 | pk_banktype | pk_banktype | pk_banktype | varchar2(50) |
| 108 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 109 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 110 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 111 | pk_currtype_con | pk_currtype_con | pk_currtype_con | varchar2(20) |
| 112 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 113 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 114 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 115 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 116 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 117 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 118 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 119 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 120 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 121 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 122 | pk_version | pk_version | pk_version | varchar2(50) |
| 123 | pk_workcalendar | pk_workcalendar | pk_workcalendar | varchar2(50) |
| 124 | prcplorder | prcplorder | prcplorder | varchar2(50) |
| 125 | prepayinterest | prepayinterest | prepayinterest | char(1) |
| 126 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 127 | rate | rate | rate | number(28, 8) |
| 128 | ratedays | ratedays | ratedays | varchar2(50) |
| 129 | rateexplan | rateexplan | rateexplan | varchar2(50) |
| 130 | ratetype | ratetype | ratetype | varchar2(50) |
| 131 | realrate | realrate | realrate | number(28, 8) |
| 132 | regenrepayplan | regenrepayplan | regenrepayplan | varchar2(50) |
| 133 | remark | remark | remark | varchar2(200) |
| 134 | repayedintstmny | repayedintstmny | repayedintstmny | number(28, 8) |
| 135 | repayedprcplmny | repayedprcplmny | repayedprcplmny | number(28, 8) |
| 136 | repaytype | repaytype | repaytype | varchar2(50) |
| 137 | replacement | replacement | replacement | char(1) |
| 138 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 139 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 140 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 141 | saga_status | saga_status | saga_status | number(38, 0) |
| 142 | settlefailreason | settlefailreason | settlefailreason | varchar2(200) |
| 143 | settleflag | settleflag | settleflag | number(38, 0) |
| 144 | signdata | signdata | signdata | varchar2(200) |
| 145 | signuserid | signuserid | signuserid | varchar2(200) |
| 146 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 147 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 148 | summary | summary | summary | varchar2(200) |
| 149 | terminatedate | terminatedate | terminatedate | char(19) |
| 150 | terminater | terminater | terminater | varchar2(20) |  |  | '~' |
| 151 | totalintstmny | totalintstmny | totalintstmny | number(28, 8) |
| 152 | tranevent | tranevent | tranevent | varchar2(200) |
| 153 | trantypeid | trantypeid | trantypeid | varchar2(50) |
| 154 | unloanmny | unloanmny | unloanmny | number(28, 8) |
| 155 | unpaymny | unpaymny | unpaymny | number(28, 8) |
| 156 | unrepayintstmny | unrepayintstmny | unrepayintstmny | number(28, 8) |
| 157 | usecontractrate | usecontractrate | usecontractrate | char(1) |
| 158 | vbillno | vbillno | vbillno | varchar2(100) |
| 159 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 160 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 161 | versionmark | versionmark | versionmark | varchar2(100) |
| 162 | versionno | versionno | versionno | number(38, 0) |
| 163 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 164 | versiontime | versiontime | versiontime | char(19) |
| 165 | vocjxrule | vocjxrule | vocjxrule | varchar2(50) |
| 166 | voucherflag | voucherflag | voucherflag | char(1) |
| 167 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 168 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 169 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 170 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 171 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 172 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 173 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 174 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 175 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 176 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 177 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 178 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 179 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 180 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 181 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 182 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 183 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 184 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 185 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 186 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 187 | creationtime | creationtime | creationtime | char(19) |
| 188 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 189 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 190 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 191 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 192 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |