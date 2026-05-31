# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | mutexno | mutexno | mutexno | char(10) |
| 2 | mutexstatus | mutexstatus | mutexstatus | char(4) | √ |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |