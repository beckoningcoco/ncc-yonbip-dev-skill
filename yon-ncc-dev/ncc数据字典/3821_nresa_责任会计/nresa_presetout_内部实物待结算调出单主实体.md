# |<<

**内部实物待结算调出单主实体 (nresa_presetout / nc.vo.nresa.internalsettlement.prematter.PreSettleOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 待结算调出单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_outorg | 调出责任组织 | pk_outorg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_org | 调出利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_org_v | 调出利润中心版本 | pk_org_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 12 | approver | 签字人 | approver | varchar(20) |  | 用户 (user) |
| 13 | taudittime | 签字日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 14 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 17 | cinpcid | 调入利润中心 | cinpcid | varchar(20) |  | 利润中心 (profitcenter) |
| 18 | cinpcvid | 调入利润中心版本 | cinpcvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 19 | cinstockorgid | 调入库存组织 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 20 | cinstockorgvid | 调入库存组织版本 | cinstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 21 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 22 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 23 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 24 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 27 | fmainbodyflag | 结算主体 | fmainbodyflag | int |  | 内部实物结算主体 (InsettmatterMainEnum) |  | 1=调出利润中心; |