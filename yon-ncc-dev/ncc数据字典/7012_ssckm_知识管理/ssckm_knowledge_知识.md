# |<<

**知识 (ssckm_knowledge / nc.vo.ssckm.kmknowledge.KmKnowledgeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowledge | 主键 | pk_knowledge | char(20) | √ | 主键 (UFID) |
| 2 | billno | 编号 | billno | varchar(20) |  | 字符串 (String) |
| 3 | title | 标题 | title | varchar(100) |  | 字符串 (String) |
| 4 | content | 内容 | content | varchar(2000) |  | 备注 (Memo) |
| 5 | keyword | 关键词 | keyword | varchar(50) |  | 字符串 (String) |
| 6 | classify | 分类 | classify | varchar(20) |  | 知识分类 (kmclassify) |
| 7 | poststatus | 发布状态 | poststatus | int |  | 发布状态 (kmpoststatus) |  | 0=未发布; |