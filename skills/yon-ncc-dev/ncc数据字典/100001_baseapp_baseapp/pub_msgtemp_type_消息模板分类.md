# |<<

**消息模板分类 (pub_msgtemp_type / nc.message.templet.vo.MsgtmptypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_temptype | 主键 | pk_temptype | char(20) | √ | 主键 (UFID) |
| 2 | tempcode | 类型编码 | tempcode | varchar(50) | √ | 字符串 (String) |
| 3 | name | 类型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | parentpk | 上级分类 | parentpk | varchar(20) |  | 消息模板分类 (msgtmptype) |
| 5 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | metaid | 关联实体 | metaid | varchar(36) |  | 实体 (entity) |