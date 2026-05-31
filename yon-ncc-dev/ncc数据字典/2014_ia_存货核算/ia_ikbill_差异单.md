# |<<

**差异单 (ia_ikbill / nc.vo.ia.mik.entity.IKHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2847.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 差异单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | varchar(50) |  | 字符串 (String) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | cstockorgid | 库存组织最新版本 | cstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | cstockorgvid | 库存组织 | cstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | cstordocid | 仓库 | cstordocid | varchar(20) |  | 仓库 (stordoc) |
| 11 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | cotherstockorgid | 对方库存组织最新版本 | cotherstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 13 | cotherstockorgvid | 对方库存组织 | cotherstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 14 | cotherstordocid | 对方仓库 | cotherstordocid | varchar(20) |  | 仓库 (stordoc) |
| 15 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 17 | cdeptvid | 部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | csrcmodulecode | 来源模块编码 | csrcmodulecode | varchar(50) |  | 字符串 (String) |
| 19 | ctrantypeid | 出入库类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 20 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 22 | bestimateflag | 暂估标志 | bestimateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | bsystemflag | 系统单据标志 | bsystemflag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | bconvertflag | 折算标志 | bconvertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 26 | bwithdrawalflag | 是否假退料 | bwithdrawalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 28 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 29 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 30 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 31 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | fintransitflag | 发出商品标识 | fintransitflag | int |  | 发出商品标志 (intransit) |  | -1=非发出商品; |