# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6753.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_audittable | pk_audittable | pk_audittable | char(20) | √ |
| 2 | desttablecode | desttablecode | desttablecode | varchar2(50) |
| 3 | desttablename | desttablename | desttablename | varchar2(50) |
| 4 | implclassname | implclassname | implclassname | varchar2(50) |
| 5 | pk_auditmodule | pk_auditmodule | pk_auditmodule | char(20) | √ |
| 6 | sourcevofullname | sourcevofullname | sourcevofullname | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |