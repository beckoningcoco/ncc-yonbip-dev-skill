# |<<

**工序完工报告质量等级 (mm_operationrep_qc / nc.vo.mmsfc.operationrep.entity.OprepQcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3711.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep_qc | 工序完工报告质量等级 | pk_oprep_qc | char(20) | √ | 主键 (UFID) |
| 2 | fqsrctype | 来源类型 | fqsrctype | int |  | 质检来源方式 (OprepSrcTypeEnum) |  | 1=直接录入; |