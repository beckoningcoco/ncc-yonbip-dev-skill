# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |  | '~' |
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
| 15 | contprop | contprop | contprop | varchar2(50) |
| 16 | contractamount | contractamount | contractamount | number(28, 8) |
| 17 | contractcode | contractcode | contractcode | varchar2(255) |
| 18 | contstatus | contstatus | contstatus | varchar2(50) |
| 19 | creditcorpname | creditcorpname | creditcorpname | varchar2(181) |
| 20 | debitcorpname | debitcorpname | debitcorpname | varchar2(181) |
| 21 | depositaccount | depositaccount | depositaccount | varchar2(20) |  |  | '~' |
| 22 | depositamount | depositamount | depositamount | number(28, 8) |
| 23 | depositcode | depositcode | depositcode | varchar2(30) |
| 24 | emendenum | emendenum | emendenum | number(38, 0) |
| 25 | enddate | enddate | enddate | char(19) |
| 26 | extbegindate | extbegindate | extbegindate | char(19) |
| 27 | extenddate | extenddate | extenddate | char(19) |
| 28 | floatratescale | floatratescale | floatratescale | number(15, 8) |
| 29 | glccontractmnt | glccontractmnt | glccontractmnt | number(28, 8) |
| 30 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 31 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 32 | glcrate | glcrate | glcrate | number(15, 8) |
| 33 | gllccontractmnt | gllccontractmnt | gllccontractmnt | number(28, 8) |
| 34 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 35 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 36 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 37 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 38 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 39 | headratescale | headratescale | headratescale | number(15, 8) |
| 40 | indocubillno | indocubillno | indocubillno | varchar2(20) |  |  | '~' |
| 41 | inlcno | inlcno | inlcno | varchar2(20) |  |  | '~' |
| 42 | interest | interest | interest | number(28, 8) |
| 43 | isautoaccount | isautoaccount | isautoaccount | char(1) |
| 44 | isfixedintrate | isfixedintrate | isfixedintrate | char(1) |
| 45 | isfixrate | isfixrate | isfixrate | char(1) |
| 46 | isinitial | isinitial | isinitial | char(1) |
| 47 | isinterest | isinterest | isinterest | char(1) |
| 48 | isnormalduplirate | isnormalduplirate | isnormalduplirate | char(1) |
| 49 | isoverduplirate | isoverduplirate | isoverduplirate | char(1) |
| 50 | isoverinterest | isoverinterest | isoverinterest | char(1) |
| 51 | ispayrelease | ispayrelease | ispayrelease | char(1) |
| 52 | isreceived | isreceived | isreceived | char(1) |
| 53 | isrepaied | isrepaied | isrepaied | char(1) |
| 54 | isrevolveloan | isrevolveloan | isrevolveloan | char(1) |
| 55 | lastadjdate | lastadjdate | lastadjdate | char(19) |
| 56 | lastinterestdate | lastinterestdate | lastinterestdate | char(19) |
| 57 | lastsettledate | lastsettledate | lastsettledate | char(19) |
| 58 | leftinterest | leftinterest | leftinterest | number(28, 8) |
| 59 | leftpayamount | leftpayamount | leftpayamount | number(28, 8) |
| 60 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 61 | olccontractmnt | olccontractmnt | olccontractmnt | number(28, 8) |
| 62 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 63 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 64 | olcrate | olcrate | olcrate | number(15, 8) |
| 65 | outdocubillno | outdocubillno | outdocubillno | varchar2(20) |  |  | '~' |
| 66 | outlcno | outlcno | outlcno | varchar2(20) |  |  | '~' |
| 67 | overinterestmsg | overinterestmsg | overinterestmsg | varchar2(200) |
| 68 | overratescale | overratescale | overratescale | number(15, 8) |
| 69 | payamount | payamount | payamount | number(28, 8) |
| 70 | payglcamount | payglcamount | payglcamount | number(28, 8) |
| 71 | paygllcamount | paygllcamount | paygllcamount | number(28, 8) |
| 72 | payinterest | payinterest | payinterest | number(28, 8) |
| 73 | paymode | paymode | paymode | varchar2(50) |
| 74 | payolcamount | payolcamount | payolcamount | number(28, 8) |
| 75 | periodcount | periodcount | periodcount | number(38, 0) |
| 76 | periodtype | periodtype | periodtype | varchar2(50) |
| 77 | periodunit | periodunit | periodunit | varchar2(50) |
| 78 | pk_apply | pk_apply | pk_apply | varchar2(20) |  |  | '~' |
| 79 | pk_bankprotocol | pk_bankprotocol | pk_bankprotocol | varchar2(20) |  |  | '~' |
| 80 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 81 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 82 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 83 | pk_calendar | pk_calendar | pk_calendar | varchar2(20) |  |  | '~' |
| 84 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 85 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 86 | pk_contract | pk_contract | pk_contract | varchar2(50) | √ |
| 87 | pk_creditbank | pk_creditbank | pk_creditbank | varchar2(20) |  |  | '~' |
| 88 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 89 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 90 | pk_debitorg | pk_debitorg | pk_debitorg | varchar2(20) |  |  | '~' |
| 91 | pk_debitorg_v | pk_debitorg_v | pk_debitorg_v | varchar2(20) |  |  | '~' |
| 92 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 93 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 94 | pk_depositcurr | pk_depositcurr | pk_depositcurr | varchar2(20) |  |  | '~' |
| 95 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 96 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 97 | pk_extratecode | pk_extratecode | pk_extratecode | varchar2(20) |  |  | '~' |
| 98 | pk_gpmcurr | pk_gpmcurr | pk_gpmcurr | varchar2(20) |  |  | '~' |
| 99 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 100 | pk_guarantee | pk_guarantee | pk_guarantee | varchar2(20) |  |  | '~' |
| 101 | pk_inneracc | pk_inneracc | pk_inneracc | varchar2(20) |  |  | '~' |
| 102 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 103 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 104 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 105 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 106 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 107 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 108 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 109 | rateprop | rateprop | rateprop | varchar2(15) |
| 110 | remark | remark | remark | varchar2(200) |
| 111 | repayamount | repayamount | repayamount | number(28, 8) |
| 112 | repayglcamount | repayglcamount | repayglcamount | number(28, 8) |
| 113 | repaygllcamount | repaygllcamount | repaygllcamount | number(28, 8) |
| 114 | repayolcamount | repayolcamount | repayolcamount | number(28, 8) |
| 115 | returnmode | returnmode | returnmode | varchar2(50) |
| 116 | sepccamount | sepccamount | sepccamount | number(28, 8) |
| 117 | sepccrate | sepccrate | sepccrate | number(15, 8) |
| 118 | signdate | signdate | signdate | char(19) |
| 119 | specialrate | specialrate | specialrate | number(15, 8) |
| 120 | terminatedate | terminatedate | terminatedate | char(19) |
| 121 | terminator | terminator | terminator | varchar2(20) |  |  | '~' |
| 122 | tradefinsort | tradefinsort | tradefinsort | varchar2(50) |
| 123 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 124 | versionno | versionno | versionno | number(38, 0) |
| 125 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 126 | versiontime | versiontime | versiontime | char(19) |
| 127 | yrate | yrate | yrate | number(15, 8) |
| 128 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 129 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 130 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 131 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 132 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 133 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 134 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 135 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 136 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 137 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 138 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 139 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 140 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 141 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 142 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 143 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 144 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 145 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 146 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 147 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 148 | creationtime | creationtime | creationtime | char(19) |
| 149 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 150 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 151 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 152 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 153 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |