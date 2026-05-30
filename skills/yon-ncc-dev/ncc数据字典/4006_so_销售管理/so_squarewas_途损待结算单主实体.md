# |<<

**途损待结算单主实体 (so_squarewas / nc.vo.so.m33.m4453.entity.SquareWasHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csalesquareid | 途损结算单主实体 | csalesquareid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 结算财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | csendstockorgid | 库存组织最新版本 | csendstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | csendstockorgvid | 库存组织版本 | csendstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | csendstordocid | 仓库 | csendstordocid | varchar(20) |  | 仓库 (stordoc) |
| 8 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | csquarebillid | 途损单主实体 | csquarebillid | char(20) |  | 主键 (UFID) |
| 10 | vbillcode | 途损单单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 11 | vtrantypecode | 途损单交易类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 12 | dbilldate | 途损单单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 13 | cwhsmanagerid | 销售出库单库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | bautosquareincome | 是否自动收入结算 | bautosquareincome | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bautosquarecost | 是否自动成本结算 | bautosquarecost | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 17 | ctrantypeid | 途损单交易类型实体 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 19 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 20 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 21 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |