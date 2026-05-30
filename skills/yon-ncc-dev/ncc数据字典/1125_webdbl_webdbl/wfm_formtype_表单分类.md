# |<<

**表单分类 (wfm_formtype / uap.wap.dbl.vo.WfmFormTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6381.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formtype | 表单分类主键 | pk_formtype | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 分类编码 | typecode | varchar(50) | √ | 字符串 (String) |
| 3 | typename | 分类名称 | typename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_parent | 父分类 | pk_parent | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 7 | pk_menuitem | 菜单项 | pk_menuitem | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |