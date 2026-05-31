# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docexp | pk_docexp | pk_docexp | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) |
| 3 | content | content | content | varchar2(2000) |
| 4 | expcode | expcode | expcode | varchar2(50) |
| 5 | exp_desc | exp_desc | exp_desc | varchar2(500) |
| 6 | pk_bill | pk_bill | pk_bill | varchar2(100) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |