# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11868.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billguidelog | pk_billguidelog | pk_billguidelog | char(20) | √ |
| 2 | isfirst | isfirst | isfirst | char(1) |
| 3 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 4 | creationtime | creationtime | creationtime | char(19) |
| 5 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 8 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |