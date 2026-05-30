# |<<

**计划类型设置 (pd_plantype / nc.vo.pd.pd0306.PlanTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4365.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cplansettingid | 计划类型设置定义 | cplansettingid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cplantemplateid | 计划模板 | cplantemplateid | varchar(20) |  | 计划模板定义 (pd_plantemplate) |
| 6 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 7 | fplantype | 计划类型 | fplantype | int |  | 计划类型 (plantype) |  | 1=主生产计划; |