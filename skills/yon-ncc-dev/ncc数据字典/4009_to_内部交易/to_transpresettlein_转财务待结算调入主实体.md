# |<<

**转财务待结算调入主实体 (to_transpresettlein / nc.vo.to.m5n.entity.TransPreSettleInHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 转财务待结算调入主实体主键 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 调入财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 调入财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | coutfiorgid | 调出财务组织 | coutfiorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | coutfiorgvid | 调出财务组织版本 | coutfiorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | cinregionid | 调入成本域 | cinregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 8 | cinstockorgid | 调入库存组织 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | cinstockorgvid | 调入库存组织版本 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 11 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 12 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 13 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 14 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | corigcurrtypeid | 原币币种 | corigcurrtypeid | varchar(20) |  | 币种 (currtype) |
| 18 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 19 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 21 | nrate | 汇率 | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 23 | cincountryid | 收货国家/地区 | cincountryid | varchar(20) |  | 国家地区 (countryzone) |
| 24 | coutcountryid | 发货国家/地区 | coutcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 25 | cintaxcountryid | 采购方报税国家/地区 | cintaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 26 | finbuysellflag | 采购方购销类型 | finbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |