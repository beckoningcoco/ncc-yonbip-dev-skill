# |<<

**工序完工报告 (mm_operationrep / nc.vo.mmsfc.operationrep.entity.OprepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep | 工序完工报告 | pk_oprep | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ctrantypeid | 报告单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vtrantypecode | 报告单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | vbillcode | 工序完工报告单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 报产日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | fstatusflag | 状态 | fstatusflag | int |  | 工序完工报告状态 (OprepStatusEnum) | 1 | 1=自由; |