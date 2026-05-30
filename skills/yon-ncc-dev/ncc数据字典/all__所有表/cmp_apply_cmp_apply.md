# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7531.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | pk_apply | pk_apply | char(20) | √ |
| 2 | actualpaysum | actualpaysum | actualpaysum | number(28, 8) |
| 3 | applydate | applydate | applydate | char(19) |
| 4 | applymny_cap | applymny_cap | applymny_cap | varchar2(80) |
| 5 | applysum | applysum | applysum | number(28, 8) |
| 6 | approvenote | approvenote | approvenote | varchar2(1536) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | busistatus | busistatus | busistatus | number(38, 0) |
| 12 | code | code | code | varchar2(1024) |
| 13 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 14 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 15 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 16 | freecustbank | freecustbank | freecustbank | varchar2(20) |  |  | '~' |
| 17 | freecust_bankacc | freecust_bankacc | freecust_bankacc | varchar2(50) |  |  | '~' |
| 18 | glcactualpaysum | glcactualpaysum | glcactualpaysum | number(28, 8) |
| 19 | glcapplysum | glcapplysum | glcapplysum | number(28, 8) |
| 20 | glcorigapplysum | glcorigapplysum | glcorigapplysum | number(28, 8) |
| 21 | glcpaysum | glcpaysum | glcpaysum | number(28, 8) |
| 22 | glcplansum | glcplansum | glcplansum | number(28, 8) |
| 23 | glcrate | glcrate | glcrate | number(15, 8) |
| 24 | glcunpaysum | glcunpaysum | glcunpaysum | number(28, 8) |
| 25 | glcunplansum | glcunplansum | glcunplansum | number(28, 8) |
| 26 | gllcactualpaysum | gllcactualpaysum | gllcactualpaysum | number(28, 8) |
| 27 | gllcapplysum | gllcapplysum | gllcapplysum | number(28, 8) |
| 28 | gllcorigapplysum | gllcorigapplysum | gllcorigapplysum | number(28, 8) |
| 29 | gllcpaysum | gllcpaysum | gllcpaysum | number(28, 8) |
| 30 | gllcplansum | gllcplansum | gllcplansum | number(28, 8) |
| 31 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 32 | gllcunpaysum | gllcunpaysum | gllcunpaysum | number(28, 8) |
| 33 | gllcunplansum | gllcunplansum | gllcunplansum | number(28, 8) |
| 34 | isfreecust | isfreecust | isfreecust | char(1) |
| 35 | isfrozen | isfrozen | isfrozen | char(1) |
| 36 | isputdown | isputdown | isputdown | char(1) |
| 37 | isrefund | isrefund | isrefund | char(1) |
| 38 | isurgent | isurgent | isurgent | char(1) |
| 39 | olcactualpaysum | olcactualpaysum | olcactualpaysum | number(28, 8) |
| 40 | olcapplysum | olcapplysum | olcapplysum | number(28, 8) |
| 41 | olcorigapplysum | olcorigapplysum | olcorigapplysum | number(28, 8) |
| 42 | olcpaysum | olcpaysum | olcpaysum | number(28, 8) |
| 43 | olcplansum | olcplansum | olcplansum | number(28, 8) |
| 44 | olcrate | olcrate | olcrate | number(15, 8) |
| 45 | olcunpaysum | olcunpaysum | olcunpaysum | number(28, 8) |
| 46 | olcunplansum | olcunplansum | olcunplansum | number(28, 8) |
| 47 | opsrctype | opsrctype | opsrctype | number(38, 0) |  |  | 2 |
| 48 | origapplysum | origapplysum | origapplysum | number(28, 8) |
| 49 | paysum | paysum | paysum | number(28, 8) |
| 50 | paytype | paytype | paytype | number(38, 0) |
| 51 | pk_acceptorg | pk_acceptorg | pk_acceptorg | varchar2(20) |  |  | '~' |
| 52 | pk_acceptorg_v | pk_acceptorg_v | pk_acceptorg_v | varchar2(20) |  |  | '~' |
| 53 | pk_applyperiod | pk_applyperiod | pk_applyperiod | varchar2(50) |  |  | '~' |
| 54 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 55 | pk_bankacc_pd | pk_bankacc_pd | pk_bankacc_pd | varchar2(20) |  |  | '~' |
| 56 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 57 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 58 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 59 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 60 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 61 | pk_decidedept | pk_decidedept | pk_decidedept | varchar2(20) |  |  | '~' |
| 62 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 63 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 64 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 65 | pk_receiveunit | pk_receiveunit | pk_receiveunit | varchar2(20) |  |  | '~' |
| 66 | pk_resuser | pk_resuser | pk_resuser | varchar2(20) |  |  | '~' |
| 67 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 68 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |  |  | '~' |
| 69 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 70 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(50) |
| 71 | pk_trantypeid | pk_trantypeid | pk_trantypeid | varchar2(20) |  |  | '~' |
| 72 | plansum | plansum | plansum | number(28, 8) |
| 73 | remark | remark | remark | varchar2(272) |
| 74 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 75 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 76 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 77 | saga_status | saga_status | saga_status | number(38, 0) |
| 78 | sourcesystypecode | sourcesystypecode | sourcesystypecode | number(38, 0) |
| 79 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 80 | summary | summary | summary | varchar2(272) |
| 81 | tbbmessage | tbbmessage | tbbmessage | varchar2(1024) |
| 82 | unpaysum | unpaysum | unpaysum | number(28, 8) |
| 83 | unplansum | unplansum | unplansum | number(28, 8) |
| 84 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 85 | vbillno | vbillno | vbillno | varchar2(40) |
| 86 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 87 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 88 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 89 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 90 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 91 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 92 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 93 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 94 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 95 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 96 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 97 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 98 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 99 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 100 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 101 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 102 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 103 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 104 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 105 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 106 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 107 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 108 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 109 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 110 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 111 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 112 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 113 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 114 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 115 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 116 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 117 | creationtime | creationtime | creationtime | char(19) |
| 118 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 119 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 120 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 121 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 122 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |