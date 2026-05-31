# |<<

**作业分割规则成本中心 (cca_jobsegmentcostcenter / nc.vo.cca.jobsegmentationrules.JobSegmentCostCenterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1287.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cosecenter | 主键 | pk_cosecenter | char(20) | √ | 主键 (UFID) |
| 2 | costcentercode | 成本中心编码 | costcentercode | varchar(50) |  | 字符串 (String) |
| 3 | costcentername | 成本中心名称 | costcentername | varchar(50) |  | 字符串 (String) |
| 4 | pk_jobsegmentation | 作业分割规则主键 | pk_jobsegmentation | varchar(50) |  | 字符串 (String) |
| 5 | pk_cost | 关联成本中心主键 | pk_cost | varchar(50) |  | 字符串 (String) |