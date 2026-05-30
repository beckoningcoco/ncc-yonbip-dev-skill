# |<<

**计算成员 (epa_calculatemember / nc.vo.epa.query.queryset.CalculateMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | cubecode | 数据集编码 | cubecode | varchar(50) |  | 字符串 (String) |
| 5 | levelcode | 维度层次编码 | levelcode | varchar(50) |  | 字符串 (String) |
| 6 | express | 表达式 | express | varchar(300) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_dimlevel | 维度层次主键 | pk_dimlevel | varchar(20) |  | 字符串 (String) |
| 10 | pk_dimdef | 维度定义主键 | pk_dimdef | varchar(20) |  | 字符串 (String) |
| 11 | dimdefcode | 维度定义编码 | dimdefcode | varchar(50) |  | 字符串 (String) |
| 12 | calculatemembertype | 计算成员类型 | calculatemembertype | int |  | 整数 (Integer) |
| 13 | displayexp | 公式表达式 | displayexp | image |  | BLOB (BLOB) |
| 14 | displayexpvalue | 公式内容 | displayexpvalue | varchar(500) |  | 字符串 (String) |
| 15 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 16 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 17 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 18 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 19 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |