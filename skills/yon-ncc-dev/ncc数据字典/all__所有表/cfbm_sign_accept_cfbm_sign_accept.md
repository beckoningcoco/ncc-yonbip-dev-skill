# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sign_accept | pk_sign_accept | pk_sign_accept | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | acceptuser | acceptuser | acceptuser | varchar2(20) |  |  | '~' |
| 4 | amount | amount | amount | number(28, 8) |
| 5 | applydate | applydate | applydate | char(19) |
| 6 | approvedate | approvedate | approvedate | char(19) |
| 7 | approvenote | approvenote | approvenote | varchar2(1024) |
| 8 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 9 | billdeadline | billdeadline | billdeadline | number(38, 0) |
| 10 | billmakedate | billmakedate | billmakedate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billmaketime | billmaketime | billmaketime | char(19) |
| 13 | busistatus | busistatus | busistatus | number(38, 0) |
| 14 | contractno | contractno | contractno | varchar2(50) |
| 15 | dealbynext | dealbynext | dealbynext | char(1) |
| 16 | dealsign | dealsign | dealsign | char(1) |
| 17 | fbmbilltype | fbmbilltype | fbmbilltype | varchar2(20) |  |  | '~' |
| 18 | glcamount | glcamount | glcamount | number(28, 8) |
| 19 | glcinnersecurityamount | glcinnersecurityamount | glcinnersecurityamount | number(28, 8) |
| 20 | glcpoundageamount | glcpoundageamount | glcpoundageamount | number(23, 8) |
| 21 | glcrate | glcrate | glcrate | number(15, 8) |
| 22 | glcsecurityamount | glcsecurityamount | glcsecurityamount | number(23, 8) |
| 23 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 24 | gllcinnersecurityamount | gllcinnersecurityamount | gllcinnersecurityamount | number(28, 8) |
| 25 | gllcpoundageamount | gllcpoundageamount | gllcpoundageamount | number(23, 8) |
| 26 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 27 | gllcsecurityamount | gllcsecurityamount | gllcsecurityamount | number(23, 8) |
| 28 | innersecurityamount | innersecurityamount | innersecurityamount | number(23, 8) |
| 29 | innersecurityrate | innersecurityrate | innersecurityrate | number(23, 8) |
| 30 | invoiceplanitem | invoiceplanitem | invoiceplanitem | varchar2(20) |  |  | '~' |
| 31 | isacceptednow | isacceptednow | isacceptednow | char(1) |
| 32 | olcamount | olcamount | olcamount | number(28, 8) |
| 33 | olcinnersecurityamount | olcinnersecurityamount | olcinnersecurityamount | number(28, 8) |
| 34 | olcpoundageamount | olcpoundageamount | olcpoundageamount | number(23, 8) |
| 35 | olcrate | olcrate | olcrate | number(15, 8) |
| 36 | olcsecurityamount | olcsecurityamount | olcsecurityamount | number(23, 8) |
| 37 | pk_acceptorg | pk_acceptorg | pk_acceptorg | varchar2(20) |  |  | '~' |
| 38 | pk_acceptorg_v | pk_acceptorg_v | pk_acceptorg_v | varchar2(20) |  |  | '~' |
| 39 | pk_applybank | pk_applybank | pk_applybank | varchar2(20) |  |  | '~' |
| 40 | pk_applybankacc | pk_applybankacc | pk_applybankacc | varchar2(20) |  |  | '~' |
| 41 | pk_applyorg | pk_applyorg | pk_applyorg | varchar2(20) |  |  | '~' |
| 42 | pk_applyorg_v | pk_applyorg_v | pk_applyorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_banksecurityacc | pk_banksecurityacc | pk_banksecurityacc | varchar2(20) |  |  | '~' |
| 44 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 46 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 47 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 48 | pk_entrustorg | pk_entrustorg | pk_entrustorg | varchar2(20) |
| 49 | pk_entrustorg_v | pk_entrustorg_v | pk_entrustorg_v | varchar2(20) |
| 50 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 51 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 52 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 53 | pk_poundageacc | pk_poundageacc | pk_poundageacc | varchar2(20) |  |  | '~' |
| 54 | pk_receivebank | pk_receivebank | pk_receivebank | varchar2(20) |  |  | '~' |
| 55 | pk_receivebankacc | pk_receivebankacc | pk_receivebankacc | varchar2(20) |  |  | '~' |
| 56 | pk_receiveunit | pk_receiveunit | pk_receiveunit | varchar2(20) |  |  | '~' |
| 57 | pk_securityacc | pk_securityacc | pk_securityacc | varchar2(20) |  |  | '~' |
| 58 | pk_settleorg | pk_settleorg | pk_settleorg | varchar2(50) |
| 59 | pk_signapply | pk_signapply | pk_signapply | varchar2(20) |
| 60 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 61 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |
| 62 | pk_summary | pk_summary | pk_summary | varchar2(100) |
| 63 | planpaydate | planpaydate | planpaydate | char(19) |
| 64 | poundageamount | poundageamount | poundageamount | number(23, 8) |
| 65 | poundageplanitem | poundageplanitem | poundageplanitem | varchar2(20) |  |  | '~' |
| 66 | purpose | purpose | purpose | varchar2(181) |
| 67 | remark | remark | remark | varchar2(181) |
| 68 | returndate | returndate | returndate | char(19) |
| 69 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 70 | returnreason | returnreason | returnreason | varchar2(181) |
| 71 | securityamount | securityamount | securityamount | number(23, 8) |
| 72 | securityplanitem | securityplanitem | securityplanitem | varchar2(20) |  |  | '~' |
| 73 | securityrate | securityrate | securityrate | number(23, 8) |
| 74 | signagreementno | signagreementno | signagreementno | varchar2(50) |
| 75 | signflag | signflag | signflag | char(1) |
| 76 | submitdate | submitdate | submitdate | char(19) |
| 77 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 78 | summary | summary | summary | varchar2(181) |  |  | '~' |
| 79 | vbillno | vbillno | vbillno | varchar2(50) |
| 80 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 81 | voucherdate | voucherdate | voucherdate | char(19) |
| 82 | vouchermaker | vouchermaker | vouchermaker | varchar2(20) |  |  | '~' |
| 83 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 84 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 85 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 86 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 87 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 88 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 89 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 90 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 91 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 92 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 93 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 94 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 95 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 96 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 97 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 98 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 99 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 100 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 101 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 102 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 103 | creationtime | creationtime | creationtime | char(19) |
| 104 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 105 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 106 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 107 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 108 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |