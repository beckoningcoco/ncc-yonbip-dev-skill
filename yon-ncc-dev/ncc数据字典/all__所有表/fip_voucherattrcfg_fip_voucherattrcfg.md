# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8353.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherattrcfg | pk_voucherattrcfg | pk_voucherattrcfg | char(20) | √ |
| 2 | attrname | attrname | attrname | varchar2(100) |
| 3 | configtype | configtype | configtype | number(38, 0) |
| 4 | defaultvartab | defaultvartab | defaultvartab | varchar2(200) |
| 5 | detailbook | detailbook | detailbook | varchar2(101) |
| 6 | entityid | entityid | entityid | varchar2(36) |  |  | '~' |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | propertyid | propertyid | propertyid | varchar2(36) |  |  | '~' |
| 11 | txbill | txbill | txbill | varchar2(101) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |