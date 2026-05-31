# |<<

**转财务待结算调出主实体 (to_transpresettleout / nc.vo.to.m5m.entity.TransPreSettleOutHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 转财务待结算调出主实体主键 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 调出财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 调出财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | cinfiorgid | 调入财务组织最新版本 | cinfiorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | cinfiorgvid | 调入财务组织 | cinfiorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | cinstockorgid | 调入库存组织最新版本 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | cinstockorgvid | 调入库存组织 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | coutstockorgid | 调出库存组织最新版本 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 10 | coutstockorgvid | 调出库存组织 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 12 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdeptvid | 部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 17 | coutregionid | 调出成本域 | coutregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 18 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 19 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | nrate | 汇率 | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | cincountryid | 收货国家/地区 | cincountryid | varchar(20) |  | 国家地区 (countryzone) |
| 22 | coutcountryid | 发货国家/地区 | coutcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 23 | couttaxcountryid | 销售方报税国家/地区 | couttaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 24 | foutbuysellflag | 销售方购销类型 | foutbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |