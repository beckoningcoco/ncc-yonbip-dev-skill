# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10702.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servprice_b | pk_servprice_b | pk_servprice_b | varchar2(20) | √ |
| 2 | meomo | meomo | meomo | varchar2(300) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_servprice | pk_servprice | pk_servprice | char(20) | √ |
| 7 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |
| 8 | price | price | price | number(28, 8) |
| 9 | rowno | rowno | rowno | varchar2(20) |
| 10 | taxprice | taxprice | taxprice | number(28, 8) |
| 11 | taxrate | taxrate | taxrate | number(28, 8) |
| 12 | taxtype | taxtype | taxtype | number(38, 0) |  |  | 1 |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |