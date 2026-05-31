# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashgather_h | pk_cashgather_h | pk_cashgather_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billstatus | billstatus | billstatus | number(38, 0) |
| 6 | bookaccdate | bookaccdate | bookaccdate | char(19) |
| 7 | businessno | businessno | businessno | varchar2(50) |
| 8 | centermakedate | centermakedate | centermakedate | char(19) |
| 9 | centermaketime | centermaketime | centermaketime | char(19) |
| 10 | centermakeuser | centermakeuser | centermakeuser | varchar2(20) |  |  | '~' |
| 11 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 12 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 13 | dbilldate | dbilldate | dbilldate | char(19) |
| 14 | dbilltime | dbilltime | dbilltime | char(19) |
| 15 | decidedate | decidedate | decidedate | char(19) |
| 16 | decidetime | decidetime | decidetime | char(19) |
| 17 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 18 | gatherdate | gatherdate | gatherdate | char(19) |
| 19 | gathertime | gathertime | gathertime | char(19) |
| 20 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 21 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 22 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 23 | ismakevoucher | ismakevoucher | ismakevoucher | char(1) |
| 24 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 25 | memo | memo | memo | varchar2(300) |
| 26 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 27 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_pfbusiflow | pk_pfbusiflow | pk_pfbusiflow | varchar2(20) |
| 34 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 35 | recmodul | recmodul | recmodul | varchar2(21) |
| 36 | retbillreason | retbillreason | retbillreason | varchar2(272) |
| 37 | returndate | returndate | returndate | char(19) |
| 38 | returntime | returntime | returntime | char(19) |
| 39 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 40 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 41 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 42 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 43 | saga_status | saga_status | saga_status | number(38, 0) |
| 44 | srcbillcode | srcbillcode | srcbillcode | varchar2(30) |
| 45 | srcbilltype | srcbilltype | srcbilltype | varchar2(21) |
| 46 | srcbilltypeid | srcbilltypeid | srcbilltypeid | varchar2(20) |  |  | '~' |
| 47 | srctradetype | srctradetype | srctradetype | varchar2(21) |
| 48 | srctradetypeid | srctradetypeid | srctradetypeid | varchar2(20) |  |  | '~' |
| 49 | stroke | stroke | stroke | number(38, 0) |
| 50 | submitdate | submitdate | submitdate | char(19) |
| 51 | submittime | submittime | submittime | char(19) |
| 52 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 53 | totalamount | totalamount | totalamount | number(28, 8) |
| 54 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 55 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 56 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 57 | vbillno | vbillno | vbillno | varchar2(50) |
| 58 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 59 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 60 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 61 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 62 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 63 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 64 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 65 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 66 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 67 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 68 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |