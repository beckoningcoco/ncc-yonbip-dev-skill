# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctempsaveid | ctempsaveid | ctempsaveid | char(20) | √ |
| 2 | data | data | data | blob |
| 3 | funcode | funcode | funcode | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | creationtime | creationtime | creationtime | char(19) |
| 6 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |