# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rulebind | pk_rulebind | pk_rulebind | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | controlstyle | controlstyle | controlstyle | varchar2(50) |
| 4 | name | name | name | varchar2(300) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 6 | pk_bindmeta | pk_bindmeta | pk_bindmeta | varchar2(36) |
| 7 | pk_rule | pk_rule | pk_rule | char(20) |
| 8 | ruletype | ruletype | ruletype | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |