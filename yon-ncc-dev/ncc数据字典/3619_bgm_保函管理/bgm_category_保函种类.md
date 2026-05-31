# |<<

**保函种类 (bgm_category / nc.vo.bgm.pub.category.CategoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1172.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_category | 保函种类主键 | pk_category | char(20) | √ | 主键 (UFID) |
| 2 | code | 种类编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 种类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | enableflag | 停用标识 | enableflag | int |  | 启用状态 (EnablingStatus) |  | 0=已启用; |