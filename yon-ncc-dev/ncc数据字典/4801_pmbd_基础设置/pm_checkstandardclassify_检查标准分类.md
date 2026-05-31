# |<<

**检查标准分类 (pm_checkstandardclassify / nc.vo.pmbd.checkstandardclassify.CheckstandardclassifyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkstandardclassify | 检查标准分类主键 | pk_checkstandardclassify | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | bill_code | 分类编码 | bill_code | varchar(40) | √ | 字符串 (String) |
| 5 | bill_name | 分类名称 | bill_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_parent | 父分类 | pk_parent | varchar(20) |  | 检查标准分类 (checkstandardclassifyVO) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态(项目管理) (pmEnablestate) |  | 1=未启用; |