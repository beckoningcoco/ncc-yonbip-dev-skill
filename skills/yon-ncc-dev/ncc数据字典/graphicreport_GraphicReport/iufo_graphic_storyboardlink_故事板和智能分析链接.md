# |<<

**故事板和智能分析链接 (iufo_graphic_storyboardlink / nccloud.vo.graphic.base.StoryBoardLinkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_link | pk_link | pk_link | char(20) | √ | 主键 (UFID) |
| 2 | pk_storyboard | 故事板主键 | pk_storyboard | varchar(20) | √ | 字符串 (String) |
| 3 | remoteid | 智能分析对象主键 | remoteid | varchar(50) | √ | 字符串 (String) |
| 4 | smartids | 语义模型id集合 | smartids | varchar(500) |  | 字符串 (String) |
| 5 | smart_fields | 语义模型字段信息集合 | smart_fields | image |  | 图片类型 (IMAGE) |
| 6 | cur_lang | 当前语种 | cur_lang | varchar(50) |  | 字符串 (String) | simpchn |