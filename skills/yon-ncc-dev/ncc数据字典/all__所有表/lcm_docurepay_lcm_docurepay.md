# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayrcpt | pk_repayrcpt | pk_repayrcpt | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | collectasrepay | collectasrepay | collectasrepay | char(1) |
| 8 | commitdate | commitdate | commitdate | char(19) |
| 9 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 10 | contractamount | contractamount | contractamount | number(28, 8) |
| 11 | dvoucherdate | dvoucherdate | dvoucherdate | char(19) |
| 12 | forceacct | forceacct | forceacct | char(1) |
| 13 | foreignamount | foreignamount | foreignamount | number(28, 8) |
| 14 | foreignrate | foreignrate | foreignrate | number(15, 8) |
| 15 | glcforeignrate | glcforeignrate | glcforeignrate | number(15, 8) |
| 16 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 17 | glcrate | glcrate | glcrate | number(15, 8) |
| 18 | glcrepayamount | glcrepayamount | glcrepayamount | number(28, 8) |
| 19 | glcsumamount | glcsumamount | glcsumamount | number(28, 8) |
| 20 | gllcforeignrate | gllcforeignrate | gllcforeignrate | number(15, 8) |
| 21 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 23 | gllcrepayamount | gllcrepayamount | gllcrepayamount | number(28, 8) |
| 24 | gllcsumamount | gllcsumamount | gllcsumamount | number(28, 8) |
| 25 | interactfield | interactfield | interactfield | varchar2(1025) |
| 26 | interest | interest | interest | number(28, 8) |
| 27 | isdeal | isdeal | isdeal | char(1) |
| 28 | isforeign | isforeign | isforeign | char(1) |
| 29 | isinitial | isinitial | isinitial | char(1) |
| 30 | ispayrelease | ispayrelease | ispayrelease | char(1) |
| 31 | isreturn | isreturn | isreturn | char(1) |
| 32 | olcforeignrate | olcforeignrate | olcforeignrate | number(15, 8) |
| 33 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 34 | olcrate | olcrate | olcrate | number(15, 8) |
| 35 | olcrepayamount | olcrepayamount | olcrepayamount | number(28, 8) |
| 36 | olcsumamount | olcsumamount | olcsumamount | number(28, 8) |
| 37 | payreleaseamount | payreleaseamount | payreleaseamount | number(28, 8) |
| 38 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 39 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 40 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 41 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 42 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 43 | pk_debitcost | pk_debitcost | pk_debitcost | varchar2(20) |  |  | '~' |
| 44 | pk_debitprof | pk_debitprof | pk_debitprof | varchar2(20) |  |  | '~' |
| 45 | pk_debitprof_v | pk_debitprof_v | pk_debitprof_v | varchar2(20) |  |  | '~' |
| 46 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 47 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 48 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 49 | pk_foreignacct | pk_foreignacct | pk_foreignacct | varchar2(20) |  |  | '~' |
| 50 | pk_foreigncurr | pk_foreigncurr | pk_foreigncurr | varchar2(20) |  |  | '~' |
| 51 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 52 | pk_intplanitem | pk_intplanitem | pk_intplanitem | varchar2(20) |  |  | '~' |
| 53 | pk_mntplanitem | pk_mntplanitem | pk_mntplanitem | varchar2(20) |  |  | '~' |
| 54 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 55 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 56 | pk_procurr | pk_procurr | pk_procurr | varchar2(20) |  |  | '~' |
| 57 | pk_srcbill | pk_srcbill | pk_srcbill | char(20) |
| 58 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 59 | remark | remark | remark | varchar2(200) |
| 60 | repayamount | repayamount | repayamount | number(28, 8) |
| 61 | repaydate | repaydate | repaydate | char(19) |
| 62 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 63 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 64 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 65 | saga_status | saga_status | saga_status | number(38, 0) |
| 66 | source | source | source | varchar2(50) |
| 67 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 68 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |
| 69 | sumamount | sumamount | sumamount | number(28, 8) |
| 70 | vbillno | vbillno | vbillno | varchar2(50) |
| 71 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 72 | voucherflag | voucherflag | voucherflag | char(1) |
| 73 | vvoucherid | vvoucherid | vvoucherid | varchar2(20) |  |  | '~' |
| 74 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 75 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 76 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 77 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 78 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 79 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 80 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 81 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 82 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 83 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 84 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 85 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 86 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 87 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 88 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 89 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 90 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 91 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 92 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 93 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 94 | creationtime | creationtime | creationtime | char(19) |
| 95 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 96 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 97 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 98 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 99 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |