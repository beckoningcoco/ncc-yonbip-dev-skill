# |<<

**主生产计划修订版本 (mm_mps_revise / nc.vo.mmmps.mps.entity.MpsReviseHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mps_revise | 主生产计划修订版本 | pk_mps_revise | char(20) | √ | 主键 (UFID) |
| 2 | pk_source_mps | 正式主生产计划主键 | pk_source_mps | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | cemployeeid | 计划岗 | cemployeeid | varchar(20) |  | 岗位设置 (pd_ppresp) |
| 7 | vbillcode | 单据编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dplandate | 计划开工日期 | dplandate | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | revisever | 修订版本号 | revisever | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | fstatusflag | 单据状态 | fstatusflag | int |  | 计划状态 (PlanStatusenum) |  | 1=自由; |