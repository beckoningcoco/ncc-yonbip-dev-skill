# |<<

**采购入财务头 (po_purchaseinfi / nc.vo.pu.m4201.entity.PurchaseinFIHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps | 采购入头 | pk_stockps | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cbilltypecode | 单据类型编码 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 6 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 8 | vbillcode | 入库单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | dbilldate | 入库日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 11 | pk_dept | 部门原始信息 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_dept_v | 部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | pk_psndoc | 业务员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 16 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 17 | freplenishflag | 退货标志 | freplenishflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | bnormpur | 是否普通采购 | bnormpur | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | bautotofi | 自动传财务标志 | bautotofi | char(1) |  | 布尔类型 (UFBoolean) | N |
| 20 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 21 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 22 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 23 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 24 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |