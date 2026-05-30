# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashpay_h | pk_cashpay_h | pk_cashpay_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billstatus | billstatus | billstatus | number(38, 0) |
| 6 | businessno | businessno | businessno | varchar2(50) |
| 7 | centermakedate | centermakedate | centermakedate | char(19) |
| 8 | centermaketime | centermaketime | centermaketime | char(19) |
| 9 | centermakeuser | centermakeuser | centermakeuser | varchar2(20) |  |  | '~' |
| 10 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 11 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | dbilltime | dbilltime | dbilltime | char(19) |
| 14 | decidedate | decidedate | decidedate | char(19) |
| 15 | decidetime | decidetime | decidetime | char(19) |
| 16 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 17 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 18 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 19 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 20 | ismakevoucher | ismakevoucher | ismakevoucher | char(1) |
| 21 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 22 | memo | memo | memo | varchar2(200) |
| 23 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 24 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 25 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_pfbusiflow | pk_pfbusiflow | pk_pfbusiflow | varchar2(20) |
| 31 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | varchar2(20) |  |  | '~' |
| 32 | recmodul | recmodul | recmodul | varchar2(21) |
| 33 | retbillreason | retbillreason | retbillreason | varchar2(300) |
| 34 | retbillreason2 | retbillreason2 | retbillreason2 | varchar2(300) |
| 35 | retbillreason3 | retbillreason3 | retbillreason3 | varchar2(300) |
| 36 | retbillreason4 | retbillreason4 | retbillreason4 | varchar2(300) |
| 37 | retbillreason5 | retbillreason5 | retbillreason5 | varchar2(300) |
| 38 | retbillreason6 | retbillreason6 | retbillreason6 | varchar2(300) |
| 39 | returndate | returndate | returndate | char(19) |
| 40 | returntime | returntime | returntime | char(19) |
| 41 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 42 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 43 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 44 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 45 | saga_status | saga_status | saga_status | number(38, 0) |
| 46 | srccmpbillcode | srccmpbillcode | srccmpbillcode | varchar2(30) |
| 47 | srccmpbilltype | srccmpbilltype | srccmpbilltype | varchar2(21) |
| 48 | srccmpbilltypeid | srccmpbilltypeid | srccmpbilltypeid | varchar2(20) |  |  | '~' |
| 49 | srccmpbusitype | srccmpbusitype | srccmpbusitype | varchar2(21) |
| 50 | srccmpbusitypeid | srccmpbusitypeid | srccmpbusitypeid | varchar2(20) |  |  | '~' |
| 51 | stroke | stroke | stroke | number(38, 0) |
| 52 | submitdate | submitdate | submitdate | char(19) |
| 53 | submittime | submittime | submittime | char(19) |
| 54 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 55 | totalamount | totalamount | totalamount | number(28, 8) |
| 56 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 57 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 58 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 59 | vbillno | vbillno | vbillno | varchar2(50) |
| 60 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 61 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 62 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 63 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 64 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 65 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 66 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 67 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 68 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 69 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 70 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 71 | creationtime | creationtime | creationtime | char(19) |
| 72 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 73 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 74 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 75 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 76 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |