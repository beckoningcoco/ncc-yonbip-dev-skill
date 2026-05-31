# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8183.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_booklog | pk_booklog | pk_booklog | char(20) | √ |
| 2 | billglcmoney | billglcmoney | billglcmoney | number(28, 8) |
| 3 | billglcrate | billglcrate | billglcrate | number(15, 8) |
| 4 | billgllcmoney | billgllcmoney | billgllcmoney | number(28, 8) |
| 5 | billgllcrate | billgllcrate | billgllcrate | number(15, 8) |
| 6 | billmoney | billmoney | billmoney | number(28, 8) |
| 7 | billolcmoney | billolcmoney | billolcmoney | number(28, 8) |
| 8 | billolcrate | billolcrate | billolcrate | number(15, 8) |
| 9 | bookactiontype | bookactiontype | bookactiontype | varchar2(50) |
| 10 | bookdate | bookdate | bookdate | char(19) |
| 11 | booksystem | booksystem | booksystem | varchar2(50) |
| 12 | bookuser | bookuser | bookuser | varchar2(20) |  |  | '~' |
| 13 | fbmbillno | fbmbillno | fbmbillno | varchar2(100) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |