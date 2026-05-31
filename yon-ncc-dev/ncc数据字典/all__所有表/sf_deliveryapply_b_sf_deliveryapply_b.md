# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryapply_b | pk_deliveryapply_b | pk_deliveryapply_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 4 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 5 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 6 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 7 | dmakevoucherdate | dmakevoucherdate | dmakevoucherdate | char(19) |
| 8 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 9 | glcamount | glcamount | glcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(28, 8) |
| 11 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 13 | isnetpay | isnetpay | isnetpay | char(1) |
| 14 | isreceipttally | isreceipttally | isreceipttally | char(1) |
| 15 | memo | memo | memo | varchar2(181) |
| 16 | olcamount | olcamount | olcamount | number(28, 8) |
| 17 | olcrate | olcrate | olcrate | number(28, 8) |
| 18 | pay_type | pay_type | pay_type | varchar2(50) |
| 19 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 20 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 21 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 22 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 23 | pk_deliveryapply_h | pk_deliveryapply_h | pk_deliveryapply_h | char(20) | √ |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 28 | recordstatus | recordstatus | recordstatus | number(38, 0) |
| 29 | rowno | rowno | rowno | varchar2(50) |
| 30 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 31 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 32 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 33 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 34 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 35 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 36 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 37 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 38 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 39 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |