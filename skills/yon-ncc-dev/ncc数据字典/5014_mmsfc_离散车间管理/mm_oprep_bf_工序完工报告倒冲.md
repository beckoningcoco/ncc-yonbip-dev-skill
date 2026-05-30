# |<<

**工序完工报告倒冲 (mm_oprep_bf / nc.vo.mmsfc.operationrep.backflush.entity.BfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep_bf | 工序完工报告倒冲 | pk_oprep_bf | varchar(50) | √ | 字符串 (String) |
| 2 | pk_oprep_b | 工序完工报告明细 | pk_oprep_b | char(20) |  | 主键 (UFID) |
| 3 | pk_oprep | 工序完工报告 | pk_oprep | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | ctranstypeid | 交易类型 | ctranstypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtranstypecode | 交易类型编码 | vtranstypecode | varchar(50) |  | 字符串 (String) |
| 9 | hchtrantypeid | 报告单类型 | hchtrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | hvhtrantypecode | 报告单类型编码 | hvhtrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | hvhbillcode | 工序完工报告单号 | hvhbillcode | varchar(40) |  | 字符串 (String) |
| 12 | hfhstatusflag | 状态 | hfhstatusflag | int |  | 整数 (Integer) |
| 13 | hdhbilldate | 报产日期 | hdhbilldate | char(19) |  | 日期 (UFDate) |
| 14 | hfhprodmode | 生产模式 | hfhprodmode | int |  | 生产模式 (prodmode) |  | 1=流程制造; |