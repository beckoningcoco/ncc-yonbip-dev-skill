# |<<

**转财务调出主实体 (to_settleout / nc.vo.to.m5f.entity.STranFinOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 主表主键 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | cslistid | 结算清单主键 | cslistid | char(20) | √ | 结算清单主实体 (to_settlelist) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | cstockorgid | 库存组织最新版本 | cstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | cstockorgvid | 库存组织 | cstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | cinfiorgid | 调入财务组织最新版本 | cinfiorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | cinfiorgvid | 调入财务组织 | cinfiorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 11 | ccostregionid | 成本域 | ccostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 12 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 13 | cdeptvid | 部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 17 | corigcurrtypeid | 交易币种 | corigcurrtypeid | varchar(20) |  | 币种 (currtype) |
| 18 | vnote | 备注 | vnote | varchar(1024) |  | 备注 (Memo) |
| 19 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 20 | buprealflag | 上游是否实体组织 | buprealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bdownrealflag | 下游是否实体组织 | bdownrealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | nrate | 汇率 | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | cinstockorgid | 调入库存组织最新版本 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 24 | cinstockorgvid | 调入库存组织 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 25 | cinwarehouseid | 调入仓库 | cinwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 26 | cincountryid | 收货国家/地区 | cincountryid | varchar(20) |  | 国家地区 (countryzone) |
| 27 | coutcountryid | 发货国家/地区 | coutcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 28 | couttaxcountryid | 销售方报税国家/地区 | couttaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 29 | foutbuysellflag | 销售方购销类型 | foutbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |