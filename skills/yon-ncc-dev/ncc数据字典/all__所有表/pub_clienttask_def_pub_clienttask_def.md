# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | pk_task | pk_task | char(20) | √ |
| 2 | taskclass | taskclass | taskclass | varchar2(100) |
| 3 | taskcode | taskcode | taskcode | varchar2(50) |
| 4 | taskname | taskname | taskname | varchar2(75) |
| 5 | taskparam | taskparam | taskparam | varchar2(100) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |