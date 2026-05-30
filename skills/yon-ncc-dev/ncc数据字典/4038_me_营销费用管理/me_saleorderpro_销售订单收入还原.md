# |<<

**销售订单收入还原 (me_saleorderpro / nc.vo.me.collectorder.entity.SaleOrderProVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_saleorderpro | 销售订单收入还原 | pk_saleorderpro | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 5 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | cdeptid | 销售部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | csaleorderid | 销售订单ID | csaleorderid | varchar(20) |  | 销售订单主实体 (so_saleorder) |
| 8 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 销售订单交易类型 (m30trantype) |
| 9 | csaleorderbid | 销售订单行ID | csaleorderbid | varchar(20) |  | 销售订单子实体 (so_saleorder_b) |
| 10 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 12 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 14 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 15 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 16 | cmarbasclassid | 物料基本分类 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 17 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 18 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 19 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nmny | 主本币原无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ntaxmny | 主本币原含税金额 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ndiscountmny | 主本币价格折扣无税金额 | ndiscountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ndiscounttaxmny | 主本币价格折扣含税金额 | ndiscounttaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | norigsubmny | 费用冲抵金额 | norigsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | blargessflag | 赠品标记 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | clargesssrcid | 赠品行对应买行ID | clargesssrcid | varchar(20) |  | 销售订单子实体 (so_saleorder_b) |
| 29 | cbuypromottypeid | 买赠费用促销类型 | cbuypromottypeid | varchar(20) |  | 促销类型定义实体 (scm_promottype) |
| 30 | cprcpromottypeid | 价格折扣费用促销类型 | cprcpromottypeid | varchar(20) |  | 促销类型定义实体 (scm_promottype) |
| 31 | cbuypromotfactorid | 买赠费用核算要素 | cbuypromotfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 32 | cprcpromotfactorid | 折扣费用核算要素 | cprcpromotfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 33 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 34 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |