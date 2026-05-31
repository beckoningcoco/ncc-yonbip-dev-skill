# |<<

**销售指标维护子实体 (sr_targetbill_b / nc.vo.scmf.sr.targetbill.entity.TargetBillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5491.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_targetbill_b | 销售指标维护子实体 | pk_targetbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmardimenid | 物料维度 | cmardimenid | varchar(20) |  | 物料维度 (sr_target_mar) |
| 4 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 5 | vperiod | 期间 | vperiod | varchar(20) |  | 指标周期列表 (sr_target_period) |
| 6 | ctargetitemid | 指标项 | ctargetitemid | varchar(20) |  | 字符串 (String) |
| 7 | vtargetkey | 指标值key | vtargetkey | varchar(60) |  | 字符串 (String) |
| 8 | ntargetvalue | 指标值 | ntargetvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nrealyearvalue | 实际年指标值 | nrealyearvalue | decimal(28, 8) |  | 数值 (UFDouble) |