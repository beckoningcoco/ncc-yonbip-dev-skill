# |<<

**结算清单子实体 (to_settlelist_b / nc.vo.to.m5f.entity.SettleListItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 子表主键 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 结算主体财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | cinventoryid | 物料最新版本 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cinventoryvid | 物料版本主键 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |