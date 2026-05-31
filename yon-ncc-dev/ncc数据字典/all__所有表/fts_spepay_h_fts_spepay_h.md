# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spepay_h | pk_spepay_h | pk_spepay_h | char(20) | √ |
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
| 18 | encryptkey | encryptkey | encryptkey | varchar2(1000) |
| 19 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 20 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 21 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 22 | ismakevoucher | ismakevoucher | ismakevoucher | char(1) |
| 23 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 24 | memo | memo | memo | varchar2(300) |
| 25 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 26 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 27 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 28 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_fundplanitem | pk_fundplanitem | pk_fundplanitem | varchar2(20) |  |  | '~' |
| 31 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 35 | pk_srccmpbill | pk_srccmpbill | pk_srccmpbill | char(20) |
| 36 | recmodul | recmodul | recmodul | varchar2(50) |
| 37 | retbillreason | retbillreason | retbillreason | varchar2(300) |
| 38 | retbillreason2 | retbillreason2 | retbillreason2 | varchar2(300) |
| 39 | retbillreason3 | retbillreason3 | retbillreason3 | varchar2(300) |
| 40 | retbillreason4 | retbillreason4 | retbillreason4 | varchar2(300) |
| 41 | retbillreason5 | retbillreason5 | retbillreason5 | varchar2(300) |
| 42 | retbillreason6 | retbillreason6 | retbillreason6 | varchar2(300) |
| 43 | returndate | returndate | returndate | char(19) |
| 44 | returntime | returntime | returntime | char(19) |
| 45 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |
| 50 | srccmpbillcode | srccmpbillcode | srccmpbillcode | varchar2(30) |
| 51 | srccmpbilltype | srccmpbilltype | srccmpbilltype | varchar2(21) |
| 52 | srccmpbilltypeid | srccmpbilltypeid | srccmpbilltypeid | varchar2(20) |  |  | '~' |
| 53 | srccmpbusitype | srccmpbusitype | srccmpbusitype | varchar2(21) |
| 54 | srccmpbusitypeid | srccmpbusitypeid | srccmpbusitypeid | varchar2(20) |  |  | '~' |
| 55 | stroke | stroke | stroke | number(38, 0) |
| 56 | submitdate | submitdate | submitdate | char(19) |
| 57 | submittime | submittime | submittime | char(19) |
| 58 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 59 | syssubmituser | syssubmituser | syssubmituser | varchar2(20) |  |  | '~' |
| 60 | totalamount | totalamount | totalamount | number(28, 8) |
| 61 | unitbillapprover | unitbillapprover | unitbillapprover | varchar2(20) |
| 62 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |
| 63 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 64 | vbillno | vbillno | vbillno | varchar2(50) |
| 65 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 66 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 67 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 68 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 69 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 70 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 71 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 72 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 73 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 74 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 75 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 76 | creationtime | creationtime | creationtime | char(19) |
| 77 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 78 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 79 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 80 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 81 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |