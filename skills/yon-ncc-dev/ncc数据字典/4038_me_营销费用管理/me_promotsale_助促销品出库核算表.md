# |<<

**助促销品出库核算表 (me_promotsale / nc.vo.me.salesaccount.entity.PromotSalesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_promotsale | 助促销品出库核算表 | pk_promotsale | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cpayorgid | 费用承担组织 | cpayorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | cpaydeptid | 费用承担部门 | cpaydeptid | varchar(20) |  | 组织_部门 (dept) |
| 6 | ccostsubjid | 收支项目 | ccostsubjid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 13 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 14 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 核算要素 (Factor) |
| 15 | cmtappbid | 来源费用申请单行 | cmtappbid | varchar(50) |  | 字符串 (String) |
| 16 | norigarsubmny | 费用支持金额 | norigarsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | ctrantypeid | 出库单交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 19 | cpushoutid | 出库单ID | cpushoutid | varchar(50) |  | 字符串 (String) |
| 20 | cpushoutbid | 出库单行ID | cpushoutbid | varchar(50) |  | 字符串 (String) |
| 21 | bcombineable | 归集标识 | bcombineable | char(1) |  | 布尔类型 (UFBoolean) |