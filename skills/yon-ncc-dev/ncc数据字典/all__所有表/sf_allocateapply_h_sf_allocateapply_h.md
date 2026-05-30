# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocateapply_h | pk_allocateapply_h | pk_allocateapply_h | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | agreeglctotal | agreeglctotal | agreeglctotal | number(28, 8) |
| 4 | agreegllctotal | agreegllctotal | agreegllctotal | number(28, 8) |
| 5 | agreeolctotal | agreeolctotal | agreeolctotal | number(28, 8) |
| 6 | agreetotal | agreetotal | agreetotal | number(28, 8) |
| 7 | applydate | applydate | applydate | char(19) |
| 8 | applyglctotal | applyglctotal | applyglctotal | number(28, 8) |
| 9 | applygllctotal | applygllctotal | applygllctotal | number(28, 8) |
| 10 | applyolctotal | applyolctotal | applyolctotal | number(28, 8) |
| 11 | applytime | applytime | applytime | char(19) |
| 12 | applytotal | applytotal | applytotal | number(28, 8) |
| 13 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 14 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 15 | billsignature | billsignature | billsignature | varchar2(20) |
| 16 | billstatus | billstatus | billstatus | number(38, 0) |
| 17 | busitype | busitype | busitype | varchar2(50) |
| 18 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 19 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 20 | isfinancereturned | isfinancereturned | isfinancereturned | char(1) |
| 21 | memo | memo | memo | varchar2(300) |
| 22 | payglctotal | payglctotal | payglctotal | number(28, 8) |
| 23 | paygllctotal | paygllctotal | paygllctotal | number(28, 8) |
| 24 | payolctotal | payolctotal | payolctotal | number(28, 8) |
| 25 | paytotal | paytotal | paytotal | number(28, 8) |
| 26 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 27 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | pk_payorg | pk_payorg | pk_payorg | varchar2(20) |  |  | '~' |
| 33 | pk_payorg_v | pk_payorg_v | pk_payorg_v | varchar2(20) |  |  | '~' |
| 34 | retbillreason | retbillreason | retbillreason | varchar2(200) |
| 35 | returndate | returndate | returndate | char(19) |
| 36 | returntime | returntime | returntime | char(19) |
| 37 | returnuser | returnuser | returnuser | varchar2(20) |  |  | '~' |
| 38 | stroke | stroke | stroke | number(38, 0) |
| 39 | submitdate | submitdate | submitdate | char(19) |
| 40 | submittime | submittime | submittime | char(19) |
| 41 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
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