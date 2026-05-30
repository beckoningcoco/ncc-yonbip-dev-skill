# |<<

**内部实物结算清单调出主实体 (nresa_settlelistout / nc.vo.nresa.internalsettlement.matter.SettleListOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 结算清单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_outorg | 调出责任组织 | pk_outorg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_org | 调出利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_org_v | 调出利润中心版本 | pk_org_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 11 | cinpcid | 调入利润中心 | cinpcid | varchar(20) |  | 利润中心 (profitcenter) |
| 12 | cinpcvid | 调入利润中心版本 | cinpcvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 13 | cinstockorgid | 调入库存组织 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 14 | cinstockorgvid | 调入库存组织版本 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 15 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 16 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 17 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 字符串 (String) |
| 21 | ccurrencyid | 本币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 22 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 24 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | csrctrantypeid | 来源交易类型 | csrctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 27 | csrcid | 来源单据 | csrcid | char(20) |  | 主键 (UFID) |
| 28 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 29 | saga_btxid | 子事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 30 | saga_frozen | 冻结状态 | saga_frozen | int |  | Saga冻结状态 (InsettFrozenEnum) |  | 0=解冻; |