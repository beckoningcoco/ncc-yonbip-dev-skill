# |<<

**图表故事板关联表 (iufo_graphic_storyboardmember / nccloud.vo.graphic.base.StoryBoardMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_asso | pk_asso | pk_asso | char(20) | √ | 主键 (UFID) |
| 2 | pk_storyboard | 故事板主键 | pk_storyboard | varchar(20) |  | 字符串 (String) |
| 3 | pk_graph | 图主键 | pk_graph | varchar(20) |  | 字符串 (String) |
| 4 | properties | 属性集合 | properties | image |  | 图片类型 (IMAGE) |