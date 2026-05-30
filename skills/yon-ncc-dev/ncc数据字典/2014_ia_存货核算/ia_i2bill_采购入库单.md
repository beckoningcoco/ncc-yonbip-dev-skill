# |<<

**采购入库单 (ia_i2bill / nc.vo.ia.mi2.entity.I2HeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 采购入库单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | cstockorgid | 库存组织最新版本 | cstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | cstockorgvid | 库存组织 | cstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | cstordocid | 仓库 | cstordocid | varchar(20) |  | 仓库 (stordoc) |
| 11 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 13 | cdeptvid | 部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 16 | bestimateflag | 暂估标志 | bestimateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | csrcmodulecode | 来源模块编码 | csrcmodulecode | varchar(10) |  | 字符串 (String) |
| 18 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 19 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 20 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 21 | bsystemflag | 系统单据标志 | bsystemflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | bconvertflag | 折算标志 | bconvertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | ctrantypeid | 出入库类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 26 | fbookflag | 账簿属性 | fbookflag | int |  | 账簿属性 (fbookflag) |  | 1=财务; |