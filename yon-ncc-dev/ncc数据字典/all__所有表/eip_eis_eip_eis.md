# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eis | pk_eis | pk_eis | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | data | data | data | varchar2(50) |
| 4 | msgstatus | msgstatus | msgstatus | number(38, 0) |
| 5 | receipt | receipt | receipt | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |