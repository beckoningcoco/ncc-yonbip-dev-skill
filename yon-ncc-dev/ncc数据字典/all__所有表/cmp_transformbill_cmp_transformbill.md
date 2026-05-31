# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transformbill | pk_transformbill | pk_transformbill | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | billclass | billclass | billclass | varchar2(2) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | busistatus | busistatus | busistatus | number(38, 0) |
| 12 | code | code | code | varchar2(1024) |
| 13 | consigndate | consigndate | consigndate | char(19) |
| 14 | consigor | consigor | consigor | varchar2(20) |  |  | '~' |
| 15 | expecteddealdate | expecteddealdate | expecteddealdate | char(19) |
| 16 | failurereason | failurereason | failurereason | varchar2(181) |
| 17 | glcamount | glcamount | glcamount | number(28, 8) |
| 18 | glcrate | glcrate | glcrate | number(15, 8) |
| 19 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 20 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 21 | inaccount_name | inaccount_name | inaccount_name | varchar2(300) |
| 22 | inaccount_num | inaccount_num | inaccount_num | varchar2(300) |
| 23 | isinner_pay | isinner_pay | isinner_pay | char(1) |
| 24 | isinner_rec | isinner_rec | isinner_rec | char(1) |
| 25 | isreded | isreded | isreded | char(1) |
| 26 | isrefused | isrefused | isrefused | char(1) |
| 27 | manualsettleflag | manualsettleflag | manualsettleflag | char(1) |
| 28 | notely_dep | notely_dep | notely_dep | varchar2(20) |  |  | '~' |
| 29 | notely_psn | notely_psn | notely_psn | varchar2(20) |  |  | '~' |
| 30 | noteno | noteno | noteno | varchar2(50) |
| 31 | notetype | notetype | notetype | varchar2(20) |  |  | '~' |
| 32 | olcamount | olcamount | olcamount | number(28, 8) |
| 33 | olcrate | olcrate | olcrate | number(15, 8) |
| 34 | paydate | paydate | paydate | char(19) |
| 35 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 36 | payreason | payreason | payreason | varchar2(50) |
| 37 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 38 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 39 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 40 | pk_busiflow | pk_busiflow | pk_busiflow | varchar2(20) |  |  | '~' |
| 41 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 42 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 43 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 45 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 46 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(50) |
| 47 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 48 | receiptno | receiptno | receiptno | varchar2(181) |
| 49 | reconciliationcode | reconciliationcode | reconciliationcode | varchar2(50) |
| 50 | remark | remark | remark | varchar2(272) |
| 51 | returnreason | returnreason | returnreason | varchar2(181) |
| 52 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 53 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 54 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 55 | saga_status | saga_status | saga_status | number(38, 0) |
| 56 | settlementdate | settlementdate | settlementdate | char(19) |
| 57 | settlementman | settlementman | settlementman | varchar2(20) |  |  | '~' |
| 58 | settlesatus | settlesatus | settlesatus | number(38, 0) |
| 59 | sourceflag | sourceflag | sourceflag | varchar2(20) |  |  | '~' |
| 60 | srcbillno | srcbillno | srcbillno | varchar2(40) |  |  | '~' |
| 61 | submitdate | submitdate | submitdate | char(19) |
| 62 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 63 | summary | summary | summary | varchar2(181) |
| 64 | transerial_pay | transerial_pay | transerial_pay | varchar2(50) |
| 65 | transerial_rec | transerial_rec | transerial_rec | varchar2(50) |
| 66 | transforminaccount | transforminaccount | transforminaccount | varchar2(20) |  |  | '~' |
| 67 | transforminbank | transforminbank | transforminbank | varchar2(20) |  |  | '~' |
| 68 | transformoutaccount | transformoutaccount | transformoutaccount | varchar2(20) |  |  | '~' |
| 69 | transformoutbank | transformoutbank | transformoutbank | varchar2(20) |  |  | '~' |
| 70 | vbillno | vbillno | vbillno | varchar2(40) |
| 71 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
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
| 92 | creationtime | creationtime | creationtime | char(19) |
| 93 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 94 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 95 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 96 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 97 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |