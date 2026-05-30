# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intranrcpt_h | pk_intranrcpt_h | pk_intranrcpt_h | char(20) | √ |
| 2 | acceptancetype | acceptancetype | acceptancetype | number(38, 0) |
| 3 | acceptdate | acceptdate | acceptdate | char(19) |
| 4 | acceptor | acceptor | acceptor | varchar2(20) |  |  | '~' |
| 5 | acceptstatus | acceptstatus | acceptstatus | number(38, 0) |
| 6 | accepttime | accepttime | accepttime | char(19) |
| 7 | amount | amount | amount | number(28, 8) |
| 8 | beginacceptdate | beginacceptdate | beginacceptdate | char(19) |
| 9 | billdate | billdate | billdate | char(19) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billtime | billtime | billtime | char(19) |
| 12 | forceacceptdate | forceacceptdate | forceacceptdate | char(19) |
| 13 | forceacceptor | forceacceptor | forceacceptor | varchar2(20) |  |  | '~' |
| 14 | forceaccepttime | forceaccepttime | forceaccepttime | char(19) |
| 15 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 16 | glcamount | glcamount | glcamount | number(28, 8) |
| 17 | glcpayamount | glcpayamount | glcpayamount | number(28, 8) |
| 18 | glcrate | glcrate | glcrate | number(28, 8) |
| 19 | glcunpayamount | glcunpayamount | glcunpayamount | number(28, 8) |
| 20 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 21 | gllcpayamount | gllcpayamount | gllcpayamount | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 23 | gllcunpayamount | gllcunpayamount | gllcunpayamount | number(28, 8) |
| 24 | isforceaccept | isforceaccept | isforceaccept | char(1) |
| 25 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 26 | lastacceptdate | lastacceptdate | lastacceptdate | char(19) |
| 27 | memo | memo | memo | varchar2(300) |
| 28 | needacceptance | needacceptance | needacceptance | char(1) |
| 29 | olcamount | olcamount | olcamount | number(28, 8) |
| 30 | olcpayamount | olcpayamount | olcpayamount | number(28, 8) |
| 31 | olcrate | olcrate | olcrate | number(28, 8) |
| 32 | olcunpayamount | olcunpayamount | olcunpayamount | number(28, 8) |
| 33 | payamount | payamount | payamount | number(28, 8) |
| 34 | paydate | paydate | paydate | char(19) |
| 35 | paytime | paytime | paytime | char(19) |
| 36 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 37 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 38 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 39 | pk_financeorg_p | pk_financeorg_p | pk_financeorg_p | varchar2(20) |  |  | '~' |
| 40 | pk_financeorg_r | pk_financeorg_r | pk_financeorg_r | varchar2(20) |  |  | '~' |
| 41 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 42 | pk_getplanitem | pk_getplanitem | pk_getplanitem | varchar2(20) |  |  | '~' |
| 43 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 44 | pk_inneraccount_p | pk_inneraccount_p | pk_inneraccount_p | varchar2(20) |  |  | '~' |
| 45 | pk_inneraccount_r | pk_inneraccount_r | pk_inneraccount_r | varchar2(20) |  |  | '~' |
| 46 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 47 | pk_org_p | pk_org_p | pk_org_p | varchar2(20) |  |  | '~' |
| 48 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 49 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 50 | pk_payplanitem | pk_payplanitem | pk_payplanitem | varchar2(20) |  |  | '~' |
| 51 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 52 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(20) |
| 53 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 54 | refusereason | refusereason | refusereason | varchar2(300) |
| 55 | settleway | settleway | settleway | varchar2(20) |  |  | '~' |
| 56 | transtype | transtype | transtype | varchar2(50) |
| 57 | unpayamount | unpayamount | unpayamount | number(28, 8) |
| 58 | vbillno | vbillno | vbillno | varchar2(50) |
| 59 | vsrcbillno | vsrcbillno | vsrcbillno | varchar2(50) |
| 60 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(50) |
| 61 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(50) |
| 62 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(50) |
| 63 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(50) |
| 64 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(50) |
| 65 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(50) |
| 66 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(50) |
| 67 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(50) |
| 68 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(50) |
| 69 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(50) |
| 70 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 71 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |