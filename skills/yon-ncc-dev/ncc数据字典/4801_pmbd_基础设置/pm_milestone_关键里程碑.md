# |<<

**关键里程碑 (pm_milestone / nc.vo.pmbd.keymilestone.MilestoneVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_milestone | 关键里程碑主键 | pk_milestone | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | milestone_code | 里程碑编码 | milestone_code | varchar(200) | √ | 字符串 (String) |
| 5 | milestone_name | 里程碑名称 | milestone_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) | 2 | 2=已启用; |