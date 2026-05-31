# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransferapply_h | pk_fundtransferapply_h | pk_fundtransferapply_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | applydate | applydate | applydate | char(19) |
| 4 | applytime | applytime | applytime | char(19) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billsignature | billsignature | billsignature | varchar2(20) |
| 8 | billstatus | billstatus | billstatus | number(38, 0) |
| 9 | busidate | busidate | busidate | char(19) |
| 10 | businessno | businessno | businessno | varchar2(50) |
| 11 | busitype | busitype | busitype | number(38, 0) |
| 12 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 13 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 14 | glcsuccesstotal | glcsuccesstotal | glcsuccesstotal | number(28, 8) |
| 15 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 16 | gllcsuccesstotal | gllcsuccesstotal | gllcsuccesstotal | number(28, 8) |
| 17 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 18 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 19 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | olcsuccesstotal | olcsuccesstotal | olcsuccesstotal | number(28, 8) |
| 22 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 23 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 24 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_t | pk_org_t | pk_org_t | varchar2(20) |  |  | '~' |
| 29 | pk_org_t_v | pk_org_t_v | pk_org_t_v | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | retbillreason | retbillreason | retbillreason | varchar2(200) |
| 32 | returndate | returndate | returndate | char(19) |
| 33 | returntime | returntime | returntime | char(19) |
| 34 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 35 | stroke | stroke | stroke | number(38, 0) |
| 36 | submitdate | submitdate | submitdate | char(19) |
| 37 | submittime | submittime | submittime | char(19) |
| 38 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 39 | successtotal | successtotal | successtotal | number(28, 8) |
| 40 | totalamount | totalamount | totalamount | number(28, 8) |
| 41 | transfertype | transfertype | transfertype | number(38, 0) |
| 42 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 43 | vbillno | vbillno | vbillno | varchar2(50) |
| 44 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 45 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 46 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 47 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 48 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 49 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 50 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 51 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 52 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 53 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 54 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |