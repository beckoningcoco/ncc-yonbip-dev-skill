# |<<

**组织关系_组织关系类型 (org_relationtype / nc.vo.org.orgmodel.OrgRelationTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relationtype | 关系类型主键 | pk_relationtype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | isruleexclusive | 规则独占 | isruleexclusive | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | ishasdefaultflag | 包含默认选项 | ishasdefaultflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | uistyle | 界面类型 | uistyle | smallint | √ | 显示类型 (displaytype) | 1 | 0=表; |