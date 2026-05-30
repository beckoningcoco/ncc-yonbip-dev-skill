# |<<

**运输状态 (deliverystatus / nc.vo.dm.m4802.entity.DelivStatusVO.SourceBillDeliveryStatus)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1696.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_id | 单据表头ID | cbill_id | char(20) | √ | 主键 (UFID) |
| 2 | cbill_bid | 单据表体ID | cbill_bid | varchar(20) |  | 字符串 (String) |
| 3 | cbilltype | 单据类型 | cbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | ncansendnum | 待运输数量 | ncansendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nsendnum | 累计运输数量 | nsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | cinventoryid | 物料版本信息 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | bsendendflag | 运输关闭 | bsendendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | vpuplancode | 到货计划号 | vpuplancode | varchar(20) |  | 字符串 (String) |
| 13 | cpuorder_bb1id | 到货计划主键 | cpuorder_bb1id | varchar(20) |  | 字符串 (String) |
| 14 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |