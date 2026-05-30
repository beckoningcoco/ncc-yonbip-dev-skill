# |<<

**指标调整单子实体 (sr_targetadj_b / nc.vo.scmf.sr.targetadj.entity.TargetAdjBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetadj_b | 销售指标调整单子实体 | pk_targetadj_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmarsetid | 物料维度 | cmarsetid | varchar(20) |  | 物料维度 (sr_target_mar) |
| 4 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 5 | vperiod | 期间 | vperiod | varchar(20) |  | 指标周期列表 (sr_target_period) |
| 6 | ctargetitemid | 指标项 | ctargetitemid | varchar(50) |  | 字符串 (String) |
| 7 | vnewtargetkey | 新指标值key | vnewtargetkey | varchar(60) |  | 字符串 (String) |
| 8 | voldtargetkey | 原指标值key | voldtargetkey | varchar(60) |  | 字符串 (String) |
| 9 | nnewtargetvalue | 新指标值 | nnewtargetvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | noldtargetvalue | 原指标值 | noldtargetvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nnewrealyearval | 新实际年指标值 | nnewrealyearval | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | noldrealyearval | 原实际年指标值 | noldrealyearval | decimal(28, 8) |  | 数值 (UFDouble) |