# |<<

**信息集 (hr_infoset / nc.vo.hr.infoset.InfoSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2680.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset | 信息集主键 | pk_infoset | char(20) | √ | 主键 (UFID) |
| 2 | pk_infoset_sort | 分类主键 | pk_infoset_sort | char(20) |  | 主键 (UFID) |
| 3 | infoset_name | 信息集名称 | infoset_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | infoset_code | 信息集编码 | infoset_code | varchar(50) |  | 字符串 (String) |
| 5 | pk_field_code | 主键字段名 | pk_field_code | varchar(50) |  | 字符串 (String) |
| 6 | meta_data_id | 对应元数据 | meta_data_id | varchar(20) |  | 实体 (entity) |
| 7 | meta_data | 元数据全称 | meta_data | varchar(50) |  | 字符串 (String) |
| 8 | table_code | 对应表名 | table_code | varchar(128) |  | 字符串 (String) |
| 9 | main_table_flag | 主集标识 | main_table_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | sync_main_table | 最新记录同步主集 | sync_main_table | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | sync_main_code | 主集对应字段 | sync_main_code | varchar(50) |  | 字符串 (String) |
| 12 | user_def_flag | 自定义 | user_def_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | record_character | 记录特征 | record_character | int |  | 记录特征 (record_character) |  | 1=无规律变更; |