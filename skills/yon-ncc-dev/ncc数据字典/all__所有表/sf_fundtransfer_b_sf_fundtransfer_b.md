# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransfer_b | pk_fundtransfer_b | pk_fundtransfer_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 4 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 5 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 6 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 7 | bankrelatcode | bankrelatcode | bankrelatcode | varchar2(50) |
| 8 | dealway | dealway | dealway | number(38, 0) |
| 9 | disusedate | disusedate | disusedate | char(19) |
| 10 | disuser | disuser | disuser | varchar2(20) |  |  | '~' |
| 11 | disusetime | disusetime | disusetime | char(19) |
| 12 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 13 | glcamount | glcamount | glcamount | number(28, 8) |
| 14 | glcrate | glcrate | glcrate | number(15, 8) |
| 15 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 17 | isnetbankfull | isnetbankfull | isnetbankfull | char(1) |
| 18 | isnetpay | isnetpay | isnetpay | char(1) |
| 19 | issamebank | issamebank | issamebank | varchar2(50) |
| 20 | issamecity | issamecity | issamecity | varchar2(50) |
| 21 | netacceptinfo | netacceptinfo | netacceptinfo | varchar2(400) |
| 22 | netpayinfo | netpayinfo | netpayinfo | varchar2(400) |
| 23 | olcamount | olcamount | olcamount | number(28, 8) |
| 24 | olcrate | olcrate | olcrate | number(15, 8) |
| 25 | paydate | paydate | paydate | char(19) |
| 26 | paysignature | paysignature | paysignature | varchar2(20) |  |  | '~' |
| 27 | paystatus | paystatus | paystatus | number(38, 0) |
| 28 | paytime | paytime | paytime | char(19) |
| 29 | paytype | paytype | paytype | varchar2(50) |
| 30 | payuser | payuser | payuser | varchar2(20) |  |  | '~' |
| 31 | pk_accid_p | pk_accid_p | pk_accid_p | varchar2(20) |  |  | '~' |
| 32 | pk_accid_r | pk_accid_r | pk_accid_r | varchar2(20) |  |  | '~' |
| 33 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 34 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 35 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 36 | pk_fundtransfer_h | pk_fundtransfer_h | pk_fundtransfer_h | char(20) | √ |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_p | pk_org_p | pk_org_p | varchar2(20) |  |  | '~' |
| 40 | pk_org_p_v | pk_org_p_v | pk_org_p_v | varchar2(20) |  |  | '~' |
| 41 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 42 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 43 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 44 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 45 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 46 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(50) |  |  | '~' |
| 47 | recordstatus | recordstatus | recordstatus | number(38, 0) |
| 48 | remark | remark | remark | varchar2(400) |
| 49 | rowno | rowno | rowno | varchar2(50) |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |
| 54 | sendnettime | sendnettime | sendnettime | char(19) |
| 55 | tallydate | tallydate | tallydate | char(19) |
| 56 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 57 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 58 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 59 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 60 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 61 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 62 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 63 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 64 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 65 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |