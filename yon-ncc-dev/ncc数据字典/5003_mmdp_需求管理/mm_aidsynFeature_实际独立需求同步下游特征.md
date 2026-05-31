# |<<

**实际独立需求同步下游特征 (mm_aidsynFeature / nc.vo.mmdp.aid.entity.AidSynFeatureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aidsynfeature | 同步下游特征主键 | pk_aidsynfeature | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cfactoryid | 工厂最新版本 | cfactoryid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | cfactoryvid | 工厂 | cfactoryvid | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | vfirstid | 源头单据表头id | vfirstid | varchar(50) |  | 字符串 (String) |
| 8 | vfirstbid | 源头单据表体id | vfirstbid | varchar(50) |  | 字符串 (String) |
| 9 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 10 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 11 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | vsrcid | 来源单据表头id | vsrcid | varchar(50) |  | 字符串 (String) |
| 13 | vsrcbid | 来源单据表体id | vsrcbid | varchar(50) |  | 字符串 (String) |
| 14 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 15 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(50) |  | 字符串 (String) |
| 16 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | vbillid | 单据表头id | vbillid | varchar(50) |  | 字符串 (String) |
| 18 | vbillbid | 单据表体id | vbillbid | varchar(50) |  | 字符串 (String) |
| 19 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 20 | vbillrowno | 单据行号 | vbillrowno | varchar(50) |  | 字符串 (String) |
| 21 | vbilltype | 单据类型 | vbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 22 | fbillstatus | 单据状态 | fbillstatus | int |  | 同步下游特征单据状态 (AidSynFeatureBillStatus) |  | 0=自由; |