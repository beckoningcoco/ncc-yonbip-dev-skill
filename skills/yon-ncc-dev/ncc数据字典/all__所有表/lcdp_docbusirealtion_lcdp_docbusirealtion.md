# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docbusirealtion | pk_docbusirealtion | pk_docbusirealtion | char(20) | √ |
| 2 | pk_busifeature | pk_busifeature | pk_busifeature | varchar2(20) |  |  | '~' |
| 3 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 4 | creationtime | creationtime | creationtime | char(19) |
| 5 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 8 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |