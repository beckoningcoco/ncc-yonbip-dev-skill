# |<<

**表单定义 (wfm_formdef / uap.wap.dbl.vo.WfmFormDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6379.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formdef | 表单定义主键 | pk_formdef | char(20) | √ | 主键 (UFID) |
| 2 | formcode | 表单编码 | formcode | varchar(50) | √ | 字符串 (String) |
| 3 | formname | 表单名称 | formname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_formtype | 所属表单分类 | pk_formtype | varchar(50) |  | 字符串 (String) |
| 5 | table_name | 表名称 | table_name | varchar(50) | √ | 字符串 (String) |
| 6 | pagemodle | 处理类 | pagemodle | varchar(50) |  | 字符串 (String) |
| 7 | pk_flowtype | 业务类型 | pk_flowtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_appnode | 功能节点 | pk_appnode | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 11 | pk_word | word文档主键 | pk_word | varchar(50) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |