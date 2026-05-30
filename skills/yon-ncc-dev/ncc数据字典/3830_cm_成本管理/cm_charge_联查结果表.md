# |<<

**联查结果表 (cm_charge / nc.vo.cm.chargequery.LinkQueryChargeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | varchar(50) | √ | 字符串 (String) |
| 2 | level | 级次 | level | int |  | 整数 (Integer) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | isourcetype | 费用来源类型 | isourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |