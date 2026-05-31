# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8394.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currex_h | pk_currex_h | pk_currex_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvetime | approvetime | approvetime | char(19) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | busidate | busidate | busidate | char(19) |
| 11 | businessno | businessno | businessno | varchar2(50) |
| 12 | busistatus | busistatus | busistatus | varchar2(50) |
| 13 | busitype | busitype | busitype | varchar2(50) |
| 14 | decidedate | decidedate | decidedate | char(19) |
| 15 | decidetime | decidetime | decidetime | char(19) |
| 16 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 17 | exprice | exprice | exprice | number(28, 8) |
| 18 | fundpurpose | fundpurpose | fundpurpose | varchar2(200) |
| 19 | fundsrc | fundsrc | fundsrc | varchar2(50) |
| 20 | glcexdiffamount | glcexdiffamount | glcexdiffamount | number(28, 8) |
| 21 | glcinamount | glcinamount | glcinamount | number(28, 8) |
| 22 | glcinrate | glcinrate | glcinrate | number(28, 8) |
| 23 | glcoutamount | glcoutamount | glcoutamount | number(28, 8) |
| 24 | glcoutrate | glcoutrate | glcoutrate | number(28, 8) |
| 25 | glcpoundageamount | glcpoundageamount | glcpoundageamount | number(28, 8) |
| 26 | glcpoundagerate | glcpoundagerate | glcpoundagerate | number(28, 8) |
| 27 | gllcexdiffamount | gllcexdiffamount | gllcexdiffamount | number(28, 8) |
| 28 | gllcinamount | gllcinamount | gllcinamount | number(28, 8) |
| 29 | gllcinrate | gllcinrate | gllcinrate | number(28, 8) |
| 30 | gllcoutamount | gllcoutamount | gllcoutamount | number(28, 8) |
| 31 | gllcoutrate | gllcoutrate | gllcoutrate | number(28, 8) |
| 32 | gllcpoundageamount | gllcpoundageamount | gllcpoundageamount | number(28, 8) |
| 33 | gllcpoundagerate | gllcpoundagerate | gllcpoundagerate | number(28, 8) |
| 34 | inamount | inamount | inamount | number(28, 8) |
| 35 | invoiceno | invoiceno | invoiceno | varchar2(50) |
| 36 | isreturned | isreturned | isreturned | char(1) |
| 37 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 38 | olcexdiffamount | olcexdiffamount | olcexdiffamount | number(28, 8) |
| 39 | olcinamount | olcinamount | olcinamount | number(28, 8) |
| 40 | olcinrate | olcinrate | olcinrate | number(28, 8) |
| 41 | olcoutamount | olcoutamount | olcoutamount | number(28, 8) |
| 42 | olcoutrate | olcoutrate | olcoutrate | number(28, 8) |
| 43 | olcpoundageamount | olcpoundageamount | olcpoundageamount | number(28, 8) |
| 44 | olcpoundagerate | olcpoundagerate | olcpoundagerate | number(28, 8) |
| 45 | outamount | outamount | outamount | number(28, 8) |
| 46 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 47 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 48 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 49 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 50 | pk_exorg | pk_exorg | pk_exorg | varchar2(20) |  |  | '~' |
| 51 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 52 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 53 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 54 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 55 | pk_incurrtype | pk_incurrtype | pk_incurrtype | varchar2(20) |  |  | '~' |
| 56 | pk_inneraccount_in | pk_inneraccount_in | pk_inneraccount_in | varchar2(20) |  |  | '~' |
| 57 | pk_inneraccount_out | pk_inneraccount_out | pk_inneraccount_out | varchar2(20) |  |  | '~' |
| 58 | pk_inneracc_poundage | pk_inneracc_poundage | pk_inneracc_poundage | varchar2(20) |  |  | '~' |
| 59 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 60 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 61 | pk_outcurrtype | pk_outcurrtype | pk_outcurrtype | varchar2(20) |  |  | '~' |
| 62 | pk_pfbusiflow | pk_pfbusiflow | pk_pfbusiflow | varchar2(20) |  |  | '~' |
| 63 | pk_poundagecurr | pk_poundagecurr | pk_poundagecurr | varchar2(20) |  |  | '~' |
| 64 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 65 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 66 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(50) |
| 67 | pk_srccmpbusitypeid | pk_srccmpbusitypeid | pk_srccmpbusitypeid | varchar2(20) |  |  | '~' |
| 68 | poundageamount | poundageamount | poundageamount | number(28, 8) |
| 69 | poundageratio | poundageratio | poundageratio | number(28, 8) |
| 70 | remark | remark | remark | varchar2(181) |
| 71 | returndate | returndate | returndate | char(19) |
| 72 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 73 | returnreason | returnreason | returnreason | varchar2(200) |
| 74 | returntime | returntime | returntime | char(19) |
| 75 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 76 | srcbilltype | srcbilltype | srcbilltype | varchar2(40) |
| 77 | srcbusitype | srcbusitype | srcbusitype | varchar2(50) |
| 78 | srcmodule | srcmodule | srcmodule | varchar2(50) |
| 79 | summary | summary | summary | varchar2(200) |
| 80 | unitbillapprover | unitbillapprover | unitbillapprover | varchar2(20) |  |  | '~' |
| 81 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 82 | unitsubmitdate | unitsubmitdate | unitsubmitdate | char(19) |
| 83 | unitsubmittime | unitsubmittime | unitsubmittime | char(19) |
| 84 | unitsubmituser | unitsubmituser | unitsubmituser | varchar2(20) |  |  | '~' |
| 85 | vbillno | vbillno | vbillno | varchar2(40) |
| 86 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 87 | verificationsheetno | verificationsheetno | verificationsheetno | varchar2(50) |
| 88 | voucherdate | voucherdate | voucherdate | char(19) |
| 89 | voucherflag | voucherflag | voucherflag | char(1) |
| 90 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 91 | vouchertime | vouchertime | vouchertime | char(19) |
| 92 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 93 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 94 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 95 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 96 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 97 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 98 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 99 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 100 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 101 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 102 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 103 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 104 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 105 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 106 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 107 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 108 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 109 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 110 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 111 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 112 | creationtime | creationtime | creationtime | char(19) |
| 113 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 114 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 115 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 116 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 117 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |