# |<<

**目录表 (iufo_graphic_directory / nccloud.vo.graphic.base.GraphDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | pk_dir | pk_dir | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 父目录pk | pk_parent | varchar(20) | √ | 字符串 (String) |
| 3 | dirtype | 目录类型 | dirtype | varchar(20) | √ | 字符串 (String) |
| 4 | modeltype | 数据模型类型 | modeltype | varchar(50) | √ | 字符串 (String) |
| 5 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | innercode | 内码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | modulecode | 模块号 | modulecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 11 | sysinit | 是否预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 12 | analysis_dir_id | 智能分析对象目录id | analysis_dir_id | varchar(50) |  | 字符串 (String) |
| 13 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 14 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 15 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 16 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 17 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 19 | creationtime | 创建时间 | creationtime | varchar(50) |  | 字符串 (String) |
| 20 | modifier | 修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 21 | modifiedtime | 修改时间 | modifiedtime | varchar(50) |  | 字符串 (String) |