# |<<

**汇总方案 (iufo_total_scheme / nc.vo.iufo.total.TotalSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_totalscheme | 主键 | pk_totalscheme | char(20) | √ | 主键 (UFID) |
| 2 | busi_prop | 业务属性 | busi_prop | varchar(20) |  | 字符串 (String) |
| 3 | org_type | 汇总规则设置 | org_type | int |  | 组织选择类型 (enumOrgType) |  | 1=直接下级; |