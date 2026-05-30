# |<<

**故事板表 (iufo_graphic_storyboard / nccloud.vo.graphic.base.StoryBoardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storyboard | pk_storyboard | pk_storyboard | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(300) |  | 多语文本 (MultiLangText) |
| 4 | thumbtype | 缩略图类型 | thumbtype | varchar(20) |  | 字符串 (String) |
| 5 | requestinfo | 渲染图表参数信息 | requestinfo | image |  | 图片类型 (IMAGE) |
| 6 | pk_parent | 父级目录pk | pk_parent | varchar(20) |  | 字符串 (String) |
| 7 | linkageset | 联动设置 | linkageset | image |  | 图片类型 (IMAGE) |
| 8 | mark | 移动端orPC端标志位 | mark | varchar(20) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 15 | creationtime | 创建时间 | creationtime | varchar(19) |  | 字符串 (String) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 17 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 字符串 (String) |