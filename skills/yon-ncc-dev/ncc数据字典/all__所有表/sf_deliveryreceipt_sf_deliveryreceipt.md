# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryreceipt | pk_deliveryreceipt | pk_deliveryreceipt | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 5 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 6 | bankrelatcode | bankrelatcode | bankrelatcode | varchar2(50) |
| 7 | busitype | busitype | busitype | number(38, 0) |
| 8 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 9 | glcamount | glcamount | glcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(15, 8) |
| 11 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 13 | isreverse | isreverse | isreverse | char(1) |
| 14 | istally | istally | istally | char(1) |
| 15 | isunitevoucher | isunitevoucher | isunitevoucher | char(1) |
| 16 | isvoucher | isvoucher | isvoucher | char(1) |
| 17 | olcamount | olcamount | olcamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | paydate | paydate | paydate | char(19) |
| 20 | paytype | paytype | paytype | varchar2(50) |
| 21 | pk_accid_p | pk_accid_p | pk_accid_p | varchar2(20) |  |  | '~' |
| 22 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 23 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 24 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 25 | pk_bankdoc_p | pk_bankdoc_p | pk_bankdoc_p | varchar2(20) |  |  | '~' |
| 26 | pk_bankdoc_r | pk_bankdoc_r | pk_bankdoc_r | varchar2(20) |  |  | '~' |
| 27 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_deliveryapply_b | pk_deliveryapply_b | pk_deliveryapply_b | varchar2(20) |  |  | '~' |
| 31 | pk_deliveryapply_h | pk_deliveryapply_h | pk_deliveryapply_h | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_p | pk_org_p | pk_org_p | varchar2(20) |  |  | '~' |
| 35 | pk_org_p_v | pk_org_p_v | pk_org_p_v | varchar2(20) |  |  | '~' |
| 36 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 37 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 40 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 41 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |  |  | '~' |
| 42 | pk_srcbill_b | pk_srcbill_b | pk_srcbill_b | varchar2(50) |  |  | '~' |
| 43 | recmodule | recmodule | recmodule | varchar2(50) |
| 44 | remark | remark | remark | varchar2(181) |
| 45 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 46 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 47 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 48 | saga_status | saga_status | saga_status | number(38, 0) |
| 49 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 50 | srcbilltype | srcbilltype | srcbilltype | varchar2(20) |  |  | '~' |
| 51 | tallydate | tallydate | tallydate | char(19) |
| 52 | tallyoperator | tallyoperator | tallyoperator | varchar2(20) |  |  | '~' |
| 53 | tallytime | tallytime | tallytime | char(19) |
| 54 | vbillno | vbillno | vbillno | varchar2(50) |
| 55 | voucherdate | voucherdate | voucherdate | char(19) |
| 56 | voucheroperator | voucheroperator | voucheroperator | varchar2(20) |  |  | '~' |
| 57 | vouchertime | vouchertime | vouchertime | char(19) |
| 58 | vueserdef1 | vueserdef1 | vueserdef1 | varchar2(101) |
| 59 | vueserdef2 | vueserdef2 | vueserdef2 | varchar2(101) |
| 60 | vueserdef3 | vueserdef3 | vueserdef3 | varchar2(101) |
| 61 | vueserdef4 | vueserdef4 | vueserdef4 | varchar2(101) |
| 62 | vueserdef5 | vueserdef5 | vueserdef5 | varchar2(101) |
| 63 | vueserdef6 | vueserdef6 | vueserdef6 | varchar2(101) |
| 64 | vueserdef7 | vueserdef7 | vueserdef7 | varchar2(101) |
| 65 | vueserdef8 | vueserdef8 | vueserdef8 | varchar2(101) |
| 66 | vueserdef9 | vueserdef9 | vueserdef9 | varchar2(101) |
| 67 | vueserdef10 | vueserdef10 | vueserdef10 | varchar2(101) |
| 68 | creationtime | creationtime | creationtime | char(19) |
| 69 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 70 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 71 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 72 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 73 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |