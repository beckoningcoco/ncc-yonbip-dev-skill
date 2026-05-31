# |<<

**运算日志明细 (mm_calclog_b / nc.vo.mmpps.calc.entity.log.LogItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3643.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppslogbid | 运算日志明细 | cppslogbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | fstatus | 例外类别 | fstatus | int |  | 运算日志行状态 (LogItemStatus) |  | 1=时格异常; |