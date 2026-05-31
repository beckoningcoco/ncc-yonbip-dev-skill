# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amordetail | pk_amordetail | pk_amordetail | char(20) | √ |
| 2 | amountformula | amountformula | amountformula | varchar2(1000) |
| 3 | ass | ass | ass | varchar2(400) |  |  | '~' |
| 4 | assid | assid | assid | varchar2(20) |
| 5 | detailorder | detailorder | detailorder | number(38, 0) |
| 6 | note | note | note | varchar2(150) |
| 7 | orientation | orientation | orientation | varchar2(50) |
| 8 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 9 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 10 | pk_amortize | pk_amortize | pk_amortize | char(20) | √ |
| 11 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | quantityformula | quantityformula | quantityformula | varchar2(1000) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |