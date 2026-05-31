# |<<

**内部实物待结算调入单主实体 (nresa_presetin / nc.vo.nresa.internalsettlement.prematter.PreSettleInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 待结算调入单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_inorg | 调入责任组织 | pk_inorg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_org | 调入利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_org_v | 调入利润中心版本 | pk_org_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 12 | approver | 签字人 | approver | varchar(20) |  | 用户 (user) |
| 13 | taudittime | 签字日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 14 | cinstockorgid | 调入库存组织 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | cinstockorgvid | 调入库存组织版本 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 17 | coutpcid | 调出利润中心 | coutpcid | varchar(20) |  | 利润中心 (profitcenter) |
| 18 | coutpcvid | 调出利润中心版本 | coutpcvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 19 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 20 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 21 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 22 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 23 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 24 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 27 | fsettletypeflag | 内部结算类型 | fsettletypeflag | int |  | 内部实物结算类型 (InsettmatterTypeEnum) |  | 1=跨利润中心调拨; |