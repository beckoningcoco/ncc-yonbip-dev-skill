# |<<

**销售出库收益表 (me_saleoutpro / nc.vo.me.collectorder.entity.SaleOutProVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_saleoutpro | 销售出库收益表 | pk_saleoutpro | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 5 | cfinanceorgid | 结算财务组织 | cfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | csalesorgid | 销售组织 | csalesorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 7 | cdeptid | 销售部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | csaleoutid | 销售出库单ID | csaleoutid | varchar(20) |  | 销售出库单表头 (SaleOutHeadVO) |
| 9 | csaleoutbid | 销售出库单行ID | csaleoutbid | varchar(20) |  | 销售出库单表体 (SaleOutBodyVO) |
| 10 | ctrantypeid | 订单交易类型 | ctrantypeid | varchar(20) |  | 销售订单交易类型 (m30trantype) |
| 11 | csaleorderid | 销售订单ID | csaleorderid | varchar(20) |  | 销售订单主实体 (so_saleorder) |
| 12 | csaleorderbid | 销售订单行ID | csaleorderbid | varchar(20) |  | 销售订单子实体 (so_saleorder_b) |
| 13 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 14 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 15 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 16 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 18 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 19 | cmarbasclassid | 物料基本分类 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 20 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 21 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 22 | nprice | 主本币原无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ntaxprice | 主本币原含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nmny | 主本币原无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ntaxmny | 主本币原含税金额 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ndiscountmny | 本币价格折扣无税金额 | ndiscountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ndiscounttaxmny | 主本币价格折扣含税金额 | ndiscounttaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | naccumwastnum | 累计途损数量 | naccumwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | fblargessflag | 赠品标识 | fblargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | clargesssrcid | 赠品行对应买行ID | clargesssrcid | varchar(20) |  | 销售订单子实体 (so_saleorder_b) |
| 32 | cbuypromotfactorid | 买赠费用核算要素 | cbuypromotfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 33 | cprcpromotfactorid | 价格折扣费用核算要素 | cprcpromotfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 34 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 35 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |