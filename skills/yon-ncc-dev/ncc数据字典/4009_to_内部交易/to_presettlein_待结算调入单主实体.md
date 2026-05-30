# |<<

**待结算调入单主实体 (to_presettlein / nc.vo.to.m5n.entity.PreSettleInHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 待结算调入单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 调入财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 调入财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | cincostregionid | 调入成本域 | cincostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 6 | cinstockorgid | 调入库存组织最新版本 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | cinstockorgvid | 调入库存组织 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 9 | coutfinanceorgid | 调出财务组织最新版本 | coutfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | coutfinanceorgvid | 调出财务组织 | coutfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 11 | coutcostregionid | 调出成本域 | coutcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 12 | coutstockorgid | 调出库存组织最新版本 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 13 | coutstockorgvid | 调出库存组织 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 14 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 15 | bmainthreadflag | 是否主线索 | bmainthreadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | fsettletypeflag | 内部结算类型 | fsettletypeflag | int |  | 内部结算场景 (SettleSceneType) |  | 1=库存调拨; |