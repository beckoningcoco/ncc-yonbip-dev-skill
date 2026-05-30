# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7283.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openregister | pk_openregister | pk_openregister | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | agentflag | agentflag | agentflag | char(1) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(1536) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | archivedflag | archivedflag | archivedflag | char(1) |  |  | 'N' |
| 8 | begindate | begindate | begindate | char(19) |
| 9 | benefciaryname | benefciaryname | benefciaryname | varchar2(450) |
| 10 | billmakedate | billmakedate | billmakedate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | busicontractamount | busicontractamount | busicontractamount | number(28, 8) |
| 13 | busicontractno | busicontractno | busicontractno | varchar2(40) |
| 14 | busidepartment | busidepartment | busidepartment | varchar2(20) |  |  | '~' |
| 15 | busidesc | busidesc | busidesc | varchar2(272) |
| 16 | busiorderno | busiorderno | busiorderno | varchar2(40) |
| 17 | busipersonnel | busipersonnel | busipersonnel | varchar2(20) |  |  | '~' |
| 18 | busistatus | busistatus | busistatus | number(38, 0) |
| 19 | ccamount | ccamount | ccamount | number(28, 8) |
| 20 | ccflag | ccflag | ccflag | char(1) |  |  | 'N' |
| 21 | ccglcamount | ccglcamount | ccglcamount | number(28, 8) |
| 22 | ccglcrate | ccglcrate | ccglcrate | number(28, 8) |
| 23 | ccgllcamount | ccgllcamount | ccgllcamount | number(28, 8) |
| 24 | ccgllcrate | ccgllcrate | ccgllcrate | number(28, 8) |
| 25 | ccmessage | ccmessage | ccmessage | varchar2(1025) |
| 26 | ccolcamount | ccolcamount | ccolcamount | number(28, 8) |
| 27 | ccolcrate | ccolcrate | ccolcrate | number(28, 8) |
| 28 | cctype | cctype | cctype | number(38, 0) |  |  | 1 |
| 29 | cguaranteeamount | cguaranteeamount | cguaranteeamount | number(28, 8) |
| 30 | cguaranteeflag | cguaranteeflag | cguaranteeflag | char(1) |
| 31 | cguaranteeglcamount | cguaranteeglcamount | cguaranteeglcamount | number(28, 8) |
| 32 | cguaranteeglcrate | cguaranteeglcrate | cguaranteeglcrate | number(28, 8) |
| 33 | cguaranteegllcamount | cguaranteegllcamount | cguaranteegllcamount | number(28, 8) |
| 34 | cguaranteegllcrate | cguaranteegllcrate | cguaranteegllcrate | number(28, 8) |
| 35 | cguaranteeolcamount | cguaranteeolcamount | cguaranteeolcamount | number(28, 8) |
| 36 | cguaranteeolcrate | cguaranteeolcrate | cguaranteeolcrate | number(28, 8) |
| 37 | cguaranteetype | cguaranteetype | cguaranteetype | varchar2(30) |
| 38 | closedate | closedate | closedate | char(19) |
| 39 | closeoperator | closeoperator | closeoperator | varchar2(20) |  |  | '~' |
| 40 | closereason | closereason | closereason | number(38, 0) |
| 41 | commitdate | commitdate | commitdate | char(19) |
| 42 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 43 | depositaccount | depositaccount | depositaccount | varchar2(20) |  |  | '~' |
| 44 | depositamount | depositamount | depositamount | number(28, 8) |
| 45 | depositflag | depositflag | depositflag | char(1) |  |  | 'N' |
| 46 | depositglcamount | depositglcamount | depositglcamount | number(28, 8) |
| 47 | depositglcrate | depositglcrate | depositglcrate | number(28, 8) |
| 48 | depositgllcamount | depositgllcamount | depositgllcamount | number(28, 8) |
| 49 | depositgllcrate | depositgllcrate | depositgllcrate | number(28, 8) |
| 50 | depositolcamount | depositolcamount | depositolcamount | number(28, 8) |
| 51 | depositolcrate | depositolcrate | depositolcrate | number(28, 8) |
| 52 | depositratio | depositratio | depositratio | number(28, 8) |
| 53 | enddate | enddate | enddate | char(19) |
| 54 | foreignflag | foreignflag | foreignflag | char(1) |  |  | 'N' |
| 55 | glform | glform | glform | number(38, 0) |
| 56 | glno | glno | glno | varchar2(50) |
| 57 | glstatus | glstatus | glstatus | number(38, 0) |
| 58 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 59 | guaranteeglcamount | guaranteeglcamount | guaranteeglcamount | number(28, 8) |
| 60 | guaranteeglcrate | guaranteeglcrate | guaranteeglcrate | number(28, 8) |
| 61 | guaranteegllcamount | guaranteegllcamount | guaranteegllcamount | number(28, 8) |
| 62 | guaranteegllcrate | guaranteegllcrate | guaranteegllcrate | number(28, 8) |
| 63 | guaranteeolcamount | guaranteeolcamount | guaranteeolcamount | number(28, 8) |
| 64 | guaranteeolcrate | guaranteeolcrate | guaranteeolcrate | number(28, 8) |
| 65 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 66 | initflag | initflag | initflag | char(1) |  |  | 'N' |
| 67 | innerdepositamount | innerdepositamount | innerdepositamount | number(28, 8) |
| 68 | innerdepositflag | innerdepositflag | innerdepositflag | char(1) |  |  | 'N' |
| 69 | innerdepositglcamount | innerdepositglcamount | innerdepositglcamount | number(28, 8) |
| 70 | innerdepositglcrate | innerdepositglcrate | innerdepositglcrate | number(28, 8) |
| 71 | innerdepositgllcamount | innerdepositgllcamount | innerdepositgllcamount | number(28, 8) |
| 72 | innerdepositgllcrate | innerdepositgllcrate | innerdepositgllcrate | number(28, 8) |
| 73 | innerdepositolcamount | innerdepositolcamount | innerdepositolcamount | number(28, 8) |
| 74 | innerdepositolcrate | innerdepositolcrate | innerdepositolcrate | number(28, 8) |
| 75 | innerpoundageamount | innerpoundageamount | innerpoundageamount | number(28, 8) |
| 76 | innerpoundageflag | innerpoundageflag | innerpoundageflag | char(1) |
| 77 | innerpoundageglcamount | innerpoundageglcamount | innerpoundageglcamount | number(28, 8) |
| 78 | innerpoundageglcrate | innerpoundageglcrate | innerpoundageglcrate | number(28, 8) |
| 79 | innerpoundagegllcamount | innerpoundagegllcamount | innerpoundagegllcamount | number(28, 8) |
| 80 | innerpoundagegllcrate | innerpoundagegllcrate | innerpoundagegllcrate | number(28, 8) |
| 81 | innerpoundageolcamount | innerpoundageolcamount | innerpoundageolcamount | number(28, 8) |
| 82 | innerpoundageolcrate | innerpoundageolcrate | innerpoundageolcrate | number(28, 8) |
| 83 | innerpoundageradio | innerpoundageradio | innerpoundageradio | number(28, 8) |
| 84 | itemname | itemname | itemname | varchar2(75) |
| 85 | legalunit | legalunit | legalunit | varchar2(200) |
| 86 | openmethod | openmethod | openmethod | number(38, 0) |  |  | 2 |
| 87 | pk_agentorg | pk_agentorg | pk_agentorg | varchar2(20) |  |  | '~' |
| 88 | pk_agentorg_v | pk_agentorg_v | pk_agentorg_v | varchar2(20) |  |  | '~' |
| 89 | pk_applyno | pk_applyno | pk_applyno | varchar2(20) |  |  | '~' |
| 90 | pk_applyorg | pk_applyorg | pk_applyorg | varchar2(20) |  |  | '~' |
| 91 | pk_applyorg_v | pk_applyorg_v | pk_applyorg_v | varchar2(20) |  |  | '~' |
| 92 | pk_benefciary | pk_benefciary | pk_benefciary | varchar2(20) |  |  | '~' |
| 93 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 94 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 95 | pk_busicontractcurr | pk_busicontractcurr | pk_busicontractcurr | varchar2(20) |  |  | '~' |
| 96 | pk_ccbank | pk_ccbank | pk_ccbank | varchar2(20) |  |  | '~' |
| 97 | pk_cccategory | pk_cccategory | pk_cccategory | varchar2(20) |  |  | '~' |
| 98 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 99 | pk_ccno | pk_ccno | pk_ccno | varchar2(20) |  |  | '~' |
| 100 | pk_cguaranteecurrtype | pk_cguaranteecurrtype | pk_cguaranteecurrtype | varchar2(20) |  |  | '~' |
| 101 | pk_cguaranteeno | pk_cguaranteeno | pk_cguaranteeno | varchar2(20) |  |  | '~' |
| 102 | pk_depositcurrtype | pk_depositcurrtype | pk_depositcurrtype | varchar2(20) |  |  | '~' |
| 103 | pk_depositno | pk_depositno | pk_depositno | varchar2(20) |
| 104 | pk_fundplan | pk_fundplan | pk_fundplan | varchar2(20) |  |  | '~' |
| 105 | pk_gltype | pk_gltype | pk_gltype | varchar2(20) |  |  | '~' |
| 106 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 107 | pk_guaranteebank | pk_guaranteebank | pk_guaranteebank | varchar2(20) |  |  | '~' |
| 108 | pk_guaranteecurrtype | pk_guaranteecurrtype | pk_guaranteecurrtype | varchar2(20) |  |  | '~' |
| 109 | pk_innerdepositcurrtype | pk_innerdepositcurrtype | pk_innerdepositcurrtype | varchar2(20) |  |  | '~' |
| 110 | pk_innerpoundagecurrtype | pk_innerpoundagecurrtype | pk_innerpoundagecurrtype | varchar2(20) |  |  | '~' |
| 111 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 112 | pk_org_unit | pk_org_unit | pk_org_unit | varchar2(20) |  |  | '~' |
| 113 | pk_org_unit_v | pk_org_unit_v | pk_org_unit_v | varchar2(20) |  |  | '~' |
| 114 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 115 | pk_poundagecurrtype | pk_poundagecurrtype | pk_poundagecurrtype | varchar2(20) |  |  | '~' |
| 116 | pk_principalorg | pk_principalorg | pk_principalorg | varchar2(20) |  |  | '~' |
| 117 | pk_principalorg_v | pk_principalorg_v | pk_principalorg_v | varchar2(20) |  |  | '~' |
| 118 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 119 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 120 | pk_transbank | pk_transbank | pk_transbank | varchar2(75) |
| 121 | poundageamount | poundageamount | poundageamount | number(28, 8) |
| 122 | poundageglcamount | poundageglcamount | poundageglcamount | number(28, 8) |
| 123 | poundageglcrate | poundageglcrate | poundageglcrate | number(28, 8) |
| 124 | poundagegllcamount | poundagegllcamount | poundagegllcamount | number(28, 8) |
| 125 | poundagegllcrate | poundagegllcrate | poundagegllcrate | number(28, 8) |
| 126 | poundagememo | poundagememo | poundagememo | varchar2(272) |
| 127 | poundageolcamount | poundageolcamount | poundageolcamount | number(28, 8) |
| 128 | poundageolcrate | poundageolcrate | poundageolcrate | number(28, 8) |
| 129 | poundagepaydate | poundagepaydate | poundagepaydate | varchar2(50) |
| 130 | restricttype | restricttype | restricttype | number(38, 0) |
| 131 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 132 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 133 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 134 | saga_status | saga_status | saga_status | number(38, 0) |
| 135 | srcbillno | srcbillno | srcbillno | varchar2(40) |
| 136 | stagesflag | stagesflag | stagesflag | char(1) |  |  | 'N' |
| 137 | sumdepositamount | sumdepositamount | sumdepositamount | number(28, 8) |
| 138 | sumdepositglcamount | sumdepositglcamount | sumdepositglcamount | number(28, 8) |
| 139 | sumdepositglcrate | sumdepositglcrate | sumdepositglcrate | number(28, 8) |
| 140 | sumdepositgllcamount | sumdepositgllcamount | sumdepositgllcamount | number(28, 8) |
| 141 | sumdepositgllcrate | sumdepositgllcrate | sumdepositgllcrate | number(28, 8) |
| 142 | sumdepositolcamount | sumdepositolcamount | sumdepositolcamount | number(28, 8) |
| 143 | sumdepositolcrate | sumdepositolcrate | sumdepositolcrate | number(28, 8) |
| 144 | suminnerdepositamount | suminnerdepositamount | suminnerdepositamount | number(28, 8) |
| 145 | suminnerdepositglcamount | suminnerdepositglcamount | suminnerdepositglcamount | number(28, 8) |
| 146 | suminnerdepositglcrate | suminnerdepositglcrate | suminnerdepositglcrate | number(28, 8) |
| 147 | suminnerdepositgllcamount | suminnerdepositgllcamount | suminnerdepositgllcamount | number(28, 8) |
| 148 | suminnerdepositgllcrate | suminnerdepositgllcrate | suminnerdepositgllcrate | number(28, 8) |
| 149 | suminnerdepositolcamount | suminnerdepositolcamount | suminnerdepositolcamount | number(28, 8) |
| 150 | suminnerdepositolcrate | suminnerdepositolcrate | suminnerdepositolcrate | number(28, 8) |
| 151 | suminnerpoundageamount | suminnerpoundageamount | suminnerpoundageamount | number(28, 8) |
| 152 | suminnerpoundageglcamount | suminnerpoundageglcamount | suminnerpoundageglcamount | number(28, 8) |
| 153 | suminnerpoundageglcrate | suminnerpoundageglcrate | suminnerpoundageglcrate | number(28, 8) |
| 154 | suminnerpoundagegllcamount | suminnerpoundagegllcamount | suminnerpoundagegllcamount | number(28, 8) |
| 155 | suminnerpoundagegllcrate | suminnerpoundagegllcrate | suminnerpoundagegllcrate | number(28, 8) |
| 156 | suminnerpoundageolcamount | suminnerpoundageolcamount | suminnerpoundageolcamount | number(28, 8) |
| 157 | suminnerpoundageolcrate | suminnerpoundageolcrate | suminnerpoundageolcrate | number(28, 8) |
| 158 | sumpoundageamount | sumpoundageamount | sumpoundageamount | number(28, 8) |
| 159 | sumpoundageglcamount | sumpoundageglcamount | sumpoundageglcamount | number(28, 8) |
| 160 | sumpoundageglcrate | sumpoundageglcrate | sumpoundageglcrate | number(28, 8) |
| 161 | sumpoundagegllcamount | sumpoundagegllcamount | sumpoundagegllcamount | number(28, 8) |
| 162 | sumpoundagegllcrate | sumpoundagegllcrate | sumpoundagegllcrate | number(28, 8) |
| 163 | sumpoundageolcamount | sumpoundageolcamount | sumpoundageolcamount | number(28, 8) |
| 164 | sumpoundageolcrate | sumpoundageolcrate | sumpoundageolcrate | number(28, 8) |
| 165 | supplydate | supplydate | supplydate | char(19) |
| 166 | tbbmessage | tbbmessage | tbbmessage | varchar2(1538) |
| 167 | termlimit | termlimit | termlimit | number(38, 0) |
| 168 | tranactunit | tranactunit | tranactunit | varchar2(200) |
| 169 | vbillno | vbillno | vbillno | varchar2(40) |
| 170 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 171 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 172 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 173 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 174 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 175 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 176 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 177 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 178 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 179 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 180 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 181 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 182 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 183 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 184 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 185 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 186 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 187 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 188 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 189 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 190 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 191 | creationtime | creationtime | creationtime | char(19) |
| 192 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 193 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 194 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 195 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 196 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |