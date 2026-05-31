# |<<

**图形表 (iufo_graphic_graph / nccloud.vo.graphic.base.GraphVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_graph | pk_graph | pk_graph | char(20) | √ | 主键 (UFID) |
| 2 | code | 图形编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 图形名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | charttype | 图表类型 | charttype | varchar(20) | √ | 字符串 (String) |
| 5 | modeltype | 模型类型 | modeltype | varchar(20) | √ | 字符串 (String) |
| 6 | modelid | 模型id | modelid | varchar(50) | √ | 字符串 (String) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 9 | pk_parent | 父级目录 | pk_parent | varchar(20) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 字符串 (String) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 字符串 (String) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 字符串 (String) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 字符串 (String) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 字符串 (String) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 16 | creationtime | 创建时间 | creationtime | varchar(19) |  | 字符串 (String) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 18 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 字符串 (String) |