# |<<

**检查标准 (pm_checkrequest / nc.vo.pmbd.checkrequest.CheckReqHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkrequest | 检查标准主键 | pk_checkrequest | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 项目组织版本 | pk_org_v | varchar(20) |  | 组织 (org) |
| 5 | check_stand_code | 检查标准编码 | check_stand_code | varchar(200) |  | 字符串 (String) |
| 6 | check_stand_name | 检查标准名称 | check_stand_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_checkstandardclassify | 检查标准分类 | pk_checkstandardclassify | varchar(20) |  | 检查标准分类 (checkstandardclassifyVO) |
| 8 | project_type | 项目类型 | project_type | varchar(20) |  | 项目类型 (projectclass) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |