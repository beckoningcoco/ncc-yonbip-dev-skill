# |<<

**计价方式调整记录 (ia_pricemodelog / nc.vo.ia.invalmethod.entity.PriceModeLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpricemodelogid | 计价方式调整 | cpricemodelogid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | foldpricemodeflag | 原计价方式 | foldpricemodeflag | int |  | 整数 (Integer) |
| 8 | fnewpricemodeflag | 新计价方式 | fnewpricemodeflag | int |  | 整数 (Integer) |
| 9 | boldbatchcostflag | 原批次核算标志 | boldbatchcostflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bnewbatchcostflag | 新批次核算标志 | bnewbatchcostflag | char(1) |  | 布尔类型 (UFBoolean) |