# |<<

**作业分割规则子表 (cca_jobsegrule_b / nc.vo.cca.jobsegmentationrules.JobSegmentationRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1289.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobsegmentation_b | 作业分割规则子表 | pk_jobsegmentation_b | char(20) | √ | 主键 (UFID) |
| 2 | factorgroup | 要素组 | factorgroup | varchar(20) |  | 核算要素组 (factorgroup) |
| 3 | costfactor | 核算要素 | costfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | work | 作业 | work | varchar(20) |  | 作业档案 (bd_activity) |
| 5 | scale | 权重 | scale | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |