# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sign_apply | pk_sign_apply | pk_sign_apply | char(20) | √ |
| 2 | acceptaccount | acceptaccount | acceptaccount | varchar2(40) |
| 3 | acceptdate | acceptdate | acceptdate | char(19) |
| 4 | acceptoraccount | acceptoraccount | acceptoraccount | varchar2(50) |
| 5 | acceptoradress | acceptoradress | acceptoradress | varchar2(200) |
| 6 | acceptorareapoint | acceptorareapoint | acceptorareapoint | varchar2(300) |
| 7 | acceptorbankaccount | acceptorbankaccount | acceptorbankaccount | varchar2(20) |  |  | '~' |
| 8 | acceptorname | acceptorname | acceptorname | varchar2(200) |
| 9 | acceptortype | acceptortype | acceptortype | number(38, 0) |
| 10 | acceptunit | acceptunit | acceptunit | varchar2(20) |  |  | '~' |
| 11 | amount | amount | amount | number(28, 8) |
| 12 | applydate | applydate | applydate | char(19) |
| 13 | applystatus | applystatus | applystatus | varchar2(50) |
| 14 | approvedate | approvedate | approvedate | char(19) |
| 15 | approvenote | approvenote | approvenote | varchar2(1024) |
| 16 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 17 | autoacceptance | autoacceptance | autoacceptance | char(1) |
| 18 | billdeadline | billdeadline | billdeadline | number(38, 0) |
| 19 | billmakedate | billmakedate | billmakedate | char(19) |
| 20 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 21 | billmaketime | billmaketime | billmaketime | char(19) |
| 22 | billpoolflag | billpoolflag | billpoolflag | char(1) |
| 23 | businesspeople | businesspeople | businesspeople | varchar2(20) |  |  | '~' |
| 24 | busistatus | busistatus | busistatus | number(38, 0) |
| 25 | buyerinterest | buyerinterest | buyerinterest | char(1) |
| 26 | cancellation | cancellation | cancellation | char(1) |  |  | 'N' |
| 27 | ccbank | ccbank | ccbank | varchar2(20) |  |  | '~' |
| 28 | ccno | ccno | ccno | varchar2(20) |  |  | '~' |
| 29 | cctype | cctype | cctype | varchar2(30) |
| 30 | contractno | contractno | contractno | varchar2(50) |
| 31 | cyberbankflag | cyberbankflag | cyberbankflag | char(1) |
| 32 | dealsign | dealsign | dealsign | char(1) |
| 33 | dept | dept | dept | varchar2(20) |  |  | '~' |
| 34 | disabledate | disabledate | disabledate | char(19) |
| 35 | disablenote | disablenote | disablenote | varchar2(1024) |
| 36 | disableuser | disableuser | disableuser | varchar2(20) |  |  | '~' |
| 37 | disusedate | disusedate | disusedate | char(19) |
| 38 | disuseflag | disuseflag | disuseflag | char(1) |
| 39 | downquotaflag | downquotaflag | downquotaflag | char(1) |
| 40 | drawbillmode | drawbillmode | drawbillmode | number(38, 0) |
| 41 | drawermentstatus | drawermentstatus | drawermentstatus | number(38, 0) |
| 42 | drawerremark | drawerremark | drawerremark | varchar2(181) |
| 43 | ensure | ensure | ensure | char(1) |
| 44 | fbmbilltype | fbmbilltype | fbmbilltype | varchar2(20) |  |  | '~' |
| 45 | glcamount | glcamount | glcamount | number(28, 8) |
| 46 | glcccamount | glcccamount | glcccamount | number(28, 8) |
| 47 | glcinnersecurityamount | glcinnersecurityamount | glcinnersecurityamount | number(28, 8) |
| 48 | glcoccucommoney | glcoccucommoney | glcoccucommoney | number(28, 8) |
| 49 | glcoccusharemoney | glcoccusharemoney | glcoccusharemoney | number(28, 8) |
| 50 | glcpoundageamount | glcpoundageamount | glcpoundageamount | number(23, 8) |
| 51 | glcrate | glcrate | glcrate | number(15, 8) |
| 52 | glcsecurityamount | glcsecurityamount | glcsecurityamount | number(23, 8) |
| 53 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 54 | gllccamount | gllccamount | gllccamount | number(28, 8) |
| 55 | gllcinnersecurityamount | gllcinnersecurityamount | gllcinnersecurityamount | number(28, 8) |
| 56 | gllcpoundageamount | gllcpoundageamount | gllcpoundageamount | number(23, 8) |
| 57 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 58 | gllcsecurityamount | gllcsecurityamount | gllcsecurityamount | number(23, 8) |
| 59 | glloccucommoney | glloccucommoney | glloccucommoney | number(28, 8) |
| 60 | glloccusharemoney | glloccusharemoney | glloccusharemoney | number(28, 8) |
| 61 | guarantoradress | guarantoradress | guarantoradress | varchar2(200) |
| 62 | guarantorname | guarantorname | guarantorname | varchar2(50) |
| 63 | guarantorno | guarantorno | guarantorno | varchar2(50) |
| 64 | guarantornoisicbc | guarantornoisicbc | guarantornoisicbc | char(1) |
| 65 | guarantoropenname | guarantoropenname | guarantoropenname | varchar2(50) |
| 66 | guarantoropenno | guarantoropenno | guarantoropenno | varchar2(50) |
| 67 | haspassedntbcheck | haspassedntbcheck | haspassedntbcheck | char(1) |
| 68 | hideacceptbankacc | hideacceptbankacc | hideacceptbankacc | varchar2(20) |  |  | '~' |
| 69 | impawnmode | impawnmode | impawnmode | varchar2(30) |
| 70 | initpoolflag | initpoolflag | initpoolflag | char(1) |
| 71 | innersecurityamount | innersecurityamount | innersecurityamount | number(23, 8) |
| 72 | innersecurityrate | innersecurityrate | innersecurityrate | number(23, 8) |
| 73 | invoiceplanitem | invoiceplanitem | invoiceplanitem | varchar2(20) |  |  | '~' |
| 74 | invstfincvartyid | invstfincvartyid | invstfincvartyid | varchar2(20) |  |  | '~' |
| 75 | isacceptednow | isacceptednow | isacceptednow | char(1) |
| 76 | isacceptorequal | isacceptorequal | isacceptorequal | char(1) |  |  | 'N' |
| 77 | issecurity | issecurity | issecurity | char(1) |
| 78 | occucommoney | occucommoney | occucommoney | number(28, 8) |
| 79 | occusharemoney | occusharemoney | occusharemoney | number(28, 8) |
| 80 | olcamount | olcamount | olcamount | number(28, 8) |
| 81 | olcccamount | olcccamount | olcccamount | number(28, 8) |
| 82 | olcinnersecurityamount | olcinnersecurityamount | olcinnersecurityamount | number(28, 8) |
| 83 | olcoccucommoney | olcoccucommoney | olcoccucommoney | number(28, 8) |
| 84 | olcoccusharemoney | olcoccusharemoney | olcoccusharemoney | number(28, 8) |
| 85 | olcpoundageamount | olcpoundageamount | olcpoundageamount | number(23, 8) |
| 86 | olcrate | olcrate | olcrate | number(15, 8) |
| 87 | olcsecurityamount | olcsecurityamount | olcsecurityamount | number(23, 8) |
| 88 | pk_acceptor | pk_acceptor | pk_acceptor | varchar2(20) |  |  | '~' |
| 89 | pk_acceptorbank | pk_acceptorbank | pk_acceptorbank | varchar2(20) |  |  | '~' |
| 90 | pk_acceptorg | pk_acceptorg | pk_acceptorg | varchar2(20) |  |  | '~' |
| 91 | pk_acceptorg_v | pk_acceptorg_v | pk_acceptorg_v | varchar2(20) |  |  | '~' |
| 92 | pk_applybank | pk_applybank | pk_applybank | varchar2(20) |  |  | '~' |
| 93 | pk_applybankacc | pk_applybankacc | pk_applybankacc | varchar2(20) |  |  | '~' |
| 94 | pk_applyorg | pk_applyorg | pk_applyorg | varchar2(20) |  |  | '~' |
| 95 | pk_applyorg_v | pk_applyorg_v | pk_applyorg_v | varchar2(20) |  |  | '~' |
| 96 | pk_banksecurityacc | pk_banksecurityacc | pk_banksecurityacc | varchar2(20) |  |  | '~' |
| 97 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 98 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 99 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 100 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 101 | pk_cccurrtype | pk_cccurrtype | pk_cccurrtype | varchar2(20) |  |  | '~' |
| 102 | pk_cctype | pk_cctype | pk_cctype | varchar2(20) |  |  | '~' |
| 103 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 104 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |  |  | '~' |
| 105 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |  |  | '~' |
| 106 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 107 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 108 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 109 | pk_poundageacc | pk_poundageacc | pk_poundageacc | varchar2(20) |  |  | '~' |
| 110 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 111 | pk_receivebankacc | pk_receivebankacc | pk_receivebankacc | varchar2(20) |  |  | '~' |
| 112 | pk_receiveunit | pk_receiveunit | pk_receiveunit | varchar2(20) |  |  | '~' |
| 113 | pk_securityacc | pk_securityacc | pk_securityacc | varchar2(20) |  |  | '~' |
| 114 | pk_settleorg | pk_settleorg | pk_settleorg | varchar2(50) |
| 115 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 116 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 117 | pk_summary | pk_summary | pk_summary | varchar2(100) |
| 118 | planpaydate | planpaydate | planpaydate | char(19) |
| 119 | poundageamount | poundageamount | poundageamount | number(23, 8) |
| 120 | poundageplanitem | poundageplanitem | poundageplanitem | varchar2(20) |  |  | '~' |
| 121 | promptticket | promptticket | promptticket | char(1) |
| 122 | purpose | purpose | purpose | varchar2(181) |
| 123 | receiveaccount | receiveaccount | receiveaccount | varchar2(20) |  |  | '~' |
| 124 | registerstatus | registerstatus | registerstatus | varchar2(30) |
| 125 | remark | remark | remark | varchar2(181) |
| 126 | returndate | returndate | returndate | char(19) |
| 127 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 128 | returnreason | returnreason | returnreason | varchar2(181) |
| 129 | securityamount | securityamount | securityamount | number(23, 8) |
| 130 | securityplanitem | securityplanitem | securityplanitem | varchar2(20) |  |  | '~' |
| 131 | securityrate | securityrate | securityrate | number(23, 8) |
| 132 | signagrbank | signagrbank | signagrbank | varchar2(20) |  |  | '~' |
| 133 | signagrbankname | signagrbankname | signagrbankname | varchar2(300) |
| 134 | signagrbanknum | signagrbanknum | signagrbanknum | varchar2(50) |
| 135 | signagrbanktext | signagrbanktext | signagrbanktext | varchar2(300) |
| 136 | signagreementno | signagreementno | signagreementno | varchar2(50) |
| 137 | submitdate | submitdate | submitdate | char(19) |
| 138 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 139 | summary | summary | summary | varchar2(181) |  |  | '~' |
| 140 | tbbmessage | tbbmessage | tbbmessage | varchar2(1025) |
| 141 | usedccamount | usedccamount | usedccamount | number(28, 8) |
| 142 | vbillno | vbillno | vbillno | varchar2(50) |
| 143 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 144 | voucherdate | voucherdate | voucherdate | char(19) |
| 145 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 146 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 147 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 148 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 149 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 150 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 151 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 152 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 153 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 154 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 155 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 156 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 157 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 158 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 159 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 160 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 161 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 162 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 163 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 164 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 165 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 166 | creationtime | creationtime | creationtime | char(19) |
| 167 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 168 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 169 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 170 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 171 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |