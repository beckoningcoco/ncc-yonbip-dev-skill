# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeem | pk_redeem | pk_redeem | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | balance | balance | balance | number(28, 8) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | billstatus | billstatus | billstatus | number(38, 0) |
| 10 | capitalproject | capitalproject | capitalproject | varchar2(20) |  |  | '~' |
| 11 | enddate | enddate | enddate | char(19) |
| 12 | expectedrate | expectedrate | expectedrate | varchar2(28) |
| 13 | gatheringaccount | gatheringaccount | gatheringaccount | varchar2(20) |  |  | '~' |
| 14 | glcmoeny | glcmoeny | glcmoeny | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(15, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 17 | gllmoeny | gllmoeny | gllmoeny | number(28, 8) |
| 18 | holdmoney | holdmoney | holdmoney | number(28, 8) |
| 19 | holdnumber | holdnumber | holdnumber | number(38, 0) |
| 20 | incomedate | incomedate | incomedate | char(19) |
| 21 | incomedivimethod | incomedivimethod | incomedivimethod | number(38, 0) |
| 22 | incomemoney | incomemoney | incomemoney | number(28, 8) |
| 23 | incomerate | incomerate | incomerate | number(28, 8) |
| 24 | initflag | initflag | initflag | char(1) |
| 25 | interestday | interestday | interestday | number(38, 0) |
| 26 | investaccount | investaccount | investaccount | varchar2(20) |  |  | '~' |
| 27 | investvariety | investvariety | investvariety | varchar2(20) |  |  | '~' |
| 28 | issuebank | issuebank | issuebank | varchar2(20) |  |  | '~' |
| 29 | issuer | issuer | issuer | varchar2(20) |  |  | '~' |
| 30 | lastdate | lastdate | lastdate | char(19) |
| 31 | lastmoney | lastmoney | lastmoney | number(28, 8) |
| 32 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 33 | olcrate | olcrate | olcrate | number(15, 8) |
| 34 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 35 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 36 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 37 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 38 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 39 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 42 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 43 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 44 | productcode | productcode | productcode | varchar2(20) |  |  | '~' |
| 45 | productname | productname | productname | varchar2(50) |
| 46 | productstatus | productstatus | productstatus | varchar2(50) |
| 47 | realrate | realrate | realrate | number(28, 8) |
| 48 | realreaning | realreaning | realreaning | number(28, 8) |
| 49 | redeemdate | redeemdate | redeemdate | char(19) |
| 50 | redeemid | redeemid | redeemid | varchar2(50) |
| 51 | redeemmoney | redeemmoney | redeemmoney | number(28, 8) |
| 52 | redeemnumber | redeemnumber | redeemnumber | number(38, 0) |
| 53 | redeemplan | redeemplan | redeemplan | varchar2(20) |  |  | '~' |
| 54 | remainredmoney | remainredmoney | remainredmoney | number(28, 8) |
| 55 | remark | remark | remark | varchar2(200) |
| 56 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 57 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 58 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 59 | saga_status | saga_status | saga_status | number(38, 0) |
| 60 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 61 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |  |  | '~' |
| 62 | submitdate | submitdate | submitdate | char(19) |
| 63 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 64 | unitnetvalue | unitnetvalue | unitnetvalue | number(28, 8) |
| 65 | vbilldate | vbilldate | vbilldate | char(19) |
| 66 | vbillno | vbillno | vbillno | varchar2(40) |
| 67 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 68 | vbilltype | vbilltype | vbilltype | number(38, 0) |
| 69 | voucherflag | voucherflag | voucherflag | char(1) |
| 70 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 71 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 72 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 73 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 74 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 75 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 76 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 77 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 78 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 79 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 80 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 81 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 82 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 83 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 84 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 85 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 86 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 87 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 88 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 89 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 90 | creationtime | creationtime | creationtime | char(19) |
| 91 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 92 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 93 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 94 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 95 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |