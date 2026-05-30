# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payinfochange | pk_payinfochange | pk_payinfochange | char(20) | √ |
| 2 | allocatbankdoc_o | allocatbankdoc_o | allocatbankdoc_o | varchar2(20) |  |  | '~' |
| 3 | allotaccnameori | allotaccnameori | allotaccnameori | varchar2(300) |
| 4 | allotaccount | allotaccount | allotaccount | varchar2(200) |
| 5 | allotaccountname | allotaccountname | allotaccountname | varchar2(300) |
| 6 | allotaccountori | allotaccountori | allotaccountori | varchar2(200) |
| 7 | amount | amount | amount | number(28, 8) |
| 8 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 9 | auditdate | auditdate | auditdate | char(19) |
| 10 | audittime | audittime | audittime | char(19) |
| 11 | bankaccname_p | bankaccname_p | bankaccname_p | varchar2(300) |
| 12 | bankaccname_pori | bankaccname_pori | bankaccname_pori | varchar2(300) |
| 13 | bankaccount_p | bankaccount_p | bankaccount_p | varchar2(200) |
| 14 | bankaccount_pori | bankaccount_pori | bankaccount_pori | varchar2(200) |
| 15 | billdate | billdate | billdate | char(19) |
| 16 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 17 | billno | billno | billno | varchar2(50) |
| 18 | billno_old | billno_old | billno_old | varchar2(50) |
| 19 | billstatus | billstatus | billstatus | number(38, 0) |
| 20 | billtime | billtime | billtime | char(19) |
| 21 | dealway | dealway | dealway | varchar2(30) |
| 22 | direct_ecds | direct_ecds | direct_ecds | char(1) |
| 23 | direct_ecds_old | direct_ecds_old | direct_ecds_old | char(1) |
| 24 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 25 | glcamount | glcamount | glcamount | number(28, 8) |
| 26 | glcrate | glcrate | glcrate | number(15, 8) |
| 27 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 28 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 29 | isebankback | isebankback | isebankback | char(1) |
| 30 | isebankunback | isebankunback | isebankunback | char(1) |
| 31 | ismakeup | ismakeup | ismakeup | char(1) |
| 32 | isnetpay | isnetpay | isnetpay | char(1) |
| 33 | ispayroll | ispayroll | ispayroll | char(1) |
| 34 | memo | memo | memo | varchar2(272) |
| 35 | olcamount | olcamount | olcamount | number(28, 8) |
| 36 | olcrate | olcrate | olcrate | number(15, 8) |
| 37 | oriamount | oriamount | oriamount | number(28, 8) |
| 38 | oribankpaymsg | oribankpaymsg | oribankpaymsg | varchar2(400) |
| 39 | oribankretmsg | oribankretmsg | oribankretmsg | varchar2(400) |
| 40 | oridealway | oridealway | oridealway | varchar2(50) |
| 41 | orifundtype | orifundtype | orifundtype | varchar2(20) |  |  | '~' |
| 42 | origlcamount | origlcamount | origlcamount | number(28, 8) |
| 43 | origlcrate | origlcrate | origlcrate | number(15, 8) |
| 44 | origllcamount | origllcamount | origllcamount | number(28, 8) |
| 45 | origllcrate | origllcrate | origllcrate | number(15, 8) |
| 46 | oriisebankback | oriisebankback | oriisebankback | char(1) |
| 47 | oriisebankunback | oriisebankunback | oriisebankunback | char(1) |
| 48 | oriisfees | oriisfees | oriisfees | char(1) |
| 49 | oriisnetpay | oriisnetpay | oriisnetpay | char(1) |
| 50 | orimemo | orimemo | orimemo | varchar2(272) |
| 51 | oriolcamount | oriolcamount | oriolcamount | number(28, 8) |
| 52 | oriolcrate | oriolcrate | oriolcrate | number(15, 8) |
| 53 | oripaymode | oripaymode | oripaymode | varchar2(50) |
| 54 | oripaystatus | oripaystatus | oripaystatus | number(38, 0) |
| 55 | oripk_payplan | oripk_payplan | oripk_payplan | varchar2(20) |  |  | '~' |
| 56 | oripurpose | oripurpose | oripurpose | varchar2(272) |
| 57 | orivoucherflag | orivoucherflag | orivoucherflag | char(1) |
| 58 | paymentvbillno | paymentvbillno | paymentvbillno | varchar2(50) |
| 59 | paymode | paymode | paymode | varchar2(50) |
| 60 | paystep | paystep | paystep | varchar2(20) |
| 61 | pk_allocatebankdoc | pk_allocatebankdoc | pk_allocatebankdoc | varchar2(20) |  |  | '~' |
| 62 | pk_allotaccount | pk_allotaccount | pk_allotaccount | varchar2(20) |  |  | '~' |
| 63 | pk_allotaccountori | pk_allotaccountori | pk_allotaccountori | varchar2(20) |  |  | '~' |
| 64 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 65 | pk_balatypeori | pk_balatypeori | pk_balatypeori | varchar2(20) |  |  | '~' |
| 66 | pk_bankaccount_p | pk_bankaccount_p | pk_bankaccount_p | varchar2(20) |  |  | '~' |
| 67 | pk_bankaccount_pori | pk_bankaccount_pori | pk_bankaccount_pori | varchar2(20) |  |  | '~' |
| 68 | pk_bankaccount_rori | pk_bankaccount_rori | pk_bankaccount_rori | char(20) |  |  | '~' |
| 69 | pk_billno | pk_billno | pk_billno | varchar2(20) |  |  | '~' |
| 70 | pk_billno_old | pk_billno_old | pk_billno_old | varchar2(20) |  |  | '~' |
| 71 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 72 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 73 | pk_company_rori | pk_company_rori | pk_company_rori | varchar2(20) |  |  | '~' |
| 74 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 75 | pk_drawer | pk_drawer | pk_drawer | varchar2(20) |  |  | '~' |
| 76 | pk_ebank_paylog | pk_ebank_paylog | pk_ebank_paylog | varchar2(20) |
| 77 | pk_fddownbillori | pk_fddownbillori | pk_fddownbillori | varchar2(20) |  |  | '~' |
| 78 | pk_fddownchildbillori | pk_fddownchildbillori | pk_fddownchildbillori | varchar2(20) |  |  | '~' |
| 79 | pk_fundcashaccount | pk_fundcashaccount | pk_fundcashaccount | varchar2(20) |  |  | '~' |
| 80 | pk_fundcashaccountori | pk_fundcashaccountori | pk_fundcashaccountori | varchar2(20) |  |  | '~' |
| 81 | pk_fundupbillori | pk_fundupbillori | pk_fundupbillori | varchar2(20) |  |  | '~' |
| 82 | pk_fundupchildbillori | pk_fundupchildbillori | pk_fundupchildbillori | varchar2(20) |  |  | '~' |
| 83 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 84 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 85 | pk_notetype_old | pk_notetype_old | pk_notetype_old | varchar2(20) |  |  | '~' |
| 86 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 87 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 88 | pk_paybank | pk_paybank | pk_paybank | varchar2(20) |  |  | '~' |
| 89 | pk_paybankori | pk_paybankori | pk_paybankori | varchar2(20) |  |  | '~' |
| 90 | pk_payment | pk_payment | pk_payment | varchar2(20) |  |  | '~' |
| 91 | pk_paymentfund | pk_paymentfund | pk_paymentfund | varchar2(20) |  |  | '~' |
| 92 | pk_payplan | pk_payplan | pk_payplan | varchar2(20) |  |  | '~' |
| 93 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(21) |
| 94 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 95 | purpose | purpose | purpose | varchar2(272) |
| 96 | recmodul | recmodul | recmodul | varchar2(20) |
| 97 | vapprovenote | vapprovenote | vapprovenote | varchar2(192) |
| 98 | vbillno | vbillno | vbillno | varchar2(40) |
| 99 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 100 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 101 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 102 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 103 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 104 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 105 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 106 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 107 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 108 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 109 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 110 | creationtime | creationtime | creationtime | char(19) |
| 111 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 112 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 113 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 114 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 115 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |