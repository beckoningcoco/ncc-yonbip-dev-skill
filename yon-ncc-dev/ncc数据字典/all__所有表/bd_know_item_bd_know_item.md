# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowitem | pk_knowitem | pk_knowitem | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | cont | cont | cont | blob |
| 4 | keyword | keyword | keyword | varchar2(200) |
| 5 | pk_create_dept | pk_create_dept | pk_create_dept | varchar2(20) |  |  | '~' |
| 6 | pk_knowbase | pk_knowbase | pk_knowbase | varchar2(20) |  |  | '~' |
| 7 | pk_knowparentitem | pk_knowparentitem | pk_knowparentitem | varchar2(50) |
| 8 | sort | sort | sort | number(38, 0) |
| 9 | title | title | title | varchar2(200) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |