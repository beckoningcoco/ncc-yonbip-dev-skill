# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7540.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypereg | pk_billtypereg | pk_billtypereg | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(25) |
| 3 | modelcode | modelcode | modelcode | varchar2(25) |
| 4 | serverclassname | serverclassname | serverclassname | varchar2(80) |
| 5 | settlementinfofetcher | settlementinfofetcher | settlementinfofetcher | varchar2(80) |
| 6 | uiclassname | uiclassname | uiclassname | varchar2(80) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |