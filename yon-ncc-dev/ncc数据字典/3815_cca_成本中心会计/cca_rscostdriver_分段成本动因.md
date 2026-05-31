# |<<

**分段成本动因 (cca_rscostdriver / nc.vo.cca.rulescheme.allocruleset.RSCostDriverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1298.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rscostdriver | 主键 | pk_rscostdriver | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |
| 3 | costdriverid | 成本动因 | costdriverid | varchar(20) |  | 成本动因 (cm_driver) |
| 4 | rate | 比例 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | condition | 动因条件 | condition | varchar(50) |  | 字符串 (String) |