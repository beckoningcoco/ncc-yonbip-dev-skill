# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_collection | pk_collection | pk_collection | char(20) | √ |
| 2 | collectiontime | collectiontime | collectiontime | char(19) |
| 3 | pk_report | pk_report | pk_report | varchar2(50) |
| 4 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |