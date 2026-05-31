# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9737.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | modulecode | modulecode | modulecode | varchar2(50) |
| 3 | pk_org | pk_org | pk_org | varchar2(50) |
| 4 | pk_schema | pk_schema | pk_schema | varchar2(50) |
| 5 | v5dsname | v5dsname | v5dsname | varchar2(50) |
| 6 | v5glbook | v5glbook | v5glbook | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |