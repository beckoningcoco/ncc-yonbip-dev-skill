# |<<

**预算控制 (pm_projectbudctrl / nc.vo.pbm.projectbudctrl.ProjectBudCtrlHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectbudctrl | 预算控制主键 | pk_projectbudctrl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_code | 单据编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 7 | control_rule | 控制规则 | control_rule | int |  | 控制规则 (budgetctrlrule) |  | 0=项目; |