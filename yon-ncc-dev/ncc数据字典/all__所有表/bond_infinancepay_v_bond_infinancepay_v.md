# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | billtype | billtype | billtype | varchar2(200) |
| 2 | borrowercorpid | borrowercorpid | borrowercorpid | varchar2(50) |
| 3 | busistatus | busistatus | busistatus | number(38, 0) |
| 4 | enddate | enddate | enddate | char(19) |
| 5 | fsrcbilltypecode | fsrcbilltypecode | fsrcbilltypecode | varchar2(50) |
| 6 | glcloanmny | glcloanmny | glcloanmny | number(28, 8) |
| 7 | glcnowloanmny | glcnowloanmny | glcnowloanmny | number(28, 8) |
| 8 | glcrate | glcrate | glcrate | number(28, 8) |
| 9 | gllcloanmny | gllcloanmny | gllcloanmny | number(28, 8) |
| 10 | gllcnowloanmny | gllcnowloanmny | gllcnowloanmny | number(28, 8) |
| 11 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 12 | infinancepaycode | infinancepaycode | infinancepaycode | varchar2(200) |
| 13 | infinancepayid | infinancepayid | infinancepayid | varchar2(200) |
| 14 | innercontractcode | innercontractcode | innercontractcode | varchar2(200) |
| 15 | innercontractid | innercontractid | innercontractid | varchar2(200) |
| 16 | loandate | loandate | loandate | char(19) |
| 17 | loanmy | loanmy | loanmy | number(28, 8) |
| 18 | nowloanmy | nowloanmy | nowloanmy | number(28, 8) |
| 19 | olcloanmny | olcloanmny | olcloanmny | number(28, 8) |
| 20 | olcnowloanmny | olcnowloanmny | olcnowloanmny | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(28, 8) |
| 22 | outfinancepayid | outfinancepayid | outfinancepayid | varchar2(200) |
| 23 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 24 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 25 | pk_bondinfinancepay_b | pk_bondinfinancepay_b | pk_bondinfinancepay_b | varchar2(50) | √ |
| 26 | pk_bondissueregister | pk_bondissueregister | pk_bondissueregister | char(20) | √ |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_fsrcbill | pk_fsrcbill | pk_fsrcbill | varchar2(50) |
| 29 | pk_fsrcbilltypeid | pk_fsrcbilltypeid | pk_fsrcbilltypeid | varchar2(50) |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 34 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 35 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 36 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 37 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 38 | pk_version | pk_version | pk_version | char(20) | √ |
| 39 | remark | remark | remark | varchar2(200) |
| 40 | rowno | rowno | rowno | varchar2(50) |
| 41 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 42 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 43 | summary | summary | summary | varchar2(200) |
| 44 | vbillno | vbillno | vbillno | varchar2(50) |
| 45 | versionno | versionno | versionno | number(38, 0) |
| 46 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 47 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 48 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 49 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 50 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 51 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 52 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 53 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 54 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 55 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 56 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 57 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 58 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 59 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 60 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 61 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 62 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 63 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 64 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 65 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 66 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 67 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 68 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 69 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 70 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 71 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 72 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 73 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 74 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 75 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 76 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 77 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |