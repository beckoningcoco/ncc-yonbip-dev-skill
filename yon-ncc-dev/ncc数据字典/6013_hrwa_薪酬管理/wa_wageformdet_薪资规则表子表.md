# |<<

**薪资规则表子表 (wa_wageformdet / nc.vo.wa.rule.WageformdetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_wageformdet | 薪资规则表子表主键 | pk_wa_wageformdet | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_wageform | 薪资规则表主表主键 | pk_wa_wageform | char(20) |  | 主键 (UFID) |
| 3 | ilevel | 序号 | ilevel | int |  | 整数 (Integer) |
| 4 | vformula | 公式 | vformula | varchar(1000) |  | 字符串 (String) |
| 5 | vformulastr | 公式显示 | vformulastr | varchar(50) |  | 字符串 (String) |
| 6 | nvalue | 薪资表金额 | nvalue | decimal(31, 8) | √ | 数值 (UFDouble) |