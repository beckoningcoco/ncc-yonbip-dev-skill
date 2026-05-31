# |<<

**项目产出物 (pm_projectproduct / nc.vo.pim.projectproduct.ProjectProductVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4513.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectproduct | 项目产出物主键 | pk_projectproduct | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 7 | bill_code | 产出物编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 8 | product_name | 产出物名称 | product_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | pk_producttype | 产出物类型 | pk_producttype | varchar(20) |  | 产出物类型 (outcometypeVO) |
| 10 | product_desc | 产出物描述 | product_desc | varchar(200) |  | 字符串 (String) |
| 11 | productstate | 产出物状态 | productstate | int |  | 项目产出物状态 (productstatus) |  | 0=初始态; |