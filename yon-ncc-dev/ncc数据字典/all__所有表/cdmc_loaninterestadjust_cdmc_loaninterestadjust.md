# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7490.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loaninterestadjust | pk_loaninterestadjust | pk_loaninterestadjust | char(20) | √ |
| 2 | adjustdate | adjustdate | adjustdate | char(19) |
| 3 | adjustmount | adjustmount | adjustmount | number(28, 8) |
| 4 | afterpaymount | afterpaymount | afterpaymount | number(28, 8) |
| 5 | approvedate | approvedate | approvedate | char(19) |
| 6 | approvenote | approvenote | approvenote | varchar2(50) |
| 7 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 8 | bereturned | bereturned | bereturned | char(1) |  |  | 'N' |
| 9 | billid | billid | billid | varchar2(50) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billno | billno | billno | varchar2(50) |
| 12 | billtype | billtype | billtype | varchar2(50) |
| 13 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 14 | busistatus | busistatus | busistatus | number(38, 0) |
| 15 | commiter | commiter | commiter | varchar2(20) |  |  | '~' |
| 16 | committime | committime | committime | char(19) |
| 17 | contractno | contractno | contractno | varchar2(200) |
| 18 | coordinationstatus | coordinationstatus | coordinationstatus | char(1) |  |  | 'N' |
| 19 | datasources | datasources | datasources | varchar2(50) |
| 20 | emendenum | emendenum | emendenum | number(38, 0) |
| 21 | expirydate | expirydate | expirydate | varchar2(20) |  |  | '~' |
| 22 | financepayno | financepayno | financepayno | varchar2(20) |  |  | '~' |
| 23 | financepaytype | financepaytype | financepaytype | varchar2(50) |
| 24 | financorganization | financorganization | financorganization | varchar2(20) |  |  | '~' |
| 25 | fin_variety | fin_variety | fin_variety | varchar2(20) |  |  | '~' |
| 26 | glcadamount | glcadamount | glcadamount | number(28, 8) |
| 27 | glcaftermount | glcaftermount | glcaftermount | number(28, 8) |
| 28 | glcmount | glcmount | glcmount | number(28, 8) |
| 29 | glcrate | glcrate | glcrate | number(28, 8) |
| 30 | glcregistmny | glcregistmny | glcregistmny | number(28, 8) |
| 31 | glcsysamount | glcsysamount | glcsysamount | number(28, 8) |
| 32 | gllcadamount | gllcadamount | gllcadamount | number(28, 8) |
| 33 | gllcaftermount | gllcaftermount | gllcaftermount | number(28, 8) |
| 34 | gllcmount | gllcmount | gllcmount | number(28, 8) |
| 35 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 36 | gllcsysamount | gllcsysamount | gllcsysamount | number(28, 8) |
| 37 | gllregistmny | gllregistmny | gllregistmny | number(28, 8) |
| 38 | justmount | justmount | justmount | number(28, 8) |
| 39 | justmountmny | justmountmny | justmountmny | number(28, 8) |
| 40 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 41 | loanunit | loanunit | loanunit | varchar2(20) |
| 42 | maketime | maketime | maketime | char(19) |
| 43 | olcadamount | olcadamount | olcadamount | number(28, 8) |
| 44 | olcaftermount | olcaftermount | olcaftermount | number(28, 8) |
| 45 | olcmount | olcmount | olcmount | number(28, 8) |
| 46 | olcrate | olcrate | olcrate | number(28, 8) |
| 47 | olcregistmny | olcregistmny | olcregistmny | number(28, 8) |
| 48 | olcsysamount | olcsysamount | olcsysamount | number(28, 8) |
| 49 | paymount | paymount | paymount | number(28, 8) |
| 50 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 51 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 52 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 53 | pk_coordination | pk_coordination | pk_coordination | varchar2(50) |
| 54 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 55 | pk_financepay | pk_financepay | pk_financepay | char(20) |
| 56 | pk_financorg | pk_financorg | pk_financorg | varchar2(20) |
| 57 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 58 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 59 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 60 | remark | remark | remark | varchar2(500) |
| 61 | repayinteresttype | repayinteresttype | repayinteresttype | varchar2(200) |
| 62 | repaymentmodeid | repaymentmodeid | repaymentmodeid | varchar2(20) |  |  | '~' |
| 63 | sysinteramount | sysinteramount | sysinteramount | number(28, 8) |
| 64 | tradetypeid | tradetypeid | tradetypeid | number(38, 0) |
| 65 | transtype | transtype | transtype | varchar2(50) |
| 66 | transtypepk | transtypepk | transtypepk | char(20) |
| 67 | vbillno | vbillno | vbillno | varchar2(50) |
| 68 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 69 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 70 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 71 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 72 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 73 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 74 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 75 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 76 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 77 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 78 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 79 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 80 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 81 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 82 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 83 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 84 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 85 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 86 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 87 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 88 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 89 | creationtime | creationtime | creationtime | char(19) |
| 90 | creator | creator | creator | varchar2(36) |  |  | '~' |
| 91 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 92 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 93 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 94 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |