# |<<

**物料清单子项阶梯损耗 (bd_bom_loss / nc.vo.bd.bom.bom0202.entity.BomLossVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_lossid | 子项阶梯损耗 | cbom_lossid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vlrowno | 行号 | vlrowno | varchar(50) |  | 字符串 (String) |
| 6 | nlfromnum | 产品主数量下限 | nlfromnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nltonum | 产品主数量上限 | nltonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nlfromastnum | 产品数量下限 | nlfromastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nltoastnum | 产品数量上限 | nltoastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nldissipationnum | 损耗系数 | nldissipationnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vlnote | 备注 | vlnote | varchar(200) |  | 字符串 (String) |