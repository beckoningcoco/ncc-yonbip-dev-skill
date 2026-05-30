# |<<

**计提设置属性 (cca_accrualsetb / nc.vo.cca.rulescheme.expenseaccrual.AccrualSetBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrualset | 计提设置主键 | pk_accrualset | char(20) | √ | 主键 (UFID) |
| 2 | pk_drawruleobject | 计提对象 | pk_drawruleobject | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | getnummethod | 取数方式 | getnummethod | int |  | 取数方式枚举 (getnumway) |  | 1=规则; |