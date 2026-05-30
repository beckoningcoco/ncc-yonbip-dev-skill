# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | pk_contract | pk_contract | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | autoenddate | autoenddate | autoenddate | char(19) |
| 6 | begindate | begindate | begindate | char(19) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | billsource | billsource | billsource | number(38, 0) |
| 11 | ccamount | ccamount | ccamount | number(28, 8) |
| 12 | ccolcamount | ccolcamount | ccolcamount | number(28, 8) |
| 13 | ccsource | ccsource | ccsource | varchar2(50) |
| 14 | cctype | cctype | cctype | varchar2(50) |
| 15 | commitdate | commitdate | commitdate | char(19) |
| 16 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 17 | contprop | contprop | contprop | varchar2(50) |
| 18 | contractamount | contractamount | contractamount | number(28, 8) |
| 19 | contractcode | contractcode | contractcode | varchar2(255) |
| 20 | contstatus | contstatus | contstatus | varchar2(50) |
| 21 | creditcorpname | creditcorpname | creditcorpname | varchar2(181) |
| 22 | debitcorpname | debitcorpname | debitcorpname | varchar2(181) |
| 23 | depositaccount | depositaccount | depositaccount | varchar2(20) |  |  | '~' |
| 24 | depositamount | depositamount | depositamount | number(28, 8) |
| 25 | depositcode | depositcode | depositcode | varchar2(30) |
| 26 | emendenum | emendenum | emendenum | number(38, 0) |
| 27 | enddate | enddate | enddate | char(19) |
| 28 | extbegindate | extbegindate | extbegindate | char(19) |
| 29 | extenddate | extenddate | extenddate | char(19) |
| 30 | floatratescale | floatratescale | floatratescale | number(15, 8) |
| 31 | glccontractmnt | glccontractmnt | glccontractmnt | number(28, 8) |
| 32 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 33 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 34 | glcrate | glcrate | glcrate | number(15, 8) |
| 35 | gllccontractmnt | gllccontractmnt | gllccontractmnt | number(28, 8) |
| 36 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 37 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 38 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 39 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 40 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 41 | headratescale | headratescale | headratescale | number(15, 8) |
| 42 | indocubillno | indocubillno | indocubillno | varchar2(20) |  |  | '~' |
| 43 | inlcno | inlcno | inlcno | varchar2(20) |  |  | '~' |
| 44 | interest | interest | interest | number(28, 8) |
| 45 | isautoaccount | isautoaccount | isautoaccount | char(1) |
| 46 | isfixedintrate | isfixedintrate | isfixedintrate | char(1) |
| 47 | isfixrate | isfixrate | isfixrate | char(1) |
| 48 | isinitial | isinitial | isinitial | char(1) |
| 49 | isinterest | isinterest | isinterest | char(1) |
| 50 | isnormalduplirate | isnormalduplirate | isnormalduplirate | char(1) |
| 51 | isoverduplirate | isoverduplirate | isoverduplirate | char(1) |
| 52 | isoverinterest | isoverinterest | isoverinterest | char(1) |
| 53 | ispayrelease | ispayrelease | ispayrelease | char(1) |
| 54 | isreceived | isreceived | isreceived | char(1) |
| 55 | isrepaied | isrepaied | isrepaied | char(1) |
| 56 | isrevolveloan | isrevolveloan | isrevolveloan | char(1) |
| 57 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 58 | lastinterestdate | lastinterestdate | lastinterestdate | char(19) |
| 59 | lastsettledate | lastsettledate | lastsettledate | char(19) |
| 60 | leftinterest | leftinterest | leftinterest | number(28, 8) |
| 61 | leftpayamount | leftpayamount | leftpayamount | number(28, 8) |
| 62 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 63 | olccontractmnt | olccontractmnt | olccontractmnt | number(28, 8) |
| 64 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 65 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 66 | olcrate | olcrate | olcrate | number(15, 8) |
| 67 | outdocubillno | outdocubillno | outdocubillno | varchar2(20) |  |  | '~' |
| 68 | outlcno | outlcno | outlcno | varchar2(20) |  |  | '~' |
| 69 | overinterestmsg | overinterestmsg | overinterestmsg | varchar2(200) |
| 70 | overratescale | overratescale | overratescale | number(15, 8) |
| 71 | payamount | payamount | payamount | number(28, 8) |
| 72 | payglcamount | payglcamount | payglcamount | number(28, 8) |
| 73 | paygllcamount | paygllcamount | paygllcamount | number(28, 8) |
| 74 | payinterest | payinterest | payinterest | number(28, 8) |
| 75 | paymode | paymode | paymode | varchar2(50) |
| 76 | payolcamount | payolcamount | payolcamount | number(28, 8) |
| 77 | periodcount | periodcount | periodcount | number(38, 0) |
| 78 | periodtype | periodtype | periodtype | varchar2(50) |
| 79 | periodunit | periodunit | periodunit | varchar2(50) |
| 80 | pk_apply | pk_apply | pk_apply | varchar2(20) |  |  | '~' |
| 81 | pk_bankprotocol | pk_bankprotocol | pk_bankprotocol | varchar2(20) |  |  | '~' |
| 82 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 83 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 84 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 85 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 86 | pk_calendar | pk_calendar | pk_calendar | varchar2(20) |  |  | '~' |
| 87 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 88 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 89 | pk_creditbank | pk_creditbank | pk_creditbank | varchar2(20) |  |  | '~' |
| 90 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 91 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 92 | pk_debitorg | pk_debitorg | pk_debitorg | varchar2(20) |  |  | '~' |
| 93 | pk_debitorg_v | pk_debitorg_v | pk_debitorg_v | varchar2(20) |  |  | '~' |
| 94 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 95 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 96 | pk_depositcurr | pk_depositcurr | pk_depositcurr | varchar2(20) |  |  | '~' |
| 97 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 98 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 99 | pk_extratecode | pk_extratecode | pk_extratecode | varchar2(20) |  |  | '~' |
| 100 | pk_gpmcurr | pk_gpmcurr | pk_gpmcurr | varchar2(20) |  |  | '~' |
| 101 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 102 | pk_guarantee | pk_guarantee | pk_guarantee | varchar2(20) |  |  | '~' |
| 103 | pk_inneracc | pk_inneracc | pk_inneracc | varchar2(20) |  |  | '~' |
| 104 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 105 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 106 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 107 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 108 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 109 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 110 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 111 | pk_version | pk_version | pk_version | varchar2(20) |  |  | '~' |
| 112 | rateprop | rateprop | rateprop | varchar2(15) |
| 113 | remark | remark | remark | varchar2(200) |
| 114 | repayamount | repayamount | repayamount | number(28, 8) |
| 115 | repayglcamount | repayglcamount | repayglcamount | number(28, 8) |
| 116 | repaygllcamount | repaygllcamount | repaygllcamount | number(28, 8) |
| 117 | repayolcamount | repayolcamount | repayolcamount | number(28, 8) |
| 118 | returnmode | returnmode | returnmode | varchar2(50) |
| 119 | sepccamount | sepccamount | sepccamount | number(28, 8) |
| 120 | sepccrate | sepccrate | sepccrate | number(15, 8) |
| 121 | signdate | signdate | signdate | char(19) |
| 122 | specialrate | specialrate | specialrate | number(15, 8) |
| 123 | terminatedate | terminatedate | terminatedate | char(19) |
| 124 | terminator | terminator | terminator | varchar2(20) |  |  | '~' |
| 125 | tradefinsort | tradefinsort | tradefinsort | varchar2(50) |
| 126 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 127 | versionno | versionno | versionno | number(38, 0) |
| 128 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 129 | versiontime | versiontime | versiontime | char(19) |
| 130 | yrate | yrate | yrate | number(15, 8) |
| 131 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 132 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 133 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 134 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 135 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 136 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 137 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 138 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 139 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 140 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 141 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 142 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 143 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 144 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 145 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 146 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 147 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 148 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 149 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 150 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 151 | creationtime | creationtime | creationtime | char(19) |
| 152 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 153 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 154 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 155 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 156 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |