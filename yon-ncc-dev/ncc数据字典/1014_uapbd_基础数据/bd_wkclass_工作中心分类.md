# |<<

**工作中心分类 (bd_wkclass / nc.vo.bd.wk.wk0102.entity.WkClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwkclassid | 工作中心分类 | cwkclassid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | code | 类别编码 | code | varchar(40) |  | 字符串 (String) |
| 6 | name | 类别名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | cparentid | 父项 | cparentid | varchar(50) |  | 字符串 (String) |
| 8 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 9 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |