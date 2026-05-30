# |<<

**流程生产订单来源 (mm_pmosrc / nc.vo.mmpac.pmo.pac0002.entity.PMOSrcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_src | 生产订单来源 | pk_src | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | nplanoutnum | 计划主数量 | nplanoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | vsrctrantypeid | 来源交易类型 | vsrctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vsrctrantype | 来源交易类型编码 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 8 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | vsrcid | 来源单据 | vsrcid | varchar(20) |  | 字符串 (String) |
| 10 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 11 | vsrcrowid | 来源单据明细 | vsrcrowid | varchar(20) |  | 字符串 (String) |
| 12 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 13 | cpmoid | 生产订单 | cpmoid | varchar(20) |  | 字符串 (String) |
| 14 | vpmocode | 生产订单号 | vpmocode | varchar(40) |  | 字符串 (String) |
| 15 | cpmorowid | 生产订单行 | cpmorowid | varchar(20) |  | 字符串 (String) |
| 16 | vpmorowno | 生产订单行号 | vpmorowno | varchar(20) |  | 字符串 (String) |
| 17 | dplanstartdate | 计划开工日期 | dplanstartdate | char(19) |  | 日期 (UFDate) |