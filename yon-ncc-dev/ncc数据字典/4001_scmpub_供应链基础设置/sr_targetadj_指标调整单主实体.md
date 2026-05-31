# |<<

**指标调整单主实体 (sr_targetadj / nc.vo.scmf.sr.targetadj.entity.TargetAdjHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5488.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetadj | 销售指标调整单主实体 | pk_targetadj | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | ctargetid | 销售指标表 | ctargetid | varchar(20) |  | 指标设置主实体 (sr_target) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | fstatusflag | 单据状态 | fstatusflag | varchar(20) |  | 指标调整单单据状态 (BillStatus) | 0 | 0=自由; |