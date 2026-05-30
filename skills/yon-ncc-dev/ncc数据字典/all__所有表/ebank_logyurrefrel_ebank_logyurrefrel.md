# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logyurrefrel | pk_logyurrefrel | pk_logyurrefrel | char(20) | √ |
| 2 | destyurref | destyurref | destyurref | varchar2(50) |
| 3 | opdesc | opdesc | opdesc | varchar2(100) |
| 4 | srcyurref | srcyurref | srcyurref | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |