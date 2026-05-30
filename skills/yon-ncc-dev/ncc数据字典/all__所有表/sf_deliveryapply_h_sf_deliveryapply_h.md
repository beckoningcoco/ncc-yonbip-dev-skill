# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryapply_h | pk_deliveryapply_h | pk_deliveryapply_h | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billsignature | billsignature | billsignature | varchar2(20) |
| 5 | billstatus | billstatus | billstatus | number(38, 0) |
| 6 | busitype | busitype | busitype | number(38, 0) |
| 7 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 8 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 9 | dbilldate | dbilldate | dbilldate | char(19) |
| 10 | dbilltime | dbilltime | dbilltime | char(19) |
| 11 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 12 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 13 | isreturned | isreturned | isreturned | char(1) |
| 14 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 15 | memo | memo | memo | varchar2(181) |
| 16 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 17 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 18 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_gacherorg_v | pk_gacherorg_v | pk_gacherorg_v | varchar2(20) |  |  | '~' |
| 21 | pk_gatherorg | pk_gatherorg | pk_gatherorg | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | retbillreason | retbillreason | retbillreason | varchar2(200) |
| 26 | returndate | returndate | returndate | char(19) |
| 27 | returntime | returntime | returntime | char(19) |
| 28 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 29 | stroke | stroke | stroke | number(38, 0) |
| 30 | submitdate | submitdate | submitdate | char(19) |
| 31 | submittime | submittime | submittime | char(19) |
| 32 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 33 | totalamount | totalamount | totalamount | number(28, 8) |
| 34 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 35 | vbillno | vbillno | vbillno | varchar2(50) |
| 36 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 37 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 38 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 39 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 40 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 41 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 42 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 43 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 44 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 45 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 46 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |