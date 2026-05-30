# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interestadj | pk_interestadj | pk_interestadj | char(20) | √ |
| 2 | adjustafterinterest | adjustafterinterest | adjustafterinterest | number(28, 8) |
| 3 | adjustbeforeinterest | adjustbeforeinterest | adjustbeforeinterest | number(28, 8) |
| 4 | adjustdate | adjustdate | adjustdate | char(19) |
| 5 | adjustmoney | adjustmoney | adjustmoney | number(28, 8) |
| 6 | approvedate | approvedate | approvedate | char(19) |
| 7 | approvenote | approvenote | approvenote | varchar2(50) |
| 8 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 9 | approvestatus | approvestatus | approvestatus | varchar2(50) |
| 10 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 11 | billmaketime | billmaketime | billmaketime | char(19) |
| 12 | billtype | billtype | billtype | varchar2(50) |
| 13 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 14 | commiter | commiter | commiter | varchar2(20) |  |  | '~' |
| 15 | committime | committime | committime | char(19) |
| 16 | emendenum | emendenum | emendenum | number(38, 0) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_borrowunit | pk_borrowunit | pk_borrowunit | varchar2(20) |  |  | '~' |
| 21 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 24 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_innerloanpay | pk_innerloanpay | pk_innerloanpay | varchar2(20) |  |  | '~' |
| 27 | pk_interestlisticdmc | pk_interestlisticdmc | pk_interestlisticdmc | varchar2(20) |  |  | '~' |
| 28 | pk_loanunit | pk_loanunit | pk_loanunit | varchar2(20) |  |  | '~' |
| 29 | pk_returnmethod | pk_returnmethod | pk_returnmethod | varchar2(20) |  |  | '~' |
| 30 | rate | rate | rate | number(28, 8) |
| 31 | transtype | transtype | transtype | varchar2(50) |
| 32 | transtypepk | transtypepk | transtypepk | char(20) |
| 33 | vbillno | vbillno | vbillno | varchar2(50) |
| 34 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 35 | def1 | def1 | def1 | varchar2(101) |
| 36 | def2 | def2 | def2 | varchar2(101) |
| 37 | def3 | def3 | def3 | varchar2(101) |
| 38 | def4 | def4 | def4 | varchar2(101) |
| 39 | def5 | def5 | def5 | varchar2(101) |
| 40 | def6 | def6 | def6 | varchar2(101) |
| 41 | def7 | def7 | def7 | varchar2(101) |
| 42 | def8 | def8 | def8 | varchar2(101) |
| 43 | def9 | def9 | def9 | varchar2(101) |
| 44 | def10 | def10 | def10 | varchar2(101) |
| 45 | def11 | def11 | def11 | varchar2(101) |
| 46 | def12 | def12 | def12 | varchar2(101) |
| 47 | def13 | def13 | def13 | varchar2(101) |
| 48 | def14 | def14 | def14 | varchar2(101) |
| 49 | def15 | def15 | def15 | varchar2(101) |
| 50 | def16 | def16 | def16 | varchar2(101) |
| 51 | def17 | def17 | def17 | varchar2(101) |
| 52 | def18 | def18 | def18 | varchar2(101) |
| 53 | def19 | def19 | def19 | varchar2(101) |
| 54 | def20 | def20 | def20 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |