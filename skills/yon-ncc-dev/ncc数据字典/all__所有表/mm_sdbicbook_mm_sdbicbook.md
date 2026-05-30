# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ic | pk_ic | pk_ic | char(20) | √ |
| 2 | cdemandkey | cdemandkey | cdemandkey | varchar2(50) |
| 3 | csupplykey | csupplykey | csupplykey | varchar2(50) |
| 4 | nnum | nnum | nnum | number(28, 8) |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |