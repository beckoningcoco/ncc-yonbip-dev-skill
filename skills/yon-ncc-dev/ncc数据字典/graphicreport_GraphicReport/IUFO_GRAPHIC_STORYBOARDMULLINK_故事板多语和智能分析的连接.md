# |<<

**故事板多语和智能分析的连接 (IUFO_GRAPHIC_STORYBOARDMULLINK / nc.vo.graphicreport.storyboardmullink.StoryBoardMulLinkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_multilanglink | pk_multilanglink | pk_multilanglink | char(20) | √ | 主键 (UFID) |
| 2 | pk_storyboard | 故事板主键 | pk_storyboard | varchar(20) | √ | 字符串 (String) |
| 3 | remoteid | 智能分析对象主键 | remoteid | varchar(50) | √ | 字符串 (String) |
| 4 | cur_lang | 当前语种 | cur_lang | varchar(50) |  | 字符串 (String) |