# |<<

**需求供给平衡明细 (invp_balance / nc.vo.invp.plan.entity.BalanceDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance | 主键 | pk_balance | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | nnum | 匹配数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | pk_require | 需求单据明细 | pk_require | varchar(40) |  | 需求明细 (RequireVO) |
| 7 | pk_supply | 供给单据明细 | pk_supply | varchar(40) |  | 供给明细 (SupplyVO) |
| 8 | itimebucket | 时格顺序 | itimebucket | int |  | 整数 (Integer) |
| 9 | fmatchtype | 匹配类型 | fmatchtype | int |  | 匹配类型 (MatchTypeEnum) |  | 1=计划匹配; |