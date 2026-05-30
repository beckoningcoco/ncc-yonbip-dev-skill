# |<<

**计划类型 (ewm_plan_type / nc.vo.ewm.planstype.PlanTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_type | 计划类型主键 | pk_plan_type | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | type_code | 类型编码 | type_code | varchar(40) |  | 字符串 (String) |
| 5 | type_name | 类型名称 | type_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | ctrl_according | 控制依据 | ctrl_according | int |  | 控制依据 (ctrlDepndEnum) |  | 1=计划总金额; |