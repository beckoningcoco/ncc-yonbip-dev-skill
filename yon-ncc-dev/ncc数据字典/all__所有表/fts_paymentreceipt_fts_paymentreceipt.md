# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentreceipt_h | pk_paymentreceipt_h | pk_paymentreceipt_h | char(20) | √ |
| 2 | address_r | address_r | address_r | varchar2(200) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | bankaccount_r | bankaccount_r | bankaccount_r | varchar2(200) |  |  | '~' |
| 5 | bankname_r | bankname_r | bankname_r | varchar2(300) |  |  | '~' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | brief | brief | brief | varchar2(272) |
| 8 | company_r | company_r | company_r | varchar2(300) |  |  | '~' |
| 9 | custaccprop | custaccprop | custaccprop | number(38, 0) |
| 10 | dbilldate | dbilldate | dbilldate | char(19) |
| 11 | dbilltime | dbilltime | dbilltime | char(19) |
| 12 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 13 | glcamount | glcamount | glcamount | number(28, 8) |
| 14 | glcrate | glcrate | glcrate | number(28, 8) |
| 15 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | isreimbursement | isreimbursement | isreimbursement | char(1) |
| 18 | isreversebusitype | isreversebusitype | isreversebusitype | char(1) |
| 19 | memo | memo | memo | varchar2(272) |
| 20 | olcamount | olcamount | olcamount | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(28, 8) |
| 22 | oripaymode | oripaymode | oripaymode | varchar2(50) |
| 23 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 24 | pk_bankaccount_p | pk_bankaccount_p | pk_bankaccount_p | varchar2(20) |  |  | '~' |
| 25 | pk_bankaccount_r | pk_bankaccount_r | pk_bankaccount_r | char(20) |  |  | '~' |
| 26 | pk_bankname_r | pk_bankname_r | pk_bankname_r | char(20) |  |  | '~' |
| 27 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 29 | pk_company_r | pk_company_r | pk_company_r | char(20) |  |  | '~' |
| 30 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 31 | pk_financeplan | pk_financeplan | pk_financeplan | varchar2(20) |  |  | '~' |
| 32 | pk_fundpayorg | pk_fundpayorg | pk_fundpayorg | varchar2(20) |  |  | '~' |
| 33 | pk_fundpayorg_v | pk_fundpayorg_v | pk_fundpayorg_v | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_inneraccount_p | pk_inneraccount_p | pk_inneraccount_p | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_personnel | pk_personnel | pk_personnel | varchar2(20) |  |  | '~' |
| 39 | pk_psnbankacc | pk_psnbankacc | pk_psnbankacc | varchar2(20) |  |  | '~' |
| 40 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 41 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(50) |
| 42 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 43 | pk_transactorg_v | pk_transactorg_v | pk_transactorg_v | varchar2(20) |  |  | '~' |
| 44 | trandate | trandate | trandate | char(19) |
| 45 | trantime | trantime | trantime | char(19) |
| 46 | vbillno | vbillno | vbillno | varchar2(50) |
| 47 | vsourcebillno | vsourcebillno | vsourcebillno | varchar2(50) |
| 48 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 49 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 50 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 51 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 52 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 53 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 54 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 55 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 56 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 57 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |