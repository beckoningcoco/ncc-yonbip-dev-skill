# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7469.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcpl | pk_repayprcpl | pk_repayprcpl | char(20) | √ |
| 2 | advancerepay | advancerepay | advancerepay | char(1) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | bankacctflag | bankacctflag | bankacctflag | char(1) |  |  | 'N' |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | bookkeepingflag | bookkeepingflag | bookkeepingflag | char(1) |
| 9 | busistatus | busistatus | busistatus | number(38, 0) |
| 10 | busitype | busitype | busitype | varchar2(50) |
| 11 | commitdate | commitdate | commitdate | char(19) |
| 12 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 13 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 14 | datasrc | datasrc | datasrc | varchar2(50) |
| 15 | glcinterestmny | glcinterestmny | glcinterestmny | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(28, 8) |
| 17 | glcrepaymny | glcrepaymny | glcrepaymny | number(28, 8) |
| 18 | glcshdrepaysumintst | glcshdrepaysumintst | glcshdrepaysumintst | number(28, 8) |
| 19 | glcunrepaymny | glcunrepaymny | glcunrepaymny | number(28, 8) |
| 20 | gllcinterestmny | gllcinterestmny | gllcinterestmny | number(28, 8) |
| 21 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 22 | gllcrepaymny | gllcrepaymny | gllcrepaymny | number(28, 8) |
| 23 | gllcshdrepaysumintst | gllcshdrepaysumintst | gllcshdrepaysumintst | number(28, 8) |
| 24 | gllcunrepaymny | gllcunrepaymny | gllcunrepaymny | number(28, 8) |
| 25 | initflag | initflag | initflag | char(1) |  |  | 'N' |
| 26 | interestmny | interestmny | interestmny | number(28, 8) |
| 27 | intstoprcplflag | intstoprcplflag | intstoprcplflag | char(1) |  |  | 'N' |
| 28 | isrepayguarls | isrepayguarls | isrepayguarls | char(1) |
| 29 | loanunittype | loanunittype | loanunittype | varchar2(50) |
| 30 | olcinterestmny | olcinterestmny | olcinterestmny | number(28, 8) |
| 31 | olcrate | olcrate | olcrate | number(28, 8) |
| 32 | olcrepaymny | olcrepaymny | olcrepaymny | number(28, 8) |
| 33 | olcshdrepaysumintst | olcshdrepaysumintst | olcshdrepaysumintst | number(28, 8) |
| 34 | olcunrepaymny | olcunrepaymny | olcunrepaymny | number(28, 8) |
| 35 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 36 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 37 | pk_contract | pk_contract | pk_contract | varchar2(50) |
| 38 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 39 | pk_debitunit | pk_debitunit | pk_debitunit | varchar2(20) |  |  | '~' |
| 40 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 41 | pk_financepay | pk_financepay | pk_financepay | varchar2(20) |  |  | '~' |
| 42 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 43 | pk_loanorg | pk_loanorg | pk_loanorg | varchar2(20) |  |  | '~' |
| 44 | pk_loanorgacct | pk_loanorgacct | pk_loanorgacct | varchar2(20) |  |  | '~' |
| 45 | pk_loanunit | pk_loanunit | pk_loanunit | varchar2(20) |  |  | '~' |
| 46 | pk_loanunitacct | pk_loanunitacct | pk_loanunitacct | varchar2(20) |  |  | '~' |
| 47 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 48 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 49 | pk_preplanitem | pk_preplanitem | pk_preplanitem | varchar2(20) |  |  | '~' |
| 50 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 51 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 52 | pk_synchronize | pk_synchronize | pk_synchronize | varchar2(50) |
| 53 | prcplorder | prcplorder | prcplorder | varchar2(50) |
| 54 | recalculateplan | recalculateplan | recalculateplan | char(1) |
| 55 | remark | remark | remark | varchar2(200) |
| 56 | repaydate | repaydate | repaydate | char(19) |
| 57 | repaymny | repaymny | repaymny | number(28, 8) |
| 58 | repaysumintst | repaysumintst | repaysumintst | char(1) |
| 59 | repaytype | repaytype | repaytype | varchar2(50) |
| 60 | returned | returned | returned | char(1) |
| 61 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 62 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 63 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 64 | saga_status | saga_status | saga_status | number(38, 0) |
| 65 | shdrepaysumintst | shdrepaysumintst | shdrepaysumintst | number(28, 8) |
| 66 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 67 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 68 | unrepaymny | unrepaymny | unrepaymny | number(28, 8) |
| 69 | vbillno | vbillno | vbillno | varchar2(50) |
| 70 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 71 | voucherflag | voucherflag | voucherflag | char(1) |  |  | 'N' |
| 72 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 73 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 74 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 75 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 76 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 77 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 78 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 79 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 80 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 81 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 82 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 83 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 84 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 85 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 86 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 87 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 88 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 89 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 90 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 91 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 92 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 93 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 94 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 95 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 96 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 97 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 98 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 99 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 100 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 101 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 102 | creationtime | creationtime | creationtime | char(19) |
| 103 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 104 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 105 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 106 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 107 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |