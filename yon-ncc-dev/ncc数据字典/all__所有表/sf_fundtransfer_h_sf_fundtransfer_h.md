# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransfer_h | pk_fundtransfer_h | pk_fundtransfer_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvesignature | approvesignature | approvesignature | varchar2(20) |  |  | '~' |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billsignature | billsignature | billsignature | varchar2(20) |  |  | '~' |
| 7 | billstatus | billstatus | billstatus | number(38, 0) |
| 8 | businessno | businessno | businessno | varchar2(50) |
| 9 | busitype | busitype | busitype | number(38, 0) |
| 10 | centermakedate | centermakedate | centermakedate | char(19) |
| 11 | centermaketime | centermaketime | centermaketime | char(19) |
| 12 | centermakeuser | centermakeuser | centermakeuser | varchar2(20) |  |  | '~' |
| 13 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 14 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 15 | dbilldate | dbilldate | dbilldate | char(19) |
| 16 | dbilltime | dbilltime | dbilltime | char(19) |
| 17 | decidedate | decidedate | decidedate | char(19) |
| 18 | decidesignature | decidesignature | decidesignature | varchar2(50) |
| 19 | decidetime | decidetime | decidetime | char(19) |
| 20 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 21 | glcsuccesstotal | glcsuccesstotal | glcsuccesstotal | number(28, 8) |
| 22 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 23 | gllcsuccesstotal | gllcsuccesstotal | gllcsuccesstotal | number(28, 8) |
| 24 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 25 | ismakevoucher | ismakevoucher | ismakevoucher | char(1) |
| 26 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 27 | memo | memo | memo | varchar2(200) |
| 28 | modifiedsignature | modifiedsignature | modifiedsignature | varchar2(20) |  |  | '~' |
| 29 | olcsuccesstotal | olcsuccesstotal | olcsuccesstotal | number(28, 8) |
| 30 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 31 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 32 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 33 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 38 | recmodul | recmodul | recmodul | varchar2(50) |
| 39 | retbillreason | retbillreason | retbillreason | varchar2(200) |
| 40 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 41 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 42 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 43 | saga_status | saga_status | saga_status | number(38, 0) |
| 44 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 45 | srcbilltype | srcbilltype | srcbilltype | varchar2(20) |  |  | '~' |
| 46 | stroke | stroke | stroke | number(38, 0) |
| 47 | submitdate | submitdate | submitdate | char(19) |
| 48 | submittime | submittime | submittime | char(19) |
| 49 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 50 | successtotal | successtotal | successtotal | number(28, 8) |
| 51 | totalamount | totalamount | totalamount | number(28, 8) |
| 52 | transfertype | transfertype | transfertype | number(38, 0) |
| 53 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 54 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 55 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 56 | vbillno | vbillno | vbillno | varchar2(50) |
| 57 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 58 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 59 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 60 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 61 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 62 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 63 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 64 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 65 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 66 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 67 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 68 | creationtime | creationtime | creationtime | char(19) |
| 69 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 70 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 71 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 72 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 73 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |