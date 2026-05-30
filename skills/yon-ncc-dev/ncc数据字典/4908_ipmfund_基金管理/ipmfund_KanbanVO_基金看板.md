# |<<

**基金看板 (ipmfund_KanbanVO / nc.vo.ipmfund.kanban.KanbanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_kanban | 主表主键 | pk_kanban | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 6 | name | 基金名称 | name | varchar(200) |  | 字符串 (String) |
| 7 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 8 | vmanagetype | 管理类型 | vmanagetype | varchar(50) |  | 管理类型 (FundManageType) |  | 1=自我管理; |