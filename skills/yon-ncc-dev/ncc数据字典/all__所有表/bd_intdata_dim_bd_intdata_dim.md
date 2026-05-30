# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6959.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | metadataid | metadataid | metadataid | varchar2(150) | √ |
| 2 | modulecode | modulecode | modulecode | varchar2(15) |
| 3 | name | name | name | varchar2(64) |
| 4 | type | type | type | varchar2(15) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |