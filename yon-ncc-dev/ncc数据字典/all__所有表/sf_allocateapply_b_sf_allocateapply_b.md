# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11476.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocateapply_b | pk_allocateapply_b | pk_allocateapply_b | char(20) | √ |
| 2 | agreeamount | agreeamount | agreeamount | number(28, 8) |
| 3 | agreeglcamount | agreeglcamount | agreeglcamount | number(28, 8) |
| 4 | agreegllcamount | agreegllcamount | agreegllcamount | number(28, 8) |
| 5 | agreeolcamount | agreeolcamount | agreeolcamount | number(28, 8) |
| 6 | agreetype | agreetype | agreetype | number(38, 0) |
| 7 | applyallocatedate | applyallocatedate | applyallocatedate | char(19) |
| 8 | applyamount | applyamount | applyamount | number(28, 8) |
| 9 | applyglcamount | applyglcamount | applyglcamount | number(28, 8) |
| 10 | applyglcrate | applyglcrate | applyglcrate | number(15, 8) |
| 11 | applygllcamount | applygllcamount | applygllcamount | number(28, 8) |
| 12 | applygllcrate | applygllcrate | applygllcrate | number(15, 8) |
| 13 | applyolcamount | applyolcamount | applyolcamount | number(28, 8) |
| 14 | applyolcrate | applyolcrate | applyolcrate | number(15, 8) |
| 15 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 16 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 17 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 18 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 19 | custbankname | custbankname | custbankname | varchar2(20) |  |  | '~' |
| 20 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 21 | isnetpay | isnetpay | isnetpay | char(1) |
| 22 | payamount | payamount | payamount | number(28, 8) |
| 23 | payglcamount | payglcamount | payglcamount | number(28, 8) |
| 24 | paygllcamount | paygllcamount | paygllcamount | number(28, 8) |
| 25 | payolcamount | payolcamount | payolcamount | number(28, 8) |
| 26 | pay_type | pay_type | pay_type | varchar2(50) |
| 27 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 28 | pk_allocateapply_h | pk_allocateapply_h | pk_allocateapply_h | char(20) | √ |
| 29 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 30 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 31 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 32 | pk_company_r | pk_company_r | pk_company_r | varchar2(20) |  |  | '~' |
| 33 | pk_custbankacc | pk_custbankacc | pk_custbankacc | varchar2(20) |  |  | '~' |
| 34 | pk_financeorg_r | pk_financeorg_r | pk_financeorg_r | varchar2(20) |  |  | '~' |
| 35 | pk_financeorg_r_v | pk_financeorg_r_v | pk_financeorg_r_v | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 40 | remark | remark | remark | varchar2(300) |
| 41 | rowno | rowno | rowno | varchar2(50) |
| 42 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 43 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 44 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 45 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 46 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 47 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 48 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 49 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 50 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 51 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |