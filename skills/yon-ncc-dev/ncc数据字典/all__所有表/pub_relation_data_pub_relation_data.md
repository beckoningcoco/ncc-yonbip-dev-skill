# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation_data | pk_relation_data | pk_relation_data | char(20) | √ |
| 2 | billno | billno | billno | varchar2(100) |
| 3 | destbillid | destbillid | destbillid | varchar2(20) |
| 4 | destbilltype | destbilltype | destbilltype | varchar2(100) |
| 5 | desttranstype | desttranstype | desttranstype | varchar2(100) |
| 6 | desttranstypepk | desttranstypepk | desttranstypepk | varchar2(100) |
| 7 | pk_org | pk_org | pk_org | varchar2(100) |
| 8 | srcbillid | srcbillid | srcbillid | varchar2(20) |
| 9 | srcbilltype | srcbilltype | srcbilltype | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |