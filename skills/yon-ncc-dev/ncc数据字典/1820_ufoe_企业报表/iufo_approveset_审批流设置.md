# |<<

**审批流设置 (iufo_approveset / nc.vo.iufo.approve.ApproveSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approveset | 主键 | pk_approveset | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务 | pk_task | varchar(20) |  | 任务 (task) |
| 3 | pk_report | 报表 | pk_report | varchar(20) |  | 报表表样 (ufoereportinfo) |
| 4 | pk_flow | 审批流主键 | pk_flow | varchar(50) |  | 字符串 (String) |
| 5 | flowname | 审批流名称 | flowname | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_rms | 报表组织体系 | pk_rms | varchar(20) |  | 组织结构_报表组织体系 (reportmanastru) |
| 9 | flowtype | 审批流类型 | flowtype | int |  | 审批流类型 (审批流类型) | 0 | 0=上报; |