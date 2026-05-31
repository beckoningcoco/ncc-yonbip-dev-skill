# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_identity | pk_identity | pk_identity | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(50) |
| 3 | pk_org | pk_org | pk_org | varchar2(50) |
| 4 | tbname | tbname | tbname | varchar2(30) |
| 5 | val | val | val | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |