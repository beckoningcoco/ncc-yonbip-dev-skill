# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fassidfield | pk_fassidfield | pk_fassidfield | char(20) | √ |
| 2 | pk_accsoa | pk_accsoa | pk_accsoa | varchar2(50) |
| 3 | pk_reconcilerulesub | pk_reconcilerulesub | pk_reconcilerulesub | char(20) | √ |
| 4 | refname | refname | refname | varchar2(50) |
| 5 | refnamevalue | refnamevalue | refnamevalue | varchar2(50) |
| 6 | refvalue | refvalue | refvalue | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |