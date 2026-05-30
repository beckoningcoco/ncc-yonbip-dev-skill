# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_primaryrule | pk_primaryrule | pk_primaryrule | varchar2(50) | √ |
| 2 | memo | memo | memo | varchar2(181) |
| 3 | pk_doc | pk_doc | pk_doc | varchar2(20) |  |  | '~' |
| 4 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 5 | rate | rate | rate | number(28, 8) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |