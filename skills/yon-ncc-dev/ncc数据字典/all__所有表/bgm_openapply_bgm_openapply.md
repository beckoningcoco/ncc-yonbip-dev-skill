# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openapply | pk_openapply | pk_openapply | varchar2(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1536) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | begindate | begindate | begindate | char(19) |
| 6 | benefciaryname | benefciaryname | benefciaryname | varchar2(450) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | busicontractamount | busicontractamount | busicontractamount | number(28, 8) |
| 10 | busicontractno | busicontractno | busicontractno | varchar2(40) |
| 11 | busidepartment | busidepartment | busidepartment | varchar2(20) |  |  | '~' |
| 12 | busidesc | busidesc | busidesc | varchar2(272) |
| 13 | busipersonnel | busipersonnel | busipersonnel | varchar2(20) |  |  | '~' |
| 14 | busistatus | busistatus | busistatus | number(38, 0) |
| 15 | ccamount | ccamount | ccamount | number(28, 8) |
| 16 | ccflag | ccflag | ccflag | char(1) |  |  | 'N' |
| 17 | ccglcamount | ccglcamount | ccglcamount | number(28, 8) |
| 18 | ccglcrate | ccglcrate | ccglcrate | number(28, 8) |
| 19 | ccgllcamount | ccgllcamount | ccgllcamount | number(28, 8) |
| 20 | ccgllcrate | ccgllcrate | ccgllcrate | number(28, 8) |
| 21 | ccmessage | ccmessage | ccmessage | varchar2(1025) |
| 22 | ccolcamount | ccolcamount | ccolcamount | number(28, 8) |
| 23 | ccolcrate | ccolcrate | ccolcrate | number(28, 8) |
| 24 | cctype | cctype | cctype | number(38, 0) |  |  | 1 |
| 25 | cguaranteeamount | cguaranteeamount | cguaranteeamount | number(28, 8) |
| 26 | cguaranteeflag | cguaranteeflag | cguaranteeflag | char(1) |  |  | 'N' |
| 27 | cguaranteeglcamount | cguaranteeglcamount | cguaranteeglcamount | number(28, 8) |
| 28 | cguaranteeglcrate | cguaranteeglcrate | cguaranteeglcrate | number(28, 8) |
| 29 | cguaranteegllcamount | cguaranteegllcamount | cguaranteegllcamount | number(28, 8) |
| 30 | cguaranteegllcrate | cguaranteegllcrate | cguaranteegllcrate | number(28, 8) |
| 31 | cguaranteeolcamount | cguaranteeolcamount | cguaranteeolcamount | number(28, 8) |
| 32 | cguaranteeolcrate | cguaranteeolcrate | cguaranteeolcrate | number(28, 8) |
| 33 | cguaranteetype | cguaranteetype | cguaranteetype | varchar2(30) |
| 34 | depositaccount | depositaccount | depositaccount | varchar2(20) |  |  | '~' |
| 35 | depositamount | depositamount | depositamount | number(28, 8) |
| 36 | depositflag | depositflag | depositflag | char(1) |  |  | 'N' |
| 37 | depositglcamount | depositglcamount | depositglcamount | number(28, 8) |
| 38 | depositglcrate | depositglcrate | depositglcrate | number(28, 8) |
| 39 | depositgllcamount | depositgllcamount | depositgllcamount | number(28, 8) |
| 40 | depositgllcrate | depositgllcrate | depositgllcrate | number(28, 8) |
| 41 | depositolcamount | depositolcamount | depositolcamount | number(28, 8) |
| 42 | depositolcrate | depositolcrate | depositolcrate | number(28, 8) |
| 43 | depositratio | depositratio | depositratio | number(28, 8) |
| 44 | enddate | enddate | enddate | char(19) |
| 45 | foreignflag | foreignflag | foreignflag | char(1) |
| 46 | glform | glform | glform | number(38, 0) |
| 47 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 48 | guaranteeglcamount | guaranteeglcamount | guaranteeglcamount | number(28, 8) |
| 49 | guaranteeglcrate | guaranteeglcrate | guaranteeglcrate | number(28, 8) |
| 50 | guaranteegllcamount | guaranteegllcamount | guaranteegllcamount | number(28, 8) |
| 51 | guaranteegllcrate | guaranteegllcrate | guaranteegllcrate | number(28, 8) |
| 52 | guaranteeolcamount | guaranteeolcamount | guaranteeolcamount | number(28, 8) |
| 53 | guaranteeolcrate | guaranteeolcrate | guaranteeolcrate | number(28, 8) |
| 54 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 55 | isagentflag | isagentflag | isagentflag | char(1) |  |  | 'N' |
| 56 | itemname | itemname | itemname | varchar2(75) |
| 57 | legalunit | legalunit | legalunit | varchar2(200) |
| 58 | openmethod | openmethod | openmethod | number(38, 0) |  |  | 2 |
| 59 | pk_acceptorg | pk_acceptorg | pk_acceptorg | varchar2(20) |  |  | '~' |
| 60 | pk_acceptorg_v | pk_acceptorg_v | pk_acceptorg_v | varchar2(20) |  |  | '~' |
| 61 | pk_benefciary | pk_benefciary | pk_benefciary | varchar2(20) |  |  | '~' |
| 62 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 63 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 64 | pk_busicontractcurr | pk_busicontractcurr | pk_busicontractcurr | varchar2(20) |  |  | '~' |
| 65 | pk_ccbank | pk_ccbank | pk_ccbank | varchar2(20) |  |  | '~' |
| 66 | pk_cccategory | pk_cccategory | pk_cccategory | varchar2(20) |  |  | '~' |
| 67 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 68 | pk_ccno | pk_ccno | pk_ccno | varchar2(20) |  |  | '~' |
| 69 | pk_cguaranteecurrtype | pk_cguaranteecurrtype | pk_cguaranteecurrtype | varchar2(20) |  |  | '~' |
| 70 | pk_cguaranteeno | pk_cguaranteeno | pk_cguaranteeno | varchar2(20) |  |  | '~' |
| 71 | pk_depositcurrtype | pk_depositcurrtype | pk_depositcurrtype | varchar2(20) |  |  | '~' |
| 72 | pk_depositno | pk_depositno | pk_depositno | varchar2(20) |  |  | '~' |
| 73 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 74 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 75 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 76 | pk_gltype | pk_gltype | pk_gltype | varchar2(20) |  |  | '~' |
| 77 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 78 | pk_guaranteebank | pk_guaranteebank | pk_guaranteebank | varchar2(20) |  |  | '~' |
| 79 | pk_guaranteecurrtype | pk_guaranteecurrtype | pk_guaranteecurrtype | varchar2(20) |  |  | '~' |
| 80 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 81 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 82 | pk_principalorg | pk_principalorg | pk_principalorg | varchar2(20) |  |  | '~' |
| 83 | pk_principalorg_v | pk_principalorg_v | pk_principalorg_v | varchar2(20) |  |  | '~' |
| 84 | pk_transbank | pk_transbank | pk_transbank | varchar2(75) |  |  | '~' |
| 85 | restricttype | restricttype | restricttype | number(38, 0) |
| 86 | returndate | returndate | returndate | char(19) |  |  | '~' |
| 87 | returnflag | returnflag | returnflag | char(1) |  |  | 'N' |
| 88 | returnperson | returnperson | returnperson | varchar2(20) |  |  | '~' |
| 89 | returnreason | returnreason | returnreason | varchar2(272) |
| 90 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 91 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 92 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 93 | saga_status | saga_status | saga_status | number(38, 0) |
| 94 | stagesflag | stagesflag | stagesflag | char(1) |  |  | 'N' |
| 95 | submitdate | submitdate | submitdate | char(19) |
| 96 | submitter | submitter | submitter | varchar2(20) |  |  | '~' |
| 97 | supplydate | supplydate | supplydate | char(19) |
| 98 | tbbmessage | tbbmessage | tbbmessage | varchar2(1538) |
| 99 | termlimit | termlimit | termlimit | number(38, 0) |
| 100 | tranactunit | tranactunit | tranactunit | varchar2(200) |
| 101 | vbillno | vbillno | vbillno | varchar2(40) |
| 102 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 103 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 104 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 105 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 106 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 107 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 108 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 109 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 110 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 111 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 112 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 113 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 114 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 115 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 116 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 117 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 118 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 119 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 120 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 121 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 122 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 123 | creationtime | creationtime | creationtime | char(19) |
| 124 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 125 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 126 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 127 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 128 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |