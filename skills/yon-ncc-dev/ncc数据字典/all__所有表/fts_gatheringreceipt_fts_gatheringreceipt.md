# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringreceipt_h | pk_gatheringreceipt_h | pk_gatheringreceipt_h | char(20) | √ |
| 2 | address_p | address_p | address_p | varchar2(200) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | bankaccount_p | bankaccount_p | bankaccount_p | varchar2(200) |  |  | '~' |
| 5 | bankname_p | bankname_p | bankname_p | varchar2(300) |  |  | '~' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | brief | brief | brief | varchar2(272) |
| 8 | company_p | company_p | company_p | varchar2(300) |  |  | '~' |
| 9 | dbilldate | dbilldate | dbilldate | char(19) |
| 10 | dbilltime | dbilltime | dbilltime | char(19) |
| 11 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 12 | glcamount | glcamount | glcamount | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(28, 8) |
| 14 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 16 | isreversebusitype | isreversebusitype | isreversebusitype | char(1) |
| 17 | memo | memo | memo | varchar2(272) |
| 18 | olcamount | olcamount | olcamount | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | origetmode | origetmode | origetmode | varchar2(50) |
| 21 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 22 | pk_bankaccount_p | pk_bankaccount_p | pk_bankaccount_p | char(20) |  |  | '~' |
| 23 | pk_bankname_p | pk_bankname_p | pk_bankname_p | char(20) |  |  | '~' |
| 24 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 25 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 26 | pk_company_p | pk_company_p | pk_company_p | char(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_fundgetorg | pk_fundgetorg | pk_fundgetorg | varchar2(20) |  |  | '~' |
| 29 | pk_fundgetorg_v | pk_fundgetorg_v | pk_fundgetorg_v | varchar2(20) |  |  | '~' |
| 30 | pk_getplanitem | pk_getplanitem | pk_getplanitem | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_inneraccount_r | pk_inneraccount_r | pk_inneraccount_r | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 35 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 36 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(50) |
| 37 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 38 | pk_transactorg_v | pk_transactorg_v | pk_transactorg_v | varchar2(20) |  |  | '~' |
| 39 | trandate | trandate | trandate | char(19) |
| 40 | trantime | trantime | trantime | char(19) |
| 41 | vbillno | vbillno | vbillno | varchar2(50) |
| 42 | vsourcebillno | vsourcebillno | vsourcebillno | varchar2(50) |
| 43 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 44 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 45 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 46 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 47 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 48 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 49 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 50 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 51 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 52 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |