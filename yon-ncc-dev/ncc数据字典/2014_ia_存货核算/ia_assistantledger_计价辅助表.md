# |<<

**计价辅助表 (ia_assistantledger / nc.vo.ia.assistantledger.entity.AssistantLedgerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cassistantledgerid | 计价辅助表主键 | cassistantledgerid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | ccalcrangeid | 计算维度 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 6 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 计价方式 (fpricemodeflag) |  | 1=先进先出; |