# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | receiptid | receiptid | receiptid | char(20) | √ |
| 2 | caption | caption | caption | varchar2(400) |
| 3 | createtime | createtime | createtime | varchar2(50) |
| 4 | detail | detail | detail | varchar2(4000) |
| 5 | procerror | procerror | procerror | char(1) |
| 6 | procerrortype | procerrortype | procerrortype | varchar2(200) |
| 7 | procresult | procresult | procresult | number(38, 0) |
| 8 | proctime | proctime | proctime | char(19) |
| 9 | receiptcode | receiptcode | receiptcode | varchar2(50) |
| 10 | receiptlist | receiptlist | receiptlist | char(20) | √ |
| 11 | receiptprocstatus | receiptprocstatus | receiptprocstatus | number(38, 0) |
| 12 | replytime | replytime | replytime | char(19) |
| 13 | systemreply | systemreply | systemreply | char(1) |
| 14 | transpackid | transpackid | transpackid | varchar2(50) |
| 15 | transpackname | transpackname | transpackname | varchar2(500) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |