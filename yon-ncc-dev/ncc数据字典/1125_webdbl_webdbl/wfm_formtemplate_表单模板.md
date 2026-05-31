# |<<

**表单模板 (wfm_formtemplate / uap.wap.dbl.vo.WfmFormTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formtemplate | 表单模板主键 | pk_formtemplate | char(20) | √ | 主键 (UFID) |
| 2 | templatename | 模板名称 | templatename | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | templatecode | 模板编码 | templatecode | varchar(50) |  | 字符串 (String) |
| 4 | xmluimeta | xml页面元数据 | xmluimeta | varchar(50) |  | 字符串 (String) |
| 5 | pk_formdef | 所属表单定义 | pk_formdef | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织 (org) |
| 8 | pk_parent | 父模板 | pk_parent | varchar(50) |  | 字符串 (String) |
| 9 | version | 版本 | version | varchar(50) |  | 字符串 (String) |
| 10 | isused | 是否启用 | isused | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | newversion | 是否生成新版本 | newversion | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_device | 终端 | pk_device | varchar(50) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |