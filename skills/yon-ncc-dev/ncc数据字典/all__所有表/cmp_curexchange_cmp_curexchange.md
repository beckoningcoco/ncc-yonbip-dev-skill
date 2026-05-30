# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7548.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cruexchange | pk_cruexchange | pk_cruexchange | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | busistatus | busistatus | busistatus | number(38, 0) |
| 11 | busitype | busitype | busitype | varchar2(50) |
| 12 | buyamount | buyamount | buyamount | number(28, 8) |
| 13 | buyglcamount | buyglcamount | buyglcamount | number(28, 8) |
| 14 | buyglcrate | buyglcrate | buyglcrate | number(28, 8) |
| 15 | buygllcamount | buygllcamount | buygllcamount | number(28, 8) |
| 16 | buygllcrate | buygllcrate | buygllcrate | number(28, 8) |
| 17 | buyolcamount | buyolcamount | buyolcamount | number(28, 8) |
| 18 | buyolcrate | buyolcrate | buyolcrate | number(28, 8) |
| 19 | capitalpurpose | capitalpurpose | capitalpurpose | varchar2(181) |
| 20 | capitalsource | capitalsource | capitalsource | varchar2(50) |
| 21 | chargeamount | chargeamount | chargeamount | number(28, 8) |
| 22 | chargeglcamount | chargeglcamount | chargeglcamount | number(28, 8) |
| 23 | chargeglcrate | chargeglcrate | chargeglcrate | number(28, 8) |
| 24 | chargegllcamount | chargegllcamount | chargegllcamount | number(28, 8) |
| 25 | chargegllcrate | chargegllcrate | chargegllcrate | number(28, 8) |
| 26 | chargeolcamount | chargeolcamount | chargeolcamount | number(28, 8) |
| 27 | chargeolcrate | chargeolcrate | chargeolcrate | number(28, 8) |
| 28 | chargerate | chargerate | chargerate | number(28, 8) |
| 29 | consigndate | consigndate | consigndate | char(19) |
| 30 | consignor | consignor | consignor | varchar2(20) |  |  | '~' |
| 31 | consigntime | consigntime | consigntime | char(19) |
| 32 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 33 | gainorloss | gainorloss | gainorloss | number(28, 8) |
| 34 | isinner | isinner | isinner | char(1) |
| 35 | makebillflag | makebillflag | makebillflag | char(1) |
| 36 | openingbank | openingbank | openingbank | varchar2(20) |  |  | '~' |
| 37 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 38 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 39 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 40 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 41 | pk_buyacct | pk_buyacct | pk_buyacct | varchar2(20) |  |  | '~' |
| 42 | pk_buycurrtype | pk_buycurrtype | pk_buycurrtype | varchar2(20) |  |  | '~' |
| 43 | pk_chargecurrtype | pk_chargecurrtype | pk_chargecurrtype | varchar2(20) |  |  | '~' |
| 44 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 45 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 46 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 47 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 48 | pk_paychargeacct | pk_paychargeacct | pk_paychargeacct | varchar2(20) |  |  | '~' |
| 49 | pk_sellacct | pk_sellacct | pk_sellacct | varchar2(20) |  |  | '~' |
| 50 | pk_sellcurrtype | pk_sellcurrtype | pk_sellcurrtype | varchar2(20) |  |  | '~' |
| 51 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(40) |
| 52 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(50) |
| 53 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 54 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 55 | receiptno | receiptno | receiptno | varchar2(50) |
| 56 | remark | remark | remark | varchar2(181) |
| 57 | returndate | returndate | returndate | char(19) |
| 58 | returned | returned | returned | char(1) |
| 59 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 60 | returnreason | returnreason | returnreason | varchar2(181) |
| 61 | returntime | returntime | returntime | char(19) |
| 62 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 63 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 64 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 65 | saga_status | saga_status | saga_status | number(38, 0) |
| 66 | sellamount | sellamount | sellamount | number(28, 8) |
| 67 | sellglcamount | sellglcamount | sellglcamount | number(28, 8) |
| 68 | sellglcrate | sellglcrate | sellglcrate | number(28, 8) |
| 69 | sellgllcamount | sellgllcamount | sellgllcamount | number(28, 8) |
| 70 | sellgllcrate | sellgllcrate | sellgllcrate | number(28, 8) |
| 71 | sellolcamount | sellolcamount | sellolcamount | number(28, 8) |
| 72 | sellolcrate | sellolcrate | sellolcrate | number(28, 8) |
| 73 | settledate | settledate | settledate | char(19) |
| 74 | settler | settler | settler | varchar2(20) |  |  | '~' |
| 75 | settlestatus | settlestatus | settlestatus | number(38, 0) |
| 76 | settletime | settletime | settletime | char(19) |
| 77 | srcbillno | srcbillno | srcbillno | varchar2(20) |
| 78 | srcsystem | srcsystem | srcsystem | varchar2(20) |  |  | '~' |
| 79 | submitdate | submitdate | submitdate | char(19) |
| 80 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 81 | submittime | submittime | submittime | char(19) |
| 82 | summary | summary | summary | varchar2(181) |
| 83 | tradeprice | tradeprice | tradeprice | number(28, 8) |
| 84 | vbillno | vbillno | vbillno | varchar2(40) |
| 85 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 86 | verificationbillno | verificationbillno | verificationbillno | varchar2(50) |
| 87 | writeoff | writeoff | writeoff | char(1) |
| 88 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 89 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 90 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 91 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 92 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 93 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 94 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 95 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 96 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 97 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 98 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 99 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 100 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 101 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 102 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 103 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 104 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 105 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 106 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 107 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 108 | creationtime | creationtime | creationtime | char(19) |
| 109 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 110 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 111 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 112 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 113 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |