# |<<

**销售订单移动报表分析实体 (so_mb_orderanaly / nc.vo.so.report.analy.entity.SaleOrderAnalyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialid | 物料 | cmaterialid | char(20) | √ | 物料基本信息（多版本） (material) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | vbillcode | 订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | cchanneltypeid | 渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 10 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 11 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 12 | nnum | 销售主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | corigcurrencyid | 原币 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 15 | csaleorderid | 销售订单主实体 | csaleorderid | varchar(20) |  | 字符串 (String) |
| 16 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |