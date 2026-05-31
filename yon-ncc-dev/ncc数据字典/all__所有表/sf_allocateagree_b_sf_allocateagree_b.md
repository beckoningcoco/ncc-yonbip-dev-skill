# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11474.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocateagree_b | pk_allocateagree_b | pk_allocateagree_b | char(20) | √ |
| 2 | agreeallocatedate | agreeallocatedate | agreeallocatedate | char(19) |
| 3 | agreeamount | agreeamount | agreeamount | number(28, 8) |
| 4 | agreeglcamount | agreeglcamount | agreeglcamount | number(28, 8) |
| 5 | agreegllcamount | agreegllcamount | agreegllcamount | number(28, 8) |
| 6 | agreeolcamount | agreeolcamount | agreeolcamount | number(28, 8) |
| 7 | agreetype | agreetype | agreetype | number(38, 0) |
| 8 | applyallocatedate | applyallocatedate | applyallocatedate | char(19) |
| 9 | applyamount | applyamount | applyamount | number(28, 8) |
| 10 | applyglcamount | applyglcamount | applyglcamount | number(28, 8) |
| 11 | applygllcamount | applygllcamount | applygllcamount | number(28, 8) |
| 12 | applyolcamount | applyolcamount | applyolcamount | number(28, 8) |
| 13 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 14 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 15 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 16 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 17 | custbankname | custbankname | custbankname | varchar2(20) |  |  | '~' |
| 18 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 19 | glcrate | glcrate | glcrate | number(15, 8) |
| 20 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 21 | isagree | isagree | isagree | number(38, 0) |
| 22 | isnetbankfull | isnetbankfull | isnetbankfull | char(1) |
| 23 | isnetpay | isnetpay | isnetpay | char(1) |
| 24 | olcrate | olcrate | olcrate | number(15, 8) |
| 25 | payamount | payamount | payamount | number(28, 8) |
| 26 | payglcamount | payglcamount | payglcamount | number(28, 8) |
| 27 | paygllcamount | paygllcamount | paygllcamount | number(28, 8) |
| 28 | payolcamount | payolcamount | payolcamount | number(28, 8) |
| 29 | paytype | paytype | paytype | varchar2(50) |
| 30 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 31 | pk_allocateagree_h | pk_allocateagree_h | pk_allocateagree_h | char(20) | √ |
| 32 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 33 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 34 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 35 | pk_company_r | pk_company_r | pk_company_r | varchar2(20) |  |  | '~' |
| 36 | pk_custbankacc | pk_custbankacc | pk_custbankacc | varchar2(20) |  |  | '~' |
| 37 | pk_financeorg_r | pk_financeorg_r | pk_financeorg_r | varchar2(20) |  |  | '~' |
| 38 | pk_financeorg_r_v | pk_financeorg_r_v | pk_financeorg_r_v | varchar2(20) |  |  | '~' |
| 39 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 42 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 43 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 44 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 45 | recordstatus | recordstatus | recordstatus | number(38, 0) |
| 46 | remark | remark | remark | varchar2(300) |
| 47 | rowno | rowno | rowno | varchar2(50) |
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