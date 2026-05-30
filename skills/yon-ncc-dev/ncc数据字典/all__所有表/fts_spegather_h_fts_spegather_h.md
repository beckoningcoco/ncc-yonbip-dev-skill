# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spegather_h | pk_spegather_h | pk_spegather_h | char(20) | √ |
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
| 18 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 19 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 20 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 21 | ismakevoucher | ismakevoucher | ismakevoucher | char(1) |
| 22 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 23 | memo | memo | memo | varchar2(300) |
| 24 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 25 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 27 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_fundplanitem | pk_fundplanitem | pk_fundplanitem | varchar2(20) |  |  | '~' |
| 30 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | varchar2(20) |  |  | '~' |
| 35 | recmodul | recmodul | recmodul | varchar2(21) |
| 36 | retbillreason | retbillreason | retbillreason | varchar2(300) |
| 37 | retbillreason2 | retbillreason2 | retbillreason2 | varchar2(300) |
| 38 | retbillreason3 | retbillreason3 | retbillreason3 | varchar2(300) |
| 39 | retbillreason4 | retbillreason4 | retbillreason4 | varchar2(300) |
| 40 | retbillreason5 | retbillreason5 | retbillreason5 | varchar2(300) |
| 41 | retbillreason6 | retbillreason6 | retbillreason6 | varchar2(300) |
| 42 | returndate | returndate | returndate | char(19) |
| 43 | returntime | returntime | returntime | char(19) |
| 44 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 45 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 46 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 47 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 48 | saga_status | saga_status | saga_status | number(38, 0) |
| 49 | srccmpbillcode | srccmpbillcode | srccmpbillcode | varchar2(30) |
| 50 | srccmpbilltype | srccmpbilltype | srccmpbilltype | varchar2(21) |
| 51 | srccmpbilltypeid | srccmpbilltypeid | srccmpbilltypeid | varchar2(20) |  |  | '~' |
| 52 | srccmpbusitype | srccmpbusitype | srccmpbusitype | varchar2(21) |
| 53 | srccmpbusitypeid | srccmpbusitypeid | srccmpbusitypeid | varchar2(20) |  |  | '~' |
| 54 | stroke | stroke | stroke | number(38, 0) |
| 55 | submitdate | submitdate | submitdate | char(19) |
| 56 | submittime | submittime | submittime | char(19) |
| 57 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 58 | syssubmituser | syssubmituser | syssubmituser | varchar2(20) |  |  | '~' |
| 59 | totalamount | totalamount | totalamount | number(28, 8) |
| 60 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 61 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 62 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 63 | vbillno | vbillno | vbillno | varchar2(50) |
| 64 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 65 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 66 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 67 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 68 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 69 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 70 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 71 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 72 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 73 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 74 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 75 | creationtime | creationtime | creationtime | char(19) |
| 76 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 80 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |