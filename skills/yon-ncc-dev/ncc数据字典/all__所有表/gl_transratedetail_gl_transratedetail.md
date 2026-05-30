# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transratedetail | pk_transratedetail | pk_transratedetail | char(20) | √ |
| 2 | ass | ass | ass | varchar2(1000) |
| 3 | detailorder | detailorder | detailorder | number(38, 0) |
| 4 | inass | inass | inass | varchar2(1000) |
| 5 | istransfer | istransfer | istransfer | char(1) |
| 6 | orientation | orientation | orientation | char(1) |
| 7 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 8 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 9 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(50) |
| 11 | pk_org | pk_org | pk_org | char(20) |
| 12 | pk_transrate | pk_transrate | pk_transrate | char(20) |
| 13 | pk_unit | pk_unit | pk_unit | char(20) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | char(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | char(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |