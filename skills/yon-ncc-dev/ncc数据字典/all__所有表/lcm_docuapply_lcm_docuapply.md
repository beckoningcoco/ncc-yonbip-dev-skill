# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9760.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 2 | applycode | applycode | applycode | varchar2(255) |
| 3 | applydate | applydate | applydate | char(19) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(1024) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | autoenddate | autoenddate | autoenddate | char(19) |
| 8 | backnote | backnote | backnote | varchar2(1024) |
| 9 | begindate | begindate | begindate | char(19) |
| 10 | billamount | billamount | billamount | number(28, 8) |
| 11 | billmakedate | billmakedate | billmakedate | char(19) |
| 12 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 13 | billmaketime | billmaketime | billmaketime | char(19) |
| 14 | ccamount | ccamount | ccamount | number(28, 8) |
| 15 | cctype | cctype | cctype | varchar2(50) |
| 16 | commitdate | commitdate | commitdate | char(19) |
| 17 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 18 | contprop | contprop | contprop | varchar2(50) |
| 19 | contractamount | contractamount | contractamount | number(28, 8) |
| 20 | creditcorpname | creditcorpname | creditcorpname | varchar2(50) |  |  | '~' |
| 21 | debitcorpname | debitcorpname | debitcorpname | varchar2(50) |  |  | '~' |
| 22 | docuscale | docuscale | docuscale | number(28, 8) |
| 23 | enddate | enddate | enddate | char(19) |
| 24 | floatratescale | floatratescale | floatratescale | number(15, 8) |
| 25 | glcapplymnt | glcapplymnt | glcapplymnt | number(28, 8) |
| 26 | glcrate | glcrate | glcrate | number(15, 8) |
| 27 | gllcapplymnt | gllcapplymnt | gllcapplymnt | number(28, 8) |
| 28 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 29 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 30 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 31 | headratescale | headratescale | headratescale | number(15, 8) |
| 32 | indocubillno | indocubillno | indocubillno | varchar2(20) |  |  | '~' |
| 33 | inlcno | inlcno | inlcno | varchar2(20) |  |  | '~' |
| 34 | isautoacc | isautoacc | isautoacc | char(1) |
| 35 | isback | isback | isback | char(1) |
| 36 | isdeal | isdeal | isdeal | char(1) |
| 37 | isfixrate | isfixrate | isfixrate | char(1) |
| 38 | isinterest | isinterest | isinterest | char(1) |
| 39 | isnormalduplirate | isnormalduplirate | isnormalduplirate | char(1) |
| 40 | isoverduplirate | isoverduplirate | isoverduplirate | char(1) |
| 41 | ispayrelease | ispayrelease | ispayrelease | char(1) |
| 42 | isrevolveloan | isrevolveloan | isrevolveloan | char(1) |
| 43 | lastsettledate | lastsettledate | lastsettledate | char(19) |
| 44 | olcapplymnt | olcapplymnt | olcapplymnt | number(28, 8) |
| 45 | olcrate | olcrate | olcrate | number(15, 8) |
| 46 | outdocubillno | outdocubillno | outdocubillno | varchar2(20) |  |  | '~' |
| 47 | outlcno | outlcno | outlcno | varchar2(20) |  |  | '~' |
| 48 | overratescale | overratescale | overratescale | number(15, 8) |
| 49 | paymode | paymode | paymode | varchar2(50) |
| 50 | periodcount | periodcount | periodcount | number(38, 0) |
| 51 | periodtype | periodtype | periodtype | varchar2(50) |
| 52 | periodunit | periodunit | periodunit | varchar2(50) |
| 53 | pk_bankprotocol | pk_bankprotocol | pk_bankprotocol | varchar2(20) |  |  | '~' |
| 54 | pk_bank_cc | pk_bank_cc | pk_bank_cc | varchar2(20) |  |  | '~' |
| 55 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 56 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 57 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 58 | pk_calendar | pk_calendar | pk_calendar | varchar2(20) |  |  | '~' |
| 59 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 60 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 61 | pk_contract | pk_contract | pk_contract | varchar2(50) |
| 62 | pk_creditbank | pk_creditbank | pk_creditbank | varchar2(20) |  |  | '~' |
| 63 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 64 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 65 | pk_debitorg | pk_debitorg | pk_debitorg | varchar2(20) |  |  | '~' |
| 66 | pk_debitorg_v | pk_debitorg_v | pk_debitorg_v | varchar2(20) |  |  | '~' |
| 67 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 68 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 69 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 70 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 71 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 72 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 73 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 74 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 75 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 76 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 77 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 78 | remark | remark | remark | varchar2(200) |
| 79 | returnmode | returnmode | returnmode | varchar2(50) |
| 80 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 81 | terminatedate | terminatedate | terminatedate | char(19) |
| 82 | terminator | terminator | terminator | varchar2(20) |  |  | '~' |
| 83 | tradefinsort | tradefinsort | tradefinsort | varchar2(50) |
| 84 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 85 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 86 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 87 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 88 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 89 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 90 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 91 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 92 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 93 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 94 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 95 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 96 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 97 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 98 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 99 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 100 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 101 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 102 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 103 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 104 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 105 | creationtime | creationtime | creationtime | char(19) |
| 106 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 107 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 108 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 109 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 110 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |