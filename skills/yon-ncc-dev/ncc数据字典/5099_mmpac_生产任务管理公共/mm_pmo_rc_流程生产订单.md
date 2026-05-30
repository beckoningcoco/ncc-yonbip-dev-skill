# |<<

**流程生产订单 (mm_pmo_rc / nc.vo.mmpac.pmo.pac0002.entity.PMOHeadVO_RC)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmoid | 流程生产订单明细 | cmoid | char(20) | √ | 主键 (UFID) |
| 2 | cpmohid | 流程生产订单 | cpmohid | char(20) | √ | 主键 (UFID) |
| 3 | version | 订单版本号 | version | varchar(10) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | cplanfactoryid | 计划组织最新版本 | cplanfactoryid | varchar(20) |  | 组织 (org) |
| 8 | cplanfactoryvid | 计划组织 | cplanfactoryvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | vbillcode | 流程生产订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 11 | ctrantypeid | 订单交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | vtrantypecode | 订单交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 13 | fbillstatus | 订单状态 | fbillstatus | int |  | 流程生产订单状态 (PMOFBillStatusEnum) |  | 0=自由; |