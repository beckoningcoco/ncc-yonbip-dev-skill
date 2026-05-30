# |<<

**信息集分类 (hr_infoset_sort / nc.vo.hr.infoset.InfoSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset_sort | 分类主键 | pk_infoset_sort | varchar(50) | √ | 字符串 (String) |
| 2 | sort_code | 分类编码 | sort_code | varchar(50) | √ | 字符串 (String) |
| 3 | sort_name | 分类名称 | sort_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | func_code | 功能编码 | func_code | varchar(50) | √ | 字符串 (String) |
| 5 | bill_type_code | 单据模板类型 | bill_type_code | varchar(50) | √ | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | module_code | 所属模块 | module_code | char(20) | √ | 模块信息 (module) |
| 9 | hook_client | 前台处理接口 | hook_client | varchar(128) |  | 字符串 (String) |
| 10 | hook_private | 后台处理接口 | hook_private | varchar(128) |  | 字符串 (String) |
| 11 | pre_table_code | 表名前缀 | pre_table_code | varchar(50) | √ | 字符串 (String) |
| 12 | pre_vo_name | VO类名前缀 | pre_vo_name | varchar(50) | √ | 字符串 (String) |
| 13 | show_flag | 显示 | show_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | add_infoset_flag | 可增加信息集 | add_infoset_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | respath | 名称资源目录 | respath | varchar(128) |  | 字符串 (String) |
| 16 | resid | 多语资源ID | resid | varchar(128) |  | 字符串 (String) |
| 17 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |