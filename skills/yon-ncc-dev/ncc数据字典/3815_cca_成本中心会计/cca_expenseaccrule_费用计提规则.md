# |<<

**费用计提规则 (cca_expenseaccrule / nc.vo.cca.rulescheme.expenseaccrual.ExpenseAccrualruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1281.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenseaccrual | 费用计提主键 | pk_expenseaccrual | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | nodetype | 节点类型 | nodetype | int |  | 节点类型 (nodetype) |  | 1=成本中心会计; |