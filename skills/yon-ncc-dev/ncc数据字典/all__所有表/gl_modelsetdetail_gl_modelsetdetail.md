# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modelsetdetail | pk_modelsetdetail | pk_modelsetdetail | char(20) | √ |
| 2 | amount | amount | amount | number(20, 4) |
| 3 | assid | assid | assid | char(20) |
| 4 | bankaccount | bankaccount | bankaccount | varchar2(40) |
| 5 | billtype | billtype | billtype | varchar2(60) |
| 6 | checkdate | checkdate | checkdate | char(10) |
| 7 | checkno | checkno | checkno | varchar2(30) |
| 8 | checkstyle | checkstyle | checkstyle | varchar2(20) |
| 9 | contrastflag | contrastflag | contrastflag | number(38, 0) |  |  | 0 |
| 10 | detailindex | detailindex | detailindex | number(38, 0) |
| 11 | direct | direct | direct | char(1) |
| 12 | excrate1 | excrate1 | excrate1 | number(15, 8) |
| 13 | excrate2 | excrate2 | excrate2 | number(15, 8) |
| 14 | explanation | explanation | explanation | varchar2(200) |
| 15 | fracamount | fracamount | fracamount | number(20, 4) |
| 16 | freefield1 | freefield1 | freefield1 | char(20) |
| 17 | freefield2 | freefield2 | freefield2 | char(20) |
| 18 | freefield3 | freefield3 | freefield3 | char(20) |
| 19 | freefield4 | freefield4 | freefield4 | char(20) |
| 20 | freefield5 | freefield5 | freefield5 | char(20) |
| 21 | isbalancedetail | isbalancedetail | isbalancedetail | char(1) |
| 22 | isself | isself | isself | char(1) |
| 23 | localamount | localamount | localamount | number(20, 4) |
| 24 | modifyflag | modifyflag | modifyflag | char(20) |
| 25 | otherfreevalue | otherfreevalue | otherfreevalue | char(20) |
| 26 | otherreconsubj | otherreconsubj | otherreconsubj | char(20) |
| 27 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 28 | pk_corp | pk_corp | pk_corp | char(4) |
| 29 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 30 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 31 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 32 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 33 | pk_innercorp | pk_innercorp | pk_innercorp | varchar2(20) |
| 34 | pk_innersob | pk_innersob | pk_innersob | varchar2(20) |
| 35 | pk_modelsetvoucher | pk_modelsetvoucher | pk_modelsetvoucher | char(20) | √ |
| 36 | pk_reconciledetail | pk_reconciledetail | pk_reconciledetail | char(20) |
| 37 | pk_sob | pk_sob | pk_sob | char(20) |
| 38 | price | price | price | number(20, 8) |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |