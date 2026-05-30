# |<<

**采购入费用暂估明细 (po_purchaseinfi_fee / nc.vo.pu.m4201.entity.PurchaseinFIFeeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_fee | 采购入费用暂估明细 | pk_stockps_fee | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockps | 采购入财务头 | pk_stockps | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_supplier | 供应商名称 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 6 | pk_costfactor | 成本要素 | pk_costfactor | varchar(20) |  | 主键 (UFID) |
| 7 | pk_feematerial | 费用项 | pk_feematerial | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_srcfeematerial | 暂估费用物料 | pk_srcfeematerial | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_estpsn | 暂估人 | pk_estpsn | varchar(20) |  | 用户 (user) |
| 10 | destdate | 暂估日期 | destdate | char(19) |  | 日期 (UFDate) |
| 11 | nestexchgrate | 折本汇率 | nestexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | btoia | 传成本标志 | btoia | char(1) |  | 布尔类型 (UFBoolean) | N |
| 13 | btoap | 传应付标志 | btoap | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | nestmny | 本币无税金额 | nestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nesttaxmny | 税额 | nesttaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nesttaxrate | 税率 | nesttaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nesttotalmny | 本币价税合计 | nesttotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | pk_estcurrency | 币种 | pk_estcurrency | varchar(20) |  | 币种 (currtype) |
| 19 | pk_localcurrency | 本币 | pk_localcurrency | varchar(20) |  | 币种 (currtype) |
| 20 | nestomny | 原币无税金额 | nestomny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nestototalmny | 原币价税合计 | nestototalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_firstsettle | 暂估费用物料第一次结算的费用发票所在结算单 | pk_firstsettle | varchar(20) |  | 主键 (UFID) |
| 23 | pk_firstsettle_b | 暂估费用物料第一次结算的费用发票所在结算单行 | pk_firstsettle_b | varchar(20) |  | 主键 (UFID) |
| 24 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 25 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 26 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 27 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |