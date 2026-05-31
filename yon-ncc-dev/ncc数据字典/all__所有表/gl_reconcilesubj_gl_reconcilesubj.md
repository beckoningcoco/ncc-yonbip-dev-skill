# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8542.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilesubj | pk_reconcilesubj | pk_reconcilesubj | char(20) | √ |
| 2 | anothersubjcode | anothersubjcode | anothersubjcode | char(30) |
| 3 | description | description | description | char(100) |
| 4 | isonlyinnercust | isonlyinnercust | isonlyinnercust | char(1) |
| 5 | onesubjcode | onesubjcode | onesubjcode | char(30) |
| 6 | reconcilebook | reconcilebook | reconcilebook | number(38, 0) |
| 7 | startdate | startdate | startdate | char(10) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |