# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11484.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocate_h | pk_allocate_h | pk_allocate_h | char(20) | √ |
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
| 26 | ismendinfofull | ismendinfofull | ismendinfofull | char(1) |
| 27 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 28 | memo | memo | memo | varchar2(200) |
| 29 | modifiedsignature | modifiedsignature | modifiedsignature | varchar2(20) |  |  | '~' |
| 30 | olcsuccesstotal | olcsuccesstotal | olcsuccesstotal | number(28, 8) |
| 31 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 32 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 33 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 34 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 40 | recmodul | recmodul | recmodul | varchar2(50) |
| 41 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 42 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 43 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 44 | saga_status | saga_status | saga_status | number(38, 0) |
| 45 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 46 | srcbilltype | srcbilltype | srcbilltype | varchar2(20) |  |  | '~' |
| 47 | srcbusitype | srcbusitype | srcbusitype | number(38, 0) |
| 48 | stroke | stroke | stroke | number(38, 0) |
| 49 | submitdate | submitdate | submitdate | char(19) |
| 50 | submittime | submittime | submittime | char(19) |
| 51 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 52 | successtotal | successtotal | successtotal | number(28, 8) |
| 53 | totalamount | totalamount | totalamount | number(28, 8) |
| 54 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 55 | vbillno | vbillno | vbillno | varchar2(50) |
| 56 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 57 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 58 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 59 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 60 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 61 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 62 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 63 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 64 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 65 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 66 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 67 | creationtime | creationtime | creationtime | char(19) |
| 68 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 69 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 70 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 71 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 72 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |