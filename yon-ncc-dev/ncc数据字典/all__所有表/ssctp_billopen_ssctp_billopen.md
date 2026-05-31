# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billopen | pk_billopen | pk_billopen | char(20) | √ |
| 2 | appid | appid | appid | varchar2(50) |
| 3 | implclassname | implclassname | implclassname | varchar2(200) |
| 4 | pageid | pageid | pageid | varchar2(50) |
| 5 | pk_tasktype | pk_tasktype | pk_tasktype | varchar2(20) |  |  | '~' |
| 6 | type | type | type | number(38, 0) |
| 7 | creationtime | creationtime | creationtime | varchar2(50) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | varchar2(50) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |