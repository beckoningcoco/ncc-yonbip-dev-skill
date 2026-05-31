# |<<

**计划策略组 (bd_planstrategygroup / nc.vo.mmbd.psg.entity.PlanStrategyGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/926.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planstrategygroup | 主键 | pk_planstrategygroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织最新版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vpsgcode | 计划策略组编码 | vpsgcode | varchar(50) |  | 字符串 (String) |
| 6 | vpsgname | 计划策略组名称 | vpsgname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatusEnum) |  | -1=自由; |