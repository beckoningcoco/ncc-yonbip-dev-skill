# |<<

**数据元 (bd_code_de / com.yonyou.yh.nhis.bd.code.vo.CodeDeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_de | 数据元主键 | pk_de | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 5 | pk_decate | 数据元分类 | pk_decate | varchar(50) |  | 字符串 (String) |
| 6 | doctype | 数据元所属记录类型 | doctype | int |  | 整数 (Integer) |
| 7 | code | 数据元编码 | code | varchar(30) |  | 字符串 (String) |
| 8 | code_std | 数据元国家编码 | code_std | varchar(30) |  | 字符串 (String) |
| 9 | name | 数据元名称 | name | varchar(50) |  | 字符串 (String) |
| 10 | denote | 数据元描述 | denote | varchar(256) |  | 字符串 (String) |
| 11 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 12 | dt_detype | 数据元类型 | dt_detype | varchar(20) |  | 字符串 (String) |
| 13 | pk_detype | 数据元类型主键 | pk_detype | varchar(50) |  | 字符串 (String) |
| 14 | dt_ecddevaltype | 数据元值域类型 | dt_ecddevaltype | varchar(20) |  | 字符串 (String) |
| 15 | pk_ecddevaltype | 数据元值域类型主键 | pk_ecddevaltype | varchar(50) |  | 字符串 (String) |
| 16 | datasource_dttype | 数据元数值域源_基础码表类别 | datasource_dttype | varchar(50) |  | 字符串 (String) |
| 17 | datasource_sql | 数据元数值域源_SQL串 | datasource_sql | varchar(4000) |  | 字符串 (String) |
| 18 | datasource_prop | 数据元数值域源_类及属性 | datasource_prop | varchar(256) |  | 字符串 (String) |
| 19 | verno | 数据元版本号 | verno | varchar(50) |  | 字符串 (String) |
| 20 | delen | 数据元长度 | delen | int |  | 整数 (Integer) |
| 21 | demax | 数据元最大值 | demax | int |  | 整数 (Integer) |
| 22 | demin | 数据元最小值 | demin | int |  | 整数 (Integer) |
| 23 | dedef | 数据元默认值 | dedef | int |  | 整数 (Integer) |
| 24 | flag_null | 允许为空 | flag_null | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | data_std_max | 数据元标准上限 | data_std_max | varchar(50) |  | 字符串 (String) |
| 26 | data_std_min | 数据元标准下限 | data_std_min | varchar(50) |  | 字符串 (String) |
| 27 | data_format | 数据元规则串 | data_format | varchar(50) |  | 字符串 (String) |
| 28 | date_publish | 数据元发布日期 | date_publish | char(19) |  | 日期时间 (UFDateTime) |
| 29 | flag_active | 数据元启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | eu_applyphase | 应用范围 | eu_applyphase | int |  | 整数 (Integer) |
| 31 | flag_assign | 病历创建后赋值标志 | flag_assign | char(50) |  | 字符串 (String) |
| 32 | flag_sync | 同步引用标志 | flag_sync | char(50) |  | 字符串 (String) |
| 33 | eu_phaseid | 段落编码取值方式 | eu_phaseid | int |  | 整数 (Integer) |
| 34 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 35 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 37 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |