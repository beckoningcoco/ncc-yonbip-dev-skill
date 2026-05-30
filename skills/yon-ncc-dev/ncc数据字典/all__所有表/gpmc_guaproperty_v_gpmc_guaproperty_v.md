# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(200) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | assessorg | assessorg | assessorg | varchar2(200) |
| 5 | assetno | assetno | assetno | varchar2(20) |  |  | '~' |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | busistatus | busistatus | busistatus | number(38, 0) |
| 10 | curprice | curprice | curprice | number(28, 8) |
| 11 | curpriceglo | curpriceglo | curpriceglo | number(28, 8) |
| 12 | curpricegro | curpricegro | curpricegro | number(28, 8) |
| 13 | curpriceol | curpriceol | curpriceol | number(28, 8) |
| 14 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 15 | datasource | datasource | datasource | number(38, 0) |
| 16 | dealer | dealer | dealer | varchar2(200) |  |  | '~' |
| 17 | debtmny | debtmny | debtmny | number(28, 8) |
| 18 | debtmnyol | debtmnyol | debtmnyol | number(28, 8) |
| 19 | enddate | enddate | enddate | char(19) |
| 20 | firstprice | firstprice | firstprice | number(28, 8) |
| 21 | firstpriceglo | firstpriceglo | firstpriceglo | number(28, 8) |
| 22 | firstpricegro | firstpricegro | firstpricegro | number(28, 8) |
| 23 | firstpriceol | firstpriceol | firstpriceol | number(28, 8) |
| 24 | glcrate | glcrate | glcrate | number(28, 8) |
| 25 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 26 | gptype | gptype | gptype | number(38, 0) |
| 27 | guagptype | guagptype | guagptype | number(38, 0) |
| 28 | guapropstatus | guapropstatus | guapropstatus | number(38, 0) |
| 29 | isversioneffect | isversioneffect | isversioneffect | char(1) |
| 30 | iunitinid | iunitinid | iunitinid | varchar2(20) |  |  | '~' |
| 31 | maxpledge | maxpledge | maxpledge | number(28, 8) |
| 32 | maxpledgeglo | maxpledgeglo | maxpledgeglo | number(28, 8) |
| 33 | maxpledgegro | maxpledgegro | maxpledgegro | number(28, 8) |
| 34 | maxpledgeol | maxpledgeol | maxpledgeol | number(28, 8) |
| 35 | measurable | measurable | measurable | char(1) |
| 36 | olcrate | olcrate | olcrate | number(28, 8) |
| 37 | originprice | originprice | originprice | number(28, 8) |
| 38 | originpriceglo | originpriceglo | originpriceglo | number(28, 8) |
| 39 | originpricegro | originpricegro | originpricegro | number(28, 8) |
| 40 | originpriceol | originpriceol | originpriceol | number(28, 8) |
| 41 | owner | owner | owner | number(38, 0) |
| 42 | ownunit | ownunit | ownunit | varchar2(20) |  |  | '~' |
| 43 | partnerid | partnerid | partnerid | varchar2(20) |  |  | '~' |
| 44 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 46 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 47 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 48 | pk_guaproperty | pk_guaproperty | pk_guaproperty | varchar2(20) | √ |
| 49 | pk_mortgage | pk_mortgage | pk_mortgage | varchar2(50) |
| 50 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 51 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 52 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 53 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 54 | pledgename | pledgename | pledgename | varchar2(200) |
| 55 | pledgeno | pledgeno | pledgeno | varchar2(200) |
| 56 | pledgeperson | pledgeperson | pledgeperson | varchar2(200) |
| 57 | pledgepno | pledgepno | pledgepno | varchar2(200) |
| 58 | pledgerate | pledgerate | pledgerate | number(28, 2) |
| 59 | price | price | price | number(28, 8) |
| 60 | priceglo | priceglo | priceglo | number(28, 8) |
| 61 | pricegro | pricegro | pricegro | number(28, 8) |
| 62 | priceol | priceol | priceol | number(28, 8) |
| 63 | propertyname | propertyname | propertyname | varchar2(200) |
| 64 | p_count | p_count | p_count | number(28, 8) |
| 65 | p_location | p_location | p_location | varchar2(200) |
| 66 | p_price | p_price | p_price | number(28, 8) |
| 67 | p_quality | p_quality | p_quality | varchar2(200) |
| 68 | p_specno | p_specno | p_specno | varchar2(200) |
| 69 | p_status | p_status | p_status | varchar2(200) |
| 70 | p_unit | p_unit | p_unit | varchar2(200) |
| 71 | registerdate | registerdate | registerdate | char(19) |
| 72 | relievedate | relievedate | relievedate | char(19) |
| 73 | remark | remark | remark | varchar2(200) |
| 74 | restpledge | restpledge | restpledge | number(28, 8) |
| 75 | restpledgeglo | restpledgeglo | restpledgeglo | number(28, 8) |
| 76 | restpledgegro | restpledgegro | restpledgegro | number(28, 8) |
| 77 | restpledgeol | restpledgeol | restpledgeol | number(28, 8) |
| 78 | signdate | signdate | signdate | char(19) |
| 79 | signsite | signsite | signsite | varchar2(200) |
| 80 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 81 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 82 | summary | summary | summary | varchar2(200) |
| 83 | totalpledge | totalpledge | totalpledge | number(28, 8) |
| 84 | totalpledgeglo | totalpledgeglo | totalpledgeglo | number(28, 8) |
| 85 | totalpledgegro | totalpledgegro | totalpledgegro | number(28, 8) |
| 86 | totalpledgeol | totalpledgeol | totalpledgeol | number(28, 8) |
| 87 | unitname | unitname | unitname | varchar2(200) |
| 88 | userange | userange | userange | number(38, 0) |
| 89 | vbillno | vbillno | vbillno | varchar2(50) |
| 90 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 91 | version | version | version | number(38, 0) |
| 92 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 93 | versionmark | versionmark | versionmark | varchar2(100) |
| 94 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 95 | versiontime | versiontime | versiontime | char(19) |
| 96 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 97 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 98 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 99 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 100 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 101 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 102 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 103 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 104 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 105 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 106 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 107 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 108 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 109 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 110 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 111 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 112 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 113 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 114 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 115 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 116 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 117 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 118 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 119 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 120 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 121 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 122 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 123 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 124 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 125 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 126 | creationtime | creationtime | creationtime | char(19) |
| 127 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 128 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 129 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 130 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 131 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |