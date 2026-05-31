# |<<

**计划独立需求 (mm_pid / nc.vo.mmdp.pid.entity.PIDVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pid | 计划独立需求ID | pk_pid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmanuplantid | 生产工厂最新版本 | cmanuplantid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | cmanuplantvid | 生产工厂 | cmanuplantvid | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 8 | taudittime | 审核时间 | taudittime | varchar(19) |  | 日期时间 (UFDateTime) |
| 9 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 10 | fstatusflag | 单据状态 | fstatusflag | varchar(50) |  | 单据状态 (EnumBillStatus) |  | 0=默认; |