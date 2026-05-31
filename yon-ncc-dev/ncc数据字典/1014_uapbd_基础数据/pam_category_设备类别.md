# |<<

**设备类别 (pam_category / nc.vo.am.category.CategoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4237.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_category | 设备类别主键 | pk_category | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | fk_parent | 父类别主键 | fk_parent | varchar(20) |  | 设备类别 (CategoryVO) |
| 4 | category_code | 设备类别编码 | category_code | varchar(40) |  | 字符串 (String) |
| 5 | category_name | 设备类别名称 | category_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | transi_type | 交易类型 | transi_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | associate_fa_flag | 固定资产核算 | associate_fa_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | cooperate_flag | 协同管理 | cooperate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | special_flag | 特种设备 | special_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | name_pre_flag | 下级名称继承标志 | name_pre_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | inv_flag | 是否库存管理标记 | inv_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | innercode | 内部编码 | innercode | varchar(60) |  | 字符串 (String) |
| 14 | max_inner_code | 最大内部编码 | max_inner_code | varchar(60) |  | 字符串 (String) |
| 15 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |