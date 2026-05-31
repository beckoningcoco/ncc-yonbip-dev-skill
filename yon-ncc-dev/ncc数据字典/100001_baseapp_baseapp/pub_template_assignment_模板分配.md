# |<<

**模板分配 (pub_template_assignment / nc.vo.platform.appsystemplate.TemplateAssignmentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assignment | 主键 | pk_assignment | char(20) | √ | 主键 (UFID) |
| 2 | pk_page_templet | 模板id | pk_page_templet | varchar(20) | √ | 页面模板 (pagetemplet) |
| 3 | pk_group | 集团id | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织id | pk_org | varchar(20) |  | 组织 (org) |
| 5 | target | 分配对象id | target | varchar(20) |  | 字符串 (String) |
| 6 | target_type | 分配对象类型 | target_type | varchar(50) |  | 字符串 (String) |
| 7 | page_code | 页面编码 | page_code | varchar(50) |  | 字符串 (String) |
| 8 | is_default | 是否为默认模板 | is_default | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | template_type | 模板类型 | template_type | varchar(50) |  | 字符串 (String) |
| 10 | app_code | 应用编码 | app_code | varchar(50) |  | 字符串 (String) |