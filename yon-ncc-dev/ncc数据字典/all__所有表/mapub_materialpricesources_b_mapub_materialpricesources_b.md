# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpricesources_bid | cpricesources_bid | cpricesources_bid | char(20) | √ |
| 2 | corgcode | corgcode | corgcode | varchar2(50) |
| 3 | cpricesourcesid | cpricesourcesid | cpricesourcesid | char(20) |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | vpricesource | vpricesource | vpricesource | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |