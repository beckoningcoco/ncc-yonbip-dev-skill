# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_delivery_b | pk_delivery_b | pk_delivery_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 4 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 5 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 6 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 7 | bankrelatcode | bankrelatcode | bankrelatcode | varchar2(50) |
| 8 | bookaccdate | bookaccdate | bookaccdate | char(19) |
| 9 | dealway | dealway | dealway | number(38, 0) |
| 10 | disusedate | disusedate | disusedate | char(19) |
| 11 | disuser | disuser | disuser | varchar2(20) |  |  | '~' |
| 12 | disusetime | disusetime | disusetime | char(19) |
| 13 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 14 | gatheringdate | gatheringdate | gatheringdate | char(19) |
| 15 | gatheringtime | gatheringtime | gatheringtime | char(19) |
| 16 | gatheringuser | gatheringuser | gatheringuser | varchar2(20) |  |  | '~' |
| 17 | glcamount | glcamount | glcamount | number(28, 8) |
| 18 | glcrate | glcrate | glcrate | number(28, 8) |
| 19 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 20 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 21 | isnetbankfull | isnetbankfull | isnetbankfull | char(1) |
| 22 | isnetpay | isnetpay | isnetpay | char(1) |
| 23 | issamebank | issamebank | issamebank | varchar2(50) |
| 24 | issamecity | issamecity | issamecity | varchar2(50) |
| 25 | netacceptinfo | netacceptinfo | netacceptinfo | varchar2(500) |
| 26 | netpayinfo | netpayinfo | netpayinfo | varchar2(500) |
| 27 | olcamount | olcamount | olcamount | number(28, 8) |
| 28 | olcrate | olcrate | olcrate | number(28, 8) |
| 29 | paystatus | paystatus | paystatus | number(38, 0) |
| 30 | pay_type | pay_type | pay_type | varchar2(50) |
| 31 | pk_accid | pk_accid | pk_accid | varchar2(20) |  |  | '~' |
| 32 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 33 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 34 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 35 | pk_delivery_h | pk_delivery_h | pk_delivery_h | char(20) | √ |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_p | pk_org_p | pk_org_p | varchar2(20) |  |  | '~' |
| 39 | pk_org_p_v | pk_org_p_v | pk_org_p_v | varchar2(20) |  |  | '~' |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 42 | pk_planitem_r | pk_planitem_r | pk_planitem_r | varchar2(20) |  |  | '~' |
| 43 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 44 | pk_srcbillrow | pk_srcbillrow | pk_srcbillrow | varchar2(20) |  |  | '~' |
| 45 | recordstatus | recordstatus | recordstatus | number(38, 0) |
| 46 | remark | remark | remark | varchar2(181) |
| 47 | rowno | rowno | rowno | varchar2(50) |
| 48 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 49 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 50 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 51 | saga_status | saga_status | saga_status | number(38, 0) |
| 52 | sendnettime | sendnettime | sendnettime | char(19) |
| 53 | transerial | transerial | transerial | varchar2(50) |
| 54 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 55 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 56 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 57 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 58 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 59 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 60 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 61 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 62 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 63 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |