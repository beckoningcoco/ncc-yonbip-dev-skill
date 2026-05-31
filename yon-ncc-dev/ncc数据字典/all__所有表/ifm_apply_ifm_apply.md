# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 2 | accountinter | accountinter | accountinter | char(1) |  |  | 'Y' |
| 3 | applynumber | applynumber | applynumber | number(38, 0) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(1024) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | banknetwork | banknetwork | banknetwork | varchar2(20) |  |  | '~' |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | billstatus | billstatus | billstatus | number(38, 0) |
| 12 | boundary | boundary | boundary | number(38, 0) |
| 13 | capitalproject | capitalproject | capitalproject | varchar2(20) |  |  | '~' |
| 14 | distribution_network | distribution_network | distribution_network | varchar2(20) |  |  | '~' |
| 15 | dividendmethod | dividendmethod | dividendmethod | number(38, 0) |
| 16 | enddate | enddate | enddate | char(19) |
| 17 | eventype | eventype | eventype | number(38, 0) |
| 18 | expectedmoney | expectedmoney | expectedmoney | number(28, 8) |
| 19 | expectedrate | expectedrate | expectedrate | varchar2(28) |
| 20 | glcexpectedmoney | glcexpectedmoney | glcexpectedmoney | number(28, 8) |
| 21 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 22 | glcrate | glcrate | glcrate | number(15, 8) |
| 23 | gllcexpectedmoney | gllcexpectedmoney | gllcexpectedmoney | number(28, 8) |
| 24 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 25 | gllmoney | gllmoney | gllmoney | number(28, 8) |
| 26 | holdmoney | holdmoney | holdmoney | number(28, 8) |
| 27 | holdnumber | holdnumber | holdnumber | number(38, 0) |
| 28 | incomecal | incomecal | incomecal | number(38, 0) |
| 29 | incomedivimethod | incomedivimethod | incomedivimethod | number(38, 0) |
| 30 | initflag | initflag | initflag | char(1) |
| 31 | interestdate | interestdate | interestdate | char(19) |
| 32 | interestday | interestday | interestday | varchar2(50) |  |  | '1' |
| 33 | invest | invest | invest | varchar2(20) |  |  | '~' |
| 34 | investvariety | investvariety | investvariety | varchar2(20) |  |  | '~' |
| 35 | issuebank | issuebank | issuebank | varchar2(20) |  |  | '~' |
| 36 | lastincomedate | lastincomedate | lastincomedate | char(19) |
| 37 | lastredeemdate | lastredeemdate | lastredeemdate | char(19) |
| 38 | limitday | limitday | limitday | number(38, 0) |
| 39 | limit_property | limit_property | limit_property | varchar2(50) |
| 40 | money | money | money | number(28, 8) |
| 41 | olcexpectedmoney | olcexpectedmoney | olcexpectedmoney | number(28, 8) |
| 42 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 43 | olcrate | olcrate | olcrate | number(15, 8) |
| 44 | payperiod | payperiod | payperiod | number(38, 0) |
| 45 | paytype | paytype | paytype | number(38, 0) |
| 46 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 47 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 48 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 49 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 50 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 51 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 52 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 53 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 54 | productcode | productcode | productcode | varchar2(50) |
| 55 | productname | productname | productname | varchar2(50) |
| 56 | productstatus | productstatus | productstatus | varchar2(50) |
| 57 | purchasedate | purchasedate | purchasedate | char(19) |
| 58 | redeemmethod | redeemmethod | redeemmethod | number(38, 0) |
| 59 | redeemstatus | redeemstatus | redeemstatus | number(38, 0) |
| 60 | redeem_model | redeem_model | redeem_model | number(38, 0) |
| 61 | remark | remark | remark | varchar2(200) |
| 62 | risk | risk | risk | number(38, 0) |
| 63 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 64 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 65 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 66 | saga_status | saga_status | saga_status | number(38, 0) |
| 67 | servicetype | servicetype | servicetype | number(38, 0) |
| 68 | settleaccount | settleaccount | settleaccount | varchar2(20) |  |  | '~' |
| 69 | settledate | settledate | settledate | varchar2(20) |  |  | '~' |
| 70 | submitdate | submitdate | submitdate | char(19) |
| 71 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 72 | unitnetvalue | unitnetvalue | unitnetvalue | number(28, 8) |
| 73 | vbillno | vbillno | vbillno | varchar2(40) |
| 74 | vbillstatus | vbillstatus | vbillstatus | varchar2(50) |
| 75 | voucherflag | voucherflag | voucherflag | char(1) |
| 76 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 77 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 78 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 79 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 80 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 81 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 82 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 83 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 84 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 85 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 86 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 87 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 88 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 89 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 90 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 91 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 92 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 93 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 94 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 95 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 96 | creationtime | creationtime | creationtime | char(19) |
| 97 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 98 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 99 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 100 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 101 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |