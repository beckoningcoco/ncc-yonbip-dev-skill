# |<<

**知识分类 (ssckm_classify / nc.vo.ssckm.kmclassify.KmClassifyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classify | 主键 | pk_classify | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | isuse | 启用状态 | isuse | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |