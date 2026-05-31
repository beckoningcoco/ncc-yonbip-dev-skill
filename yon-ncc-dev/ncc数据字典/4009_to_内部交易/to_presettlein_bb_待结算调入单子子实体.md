# |<<

**待结算调入单子子实体 (to_presettlein_bb / nc.vo.to.m5n.entity.PreSettleInLineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bbid | 待结算调入单子子表 | cbill_bbid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 待结算调入单 | cbillid | char(20) |  | 主键 (UFID) |
| 3 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 4 | cupfinanceorgid | 上游财务组织最新版本 | cupfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | cupfinanceorgvid | 上游财务组织 | cupfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | cupcostregionid | 上游成本域 | cupcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | cdownfinanceorgid | 下游财务组织最新版本 | cdownfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | cdownfinanceorgvid | 下游财务组织 | cdownfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | cdowncostregionid | 下游成本域 | cdowncostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 10 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | bcaniaflag | 是否可传存货 | bcaniaflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bcanapflag | 是否可传应付 | bcanapflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bcansettleflag | 是否可结算 | bcansettleflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bcanesitmateflag | 是否可暂估 | bcanesitmateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | fiastatusflag | 传存货状态 | fiastatusflag | int |  | 待结算调入传存货状态 (pushinapflag) |  | 0=NONE; |