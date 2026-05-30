# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_publish | pk_publish | pk_publish | char(20) | √ |
| 2 | nodetype | nodetype | nodetype | number(38, 0) |  |  | 0 |
| 3 | ordernum | ordernum | ordernum | number(38, 0) |  |  | 0 |
| 4 | parentid | parentid | parentid | varchar2(20) |
| 5 | repid | repid | repid | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |