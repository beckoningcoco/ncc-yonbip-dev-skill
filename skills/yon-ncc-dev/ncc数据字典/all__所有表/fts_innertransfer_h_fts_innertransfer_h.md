# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertransfer_h | pk_innertransfer_h | pk_innertransfer_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptwfstatus | acceptwfstatus | acceptwfstatus | number(38, 0) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | auditdate | auditdate | auditdate | char(19) |
| 6 | auditsignature | auditsignature | auditsignature | varchar2(20) |  |  | '~' |
| 7 | audittime | audittime | audittime | char(19) |
| 8 | beginacceptdate | beginacceptdate | beginacceptdate | char(19) |
| 9 | billdate | billdate | billdate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billsignature | billsignature | billsignature | varchar2(20) |  |  | '~' |
| 12 | billstatus | billstatus | billstatus | number(38, 0) |
| 13 | billtime | billtime | billtime | char(19) |
| 14 | bookaccdate | bookaccdate | bookaccdate | char(19) |
| 15 | businessno | businessno | businessno | varchar2(50) |
| 16 | clearaccountintype | clearaccountintype | clearaccountintype | varchar2(15) |
| 17 | clearaccountouttype | clearaccountouttype | clearaccountouttype | varchar2(15) |
| 18 | clearbookaccdate | clearbookaccdate | clearbookaccdate | char(19) |
| 19 | cleardate | cleardate | cleardate | char(19) |
| 20 | clearinioflag | clearinioflag | clearinioflag | varchar2(10) |
| 21 | clearoutioflag | clearoutioflag | clearoutioflag | varchar2(10) |
| 22 | consigndate | consigndate | consigndate | char(19) |
| 23 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 24 | consigntime | consigntime | consigntime | char(19) |
| 25 | decidedate | decidedate | decidedate | char(19) |
| 26 | decidesignature | decidesignature | decidesignature | varchar2(20) |  |  | '~' |
| 27 | decidetime | decidetime | decidetime | char(19) |
| 28 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 29 | decidewfstatus | decidewfstatus | decidewfstatus | number(38, 0) |
| 30 | deliversignature | deliversignature | deliversignature | varchar2(20) |  |  | '~' |
| 31 | deliverwfstatus | deliverwfstatus | deliverwfstatus | number(38, 0) |
| 32 | delivretreason | delivretreason | delivretreason | varchar2(75) |
| 33 | destdeliverdirection | destdeliverdirection | destdeliverdirection | varchar2(21) |
| 34 | glcpaytotalamount | glcpaytotalamount | glcpaytotalamount | number(28, 8) |
| 35 | glcrate | glcrate | glcrate | number(15, 8) |
| 36 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 37 | glcunpaytotalamount | glcunpaytotalamount | glcunpaytotalamount | number(28, 8) |
| 38 | gllcpaytotalamount | gllcpaytotalamount | gllcpaytotalamount | number(28, 8) |
| 39 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 40 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 41 | gllcunpaytotalamount | gllcunpaytotalamount | gllcunpaytotalamount | number(28, 8) |
| 42 | isbssign | isbssign | isbssign | char(1) |
| 43 | iscommitinnerreal | iscommitinnerreal | iscommitinnerreal | char(1) |
| 44 | isdelivreturned | isdelivreturned | isdelivreturned | char(1) |
| 45 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 46 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 47 | lastacceptdate | lastacceptdate | lastacceptdate | char(19) |
| 48 | makevdate | makevdate | makevdate | char(19) |
| 49 | makevtime | makevtime | makevtime | char(19) |
| 50 | makevuser | makevuser | makevuser | varchar2(20) |  |  | '~' |
| 51 | memo | memo | memo | varchar2(300) |
| 52 | needacceptance | needacceptance | needacceptance | char(1) |
| 53 | olcpaytotalamount | olcpaytotalamount | olcpaytotalamount | number(28, 8) |
| 54 | olcrate | olcrate | olcrate | number(15, 8) |
| 55 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 56 | olcunpaytotalamount | olcunpaytotalamount | olcunpaytotalamount | number(28, 8) |
| 57 | paydate | paydate | paydate | char(19) |
| 58 | paysignature | paysignature | paysignature | varchar2(20) |  |  | '~' |
| 59 | paytime | paytime | paytime | char(19) |
| 60 | paytotalamount | paytotalamount | paytotalamount | number(28, 8) |
| 61 | payuser | payuser | payuser | varchar2(20) |  |  | '~' |
| 62 | paywfstatus | paywfstatus | paywfstatus | number(38, 0) |
| 63 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 64 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 65 | pk_clearaccount_in | pk_clearaccount_in | pk_clearaccount_in | varchar2(20) |  |  | '~' |
| 66 | pk_clearaccount_out | pk_clearaccount_out | pk_clearaccount_out | varchar2(20) |  |  | '~' |
| 67 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 68 | pk_deldestorg | pk_deldestorg | pk_deldestorg | varchar2(20) |  |  | '~' |
| 69 | pk_delsourceorg | pk_delsourceorg | pk_delsourceorg | varchar2(20) |  |  | '~' |
| 70 | pk_fundorg_p | pk_fundorg_p | pk_fundorg_p | varchar2(20) |  |  | '~' |
| 71 | pk_fundorg_p_v | pk_fundorg_p_v | pk_fundorg_p_v | varchar2(20) |  |  | '~' |
| 72 | pk_fundorg_r | pk_fundorg_r | pk_fundorg_r | varchar2(20) |  |  | '~' |
| 73 | pk_fundorg_r_v | pk_fundorg_r_v | pk_fundorg_r_v | varchar2(20) |  |  | '~' |
| 74 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 75 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 76 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 77 | pk_original | pk_original | pk_original | varchar2(20) |  |  | '~' |
| 78 | pk_pfbusiflow | pk_pfbusiflow | pk_pfbusiflow | varchar2(20) |  |  | '~' |
| 79 | pk_planitem_in | pk_planitem_in | pk_planitem_in | varchar2(20) |  |  | '~' |
| 80 | pk_planitem_out | pk_planitem_out | pk_planitem_out | varchar2(20) |  |  | '~' |
| 81 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 82 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 83 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | varchar2(20) |  |  | '~' |
| 84 | pk_srccmpbusitypeid | pk_srccmpbusitypeid | pk_srccmpbusitypeid | varchar2(20) |  |  | '~' |
| 85 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 86 | pk_transactorg_v | pk_transactorg_v | pk_transactorg_v | varchar2(20) |  |  | '~' |
| 87 | pk_transact_group | pk_transact_group | pk_transact_group | varchar2(20) |  |  | '~' |
| 88 | recmodul | recmodul | recmodul | varchar2(21) |
| 89 | retbilldate | retbilldate | retbilldate | char(19) |
| 90 | retbillreason | retbillreason | retbillreason | varchar2(300) |
| 91 | retbilltime | retbilltime | retbilltime | char(19) |
| 92 | retbilluser | retbilluser | retbilluser | varchar2(20) |  |  | '~' |
| 93 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 94 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 95 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 96 | saga_status | saga_status | saga_status | number(38, 0) |
| 97 | sourcedeliverdirection | sourcedeliverdirection | sourcedeliverdirection | varchar2(21) |
| 98 | srcbillcode | srcbillcode | srcbillcode | varchar2(30) |
| 99 | srcbilltype | srcbilltype | srcbilltype | varchar2(21) |
| 100 | srccmpbusitype | srccmpbusitype | srccmpbusitype | varchar2(21) |
| 101 | strokes | strokes | strokes | number(38, 0) |
| 102 | submitdate | submitdate | submitdate | char(19) |
| 103 | submitsignature | submitsignature | submitsignature | varchar2(20) |  |  | '~' |
| 104 | submittime | submittime | submittime | char(19) |
| 105 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 106 | syssubmituser | syssubmituser | syssubmituser | varchar2(20) |  |  | '~' |
| 107 | totalamount | totalamount | totalamount | number(28, 8) |
| 108 | transfer | transfer | transfer | varchar2(20) |  |  | '~' |
| 109 | transferdate | transferdate | transferdate | char(19) |
| 110 | transfertime | transfertime | transfertime | char(19) |
| 111 | transfertype | transfertype | transfertype | varchar2(30) |
| 112 | unitapprover | unitapprover | unitapprover | char(20) |  |  | '~' |
| 113 | unitbillmaker | unitbillmaker | unitbillmaker | char(20) |  |  | '~' |
| 114 | unpaytotalamount | unpaytotalamount | unpaytotalamount | number(28, 8) |
| 115 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 116 | vbillno | vbillno | vbillno | varchar2(50) |
| 117 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 118 | voucherflag | voucherflag | voucherflag | char(1) |
| 119 | vsourcebustype | vsourcebustype | vsourcebustype | number(38, 0) |
| 120 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 121 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 122 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 123 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 124 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 125 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 126 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 127 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 128 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 129 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 130 | creationtime | creationtime | creationtime | char(19) |
| 131 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 132 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 133 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 134 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 135 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |