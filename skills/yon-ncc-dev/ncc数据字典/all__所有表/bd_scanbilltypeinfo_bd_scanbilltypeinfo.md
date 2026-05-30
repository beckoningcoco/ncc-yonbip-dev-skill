# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7065.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scanbilltypeinfo | pk_scanbilltypeinfo | pk_scanbilltypeinfo | char(20) | √ |
| 2 | factorycode | factorycode | factorycode | varchar2(50) |
| 3 | ownmodule | ownmodule | ownmodule | varchar2(50) |
| 4 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | voclasspath | voclasspath | voclasspath | varchar2(1000) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |