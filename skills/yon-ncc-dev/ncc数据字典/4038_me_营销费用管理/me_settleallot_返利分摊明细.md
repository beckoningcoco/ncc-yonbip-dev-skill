# |<<

**返利分摊明细 (me_settleallot / nc.vo.me.collectorder.entity.SettleAllotVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settleallot | 分摊表主键 | pk_settleallot | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vsettlecode | 返利结算单号 | vsettlecode | varchar(50) |  | 字符串 (String) |
| 4 | csettleid | 返利结算单ID | csettleid | varchar(20) |  | 返利结算单主实体 (sr_settle) |
| 5 | csettlebid | 返利结算单行ID | csettlebid | varchar(20) |  | 返利结算单子实体 (sr_settle_b) |
| 6 | cplcytrantypeid | 返利政策类型 | cplcytrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 9 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 10 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 15 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 16 | nmny | 费用金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ccurrencyid | 币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | fallotsetflag | 分摊依据 | fallotsetflag | int |  | 分摊依据 (allotsetflag) |  | 1=订单金额; |