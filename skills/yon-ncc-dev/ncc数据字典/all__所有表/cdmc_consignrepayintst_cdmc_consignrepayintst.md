# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintst | pk_repayintst | pk_repayintst | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(50) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | bankacctflag | bankacctflag | bankacctflag | char(1) |  |  | 'N' |
| 5 | billmakedate | billmakedate | billmakedate | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | busistatus | busistatus | busistatus | number(38, 0) |
| 8 | busitype | busitype | busitype | varchar2(50) |
| 9 | commitdate | commitdate | commitdate | char(19) |
| 10 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 11 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 12 | datasrc | datasrc | datasrc | varchar2(50) |
| 13 | drawback | drawback | drawback | char(1) |  |  | 'N' |
| 14 | glcrate | glcrate | glcrate | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 16 | initflag | initflag | initflag | char(1) |  |  | 'N' |
| 17 | intstoprcplflag | intstoprcplflag | intstoprcplflag | char(1) |  |  | 'N' |
| 18 | loanfing | loanfing | loanfing | varchar2(20) |  |  | '~' |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | payintstgllmny | payintstgllmny | payintstgllmny | number(28, 8) |
| 21 | payintstglmny | payintstglmny | payintstglmny | number(28, 8) |
| 22 | payintstmny | payintstmny | payintstmny | number(28, 8) |
| 23 | payintstolmny | payintstolmny | payintstolmny | number(28, 8) |
| 24 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 25 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 26 | pk_cgorgacct | pk_cgorgacct | pk_cgorgacct | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_debitunit | pk_debitunit | pk_debitunit | varchar2(20) |  |  | '~' |
| 29 | pk_debitunitacct | pk_debitunitacct | pk_debitunitacct | varchar2(20) |  |  | '~' |
| 30 | pk_financepay | pk_financepay | pk_financepay | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_loanunit | pk_loanunit | pk_loanunit | varchar2(20) |  |  | '~' |
| 33 | pk_loanunitacct | pk_loanunitacct | pk_loanunitacct | varchar2(20) |  |  | '~' |
| 34 | pk_loanunittype | pk_loanunittype | pk_loanunittype | varchar2(50) |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_preplanitem | pk_preplanitem | pk_preplanitem | varchar2(20) |  |  | '~' |
| 38 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 39 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 40 | pk_synergy | pk_synergy | pk_synergy | char(20) |
| 41 | remark | remark | remark | varchar2(500) |
| 42 | repayintstdate | repayintstdate | repayintstdate | char(19) |
| 43 | repaysumintst | repaysumintst | repaysumintst | char(1) |  |  | 'N' |
| 44 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 45 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 46 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 47 | saga_status | saga_status | saga_status | number(38, 0) |
| 48 | shdintstgllmny | shdintstgllmny | shdintstgllmny | number(28, 8) |
| 49 | shdintstglmny | shdintstglmny | shdintstglmny | number(28, 8) |
| 50 | shdintstmny | shdintstmny | shdintstmny | number(28, 8) |
| 51 | shdintstolmny | shdintstolmny | shdintstolmny | number(28, 8) |
| 52 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 53 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 54 | tallyflag | tallyflag | tallyflag | char(1) |  |  | 'N' |
| 55 | vbillno | vbillno | vbillno | varchar2(50) |
| 56 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 57 | voucherflag | voucherflag | voucherflag | char(1) |  |  | 'N' |
| 58 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 59 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 60 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 61 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 62 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 63 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 64 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 65 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 66 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 67 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 68 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 69 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 70 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 71 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 72 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 73 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 74 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 75 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 76 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 77 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 78 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 79 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 80 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 81 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 82 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 83 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 84 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 85 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 86 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 87 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 88 | creationtime | creationtime | creationtime | char(19) |
| 89 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 90 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 91 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 92 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 93 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |