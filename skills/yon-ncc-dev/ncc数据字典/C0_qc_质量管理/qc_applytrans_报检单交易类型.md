# |<<

**报检单交易类型 (qc_applytrans / nc.vo.qc.c001transtype.entity.ApplyTranstypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4824.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applytrans | 报检单交易类型 | pk_applytrans | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 4 | icheckday | 检验时间（天） | icheckday | int |  | 整数 (Integer) |
| 5 | fqcbusiflow | 质检流程 | fqcbusiflow | int |  | 质检流程 (QCBusiFlowEnum) |  | 1=报检/报告; |